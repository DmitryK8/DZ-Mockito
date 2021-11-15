package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosterMovieManagerTest {
    PosterMovieManager manager = new PosterMovieManager();

    @Test
    public void shouldSetLastTen8() {
        manager.setLastTen(8);
        int expected = 8;
        int actual = manager.getLastTen();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastTenMinus1() {
        manager.setLastTen(-1);
        int expected = 10;
        int actual = manager.getLastTen();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastTen010() {
        manager.setLastTen(0);
        int expected = 10;
        int actual = manager.getLastTen();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastTen1() {
        manager.setLastTen(1);
        int expected = 1;
        int actual = manager.getLastTen();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        PosterManager first = new PosterManager("MovieFirst");
        PosterManager second = new PosterManager("MovieSecond");
        PosterManager third = new PosterManager("MovieThird");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        assertArrayEquals(manager.getMovies(), new PosterManager[]{first, second, third});
    }

    @Test
    public void shouldLastTenMovies() {
        PosterManager one = new PosterManager("MovieOne");
        PosterManager two = new PosterManager("MovieTwo");
        PosterManager three = new PosterManager("MovieThree");
        PosterManager four = new PosterManager("MovieFour");
        PosterManager five = new PosterManager("MovieFive");
        PosterManager six = new PosterManager("MovieSix");
        PosterManager seven = new PosterManager("MovieSeven");
        PosterManager eight = new PosterManager("MovieEight");
        PosterManager nine = new PosterManager("MovieNine");
        PosterManager ten = new PosterManager("MovieTen");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);

        assertArrayEquals(new PosterManager[] {ten, nine, eight, seven, six, five, four, three, two, one}, manager.listMovies(10));
    }


}

