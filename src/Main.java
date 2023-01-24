import java.util.Arrays;

public class Main{
    public static void main(String[]args){
        int []list={10,20,20,10,10,20,5,20};
        int []cover=new int[list.length];
        System.out.println("Array: "+ Arrays.toString(list));
        int sum=0;
        int n=0;
        System.out.println("Repeating numbers");
        for(int i=0;i< list.length;i++){
            for (int k=0;k< list.length;k++){

                if(list[i]==list[k]){
                    sum++;
                }
            }
            for(int j=0;j< list.length;j++){
                if((list[i]==cover[j])){
                    n++;
                }
            }
            if(n==0){
                System.out.println("The number "+list[i]+" was repeated "+sum+" times.");
            }
            n=0;
            sum=0;
            cover[i]=list[i];

        }

    }
}