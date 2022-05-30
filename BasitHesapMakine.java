
package basithesapmakine;

import java.util.Scanner;

public class BasitHesapMakine {


    public static void main(String[] args) {

        {
            double sayi1, sayi2;
      
            Scanner scanner = new Scanner(System.in);
      
            System.out.println("Sayıları gir:");
      
            sayi1 = scanner.nextDouble();
      
            sayi2 = scanner.nextDouble();
      
            System.out.println("İşlemi seç: (+,-,*,/)");
      
            char islem = scanner.next().charAt(0);
      
            double sonuc = 0;
      
            switch (islem) {
      
            case '+':
      
                sonuc = sayi1 + sayi2;
      
                break;

            case '-':
      
                sonuc = sayi1 - sayi2;
      
                break;
      
            case '*':
      
                sonuc = sayi1 * sayi2;
      
                break;
      
            case '/':
      
                sonuc = sayi1 / sayi2;
      
                break;
      
            default:
      
                System.out.println("Hatalı işlem.");
      
                break;
            }
      
            System.out.println("Sonuç:");
      
            System.out.println();
      
            System.out.println(sayi1 + " " + islem + " " + sayi2
                               + " = " + sonuc);
        }
        
    }
           
}
