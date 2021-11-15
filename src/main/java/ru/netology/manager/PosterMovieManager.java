package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.PosterManager;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PosterMovieManager {
    private int lastTen = 10;
    private PosterManager[] movies = new PosterManager[0];

    public PosterMovieManager(int lastTen) {
        this.lastTen = lastTen;
    }

    public void addMovie(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];

        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public void setLastTen(int lastTen) {
        if (lastTen <= 0) {
            return;
        }
        this.lastTen = lastTen;
    }

    public PosterManager[] listMovies(int lastTen) {
        int numberLength = 0;
        if (lastTen < 10) {
            numberLength = lastTen;
        } else {
            numberLength = 10;
        }


        PosterManager[] number = new PosterManager[numberLength];
        PosterManager[] movies = getMovies();

        for (int i = 0; i < numberLength; i++) {
            int j = movies.length - i - 1;
            number[i] = movies[j];
        }
        return number;
    }
}










