package ru.netology.stats;

public class MoviePoster {
    private final String MovieName;
    private final String genre;

    public MoviePoster(String name, String genre) {
        this.MovieName = name;
        this.genre = genre;
    }

    public String getMovieName() {
        return MovieName;
    }

    public String getGenre() {
        return genre;
    }

}
