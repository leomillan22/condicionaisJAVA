import java.util.Scanner;
public class ex006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		if (N >= 0 && N < 25) {
			System.out.println("Intervalo 1");
		}else if (N >= 25 && N < 50) {
			System.out.println("Intervalo 2");
		}else if (N >= 50 && N < 75) {
			System.out.println("Intervalo 3");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
