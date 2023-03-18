import java.util.Scanner;
public class Manav{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);		
		System.out.print("Kaç kilo armut aldınız : ");
		double armut = (io.nextDouble()* 2.14);		
		System.out.print("Kaç kilo elma aldınız : ");
		double elma = (io.nextDouble()* 3.67);		
		System.out.print("Kaç kilo domates aldınız : ");
		double domates = (io.nextDouble()* 1.11);		
		System.out.print("Kaç kilo muz aldınız : ");
		double muz = (io.nextDouble()* 0.95);		
		System.out.print("Kaç kilo patlıcan aldınız : ");
		double patlican = (io.nextDouble()* 5.00);
		
		double sum = armut+ elma+ domates+ muz+ patlican;
		System.out.println();
		System.out.println("Toplam alışveriş tutarınız: "+ sum+ "TL");
	}
}
 
