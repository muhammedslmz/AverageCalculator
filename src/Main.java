public class Main{
    public static void main(String[]args){
        int [][]letter=new int[6][4];
        for (int i=0;i< letter.length;i++){
            for (int j=0;j<letter[i].length;j++){
                if(i==0||i==3||j==0)
                    System.out.print(" * ");
                else if (j==3&&i!=4&&i!=5) {
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            System.out.println();
        }
    }
}