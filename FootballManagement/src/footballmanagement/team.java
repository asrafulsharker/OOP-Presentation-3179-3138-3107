/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballmanagement;

/**
 *
 * @author A.S NIROB
 */


//import the arrylist class
import java.util.ArrayList;
//the list interface provides a way to store the orderd collection.
import java.util.List;
//Scanner is a class in java.util package used for obataining the input of primitive types like int, double, etc.
import java.util.Scanner;


//this is the team public class
public class team {
    
    

    private String teamName;
    private String teamAddress;
    
//    creatinf a  arrayList for player

    private List<player> players;
    
    
    
//create scanner object for user input
    
    Scanner sc = new Scanner(System.in);

//    this is peramitarize  constractor of team Class
            
    public team(String teamName, String teamAddress) {
        this.teamName = teamName;
        this.teamAddress = teamAddress;
        
        players = new ArrayList<>();
    }
    
    
// this is getter method of TeamName
    public String getTeamName() {
        return teamName;
    }
    
    
// this is setter method of TeamName 
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    
//this is getter method of TeamAddress
    public String getTeamAddress() {
        return teamAddress;
    }
    
    
//this is setter method of TeamAddress
    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress;
    }
    

    //this is getter method of players
    public List<player> getPlayers() {
        return players;
    }
    
    
    //this is setter method of players
    public void addPlayer(player player) {
        players.add(player);
    }

//    this method will print all allplayer list 
    public void printAllPlayersName() {
        try {
            System.out.println("----------------------------");
            System.out.println("        Player List         ");
            System.out.println("----------------------------");
            int c = 1;
            for (int i = 0; i < players.size(); i++) {
                System.out.println(c + ": " + getPlayers().get(i).getName());
                c++;
            }
            System.out.println("Do you want see player details? Enter no (Enter 99 for exit): ");
            int n = sc.nextInt();
            if (n != 99) {
                printPlayerByNo(n - 1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
//    this method will print player by No
    public void printPlayerByNo(int no) {
//        print player function
        try {

            System.out.println("----------------------------");
            System.out.println("      Player Details          ");
            System.out.println("----------------------------");
            players.get(no).displayPlayer();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
//    this method will print team allplayer details
    public void printAllPlayers() {
        try {
            for (int i = 0; i < players.size(); i++) {
                System.out.println("----------------------------");
                System.out.println("      Team All Players          ");
                System.out.println("----------------------------");
                players.get(i).displayPlayer();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
//    this method will search administrator and print
    public void searchPlayers(String name) {
//        search player function
        try {
            System.out.println("-------------------------------------");
            System.out.println("        Search Player by name         ");
            System.out.println("------------------------------------");
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getName().equalsIgnoreCase(name)) {
                    players.get(i).displayPlayer();
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
//this method will delete administrator
    public void deletePlayers(String name) {
//        delete player function
        try {
            System.out.println("-------------------------------------");
            System.out.println("             Player Details          ");
            System.out.println("-------------------------------------");
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getName().equalsIgnoreCase(name)) {
                    players.get(i).displayPlayer();

                    System.out.println("Do You want to delete this record? (y/n)");
                    String c = sc.next();S
                    if (c.equals("y")) {
                        players.remove(i);
                        System.out.println("Successfully Deleted");
                    }
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

