import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double paraTutari;
        Scanner input=new Scanner(System.in);
        System.out.print("Para Tutarini Giriniz : ");
        paraTutari = input.nextDouble();

        double kdvOrani = (paraTutari<=1000) ? 0.18 : 0.08;
        System.out.println("KDV orani : " +kdvOrani);

        double kdvTutari = paraTutari * kdvOrani;
        System.out.println("KDV tutari : " +kdvTutari);

        double kdvliTutar=paraTutari+kdvTutari;
        System.out.println("KDV'li tutar : " +kdvliTutar);




    }
}
