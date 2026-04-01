public class IMDB {
    private String movie;
    private int year;
    private int duration;
    private String genre;
    private double imdbRating;
    private String star1;
    private String star2;
    private String star3;
    
    public IMDB(String movie, int year, int duration, String genre, double imdbRating, String star1, String star2, String star3) {
        this.movie = movie;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.star1 = star1;
        this.star2 = star2;
        this.star3 = star3;  
    }

    // Getters
    public String getMovie() {
        return movie;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public double getImdbRating() {
        return imdbRating;
    }
    
    public String getStar1() {
        return star1;
    }
    
    public String getStar2() {
        return star2;
    }
    
    public String getStar3() {
        return star3;
    }
    
    // Setters
    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
    
    public void setStar1(String star1) {
        this.star1 = star1;
    }
    
    public void setStar2(String star2) {
        this.star2 = star2;
    }
    
    public void setStar3(String star3) {
        this.star3 = star3;
    }

    // toString method
    @Override
    public String toString() {
        return "IMDB{" +
                "movie='" + movie + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                ", star1='" + star1 + '\'' +
                ", star2='" + star2 + '\'' +
                ", star3='" + star3 + '\'' +
                '}';
    }


}
