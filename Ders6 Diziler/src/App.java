import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    /* 
        //1 haftaya ait sıcaklık bilgilerini içerisinde barındırabilecek bir dizi tanımlayınız. Klavyeden bu dizinin
        // elemanlarına veri girişi yapınız. Ardından sıcaklık ortalamasını hesaplayıp ekrana yazdırınız.

        Scanner girdi=new Scanner(System.in);

        int sıcaklık[]=new int[7];

        double ortalama,toplam=0;



        for (int i = 0; i < sıcaklık.length; i++) {

            System.out.println((i+1)+".Günün sıcaklığını giriniz.");
            sıcaklık[i]=girdi.nextInt();

            toplam +=sıcaklık[i];

            
        }
        ortalama=toplam/7;
        System.out.println("Ortalama:"+ortalama);
        */


        //. 100 elemanlı bir diziye 1-200 arasında rastgele sayılar üreterek aktaran, bu sayılar üzerinde;
        //)100'den büyük sayıların sayısını bulan
        //b)100'den küçük sayıların ortalamasını bulan
        //c)Çift sayıların sayısını bulan

        /*
        int sayılar[]=new int[100];

        int sayac1=0,sayac2=0,toplam=0,ortalama=0,sayac3=0;
        
        for (int i = 0; i < sayılar.length; i++) {

            sayılar[i] = (int) (Math.random() * 200);
            System.out.println((i+1)+".sayı:"+sayılar[i]);

            if(sayılar[i]>100)
            {
                sayac1++;
            }
            else if(sayılar[i]<100)
            {
                sayac2++;
                toplam+=sayılar[i];
            }
            ortalama=toplam/sayac2;
             if(sayılar[i]%2==0)
            {
                sayac3++;
            }
            
        }

        System.out.println("Yüzden büyük sayılar:"+sayac1);
        System.out.println("Yüzden küçük sayıların ortalaması:"+ortalama);
        System.out.println("Çift sayıların sayısı:"+sayac3);
        */

        /*Elemanları 1-100 arasında rastgele değerler olan int türden 20 elemanlı bir dizideki elemanların sayısal
        ortalamasını, en büyük değerini, en küçük değerini bulan programı yazınız 


        int sayılar[]=new int[20];
        int ortalama=0,toplam=0,enbuyuk=0,enkucuk=101;

        for (int i = 0; i < sayılar.length; i++) {
            sayılar[i]=(int) (Math.random()*100);

            System.out.println(sayılar[i]);

            toplam += sayılar[i];


            if(sayılar[i]>enbuyuk)
            {
                enbuyuk=sayılar[i];
            }
           else  if(sayılar[i]<enkucuk)
            {
                enkucuk=sayılar[i];
            }



        }
        ortalama=toplam/sayılar.length;

            System.out.println("En büyük sayı:"+enbuyuk);
            System.out.println("En küçük sayı:"+enkucuk);
            System.out.println("ortalama:"+ortalama);
        */













































    }
}
