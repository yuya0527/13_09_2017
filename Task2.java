package studying;
import java.util.Scanner;

public class Task2 {
public static void main(String [] args){
	Scanner opab = new Scanner(System.in);
	
	
	int a = opab.nextInt();
	int b = opab.nextInt();
	int op =opab.nextInt();
	
	if(op == 1){
		System.out.println(a + b);
	}else if(op == 2){
		System.out.println(a - b);
	}else if(op == 3){
		System.out.println(a * b);
	}else if(op == 4){
		System.out.println(a / b);
	}else{
		System.out.println("Not available");
	}
	
	
}
}
