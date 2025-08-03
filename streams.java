import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class streams{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] arr=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arr[i]=sc.nextInt();
        }
        IntStream stream=Arrays.stream(arr);
        stream.forEach(System.out::print);

    }
}

/*In Java, `IntStream` is a specialized **interface** from the `java.util.stream` package designed for
 handling streams of primitive `int` values efficiently, avoiding the overhead of boxing seen with `Stream<Integer>`. 
 When we write `IntStream stream = Arrays.stream(arr);`, we are converting an `int[]` array into an `IntStream` using `Arrays.stream()`. 
 Here, `stream` is a **reference variable** pointing to an object that implements the `IntStream` interface, allowing us
  to perform functional-style operations like `forEach`, `map`, `filter`, `sum`, etc. This approach is both memory-efficient and clean, 
  especially when processing large collections of primitive data.*/
