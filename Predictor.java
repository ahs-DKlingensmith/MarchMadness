
/**
 * Dylan Klingensmith
 * NCAA Tournament
 * AP Computer Science
 * 2/22/19
 */

import java.util.Random;
import java.util.ArrayList;

public class Predictor {

    public static void main(String[] args) {

        //Establish ArrayList for the Final Four
        ArrayList<Team> finalFour = new ArrayList(4);

        //Establish ArrayList for the East region and add teams
        ArrayList<Team> eastRoundOne = new ArrayList();
        eastRoundOne.add(new Team("Duke", 1, 137));
        eastRoundOne.add(new Team("N. Dakota St.", 16, 36));
        eastRoundOne.add(new Team("VCU", 8, 173));
        eastRoundOne.add(new Team("UCF", 9, 104));
        eastRoundOne.add(new Team("Mississippi St.", 5, 247));
        eastRoundOne.add(new Team("Liberty", 12, 167));
        eastRoundOne.add(new Team("Virginia Tech", 4, 180));
        eastRoundOne.add(new Team("Saint Louis", 13, 72));
        eastRoundOne.add(new Team("Maryland", 6, 181));
        eastRoundOne.add(new Team("Belmont", 11, 77));
        eastRoundOne.add(new Team("LSU", 3, 93));
        eastRoundOne.add(new Team("Yale", 14, 51));
        eastRoundOne.add(new Team("Louisville", 7, 302));
        eastRoundOne.add(new Team("Minnesota", 10, 22));
        eastRoundOne.add(new Team("Michigan St.", 2, 198));
        eastRoundOne.add(new Team("Bradley", 15, 82));

        //Establish ArrayList for the West region and add teams
        ArrayList<Team> westRoundOne = new ArrayList();
        westRoundOne.add(new Team("Gonzaga", 1, 160));
        westRoundOne.add(new Team("F. Dickonson", 16, 132));
        westRoundOne.add(new Team("Syracuse", 8, 169));
        westRoundOne.add(new Team("Baylor", 9, 256));
        westRoundOne.add(new Team("Marquette", 5, 164));
        westRoundOne.add(new Team("Murray St.", 12, 98));
        westRoundOne.add(new Team("Florida St.", 4, 74));
        westRoundOne.add(new Team("Vermont", 13, 56));
        westRoundOne.add(new Team("Buffalo", 6, 79));
        westRoundOne.add(new Team("Arizona St.", 11, 69));
        westRoundOne.add(new Team("Texas Tech", 3, 174));
        westRoundOne.add(new Team("Northern Ky.", 14, 204));
        westRoundOne.add(new Team("Nevada", 7, 85));
        westRoundOne.add(new Team("Florida", 10, 327));
        westRoundOne.add(new Team("Michigan", 2, 222));
        westRoundOne.add(new Team("Montana", 15, 52));

        //Establish ArrayList for the Midwest region and add teams
        ArrayList<Team> midwestRoundOne = new ArrayList();
        midwestRoundOne.add(new Team("North Carolina", 1, 113));
        midwestRoundOne.add(new Team("Iona", 16, 243));
        midwestRoundOne.add(new Team("Utah St.", 8, 162));
        midwestRoundOne.add(new Team("Washington", 9, 26));
        midwestRoundOne.add(new Team("Auburn", 5, 179));
        midwestRoundOne.add(new Team("New Mexico St.", 12, 41));
        midwestRoundOne.add(new Team("Kansas", 4, 15));
        midwestRoundOne.add(new Team("Northeastern", 13, 118));
        midwestRoundOne.add(new Team("Iowa St.", 6, 296));
        midwestRoundOne.add(new Team("Ohio St.", 11, 168));
        midwestRoundOne.add(new Team("Houston", 3, 53));
        midwestRoundOne.add(new Team("Georgia St.", 14, 3));
        midwestRoundOne.add(new Team("Wofford", 7, 44));
        midwestRoundOne.add(new Team("Seton Hall", 10, 123));
        midwestRoundOne.add(new Team("Kentucky", 2, 90));
        midwestRoundOne.add(new Team("Abilene Christ.", 15, 16));

        //Establish ArrayList for the South region and add teams
        ArrayList<Team> southRoundOne = new ArrayList();
        southRoundOne.add(new Team("Virginia", 1, 115));
        southRoundOne.add(new Team("Gardner-Webb", 16, 29));
        southRoundOne.add(new Team("Mississippi", 8, 228));
        southRoundOne.add(new Team("Oklahoma", 9, 102));
        southRoundOne.add(new Team("Wisconsin", 5, 246));
        southRoundOne.add(new Team("Oregon", 12, 272));
        southRoundOne.add(new Team("Kansas St.", 4, 43));
        southRoundOne.add(new Team("UC Irvine", 13, 10));
        southRoundOne.add(new Team("Villanova", 6, 139));
        southRoundOne.add(new Team("Saint Mary's", 11, 260));
        southRoundOne.add(new Team("Purdue", 3, 123));
        southRoundOne.add(new Team("Old Dominion", 14, 60));
        southRoundOne.add(new Team("Cincinnati", 7, 45));
        southRoundOne.add(new Team("Iowa", 10, 54));
        southRoundOne.add(new Team("Tennessee", 2, 87));
        southRoundOne.add(new Team("Colgate", 15, 127));

        //Compare the rankings of each pair of East teams and determine the 
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               eastRoundOne.remove(compareTeams(eastRoundOne.get(y),
                        eastRoundOne.get(y + 1)));
                          
            }  
            
            
        }
        
        
            
        finalFour.add(eastRoundOne.get(0));
       
        //Compare the rankings of each pair of West teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               westRoundOne.remove(compareTeams(westRoundOne.get(y),
                        westRoundOne.get(y + 1)));
                        
            }                  
            
           
        }
        
        
        finalFour.add(westRoundOne.get(0));
        
        //Compare the rankings of each pair of South teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               southRoundOne.remove(compareTeams(southRoundOne.get(y),
                        southRoundOne.get(y + 1)));
                        
            }
             
          
        }
        
        
        finalFour.add(southRoundOne.get(0));
        
        //Compare the rankings of each pair of Midwest teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               midwestRoundOne.remove(compareTeams(midwestRoundOne.get(y),
                        midwestRoundOne.get(y + 1)));
                        
            }
            
           
        }
          
        
        finalFour.add(midwestRoundOne.get(0));
    
        //Print the names of the teams in the Final Four
        for (int x = 0; x < 4; x++) {
            
            System.out.println(finalFour.get(x).getName());
            
        }
       
    }

    //The compareTeams method returns the team with the greater power ranking
    //If the rankings are tied, the method generates a random number for each
    //team and returns the team with the greater number
    public static Team compareTeams(Team team1, Team team2) {

        if (team1.getPowerRanking() < team2.getPowerRanking()) {

            return team2;

        } else if (team2.getPowerRanking() < team1.getPowerRanking()) {

            return team1;

        } else {

            Random randomizer = new Random();

            int number1 = randomizer.nextInt(100) + 1;
            int number2 = randomizer.nextInt(100) + 1;

            if (number1 < number2) {

                return team2;

            } else {

                return team1;

            }

        }

    }

}
