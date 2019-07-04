import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {

 // Scanner object   
 Scanner scan = new Scanner(System.in);

 // Get sayi1 value
 System.out.println("Lütfen 1. Sayıyı giriniz : ");
 int sayi1 = scan.nextInt();
 
 // Get sayi2 value 
 System.out.println("Lütfen 2. Sayıyı giriniz : ");
 int sayi2 = scan.nextInt();
 
 // Get preference
 System.out.println("Lütfen bir işlem seçiniz : \n 1 - Topla \n 2 - Çıkar \n 3 - Bölme \n 4 - Çarpma \n 5 - Mod al");
 int tercih = scan.nextInt();
 
 int sonuc;
 switch (tercih){
     case 1 : 
     sonuc = sayi1 + sayi2;
     System.out.println("Toplama işleminin sonucu : " + sonuc);
     break;
     case 2 : 
     sonuc = sayi1 - sayi2;
     System.out.println("Çıkarma işleminin sonucu : " + sonuc);
     break;
     case 3 :
     sonuc = sayi1 / sayi2;
     System.out.println("Bölme işleminin sonucu : " + sonuc);
     break;
     case 4 : 
     sonuc = sayi1 * sayi2;
     System.out.println("Çarpma işleminin sonucu : " + sonuc);
     break;
     case 5 :
     sonuc = sayi1 % sayi2;
     System.out.println(sayi1 + " sayısının " + sayi2 +" sayısına modu : " + sonuc);
     break;
}
 
 System.out.println("Programdan çıkmak için herhangi bir tuşa basın...");
 String tus = scan.next(); 
 if (tus == "") {
     System.exit(0);
 }




}
      }