import java.util.HashMap;
import java.util.Scanner;
public class StudentInformationSystemV1 {
    
    public static void main (String[] args) {
        int ogrenciSayisi = 0;
        int dersSayisi = 0;
        int dersOrt;
        String sonuc;
        System.out.println("Öğrenci Bilgi Sistemine Hoşgeldiniz..\n\nHoca : Mert Acel\nProgramın yapımcısı : Yılmaz Yağız Dokumacı\n\n");

        // Add Scanner Object 
        Scanner scan = new Scanner(System.in);
        

        // Get Number of students 
        System.out.println("Lütfen öğrenci sayısını giriniz : ");
        ogrenciSayisi = scan.nextInt();

        // Get Number of Lessons
        System.out.println("Lütfen ders sayısını giriniz : ");
        dersSayisi = scan.nextInt();

        int[][][] notlar = new int[ogrenciSayisi][dersSayisi][2];

        // Add Values 
        // First For Loop - Student Number Loop
        for (int i = 0; i< ogrenciSayisi; i++) {
        
         // Second For Loop - Lesson Number Loop
         for (int y = 0; y< dersSayisi; y++ ) {
            // Get first exam note
            System.out.println("Lüften " + (i+1) + ". öğrencinin "+ (y+1) + ". dersinin vize notunu giriniz : ");
            notlar[i][y][0] = scan.nextInt();
           // Get second exam note1
            System.out.println("Lüften " + (i+1) + ". öğrencinin "+ (y+1) + ". dersinin final notunu giriniz : ");
            notlar[i][y][1] = scan.nextInt();
            
        }
        }
        // Print Values 
        for (int m = 0; m<ogrenciSayisi; m++) {
         for(int k = 0; k<dersSayisi; k++) {
             // Calculate Course Average 
            dersOrt = ((notlar[m][k][0]*40/100) + (notlar[m][k][1]*60/100));
            // Write Passed / failed
            if (dersOrt > 60) {
                sonuc = "Geçti";
            } else {
                 sonuc = "Kaldı";
            }

            // Print All Student Values
            System.out.println("ÖğrenciNo -- DersNo -- Vize -- Final -- Ortalama -- Geçti/Kaldı");
            System.out.println("   " + (m+1) + "           " + (k+1) + "        " + notlar[m][k][0]  + "      " + notlar[m][k][1] + "        " + dersOrt + "          " + sonuc );
         
            
         }
        }
        
    }
} 