import java.util.Scanner;
public class ListEvenNumbers {
	public static void main(String[] args) {
		Scanner io  = new Scanner(System.in);
		int number, toplam = 0;
		
		do {
			System.out.print("Lütfen Bir sayı giriniz: ");
			number = io.nextInt();
			
			if(number%2==0 && number%4==0)
				toplam+= number;
			
		}while(number%2==0);
		
		System.out.println("Tek sayılarınızın toplamı: " + toplam);
	}
}
