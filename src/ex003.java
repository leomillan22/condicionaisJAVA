import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores: \n");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos.");
		}else {
			System.out.println("Nao sao Multiplos.");
		}
		
		
			
		
		
		
		
		sc.close();
	}

}
