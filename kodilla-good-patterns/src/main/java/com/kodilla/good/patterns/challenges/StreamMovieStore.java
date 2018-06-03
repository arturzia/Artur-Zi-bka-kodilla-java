package com.kodilla.good.patterns.challenges;

public class StreamMovieStore {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(u->u.getValue().stream())
                .forEach(u-> System.out.print(u +" ! "));
    }
}
