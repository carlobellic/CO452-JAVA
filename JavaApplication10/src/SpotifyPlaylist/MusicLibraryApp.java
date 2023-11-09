package MusicLibraryApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MusicLibraryApp {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);
        
        Song one = new Song ("Joe1","Joe",1);
        Song two = new Song ("Joe2","Joe",1);
        Song three = new Song ("Joe3","Joe",1);
        Song four = new Song ("Joe4","Joe",1);
        Song five = new Song ("Joe5","Joe",1);
        Song six = new Song ("Joe6","Joe",1);
        Song seven = new Song ("Joe7","Joe",1);
        Song eight = new Song ("Joe8","Joe",1);
        Song nine = new Song ("Joe9","Joe",1);
        Song ten = new Song ("Joe10","Joe",1);
        
        library.addSong (one);
        library.addSong (two);
        library.addSong (three);
        library.addSong (four);
        library.addSong (five);
        library.addSong (six);
        library.addSong (seven);
        library.addSong (eight);
        library.addSong (nine);
        library.addSong (ten);
        

             
        while (true) {
            System.out.println("Music Library Menu");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs over a given number of plays");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter the play count: ");
                    int playCount = scanner.nextInt();
                    scanner.nextLine(); 
                    Song newSong = new Song(title, artist, playCount);
                    library.addSong(newSong);
                    break;

                case 2:
                    System.out.print("Enter the song title to remove: ");
                    String songTitleToRemove = scanner.nextLine();
                    
                    break;

                case 3:
                    System.out.println("All Songs:");
                    library.printAllSongs();
                    break;

                case 4:
                    System.out.print("Enter the minimum play count: ");
                    int minPlayCount = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Songs with more than " + minPlayCount + " plays:");
                    library.printSongsOverPlayCount(minPlayCount);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
                    
            }
        }
    }
}
