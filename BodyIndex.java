import java.util.Scanner;
public class BodyIndex{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Lütfen boy ölçünüzü girin: ");
		double meter = io.nextDouble();
		System.out.print("Lütfen kilonuzu girin: ");
		int weight = io.nextInt();
		double calcBodyIndex = weight/ (meter* meter);
		
		System.out.println("Vücut kitle İndeksiniz: "+ calcBodyIndex);
	}
}
 
