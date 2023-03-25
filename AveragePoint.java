import java.util.Scanner;
public class AveragePoint{
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);		
		System.out.print("Rakam giriniz : ");
		int n = io.nextInt();
		int count= 0, i= 0, j= 0;
		
		for(; i<n;i++) {
			if(i%3== 0 && i%4==0 ){
        j+=i;
			count++;
				}
		}
		System.out.println(j);		
		System.out.println(count);
		System.out.println("Ortalamanız: " + (j/count));
	}
}
