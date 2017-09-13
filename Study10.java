package studying;
import java.util.Scanner;

public class Study10 {
	public static void main(String [] args){
	Scanner abcd = new Scanner(System.in);
	
	int a = abcd.nextInt();
	int b = a/1000;
	int c = (a-1000*b)/500;
	int d = (a-1000*b-500*c)/100;
	int e = (a-1000*b-500*c-100*d)/50;
	int f = (a-1000*b-500*c-100*d-50*e)/20;
	int g = (a-1000*b-500*c-100*d-50*e-20*f)/10;
	
	if(a >= 10){
		System.out.println("1000×" + b);
		System.out.println("500×" + c);
		System.out.println("100×" + d);
		System.out.println("50×" + e);
		System.out.println("20×" + f);
		System.out.println("10×" + g);	
	}else{
		System.out.println("No money");
	}
	
	}

}
