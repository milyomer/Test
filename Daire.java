import java.util.Scanner;
public class Daire{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Daire yarıçapı nedir: ");
		int r = io.nextInt();
		System.out.print("Alanını istediğiniz bölgenin açısı ne : ");
		int a = io.nextInt();
		double pi = 3.14;
		double angle = (pi* (r* r)* a)/360;
		
		System.out.println(r+ " yarıçaplı dairenin"+ a+ " açısının alanı "+ angle);
	}
}
