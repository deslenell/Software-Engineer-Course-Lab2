import java.util.Scanner;
import java.util.Random;
public class Guess3 {
	
	public static void instructions( String instructions){
        System.out.println(instructions);

    }
    public static void giveHint( int input_1, int input_2, int answer, String player1, String player2){
        if( input_1 < answer && input_2 < answer){
                System.out.println("Hint:" + " " + player1+ " "+ "you are getting warmer to the answer!\n");
                System.out.println("Hint:" + " " + player2+ " "+ "you are getting warmer to the answer!\n");
        }

        else if( input_1 < answer){
             System.out.println("Hint:" + " " + player1+ " "+ "you are getting warmer to the answer!\n");
        }

        else if ( input_2 < answer){
                System.out.println("Hint:" +  " " + player2 + " " + "you are getting warmer to the answer!\n");
        }

        if( input_1 > answer && input_2 > answer){
            System.out.println("Hint:" + " " + player1+ " " + " you are getting colder from the answer!\n");
             System.out.println("Hint:" + " " + player2+ " " + " you are getting colder from the answer!\n");
        }

        else if (input_1 > answer){
           System.out.println("Hint:" + player1 + " " + " you are getting colder from the answer!\n");
        }

        else if(input_2 > answer){
           System.out.println("Hint:" + player2 + " " + " you are getting colder from the answer!\n");
        }
      
        
    }
   
    public static void checkValidInput(String player1, String player2, int answer){
        int counter = 0;
        while(counter <= 3){
            Scanner myObj = new Scanner(System.in);  
            System.out.println(player1 + " "+ "Please enter a number!");
            int input_1 = Integer.parseInt(myObj.nextLine());
            System.out.println( player2 + " "+ "Please enter a number!");
            int input_2 = Integer.parseInt(myObj.nextLine());
           
            if( input_1 == answer){
                System.out.println("Correct" + " " +  player1 +  " " +"Game Over!");
                break;
            } 
            if(input_2 == answer){
                System.out.println("Correct" + " " +  player2 + " "+ "Gamer Over!");
                break;
            }
            else if (counter == 2){
                    System.out.println("Opps Both of you ran out of quesses Game Over!");
                    break;
            }

            else{
                System.out.println("Both answers are wrong \n");
                counter = counter + 1;    
            }
            giveHint( input_1, input_2, answer, player1, player2);
        
        }

    }

    public static void main(String[] args){
        Random rand = new Random();
         // Generate random integers in range 0 to 100
        int answer = rand.nextInt(100);
        System.out.println(" The answer: " + " " + answer + " \n");
        String instructions = "Instructions: In this two-player number guessing game,\n" +
                      "each player takes turns to guess a pre-determined secret number between 1 and \n" +
                      "100, receiving hints if they're wrong. The game ends when one player guesses correctly \n" +
                      "or both players have had three unsuccessful attempts each. \n" + 
                      " \n";
        instructions(instructions);              
        Scanner sec_myObj = new Scanner(System.in);
        System.out.println("Please enter your name player 1");
        String player1 = sec_myObj.nextLine();
        System.out.println("Please enter your name player 2");
        String player2 = sec_myObj.nextLine();

        checkValidInput(player1, player2, answer);
        
    } 
}
