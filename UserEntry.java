import java.util.Scanner;
public class UserEntry {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("Lütfen kullanıcı adınızı giriniz: ");
		String userName = io.nextLine();
		System.out.println("Lütfen şifrenizi giriniz: ");
		String password = io.nextLine();
		String answer;
		
		if(
				(userName.equals("patika") || userName.equals("Patika")) && password.equals("java123")
				) {
			System.out.println("Sisteme başarılı bir şekilde giriş yaptınız !");
		} else if (password.equals("java123")) {
					System.out.println("Kullanıcı adınız hatalıdır. Lütfen tekrar deneyiniz !");
				}
		 		else {
			System.out.println("Şifreniz hatalıdır. Yeni şifre oluşturmak isterseniz lütfen \"evet\" olarak belirtin.");
				answer = io.next();
				if(answer.equals("evet") || answer.equals("Evet")) {
			System.out.println("Lütfen yeni şifrenizi giriniz: ");
			password = io.next();
				if (password.equals("java123")) {
					System.out.println("Lütfen öncekinden farklı bir sifre girin");
					password = io.next();
					if (password.equals("java123")) {
						System.out.println("Lütfen öncekinden farklı bir sifre girin");
						
					} else {
						System.out.println("Yeni şifreniz oluşturuldu");
					}
				}
				}
		}
	}
}
