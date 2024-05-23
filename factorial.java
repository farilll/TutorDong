package Faktorial;

import java.util.Scanner;

public class Trial {

    public static void Mm() {
        Scanner x = new Scanner(System.in);
        int angka = x.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
    }

    public static void main(String[] args) {
        Mm();
    }
}
