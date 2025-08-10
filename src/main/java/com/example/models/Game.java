package com.example.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Game {
    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "genre is required")
    private String genre;

    @NotNull(message = "players must not be null")
    private Integer players;

    public Game() {}

    public Game(Long id, String name, String genre, Integer players) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.players = players;
    }

    // This is the new constructor that fixes the pipeline error
    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.players = 0; // Initialize players to a default value since it's not provided
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getPlayers() { return players; }
    public void setPlayers(Integer players) { this.players = players; }

    @Override
    public String toString() {
        return "Game{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", genre='" + genre + '\'' +
               ", players=" + players +
               '}';
    }
}