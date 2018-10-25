package himanshugoel.com.architecturesample.Presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import himanshugoel.com.architecturesample.Presentation.model.MovieViewModel;
import himanshugoel.com.architecturesample.R;

public class MovieActivity extends AppCompatActivity implements UpcomingMovieView {

    UpcomingMoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new UpcomingMoviePresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.initialize();
    }

    @Override
    public void render(MovieViewModel movieViewModel) {

    }
}
