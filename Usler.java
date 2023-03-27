import java.util.Scanner;
public class Usler {
	public static void main(String[] args) {
		Scanner io  = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = io.nextInt();
		int j= 0;
		System.out.println("Girdiğiniz rakama kadar olan dördün katları sırasıyla: \n");		
		for(int i= 1; i<number; i*=4 ) {
			j++;
			System.out.print( i+ ", ");
		}

		System.out.print("\nToplam üs adedi: " + j);
		j=0;
		System.out.println("\n\nGirdiğiniz rakama kadar olan beşin katları sırasıyla: \n");		
		for(int i= 1; i<number; i*=5 ) {
			j++;
			System.out.print( i+ ", ");
		}

		System.out.print("\nToplam üs adedi: " + j);
	}
}
