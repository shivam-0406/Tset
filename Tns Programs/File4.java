import java.util.*;  
import java.util.stream.Collectors;  

public class File4 {  
    public static void main(String[] args) {  
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);  
        
        List<Integer> evenNumbers = numbers.stream()  
                .filter(num->num%2==0)  
                .collect(Collectors.toList());  

        System.out.println("Even Numbers:" + evenNumbers);  
    }  
}