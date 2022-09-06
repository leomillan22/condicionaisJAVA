import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		int X = sc.nextInt();
		
		if (Y > 0 && X > 0) {
			System.out.println("Q1");
			
		}else if(Y > 0 && X < 0) {
			System.out.println("Q2");
			
		}else if(Y < 0 && X < 0) {
			System.out.println("Q3");
			
		}else if(Y < 0 && X > 0) {
			System.out.println("Q4");
			
		}else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
