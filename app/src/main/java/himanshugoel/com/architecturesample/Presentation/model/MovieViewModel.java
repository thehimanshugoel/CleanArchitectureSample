package himanshugoel.com.architecturesample.Presentation.model;

import java.util.List;

public class MovieViewModel {
    private List<MovieDetails> movieDetailsList;

    public List<MovieDetails> getMovieDetailsList() {
        return movieDetailsList;
    }

    public void setMovieDetailsList(List<MovieDetails> movieDetailsList) {
        this.movieDetailsList = movieDetailsList;
    }
}
