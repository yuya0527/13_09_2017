package studying;
import java.util.Scanner;

public class eeight {
	public static void main(String [] args){
		Scanner ab = new Scanner(System.in);
		
		int a = ab.nextInt();
		
		if(a>=0 && a<=33){
			System.out.println("D");
		}else if(a>=34 && a<=40){
			System.out.println("C-");
		}else if(a>=41 && a<=50){
			System.out.println("C+");
		}else if(a>=51 && a<=60){
			System.out.println("B-");
		}else if(a>=61 && a<=80){
			System.out.println("B+");
		}else if(a>=81 && a<=100){
			System.out.println("A");
		}
		 
	}

}
