import java.lang.Thread;
import java.util.*;
public class test{
    public static void main(String[] args) {
        int score = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        for(int i = 1 ;i<=3 ; i++){
        System.out.println(" If you want to play the round " +i+ " please PRESS : "+i);
         int option = sc.nextInt();
         int chance = 0;
         if(option == i ){
                 System.out.println("Your game will start in few seconds");
           try{
             for (int k= 1; k < 4; k++){
                Thread.sleep(1000);
                System.out.println(k);
            }
        }
             
        catch(Exception e){
            System.out.println(e);
        } 
        int number = (int)(Math.random()*100) + 1;
        System.out.println("WELCOME TO THE ROUND "+ i);
        System.out.println("I have generated a number from 1 to 100. You have to guess that no to win this round .");
        System.out.println("You have five chances to guess that number");
        for(int j=1;j<=5;j++){
              System.out.println("Enter your gussed no");
              int guess= sc.nextInt();
              if(guess<number && (number - guess <= 10) ){
                    System.out.println("close guesss but Your guessed no is low  . Plese enter some thing which is larger approx 10 times than your lastone.");
              }
              else if (guess>number && guess - number <= 10){
                   System.out.println("close guess but your guesses no is high . please enter something which is smaller approx 10 times than your lastone");
              }
              else if(guess>number ){
                System.out.println("your guesses no is too high . please enter something which is smaller than your lastone");
              }
              else if(guess<number){
                 System.out.println("Your guessed no is too low  . Plese enter some thing which is larger than your lastone.");
              }
              else{
               System.out.println("CONGRATULATION'S YOU WON THE ROUND");
               break;
              }
              chance = chance+1;
        }
        if (chance==5){
           System.out.println("NICE TRY .YOUR FIVE CHANCES ARE OVER . YOU LOSSES THIS ROUND.");
           score = score + 0 ;
           System.out.println(score);
           System.out.println("THE GENERATED NO IS = "+number);

        }
        else if(chance<=2){
           System.out.println(name+" EXCELLENT GAME PLAY. YOU WON THIS ROUND");
           score = score + 500 ;
           System.out.println(score);
           System.out.println("THE GENERATED NO IS = "+number);

        }
        else{
           System.out.println(name+"YOU WON THIS ROUND .");
           score = score + 200;
          System.out.println(score);
           System.out.println("THE GENERATED NO IS = "+number);

        }
}
    else{
        System.out.println("You do not want to play this game.");
        System.out.println("THANK YOU VISITING THIS GAME.");
        System.out.println(score);
        break;
         }
         
     }
     sc.close(); 
  }
}
    
    

    

