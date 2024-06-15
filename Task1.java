import java.lang.Thread;
import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(" If you want to play the game ''GUESS THE NUMBER'' please PRESS : 1");
         int option = sc.nextInt();
         if(option == 1){
        System.out.println("Your game will start in few seconds");
           try{
            int chance =0;
             for (int i = 1; i < 4; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
             int number = (int)(Math.random()*100) + 1;
             System.out.println("WELCOME TO THE GAME ");
             System.out.println("I have generated a number 1 from to 100. You have guess that no to win this game.");
             System.out.println("You have five chances to guess that number");
             for(int i=1;i<=5;i++){
                   System.out.println("Enter your gussed no");
                   int guess= sc.nextInt();
                   if(guess<number){
                         System.out.println("Your guessed no is too low . Please enter the new no. which is larger than your last guess. ");
                   }
                   else if (guess>number){
                        System.out.println("Your guesses no is too high. Please enter the new no. which is smaller than your last guess ");
                   }
                   else{
                    System.out.println("CONGRATULATION'S YOU WON THE GAME ");
                    break;
                   }
                   chance = chance+1;
             }
             if (chance==5){
                System.out.println("Nice try .Your five chances are over . You loss the game.");
                System.out.println(number);
             }
             else if(chance==2){
                System.out.println(name+"excellent game play. You won the game");
             }
             else{
                System.out.println(name+"  You won the game .");
             }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    else{
        System.out.println("You do not want to play this game.");
        System.out.println("THANK YOU VISITING THIS GAME.");
    }
        sc.close();
    }

    }



