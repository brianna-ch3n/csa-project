import java.util.*;
import java.io.*;

public class DataManager {
    public static void main(String[] args) {
        ArrayList<IMDB> roster = new ArrayList<>();
        String fileName = "IMDB Top 200.csv";

        try {
            Scanner fileReader = new Scanner(new File(fileName));
            
            // 1. Skip the header row
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }

            // 2. Loop through the file
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                // 3. Split the line by comma
                String[] data = line.split(",", 8);

                if (data.length >= 8) {

                    String movie = data[0];
                    int year = (int) Double.parseDouble(data[1]);
                    int duration = Integer.parseInt(data[2].replace(" min", ""));
                    String genre = data[3];
                    double rating = Double.parseDouble(data[4]);
                    String star1 = data[5];
                    String star2 = data[6];
                    String star3 = data[7];

                    IMDB film = new IMDB(movie, year, duration, genre, rating, star1, star2, star3);
                    roster.add(film);
                }
            }
            
            fileReader.close();
            System.out.println("Successfully loaded " + roster.size() + " records.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Failed to parse a numeric value in the CSV.");
        }
        
        if(roster.size()>0){
            System.out.println(roster.get(0));
        }
        System.out.println("Total movies: " + roster.size());

        
        // 5. TODO: Implement your Level Up analysis here!
        //mean
        double sum = 0;

        for (IMDB m:roster){
            sum+= m.getImdbRating();
        }

        double mean = sum/roster.size();

        //best movie
        IMDB best = roster.get(0);

        for (IMDB m: roster){
            if (m.getImdbRating()> best.getImdbRating()){
                best = m;
            }
        }

        //worst movie
        IMDB worst = roster.get(0);

        for(IMDB m:roster){
            if(m.getImdbRating() < worst.getImdbRating()){
                worst = m;
            }
        }

        //
        int count = 0;

        for (IMDB m:roster){
            if(m.getImdbRating() >= 8.5){
                count++;
            }
        } 

        // final output
        System.out.println("\nIMDB ANALYSIS");
        System.out.println("Total Movies: " + roster.size());
        System.out.println("Average Rating: " + mean);
        System.out.println("Best Movie: " + best);
        System.out.println("Worst Movie: " + worst);
        System.out.println("Movies rated 8.5+: " + count);
    
        
    }
}
