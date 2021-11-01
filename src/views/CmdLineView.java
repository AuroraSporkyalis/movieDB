package views;

import java.util.Scanner;
import models.Movie;

public class CmdLineView {
    Scanner input = new Scanner(System.in);

    public void cmdLineView() {

    }

    public String getTitle() {
        System.out.println("Enter movie title");
        return input.next();
    }

    public String getYear() {
        System.out.println("Enter release year");
        return input.next();
    }

    public String getRating() {
        System.out.println("Enter rating");
        return input.next();
    }

    public String getContinue() {
        System.out.println("Do you want to add another movie? y/n");
        return input.next();
    }

    public void printDatabase(Movie movie) {
        System.out.println(movie.toString());
    }

    public int menuInput() {
        System.out.println("(1) Add a movie.\n(2) Show movies.");
        return input.nextInt();
    }

    public void menuError() {
        System.out.println("Error, that is not a valid input");
    }
}
