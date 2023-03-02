package ru.netology.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMoviesLimit() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] expected ={"Film 1","Film 2","Film 3","Film 4","Film 5","Film 6","Film 7","Film 8","Film 9","Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMoviesNotAboveLimit(){
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");
        manager.addMovie("Film 11");
        manager.addMovie("Film 12");

        String[] expected ={"Film 12","Film 11","Film 10","Film 9","Film 8","Film 7","Film 6","Film 5","Film 4","Film 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddMoviesLessThanTheLimit() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");

        String[] expected ={"Film 6","Film 5","Film 4","Film 3","Film 2","Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldAddMoviesWhenOverLimit() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");
        manager.addMovie("Film 11");
        manager.addMovie("Film 12");

        String[] expected ={"Film 1","Film 2","Film 3","Film 4","Film 5","Film 6","Film 7","Film 8","Film 9","Film 10","Film 11","Film 12"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}