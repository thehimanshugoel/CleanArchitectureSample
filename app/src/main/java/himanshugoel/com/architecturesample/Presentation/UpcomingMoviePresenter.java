package himanshugoel.com.architecturesample.Presentation;

import java.util.List;

import himanshugoel.com.architecturesample.Domain.GetUpcomingMoviesUseCase;
import himanshugoel.com.architecturesample.Domain.Movie;
import himanshugoel.com.architecturesample.Presentation.model.MovieViewModel;

public class UpcomingMoviePresenter {
    private UpcomingMovieView view;
    private GetUpcomingMoviesUseCase usecase;

    UpcomingMoviePresenter(UpcomingMovieView view) {
        this.view = view;
        usecase = new GetUpcomingMoviesUseCase();
    }

    void initialize() {
        List<Movie> movies = usecase.execute();

        /// Transform Movie to MovieViewModel
        MovieViewModel movieViewModel = MovieMapper2.tranform(movies);

        // ask the view to render movies
        this.view.render(movieViewModel);
    }
}

