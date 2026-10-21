/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class TestUserProfile {
    
    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please give your name");
       String name = scanner.nextLine();
       while(true) {
       System.out.println("Please give your favorite genre out of the following: comedy, drama, action, mystery");
       String genre = scanner.nextLine();
       
       if ("comedy".equals(genre.toLowerCase()) || 
           "drama".equals(genre.toLowerCase()) ||
           "action".equals(genre.toLowerCase()) ||
           "mystery".equals(genre.toLowerCase())) {
           UserProfile newProfile = new UserProfile(name, genre);
           System.out.println("Your user profile has been created!");
           System.out.println("UserID: " + newProfile.getUserID() + " Favorite genre: " + newProfile.getGenre());
           System.exit(0);
       } else {
           System.out.print("Invalid input, please choose from the list of genres!");
       }
       }
       
    }
    
}