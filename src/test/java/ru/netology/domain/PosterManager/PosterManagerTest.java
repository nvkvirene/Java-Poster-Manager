package ru.netology.domain.PosterManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void show5Movies() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void show1Movies() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noMovies() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("");

        String[] expected = {""};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withinRange() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");
        posterManager.add("Movie 7");
        posterManager.add("Movie 8");
        posterManager.add("Movie 9");
        posterManager.add("Movie 10");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showMoviesReversOrder() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");
        posterManager.add("Movie 7");
        posterManager.add("Movie 8");
        posterManager.add("Movie 9");
        posterManager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void show9Movies() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");
        posterManager.add("Movie 7");
        posterManager.add("Movie 8");
        posterManager.add("Movie 9");

        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWithinMaxRange() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");
        posterManager.add("Movie 7");
        posterManager.add("Movie 8");
        posterManager.add("Movie 9");
        posterManager.add("Movie 10");
        posterManager.add("Movie 11");
        posterManager.add("Movie 12");

        String[] expected = {"Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWithinMinRange() {
        PosterManager posterManager = new PosterManager();

        posterManager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void newLimit() {
        PosterManager posterManager = new PosterManager(7);

        posterManager.add("Movie 1");
        posterManager.add("Movie 2");
        posterManager.add("Movie 3");
        posterManager.add("Movie 4");
        posterManager.add("Movie 5");
        posterManager.add("Movie 6");
        posterManager.add("Movie 7");
        posterManager.add("Movie 8");
        posterManager.add("Movie 9");
        posterManager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4"};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
