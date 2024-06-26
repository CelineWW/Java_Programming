import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ReviewSystem {
   
   public static String readReviews(ArrayList<String> userNames,
                                    ArrayList<Integer> userRatings)
                                    throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      String restaurantName;
      String userName;
      int userRating;

      // Try to open file
      System.out.println("Opening file Trattoria_Reviews.txt.");
      fileByteStream = new FileInputStream("Trattoria_Reviews.txt");
      inFS = new Scanner(fileByteStream);

      restaurantName = inFS.nextLine();

      while(inFS.hasNext()) {
         userName = inFS.next();
         userRating = inFS.nextInt();

         userNames.add(userName);
         userRatings.add(userRating);
      }

      fileByteStream.close(); // close() may throw IOException if fails

      return restaurantName;
   }
   
   public static double calcAvgRating(ArrayList<Integer> userRatings) {
      int i;
      double ratingAvg = 0;

      for(i = 0; i < userRatings.size(); ++i) {
         ratingAvg += userRatings.get(i);
      }
      return ratingAvg /= userRatings.size();
   }

   public static void displayReviews(String restaurantName,
                                     ArrayList<String> userNames,
                                     ArrayList<Integer> userRatings,
                                     double ratingAvg) {
      int i;

      System.out.println("\n" + restaurantName);
      System.out.println("Average rating: " + ratingAvg);
      System.out.println("--------------------");

      for(i = 0; i < userNames.size(); ++i) {
         System.out.println("User name: " + userNames.get(i));
         System.out.println("   Rating: " + userRatings.get(i));
         System.out.println();
      }
   }

   public static void main(String [] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      double ratingAvg;
      ArrayList<String> userNames = new ArrayList<String>();
      ArrayList<Integer> userRatings = new ArrayList<Integer>();
      String restaurantName;
      
      // Reads restaurant name and reviews from input file at program start
      restaurantName = readReviews(userNames, userRatings);

      ratingAvg = calcAvgRating(userRatings);
      displayReviews(restaurantName, userNames, userRatings, ratingAvg);
   }
}