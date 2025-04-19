package project_1;

import java.util.Scanner;

abstract class VideoTape{
    String available;
    double length;
    String title;
}

class Movie extends VideoTape{
    String director;
    double rating;
    void Store_Display(String d, double r) {
        director = d;
        rating = r;
        System.out.println("Name of Director :- "+director);
        System.out.println("Rating of Movie :- "+rating);
    }
    void Show(String title, double length, String available) {
        System.out.println("Title of Movie :- "+title);
        System.out.println("Length of Movie :- "+length);
        System.out.println("Availablity of Movie :- "+available);
    }
}

class MusicVideo extends VideoTape{
    String artist;
    String category;
    void Store_Display(String a, String c) {
        artist = a;
        category = c;
        System.out.println("Name of Artist :- "+artist);
        System.out.println("Category of Music-Video :- "+category);
    }
    void Show(String title, double length, String available) {
        System.out.println("Title of Music-Video :- "+title);
        System.out.println("Length of Music-Video :- "+length);
        System.out.println("Availablity of Music-Video :- "+available);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose 1.Movie or 2.Music-Video: ");
        int choice=scan.nextInt();
        if(choice==1) {
            Movie a1= new Movie();
            System.out.print("Enter Director Name: ");
            String name1 = scan.next();
            System.out.print("Enter Ratings: ");
            double rate = scan.nextDouble();
            System.out.print("Enter Title: ");
            a1.title = scan.next();
            System.out.print("Enter Length: ");
            a1.length = scan.nextDouble();
            System.out.print("Enter Availability: ");
            a1.available = scan.next();
            a1.Store_Display(name1,rate);
            a1.Show(a1.title,a1.length,a1.available);
        }
        else if(choice==2) {
            MusicVideo a2= new MusicVideo();
            System.out.print("Enter Artist Name: ");
            String name2 = scan.next();
            System.out.print("Enter Category: ");
            String type = scan.next();
            System.out.print("Enter Title: ");
            a2.title = scan.next();
            System.out.print("Enter Length: ");
            a2.length = scan.nextDouble();
            System.out.print("Enter Availability: ");
            a2.available = scan.next();
            a2.Store_Display(name2,type);
            a2.Show(a2.title,a2.length,a2.available);
        }
        else {
            System.out.println("Option invalid..! Try Again.. ");
        }
    }
}
