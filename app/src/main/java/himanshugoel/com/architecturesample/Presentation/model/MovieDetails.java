package himanshugoel.com.architecturesample.Presentation.model;

public class MovieDetails {
    private int id;
    private String title;
    private double rating;

    public MovieDetails(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
