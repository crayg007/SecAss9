import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Maximum Value in the Fibonacci Sequence.");
	int fibMax = scan.nextInt();
        
	System.out.println("Enter the First Integer in the Fibonacci Sequence.");
	int a1 = scan.nextInt();
        
	System.out.println("Enter the Second Integer in the Fibonacci Sequence.");
	int a2 = scan.nextInt();
        
	int[] initialFibArray = {a1,a2};
        
        while (initialFibArray[1] < fibMax) {
            System.out.println(initialFibArray[0]);
            initialFibArray[0] += initialFibArray[1];
            
            System.out.println(initialFibArray[1]);
            initialFibArray[1] += initialFibArray[0];
            }
        
        System.out.println(initialFibArray[0]);
            initialFibArray[0] += initialFibArray[1]; 
    }
    
}
