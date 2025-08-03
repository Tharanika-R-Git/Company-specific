import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class streams_even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] arr=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        IntStream stream =Arrays.stream(arr);
        stream
        .filter(num->num%2==0)
        .forEach(System.out::println);
    }

    
}
