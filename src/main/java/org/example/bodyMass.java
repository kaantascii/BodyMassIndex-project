package org.example;

import java.util.Scanner;

public class bodyMass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Scanner ile kullanıcıdan değer girmemizi isteriz.

            //Boy ve Kilo değerleri istendiği için onları yazıyoruz
            System.out.print("Lütfen boyunuzu (metre) cinsinden giriniz ?"); //sormak istediğimiz soruyu yazarız.
            double boy = scanner.nextDouble(); //Kullanıcı klavyeden bir sayı girdiğinde, scanner.nextDouble() bu sayıyı okur ve programın devamında kullanılabilecek bir double türüne dönüştürür.

            System.out.print("lütfen Kilonuzu giriniz ? "); //sormak istediğimiz değer veya nesnenin ismini yazarız.
            double kilo = scanner.nextDouble();

            //Şimdi Body Mass İndex hesaplmaya geçilir.
            double bmi = kilo / Math.pow(boy, 2); //formül kilonu boyun karesine bölümü bmi verir.
            // veya double bmi = kilo / (boy*boy); de hesaplanabilir.

            //sonucu yazdırırız.
            System.out.println("Vücut Kitle indeksiniz:"+  bmi );

        }

}
