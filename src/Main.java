public class Main {
    public static void main(String[]args){
        int[]list={1,45,6,34,8,76};
        double sum=0.0;
        for(int i=0;i< list.length;i++){
            sum+=list[i];
        }
        double average=sum/list.length;
        System.out.println(average);
    }
}
