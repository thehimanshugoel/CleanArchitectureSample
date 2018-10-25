package himanshugoel.com.architecturesample.Data;

import java.util.ArrayList;
import java.util.List;

public class APiMovieStore implements MovieStore {
    @Override
    public List<MovieEntity> fetchUpcomingMovies() {
        List<MovieEntity> movieEntityList = new ArrayList<>();
        movieEntityList.add(new MovieEntity(1, "Thor", 4.5));
        movieEntityList.add(new MovieEntity(2, "WonderWoman", 5));
        movieEntityList.add(new MovieEntity(3, "Hulk", 4));
        movieEntityList.add(new MovieEntity(4, "SuperMan", 5));
        return movieEntityList;
    }
}
