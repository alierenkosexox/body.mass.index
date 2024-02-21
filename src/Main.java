import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
            double kilo ,boy , bmi;                 //formül için kilo boy tanımlandı

                Scanner input = new Scanner(System.in);    // kilo verisi için scanner
                System.out.print("Kilonuzu Girin : ");   //kilo için soru
                kilo = input.nextDouble();                 // öğrenilen kiloyu kaydet

                System.out.print("Boyunuzu Girin(örn:1,75) : ");
                boy  = input.nextDouble();

                //Kilo (kg) / Boy(m) * Boy(m)
                bmi = (kilo/(boy*boy));   //vücut kitle indeksi formülü
                System.out.println("Vücut Kitle İndeksiniz : "+ bmi);   // denklemden çıkan sonucu yazdır
            }
}           // Ali Eren KÖSE 21/02/2024 05:49