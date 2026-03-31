public class IMBD {
    private String movie;
    private int year;
    private int mins;
    private String genre;
    private int IMBDrating;
    private String star1;
    private String star2;
    private String star3;
    
    public IMBD(String movie, int year, int mins, String genre, int IMBDrating, String star1, String star2, String star3) {
        this.movie = movie;
        this.year = year;
        this.mins = mins;
        this.genre = genre;
        this.IMBDrating = IMBDrating;
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
    
    public int getMins() {
        return mins;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public int getIMBDrating() {
        return IMBDrating;
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
    
    public void setMins(int mins) {
        this.mins = mins;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setIMBDrating(int IMBDrating) {
        this.IMBDrating = IMBDrating;
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
        return "IMBD{" +
                "movie='" + movie + '\'' +
                ", year=" + year +
                ", mins=" + mins +
                ", genre='" + genre + '\'' +
                ", IMBDrating=" + IMBDrating +
                ", star1='" + star1 + '\'' +
                ", star2='" + star2 + '\'' +
                ", star3='" + star3 + '\'' +
                '}';
    }


}