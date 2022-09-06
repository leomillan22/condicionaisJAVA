import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu salario?");
		double salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		}else if (salario >= 2000.01 && salario <= 3000.00) {
			double ajuste = (salario / 100) * 8;
			System.out.println("R$ " + ajuste);
		}else if (salario >= 3000.01 && salario <= 4500.00){
			double ajuste = (salario / 100) * 18;
			System.out.println("R$ " + ajuste);
		}else if (salario > 4500.00) {
			double ajuste = (salario / 100) * 28;
			System.out.println("R$ " + ajuste);
		}else {
			System.out.println("Erro.");
		}
		sc.close();
	}

}
