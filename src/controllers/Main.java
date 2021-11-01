package controllers;

import models.Movie;
import views.CmdLineView;

import java.util.ArrayList;

public class Main {
    static CmdLineView view = new CmdLineView();
    static DBConnect db = new DBConnect("movies.db");

    public static void main(String[] args) {
       db.createNewDatabase();
       db.addTables();

       menu();

    }

    public static void addMovie() {
        System.out.println("addMovie");
        while(view.getContinue().equals("y")) {
            db.addData(view.getTitle(), view.getYear(), view.getRating());
        }
        menu();
    }


    public static void showMovies() {
        ArrayList<Movie> theMovies = db.getData();
        for(Movie movie : theMovies){
            view.printDatabase(movie);
        }
        menu();
    }

    public static void menu() {
        switch(view.menuInput()) {
            case 1: addMovie();
                break;
            case 2: showMovies();
                break;
            default: view.menuError();
       }
    }

}

