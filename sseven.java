package studying;
import java.util.Scanner;

public class sseven {
public static void main(String [] args){
	Scanner ab = new Scanner(System.in);
	
	int a = ab.nextInt();
	int b = ab.nextInt();
	int c = ab.nextInt();
	
	if(a > b && a > c){
		System.out.println("a is greater");
	}else if(b > a && b > c){
		System.out.println("b is greater");
	}else{
		System.out.println("c is greater");
	}
	
}
}
