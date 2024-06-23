package oop.session1;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }


    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }


    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index++] = movie;
            }
        }
        return pgMovies;
    }

    public static void main(String[] args) {
        // Creating a Movie instance
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        System.out.println("Movie: " + casinoRoyale.title + ", Studio: " + casinoRoyale.studio + ", Rating: " + casinoRoyale.rating);

        // Test the Movie class methods
        Movie movie1 = new Movie("Movie1", "Studio1", "PG");
        Movie movie2 = new Movie("Movie2", "Studio2", "PG13");
        Movie movie3 = new Movie("Movie3", "Studio3", "PG");
        Movie[] movies = {movie1, movie2, movie3};

        Movie[] pgMovies = Movie.getPG(movies);
        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.title + " (" + movie.rating + ")");
        }
    }

}
