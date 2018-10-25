package himanshugoel.com.architecturesample.Data;

import java.util.ArrayList;
import java.util.List;

import himanshugoel.com.architecturesample.Domain.Movie;

public class MovieMapper {

    public static List<Movie> tranform(List<MovieEntity> movieEntities) {

        List<Movie> movieList = new ArrayList<>();

        for (int i = 0; i < movieEntities.size(); i++) {
            movieList.add(new Movie(movieEntities.get(i).getId(), movieEntities.get(i).getTitle(), movieEntities.get(i).getRating()));
        }
        return movieList;
    }
}
