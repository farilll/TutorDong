package Uang;

import java.util.Scanner;

public class KonversiDolar {

    public static void RupiahDolar() {
        Scanner x = new Scanner(System.in);
        System.out.println("[1].Dollar to Rupiah");
        System.out.println("[2].Rupiah to Dollar");
        int pil = x.nextInt();
        if (pil == 1) {
            System.out.println("konversi: ");
            double y = x.nextInt();
            double c = y * 16000;
            System.out.println(c);
        }else if(pil == 2){
            System.out.println("konversi: ");
            double y = x.nextInt();
            double c = y / 16000;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        RupiahDolar();
    }

}
