package P1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    private List<Kisi> ogrenciListesi = new ArrayList<>();
    private List<Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;




    public void anaMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();


        if(secim.equals("Q")){
           cikis();
        } else if (secim.equals("1")){
            kisiTuru ="OGRENCI";
            islemMenusu();

        } else if(secim.equals("2")){
            kisiTuru = "OGRETMEN";
            islemMenusu();

        } else {
            System.out.println("Yanlis giris yaptınız");
            anaMenu();
        }


    }
     private void islemMenusu(){

         Scanner scan = new Scanner(System.in);
         System.out.println("============= İŞLEMLER =============");
         System.out.println("1-EKLEME");
         System.out.println("2-ARAMA");
         System.out.println("3-LİSTELEME");
         System.out.println("4-SİLME");
         System.out.println("5-ANA MENÜ");
         System.out.println("Q-ÇIKIŞ\n");
         System.out.println("SEÇİMİNİZ:");
         String tercih = scan.next().toUpperCase();
         switch (tercih){
             case "1" : ekle();     break;
          //   case "2" : ara();     break;
          //   case "3" : listele();     break;
          //   case "4" : sil();     break;
             case "5" : anaMenu();     break;
             case "Q" : cikis();     break;
             default:
                 System.out.println("Hatalı secim yaptınız");
                 islemMenusu();
                         break;
         }
     }
     private void cikis(){
         System.out.println("Programı kullandıgınız icin tesekkürler");
     }

     private void ekle (){
        Scanner scan = new Scanner(System.in);
         System.out.println("---------- " + kisiTuru + "Ekleme Sayfası ----------");
         System.out.println("Ad Soyad Giriniz");
         String adSoyad= scan.nextLine();
         System.out.println("Kimlik no giriniz");
         String kimlikNo=scan.next();
         System.out.println("Yasınızı giriniz");
         int yas = scan.nextInt();

         if(kisiTuru.equals("OGRENCI")){
             System.out.println("Numaranızı Giriniz");
             String numara = scan.next();
             System.out.println("Sınıf Giriniz");
             String sinif = scan.next();
             Ögrenci ogrenci = new Ögrenci(adSoyad,kimlikNo,yas,numara,sinif);
             ogrenciListesi.add(ogrenci);





         } else {

             System.out.println("Sicil no Giriniz");
             String sicilNo = scan.next();
             System.out.println("Bölüm Giriniz");
             String bolum = scan.next();
             Ögretmen ogretmen = new Ögretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
             ogretmenListesi.add(ogretmen);

         }

     }

}
