import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=input.nextInt();
        int[] list=new int[size];
        for (int i=0;i< list.length;i++){
            System.out.print("Enter the "+(i+1)+". element of array: ");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}