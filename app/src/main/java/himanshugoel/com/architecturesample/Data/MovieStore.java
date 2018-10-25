package himanshugoel.com.architecturesample.Data;

import java.util.List;

public interface MovieStore {
    List<MovieEntity> fetchUpcomingMovies();
}
