package ru.netology.stats;

public class MoviePoster {
    private final String MovieName;
    private final String genre;
    public MoviePoster(String name, String genre) {
        this.MovieName = name;
        this.genre = genre;
    }

    String getMovieName() {
        return MovieName;
    }
}
