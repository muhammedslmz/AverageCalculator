import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Random rand =new Random();
        int number = rand.nextInt(100);
        int selected;
        int []wrong=new int[5];
        boolean isWin=false;
        /*
        @author
               Muhammed Solmaz
         */

        Scanner inp =new Scanner(System.in);
        int right=5;
        while(right>0){
            System.out.print("Enter your guess: ");
            selected= inp.nextInt();

            if (selected<0||selected>99){
                System.out.println("Please enter the number between 0-100: ");
                continue;
            }
            if(selected==number){
                System.out.println("Congratulations, right guess: "+selected);
                isWin=true;
                break;
            }else {


                System.out.println("Wrong number you're entered.");
                if(selected>number){
                    System.out.println(selected+" is bigger than our secret number.");
                }else{
                    System.out.println(selected+" is smaller than our secret number. ");
                }
                wrong[right-1]=selected;
                right--;
                System.out.println("Remaining right: "+right);
                System.out.println("---------------------------");
            }
        }
        if(!isWin){
            System.out.println("You're failed.");
            System.out.println("Your guesses: "+ Arrays.toString(wrong ));
        }
        System.out.println("Secret number is: "+number);

    }
}