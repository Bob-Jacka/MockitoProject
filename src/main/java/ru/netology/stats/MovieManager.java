package ru.netology.stats;

public class MovieManager {
    private int limit = 5;
    private MoviePoster[] movieArray = new MoviePoster[0];

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
    }

    public void addNew(MoviePoster newPoster) {
        MoviePoster[] tmp = new MoviePoster[movieArray.length + 1];
        for (int i = 0; i < movieArray.length; i++) {
            tmp[i] = movieArray[i];
        }
        tmp[tmp.length - 1] = newPoster;
        movieArray = tmp;
    }

    public MoviePoster[] findAll() {
        MoviePoster[] tmp = new MoviePoster[movieArray.length];
        for (int i = 0; i < movieArray.length; i++) {
            tmp[i] = movieArray[i];
        }
        movieArray = tmp;
        for (MoviePoster mv : movieArray) {
            System.out.println(mv.getMovieName());
        }
        return movieArray;
    }

    public MoviePoster[] findLast() {
        MoviePoster[] tmp = new MoviePoster[movieArray.length];
        for (int i = 0; i < movieArray.length; i++) {
            tmp[i] = movieArray[movieArray.length - 1 - i];
        }
        movieArray = tmp;
        if (movieArray.length < limit) {
            for (int i = 0; i < movieArray.length; i++) {
                System.out.println(movieArray[i].getMovieName());
            }

        } else if (movieArray.length > limit) {
            for (int i = 0; i < limit; i++) {
                System.out.println(movieArray[i].getMovieName());
            }
        }
        return movieArray;
    }

    public MoviePoster[] getMovieArray() {
        return movieArray;
    }

    ;

}
