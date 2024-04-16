package org.example;

import java.util.Scanner;
// Heron Formülü
// Klavyeden tüm kenar uzunlukları girilen üçgenin alanını hesaplayan program.


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Lütfen Kenar Uzunluklarını Giriniz. --- ");
        double a;
        double b;
        double c;
        double alan;
        double u;

        System.out.print("1. Kenarı Giriniz : ");
        a = scanner.nextDouble();

        System.out.print("2. Kenarı Giriniz : ");
        b = scanner.nextDouble();

        System.out.print("3. Kenarı Giriniz : ");
        c = scanner.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Hata: Bu kenar uzunluklarıyla üçgen oluşturulamaz !!! ");
            System.out.println("Lütfen Tekrar Deneyiniz... ");
        } else {
            u = (a + b + c) / 2;
            alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
            System.out.println("Üçgenin alanı : " + alan);
        }

        scanner.close();
    }
}