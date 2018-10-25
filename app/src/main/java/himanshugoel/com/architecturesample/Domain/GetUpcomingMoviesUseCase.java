package himanshugoel.com.architecturesample.Domain;

import java.util.List;

import himanshugoel.com.architecturesample.Data.MovieDataRepository;

public class GetUpcomingMoviesUseCase {
    private MovieRepository repository;

    public GetUpcomingMoviesUseCase() {
        repository = new MovieDataRepository();
    }

    public List<Movie> execute() {
        return repository.getUpcomingMovies();
    }
}
