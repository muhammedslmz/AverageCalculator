import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=inp.nextInt();

        System.out.print("Enter the number of colon: ");
        int col=inp.nextInt();
        int [][]list=new int[row][col];
        int[][]listTranspoze=new int[col][row];
        for (int i=0;i< list.length;i++){
            for (int j=0;j<list[0].length;j++){
                list[i][j]=inp.nextInt();
            }
        }
        System.out.println("Matris :");
        for (int[]a:list){
            for (int b:a){
                System.out.print(b+" \t");
            }
            System.out.println();
        }
        System.out.println("Transpoze :");
        for(int i=0;i< list.length;i++){
            for (int j =0; j<list[0].length;j++){
                listTranspoze[j][i]=list[i][j]  ;
            }
        }

        for (int[] a: listTranspoze){
            for (int b: a){
                System.out.print(b+" \t");
            }
            System.out.println();
        }


    }
}