package SpotifyPlaylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicLibraryApp {
    public static void main(String[] args) {
        // Create a MusicLibrary instance to manage songs
        MusicLibrary library = new MusicLibrary();
        
        
        Scanner scanner = new Scanner(System.in);
        
        // Create ten Song objects and add them to the music library
        Song one = new Song("Alone Again ", "The Weeknd", 164657602);
        Song two = new Song("Just The Way You Are", "Bruno Mars", 1773603056);
        Song three = new Song("Money Trees", "Kendrick Lamar", 1225496391);
        Song four = new Song("Ghost", "Justin Bieber", 1296542137);
        Song five = new Song("Mockingbird", "Eminem", 1382278752);
        Song six = new Song("The Real Slim Shady", "Eminem", 1532459853);
        Song seven = new Song("Blank Space", "Taylor Swift", 1589818931);
        Song eight = new Song("Last Friday Night", "Katy Perry", 959433175);
        Song nine = new Song("Kill Bill", "SZA", 1439153910);
        Song ten = new Song("Woman", "Doja Cat", 1421862085);
        
        // Add these songs to the music library
        library.addSong(one);
        library.addSong(two);
        library.addSong(three);
        library.addSong(four);
        library.addSong(five);
        library.addSong(six);
        library.addSong(seven);
        library.addSong(eight);
        library.addSong(nine);
        library.addSong(ten);

        // Main menu loop
        while (true) {
            System.out.println("Music Library Menu");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs over a given number of plays");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Get the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Option to add a new song
                    System.out.print("Enter the song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter the play count: ");
                    int playCount = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    // Create a new Song object and add it to the library
                    Song newSong = new Song(title, artist, playCount);
                    library.addSong(newSong);
                    break;

                case 2:
                    // Option to remove a song
                    System.out.print("Enter the song title to remove: ");
                    String songTitleToRemove = scanner.nextLine();
                    // Implement code here to remove the specified song
                    break;

                case 3:
                    // Option to print all songs in the library
                    System.out.println("All Songs:");
                    library.printAllSongs();
                    break;

                case 4:
                    // Option to print songs with a specified minimum play count
                    System.out.print("Enter the minimum play count: ");
                    int minPlayCount = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Songs with more than " + minPlayCount + " plays:");
                    library.printSongsOverPlayCount(minPlayCount);
                    break;

                case 5:
                    // Option to exit the program
                    System.out.println("Goodbye!");
                    scanner.close(); // Close the Scanner
                    System.exit(0); // Exit the program
                    break;

                default:
                    // Handles invalid choices for inputs.
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
