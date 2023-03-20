import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.print("Lütfen işlem yapmak istediğiniz ilk sayıyı giriniz:");
		int a = io.nextInt();
		
		System.out.print("Lütfen işlem yapmak istediğiniz ikinci sayıyı girin:");
		int b = io.nextInt();
		
		System.out.print("Lütfen yapmak istediğiniz işlen için; \n Toplama için 1 \n Çıkarma için 2 \n Çarpma için 3 \n Bölme için 4 giriniz: ");
		int c = io.nextInt();
		
		switch(c) {
		
			case 1 : System.out.println("Girdiğiniz verilerle yapmak istediğiniz toplama işleminin sonucu: "+ (a+ b));
				break;
			case 2 : System.out.println("Girdiğiniz verilerle yapmak istediğiniz toplama işleminin sonucu: "+ (a- b));
				break;
			case 3 : System.out.println("Girdiğiniz verilerle yapmak istediğiniz toplama işleminin sonucu: "+ (a* b));
			    break;
			case 4 : if(b>0) 
						System.out.println("Girdiğiniz verilerle yapmak istediğiniz toplama işleminin sonucu: "+ (a / b));
					 else
						 System.out.println("Bölme işlemi için ikinci rakamınız sıfır olamaz. Lütfen geçerli bir değer girip tekrar deneyiniz");
				 break;
			default : System.out.println("Lütfen belirtilen işlem numarası dışında değer girmeyin. Tekrar deneyiniz. ");
		}
	
	}
}
