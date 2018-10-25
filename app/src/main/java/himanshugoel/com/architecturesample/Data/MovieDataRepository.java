package himanshugoel.com.architecturesample.Data;

import java.util.List;

import himanshugoel.com.architecturesample.Domain.Movie;
import himanshugoel.com.architecturesample.Domain.MovieRepository;

public class MovieDataRepository implements MovieRepository {
    @Override
    public List<Movie> getUpcomingMovies() {
        MovieStore movieStore = new APiMovieStore();
        List<MovieEntity> movieEntityList = movieStore.fetchUpcomingMovies();
        List<Movie> movieList = MovieMapper.tranform(movieEntityList);
        return movieList;
    }
}
