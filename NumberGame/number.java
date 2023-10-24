import java.io.*;
import java.util.*;
import java.util.Scanner;

class number{
    

        public static void playGame()
        {
            int ans=(int) (Math.random() * 100)+1 ;
            int k = 1;
            Scanner sc=new Scanner(System.in);
            boolean Correct=false;
            

            while(k<=3)
            {
                System.out.println("Enter the number between 1 to 100 to guess:");
                int n = sc.nextInt();
                if(n > ans)
                {
                    System.out.println("The guess is too high\n");
                }
                else if(n < ans)
                {
                    System.out.println("The guess is too low\n");
                }
                else
                {
                    System.out.println("The guess is Correct");
                    System.out.println("You win! You tried " + k + " time(s) total\nSo your score is " + k + ".");
                    Correct=true;
                    break;
                }
            k++;
            
            }
            if(Correct==false)
            {
                System.out.println("You ran out of attempts...!\n ");
            }
            
            System.out.println("Enter 'Yes' to play again...");
            String playagain = sc.next();

            if(playagain.equalsIgnoreCase("Yes"))
            {
                playGame();
            }
            else
            {
                System.out.println("Thank you for playing.");
            }
        }

    public static void main(String[] args)
    {
        playGame();
    }

}