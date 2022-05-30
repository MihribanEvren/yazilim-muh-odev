
package basithesapmakine;

import java.util.Scanner;

public class BasitHesapMakine {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********************************");
        String islemler = "1.Toplama işlemi\n" 
                         +"2.Çıkarma işlemi\n" 
                         +"3.Çarpma işlemi\n" 
                         +"4.Bölme işlemi\n";
        System.out.println(islemler);
        System.out.println("**********************************");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        String islem = scanner.nextLine();
        
        switch(islem){
            case "1": 
                System.out.println("1. sayı:");
                int sayi1 = scanner.nextInt();
                System.out.println("2.sayı:");
                int sayi2 = scanner.nextInt();
                int toplam = sayi1+sayi2;
                System.out.println("Toplamları= " + toplam);
                break;
            case "2": 
                System.out.println("1. sayı:");
                sayi1 = scanner.nextInt();
                System.out.println("2.sayı:");
                sayi2 = scanner.nextInt();
                int çıkarma = sayi1-sayi2;
                System.out.println("Fark= " + çıkarma);
                break;
            case "3": 
                System.out.println("1. sayı:");
                sayi1 = scanner.nextInt();
                System.out.println("2.sayı:");
                sayi2 = scanner.nextInt();
                int çarpım = sayi1*sayi2;
                System.out.println("Çarpımları= " + çarpım);
                break;
            case "4": 
                System.out.println("1. sayı:");
                double sayi3 = scanner.nextInt();
                System.out.println("2.sayı:");
                double sayi4 = scanner.nextInt();
                double bölüm = sayi3/sayi4;
                System.out.println("Bölümleri:= " + bölüm);
                break;
            default:
                System.out.println("Geçersiz işlem...");
        
        
        
        }
        
    
    
}
}