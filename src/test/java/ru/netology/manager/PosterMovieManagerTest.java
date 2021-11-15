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
    public void shouldListOfMovies() {

        PosterManager one = new PosterManager("Movie1");
        PosterManager two = new PosterManager("Movie2");
        PosterManager three = new PosterManager("Movie3");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);

        assertArrayEquals(new PosterManager[]{three, two, one}, manager.listMovies(3));
    }

    @Test
    public void shouldLastTenMovies() {
        PosterManager one = new PosterManager("Movie1");
        PosterManager two = new PosterManager("Movie2");
        PosterManager three = new PosterManager("Movie3");
        PosterManager four = new PosterManager("Movie4");
        PosterManager five = new PosterManager("Movie5");
        PosterManager six = new PosterManager("Movie6");
        PosterManager seven = new PosterManager("Movie7");
        PosterManager eight = new PosterManager("Movie8");
        PosterManager nine = new PosterManager("Movie9");
        PosterManager ten = new PosterManager("Movie10");

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

    @Test
    public void shouldListOfMoviesMoreTen() {
        PosterManager one = new PosterManager("Movie1");
        PosterManager two = new PosterManager("Movie2");
        PosterManager three = new PosterManager("Movie3");
        PosterManager four = new PosterManager("Movie4");
        PosterManager five = new PosterManager("Movie5");
        PosterManager six = new PosterManager("Movie6");
        PosterManager seven = new PosterManager("Movie7");
        PosterManager eight = new PosterManager("Movie8");
        PosterManager nine = new PosterManager("Movie9");
        PosterManager ten = new PosterManager("Movie10");
        PosterManager eleven = new PosterManager("Movie11");
        PosterManager twelve = new PosterManager("Movie12");

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
        manager.addMovie(eleven);
        manager.addMovie(twelve);

        assertArrayEquals(new PosterManager[]{twelve, eleven, ten, nine, eight, seven, six, five, four, three}, manager.listMovies(12));
    }

    @Test
    public void shouldListOfFilmFrom5() {
        PosterMovieManager manager = new PosterMovieManager(5);
        PosterManager one = new PosterManager("Movie1");
        PosterManager two = new PosterManager("Movie2");
        PosterManager three = new PosterManager("Movie3");
        PosterManager four = new PosterManager("Movie4");
        PosterManager five = new PosterManager("Movie5");
        PosterManager six = new PosterManager("Movie6");
        PosterManager seven = new PosterManager("Movie7");
        PosterManager eight = new PosterManager("Movie8");
        PosterManager nine = new PosterManager("Movie9");
        PosterManager ten = new PosterManager("Movie10");

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

        assertArrayEquals(new PosterManager[]{ten, nine, eight, seven, six}, manager.listMovies(5));
    }
}

