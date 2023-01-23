public class Main {
    public static void main(String[]args){
       int []list={1,54,9,-76,-9,44,-7};
       int max=list[0];
       int min=list[0];
       for(int i: list){
           if(i>max){
               max=i;
           }
           if(i<min){
               min=i;
           }
       }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
