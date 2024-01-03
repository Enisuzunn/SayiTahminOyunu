
package sayı.tahmini.oyunu;

import java.util.Random;
import java.util.Scanner;

public class SayıTahminiOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAYI TAHMİNİ OYUNUNA HOŞ GELDİNİZ!!!");
        System.out.println("LÜtfen 1-100 arasında bir sayı giriniz");
        int tahmin = scanner.nextInt();
        Random r = new Random();
        int random =r.nextInt(101);
        while (tahmin != random)
        if(tahmin<0 || random>100){
            System.out.println("1 ile 100 arasında bir değer giriniz");
        tahmin = scanner.nextInt();

        }
        else if (tahmin < random){
                System.out.println("Daha büyük bir sayı giriniz");
        tahmin = scanner.nextInt();
        

        }
         else
                System.out.println("Daha küçük bir sayı giriniz");
        tahmin = scanner.nextInt();
        System.out.println("Tebrikler oyunu kazandınız");
    }          
    
       
        
}    

        
