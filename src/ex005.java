import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int product = sc.nextInt();
		int quantity = sc.nextInt();
		double price;
		
		if (product == 1) {
			price = 4.00 * quantity;
			System.out.println("Total: R$ " + price);
		}else if(product == 2) {
			price = 4.50 * quantity;
			System.out.println("Total: R$ " + price);
		}else if(product == 3) {
			price = 5.00 * quantity;
			System.out.println("Total: R$ " + price);
		}else if(product == 4) {
			price = 2.00 * quantity;
			System.out.println("Total: R$ " + price);
		}else if(product == 5) {
			price = 1.50 * quantity;
			System.out.println("Total: R$ " + price);
		}else{
			System.out.println("");
		}
		sc.close();
	}

}
