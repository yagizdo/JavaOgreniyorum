import java.util.Random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class WordGuessingGame {
    public static void main (String[] args) {
        /* Turkish - English Translate
        --------------------------------- 
        Kelime = Word
        kelimeSec = selectWord
        secilenKelime = selectedWord
        */

        // String Words Array
        String[] kelime = {"Yilmaz", "Selim", "Mustafa","Mert","Oguz"};
        
        // Program Starting
        System.out.println(" Kelime Tahmin oyununa hoşgeldiniz..\n Her kelime de 3 kere deneme hakkınız mevcut..\n Her kelime bildiğinizde 10 puan kazanacaksınız..\n"+ " Listede ki isimler : " + Arrays.toString(kelime) + "\n BAŞARILAR...");
       
        // Scanner Object
        Scanner scan = new Scanner(System.in);
        
        // Get User Choice
        System.out.println("Lütfen bir tahmin yapınız..");
        String secim = scan.next();
        // Select Random Wordcls
        Random rnd = new Random();
        int kelimeSec = rnd.nextInt(5);
        String secilenKelime = kelime[kelimeSec];

        // Result
        if (secim.equals(secilenKelime)) {
            System.out.println("Tebrikler kelimeyi doğru bildiniz..\n Seçilen Kelime : " + secilenKelime);
        } else {
            System.out.println("Üzgünüm Bilemediniz..\n Siz " + secim + " dediniz fakat secilen kelime " + secilenKelime + " idi.");
        }
        
        // Print Selected Word
        //System.out.println(secilenKelime);
    }
}