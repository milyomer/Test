import java.util.Scanner;
public class basSum {
	public static void main(String[] args) {
		Scanner io= new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = io.nextInt();

		int tempNumber= number;
		int result=0,total=0;

		while(tempNumber!=0) {
			result= tempNumber%10;
			tempNumber/=10;
			total+=result;
		}
		System.out.println(number+ " sayısının basamakları toplamı: "+total);
	}
}
