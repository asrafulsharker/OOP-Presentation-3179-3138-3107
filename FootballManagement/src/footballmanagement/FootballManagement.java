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


import java.util.Scanner;


public class FootballManagement {
//    this is the public class

    public static void main(String[] args) {
        
//this is the main function

        /**
         * start
         */
        
//        team barsulona start
//this is the object of a barsolona team
        team barsolona = new team("FC Barcelona", "Spain");

//        this is the object of barsolona team player

        player p1 = new player("Lionel Messi", 10, 40, 330000);
        player p2 = new player("Ansu Fati", 10, 40, 330000);
        player p3 = new player("Antone Griezmann", 10, 40, 330000);
        player p4 = new player("Ousmane Dembele", 10, 40, 330000);
        player p5 = new player("Pedri", 10, 40, 330000);
        player p6 = new player("Philippe Coutinho", 10, 40, 330000);
        player p7 = new player("Frenkie de Jong", 10, 40, 330000);
        player p8 = new player("Gerad Pique", 10, 40, 330000);
        player p9 = new player("Segino Dest", 10, 40, 330000); 
        player p10 = new player("IIaix Moriba", 10, 40, 330000);
        player p11 = new player("Martin Braithwaite", 10, 40, 330000);

//      barsolona.addPlayer(new player("Messi", 10, 40, 330000));

//addplayer opbject passing function
        barsolona.addPlayer(p1);
        barsolona.addPlayer(p2);
        barsolona.addPlayer(p3);
        barsolona.addPlayer(p4);
        barsolona.addPlayer(p5);
        barsolona.addPlayer(p6);
        barsolona.addPlayer(p7);
        barsolona.addPlayer(p8);
        barsolona.addPlayer(p9);
        barsolona.addPlayer(p10);
        barsolona.addPlayer(p11);
        
//        team barsolona end

//        team real mardrid start

        team realMadrid = new team("Real Madrid C.F", "Portuguage");
        player r1 = new player("Ronaldo", 10, 20, 432432);
        player r2 = new player("Eden Hazard", 10, 20, 432432);
        player r3 = new player("Karim Benzema", 10, 20, 432432);
        player r4 = new player("Marcelo Vieira", 10, 20, 432432);
        player r5 = new player("Rodrygo", 10, 20, 432432);
        player r6 = new player("Luka Modric", 10, 20, 432432);
        player r7 = new player("Isco", 10, 20, 432432);
        player r8 = new player("Ferland Mendy", 10, 20, 432432);
        player r9 = new player("Marvin Park", 10, 20, 432432);
        player r10 = new player("Federico Valverde", 10, 20, 432432);
        player r11 = new player("Marco Asensio", 10, 20, 432432);


//        realMadrid.addPlayer(new player("Ronaldo", 10, 20, 432432));
        realMadrid.addPlayer(r1);
        realMadrid.addPlayer(r2);
        realMadrid.addPlayer(r3);
        realMadrid.addPlayer(r4);
        realMadrid.addPlayer(r5);
        realMadrid.addPlayer(r6);
        realMadrid.addPlayer(r7);
        realMadrid.addPlayer(r9);
        realMadrid.addPlayer(r10);
        realMadrid.addPlayer(r11);
        
        
        
        team arsenal = new team("Arsenal F.C", "London");

        player a1 = new player("Martin Odegaard", 10, 40, 330000);
        player a2 = new player("Pierre-Emerick", 10, 40, 330000);
        player a3 = new player("Bukayo Saka", 10, 40, 330000);
        player a4 = new player("Nicolas Pepe", 10, 40, 330000);
        player a5 = new player("Gabriel Martinelli", 10, 40, 330000);
        player a6 = new player("Kieran Tierney", 10, 40, 330000);
        player a7 = new player("Thomas Partey", 10, 40, 330000);
        player a8 = new player("Willian", 10, 40, 330000);
        player a9 = new player("Alexzndre", 10, 40, 330000); 
        player a10 = new player("Emile Smith", 10, 40, 330000);
        player a11 = new player("Mathew Ryan", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        arsenal.addPlayer(a1);
        arsenal.addPlayer(a2);
        arsenal.addPlayer(a3);
        arsenal.addPlayer(a4);
        arsenal.addPlayer(a5);
        arsenal.addPlayer(a6);
        arsenal.addPlayer(a7);
        arsenal.addPlayer(a8);
        arsenal.addPlayer(a9);
        arsenal.addPlayer(a10);
        arsenal.addPlayer(a11);
//      team real madrid end
//     team chelsea start   
        team chelsea = new team("Chelsea F.C", "London");

        player c1 = new player("Martin Odegaard", 10, 40, 330000);
        player c2 = new player("Pierre-Emerick", 10, 40, 330000);
        player c3 = new player("Bukayo Saka", 10, 40, 330000);
        player c4 = new player("Nicolas Pepe", 10, 40, 330000);
        player c5 = new player("Gabriel Martinelli", 10, 40, 330000);
        player c6 = new player("Kieran Tierney", 10, 40, 330000);
        player c7 = new player("Thomas Partey", 10, 40, 330000);
        player c8 = new player("Willian", 10, 40, 330000);
        player c9 = new player("Alexzndre", 10, 40, 330000); 
        player c10 = new player("Emile Smith", 10, 40, 330000);
        player c11 = new player("Mathew Ryan", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        chelsea.addPlayer(c1);
        chelsea.addPlayer(c2);
        chelsea.addPlayer(c3);
        chelsea.addPlayer(c4);
        chelsea.addPlayer(c5);
        chelsea.addPlayer(c6);
        chelsea.addPlayer(c7);
        chelsea.addPlayer(c8);
        chelsea.addPlayer(c9);
        chelsea.addPlayer(c10);
        chelsea.addPlayer(c11);
        
//        team chelsea end

//     team manschester city start
        
        team manchester = new team("Manchester city", "Manchester, England ");

        player m1 = new player("Sergio Aguero ", 10, 40, 330000);
        player m2 = new player("Kevin de bruyne", 10, 40, 330000);
        player m3 = new player("Riyad mahrez", 10, 40, 330000);
        player m4 = new player("Phil foden", 10, 40, 330000);
        player m5 = new player("Ilkay Guandon", 10, 40, 330000);
        player m6 = new player("Ruben dias", 10, 40, 330000);
        player m7 = new player(" Rahin starling ", 10, 40, 330000);
        player m8 = new player("Gabriel jesus", 10, 40, 330000);
        player m9 = new player("Ferran torres", 10, 40, 330000); 
        player m10 = new player(" Rodri ", 10, 40, 330000);
        player m11 = new player(" Kyle walker", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        manchester.addPlayer(m1);
        manchester.addPlayer(m2);
        manchester.addPlayer(m3);
        manchester.addPlayer(m4);
        manchester.addPlayer(m5);
        manchester.addPlayer(m6);
        manchester.addPlayer(m7);
        manchester.addPlayer(m8);
        manchester.addPlayer(m9);
        manchester.addPlayer(m10);
        manchester.addPlayer(m11);
//        team manschister end

//team manschister united start
        
        team united = new team("Manchester united", "Greater Manchester, old trafford, England. ");

        player u1 = new player("Marcos rashford", 10, 40, 330000);
        player u2 = new player("Poul pogba", 10, 40, 330000);
        player u3 = new player("Bruno fernandes", 10, 40, 330000);
        player u4 = new player("Amad dilao", 10, 40, 330000);
        player u5 = new player("Edinson cavani", 10, 40, 330000);
        player u6 = new player("Anthony martial", 10, 40, 330000);
        player u7 = new player(" David de gea ", 10, 40, 330000);
        player u8 = new player("Harry maguire", 10, 40, 330000);
        player u9 = new player("Dean henderson", 10, 40, 330000); 
        player u10 = new player("Luke Shaw", 10, 40, 330000);
        player u11 = new player(" Fred", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        united.addPlayer(u1);
        united.addPlayer(u2);
        united.addPlayer(u3);
        united.addPlayer(u4);
        united.addPlayer(u5);
        united.addPlayer(u6);
        united.addPlayer(u7);
        united.addPlayer(u8);
        united.addPlayer(u9);
        united.addPlayer(u10);
        united.addPlayer(u11);
        
        
        team juventus = new team("Juventus", "Turin,piedmont,Italy.");

        player j1 = new player("Marcos rashford", 10, 40, 330000);
        player j2 = new player("Poul pogba", 10, 40, 330000);
        player j3 = new player("Bruno fernandes", 10, 40, 330000);
        player j4 = new player("Amad dilao", 10, 40, 330000);
        player j5 = new player("Edinson cavani", 10, 40, 330000);
        player j6 = new player("Anthony martial", 10, 40, 330000);
        player j7 = new player(" David de gea ", 10, 40, 330000);
        player j8 = new player("Harry maguire", 10, 40, 330000);
        player j9 = new player("Dean henderson", 10, 40, 330000); 
        player j10 = new player("Luke Shaw", 10, 40, 330000);
        player j11 = new player(" Fred", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        juventus.addPlayer(j1);
        juventus.addPlayer(j2);
        juventus.addPlayer(j3);
        juventus.addPlayer(j4);
        juventus.addPlayer(j5);
        juventus.addPlayer(j6);
        juventus.addPlayer(j7);
        juventus.addPlayer(j8);
        juventus.addPlayer(j9);
        juventus.addPlayer(j10);
        juventus.addPlayer(j11);
        
        
//        team maschister end

//        team paris start
                
        team paris = new team("Paris saint-Germain FC", "Paris,France. ");

        player g1 = new player("Marcos rashford", 10, 40, 330000);
        player g2 = new player("Poul pogba", 10, 40, 330000);
        player g3 = new player("Bruno fernandes", 10, 40, 330000);
        player g4 = new player("Amad dilao", 10, 40, 330000);
        player g5 = new player("Edinson cavani", 10, 40, 330000);
        player g6 = new player("Anthony martial", 10, 40, 330000);
        player g7 = new player(" David de gea ", 10, 40, 330000);
        player g8 = new player("Harry maguire", 10, 40, 330000);
        player g9 = new player("Dean henderson", 10, 40, 330000); 
        player g10 = new player("Luke Shaw", 10, 40, 330000);
        player g11 = new player(" Fred", 10, 40, 330000);

//        barsolona.addPlayer(new player("Messi", 10, 40, 330000));
        paris.addPlayer(g1);
        paris.addPlayer(g2);
        paris.addPlayer(g3);
        paris.addPlayer(g4);
        paris.addPlayer(g5);
        paris.addPlayer(g6);
        paris.addPlayer(g7);
        paris.addPlayer(g8);
        paris.addPlayer(g9);
        paris.addPlayer(g10);
        paris.addPlayer(g11);
        
        
//        team paris end
        /**
         * end
         */
//create a scanner object for input
        Scanner input = new Scanner(System.in);

        while (true) {
            
//            this is the select section
            
            System.out.println("\n--------------");
            System.out.println("Select your Option");
            System.out.println("----------------");
            System.out.println("1. Add Player");
            System.out.println("2. Print Player");
            System.out.println("3. Delete Player");
            System.out.println("4. Search Player");
            System.out.println("5. exit");
            System.out.print("Enter Option: ");
            int option = input.nextInt();

//            jodi user exit korte chay tahole option 5 hole close hobe
            
            if (option == 5) {
                input.close();
                barsolona.sc.close();
                break;
            }
            switch (option) {
//                this is the swithc case function
//                Select  team by Adding Player using option one
            case 1:
                System.out.println("\n--------------------------------");
                System.out.println("Select your team for Add Player");
                System.out.println("---------------------------------");
                System.out.println("1. barsolona");
                System.out.println("2. Real madrid");
                System.out.println("3. Arsenal");
                System.out.println("4. Chelsea");
                System.out.println("5.  Manchester city");
                System.out.println("6. Manchester united");
                System.out.println("7. Juventus");
                System.out.println("8. Paris");
                System.out.println("9. Back");
                System.out.print("Enter Option: ");
                
//                using switch case
                int optionA = input.nextInt();
                String tN = "";
                if (optionA == 1) {
//                    option one tN = team name = barsolona
                    tN = "barsolona";
                }
                if (optionA == 2) {
//                    option two tN=team name = realmadrid by selecting switch two
                    tN = "Real Madrid";
                }
                if (optionA == 3) {
//                    option three tN=team name = arsenal by selecting switch three
                    tN = "arsenal";
                }
                if (optionA == 4) {
//                    option four tN=team name = chelsea by selecting switch four
                    tN = "chelsea";
                }
                if (optionA == 5) {
//                    option five tN=team name = manschister by selecting switch five
                    tN = "manchester";
                }
                if (optionA == 6) {
//                    option six tN=team name = manschister united by selecting switch six
                    tN = "united";
                }
                if (optionA == 7) {
//                    option seven tN=team name = juventus by selecting switch seven
                    tN = "juventus";
                }
                if (optionA == 8) {
//                    option eight tN=team name = paris by selecting switch tweighto
                    tN = "paris";
                }
                if (optionA == 9) {
//                    option nine break by selecting switch nine
                    break;
                }

//                adding player details bt player name , jursey number, age, player salary
//                pName is using for input player name
//                pNumber is using for input Jursey number
//                pAge is using for input player age
//                pSalary is using for player salary
//                input.next() = String data
//                input.nextInt()= int Data
//                input.nextDauble() = double data
                
                System.out.print("Enter Player Name: ");
                String pName = input.next();
                System.out.print("Enter Player Jursey Number: ");
                int pNumber = input.nextInt();
                System.out.print("Enter Player Age: ");
                int pAge = input.nextInt();
                System.out.print("Enter Player Salary: ");
                Double pSalary = input.nextDouble();
//tN = team name
//                if tN is equals to team name then geeting player details for adding details
                if (tN.equals("barsolona")) {
                    barsolona.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("Real Madrid")) {
                    realMadrid.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("arsenal")) {
                    arsenal.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("chelsea")) {
                    chelsea.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("manchester")) {
                    manchester.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("united")) {
                    united.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("juventus")) {
                    juventus.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                if (tN.equals("paris")) {
                    paris.addPlayer(new player(pName, pNumber, pAge, pSalary));
                    System.out.println("Player Add Successfully");
                }
                

                break;
//                option 2 is printing player details
                
            case 2:
                System.out.println("\n--------------------------------");
                System.out.println("Select your team for Player Details");
                System.out.println("---------------------------------");
                System.out.println("1. Barsolona");
                System.out.println("2. Real madrid");
                System.out.println("3. Arsenal");
                System.out.println("4. Chelsia");
                System.out.println("5. Manchester city");
                System.out.println("6. Manchester united");
                System.out.println("7. Juventus");
                System.out.println("8. Paris");
                System.out.println("9. Back");
                System.out.print("Enter Option: ");
                
                
                
                int optionP = input.nextInt();


                if (optionP == 1) {
                    barsolona.printAllPlayersName();
                }
                if (optionP == 2) {
                    realMadrid.printAllPlayersName();
                }
                if (optionP == 3) {
                    arsenal.printAllPlayersName();
                }
                if (optionP == 4) {
                    chelsea.printAllPlayersName();
                }
                if (optionP == 5) {
                    manchester.printAllPlayersName();
                }
                if (optionP == 6) {
                    united.printAllPlayersName();
                }
                if (optionP == 7) {
                    juventus.printAllPlayersName();
                }
                if (optionP == 8) {
                    paris.printAllPlayersName();
                }                
                if (optionP == 9) {
                    break;
                }
                break;
                
//                input case 4 for searching player by name
                
                
            case 4:
                System.out.println("\n--------------------------------");
                System.out.println("Select your team for Search Player");
                System.out.println("----------------------------------");
                System.out.println("1. Barsolona");
                System.out.println("2. Real madrid");
                System.out.println("3. Arsenal");
                System.out.println("4. Chelsea");
                System.out.println("5.  Manchester city");
                System.out.println("6. Manchester united");
                System.out.println("7. Juventus");
                System.out.println("8. Paris");
                System.out.println("9. Back");
                System.out.print("Enter Option: ");
                int option2 = input.nextInt();
                
//                ekta string name nitece sring veriable e tarpor search function e pass kore ditece

                if (option2 == 1) {
                    System.out.print("Enter Name: ");
                    String name1 = input.nextLine();
                    barsolona.searchPlayers(name1);
                }
                if (option2 == 2) {
                    System.out.print("Enter Name: ");
                    String name2 = input.next();
                    realMadrid.searchPlayers(name2);
                }
                if (option2 == 3) {
                    System.out.print("Enter Name: ");
                    String name3 = input.next();
                    arsenal.searchPlayers(name3);
                }
                if (option2 == 4) {
                    System.out.print("Enter Name: ");
                    String name4 = input.next();
                    chelsea.searchPlayers(name4);
                }
                if (option2 == 5) {
                    System.out.print("Enter Name: ");
                    String name5 = input.next();
                    manchester.searchPlayers(name5);
                }
                if (option2 == 6) {
                    System.out.print("Enter Name: ");
                    String name6 = input.next();
                    united.searchPlayers(name6);
                }
                if (option2 == 7) {
                    System.out.print("Enter Name: ");
                    String name7 = input.next();
                    juventus.searchPlayers(name7);
                }
                if (option2 == 8) {
                    System.out.print("Enter Name: ");
                    String name8 = input.next();
                    paris.searchPlayers(name8);
                }
                if (option2 == 9) {
                    break;
                }
                break;
                
//                option three is player delete option
                
                
            case 3:
                System.out.println("\n--------------------------------");
                System.out.println("Select your team for Delete Player");
                System.out.println("---------------------------------");
                System.out.println("1. barsolona");
                System.out.println("2. Real madrid");
                System.out.println("3. Arsenal");
                System.out.println("4. Chelsea");
                System.out.println("5.  Manchester city");
                System.out.println("6. Manchester united");
                System.out.println("7. Juventus");
                System.out.println("8. Paris");
                System.out.println("9. Back");
                System.out.print("Enter Option: ");
                int option4 = input.nextInt();
// ekta string name nitece sring veriable e tarpor delete function e pass kore ditece
                if (option4 == 1) {
                    System.out.print("Enter Name: ");
                    String name1 = input.next();
                    barsolona.deletePlayers(name1);
                }
                if (option4 == 2) {
                    System.out.print("Enter Name: ");
                    String name2 = input.next();
                    realMadrid.deletePlayers(name2);
                }
                if (option4 == 3) {
                    System.out.print("Enter Name: ");
                    String name3 = input.next();
                    arsenal.deletePlayers(name3);
                }
                if (option4 == 4) {
                    System.out.print("Enter Name: ");
                    String name4 = input.next();
                    chelsea.deletePlayers(name4);
                }
                if (option4 == 5) {
                    System.out.print("Enter Name: ");
                    String name5 = input.next();
                    manchester.deletePlayers(name5);
                }
                if (option4 == 6) {
                    System.out.print("Enter Name: ");
                    String name6 = input.next();
                    united.deletePlayers(name6);
                }
                if (option4 == 7) {
                    System.out.print("Enter Name: ");
                    String name7 = input.next();
                    juventus.deletePlayers(name7);
                }
                if (option4 == 8) {
                    System.out.print("Enter Name: ");
                    String name8 = input.next();
                    paris.deletePlayers(name8);
                }
                
                if (option4 == 9) {
                    break;
                }
                break;
//            default option jodi uporer option na select kore onno kono moption select kore tahole default functionality kaj korbe
            default:
                System.out.println("Please Enter correct option");
                break;
            }
        }
    }

}
