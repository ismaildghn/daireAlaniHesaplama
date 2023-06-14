import java.util.Scanner;

public class daireAlaniHesaplama {
    public static void main(String[] args) {

        int r , a;
        double pi = 3.14;

        Scanner imp = new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz");
        r = imp.nextInt();
        System.out.println("Dairenin Merkez Açısını Giriniz");
        a = imp.nextInt();

        double daireDilimi = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Dilim Alanı : " + daireDilimi);



    }
}
