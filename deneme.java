import java.util.Scanner;
public class deneme {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Lütfen istenilen derslere ait notlarınızı yazar mısınız?");
        System.out.print("Matematik\t : ");
        int ma = io.nextInt();
        System.out.print("Fizik\t : ");
        int f = io.nextInt();
        System.out.print("Kimya\t : ");
        int k = io.nextInt();
        System.out.print("Türkçe\t : ");
        int tu = io.nextInt();
        System.out.print("Tarih\t : ");
        int ta = io.nextInt();
        System.out.print("Müzik\t : ");
        int mu = io.nextInt();


        double notOrt = (ma + f + k + tu + ta + mu) / 6;
        String s = ((notOrt<60)? "Kaldı" : "Geçti");

        System.out.println();
        System.out.println(" Tüm derslere ait not ortalamanız: " + notOrt + " .Sonuç: " + s);
    }
}
