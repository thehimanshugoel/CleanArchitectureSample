package himanshugoel.com.architecturesample.Presentation;

import java.util.ArrayList;
import java.util.List;

import himanshugoel.com.architecturesample.Domain.Movie;
import himanshugoel.com.architecturesample.Presentation.model.MovieDetails;
import himanshugoel.com.architecturesample.Presentation.model.MovieViewModel;

public class MovieMapper2 {

    public static MovieViewModel tranform(List<Movie> movieList) {
        List<MovieDetails> movieDetailsList = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            movieDetailsList.add(new MovieDetails(movieList.get(i).getId(), movieList.get(i).getTitle(), movieList.get(i).getRating()));
        }

        MovieViewModel movieViewModel = new MovieViewModel();
        movieViewModel.setMovieDetailsList(movieDetailsList);

        return movieViewModel;

    }
}
