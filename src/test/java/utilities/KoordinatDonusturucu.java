
package utilities;

import java.awt.*;

public class KoordinatDonusturucu {
    // Orijinal ekran boyutları
    private static final int ORIJINAL_EKRAN_GENISLIK = 1080; //Pixel 4
    private static final int ORIJINAL_EKRAN_YUKSEKLIK = 2280;

    // Yeni cihazın ekran boyutları
    private static int yeniEkranGenislik;
    private static int yeniEkranYukseklik;



    public static Point koordinatlariDonustur(Point orijinalNokta, int yeniCihazEkranGenislik, int yeniCihazEkranYukseklik) {
        yeniEkranGenislik = yeniCihazEkranGenislik;
        yeniEkranYukseklik = yeniCihazEkranYukseklik;

        double xOran = (double) yeniEkranGenislik / ORIJINAL_EKRAN_GENISLIK;
        double yOran = (double) yeniEkranYukseklik / ORIJINAL_EKRAN_YUKSEKLIK;

        int yeniX = (int) (orijinalNokta.x * xOran);
        int yeniY = (int) (orijinalNokta.y * yOran);

        return new Point(yeniX, yeniY);
    }

    public static void main(String[] args) {
        //Orjinal telefona göre koordinatlar
        Point orjinalnokta=new Point(900,1400);// Pixel 7 pro ya göre 1200,1915 olacak

        //Yeni cihazin ekran boyutlari
        int yeniCihazEkranGenislik=1440; //Pixel 7 pro
        int yeniCihazEkranYukseklik=3120;

        //Koordinatlari dönustur
        Point donusturulmusNokta=koordinatlariDonustur(orjinalnokta,yeniCihazEkranGenislik,yeniCihazEkranYukseklik);

        //Yazdirilmis hali
        System.out.println("Yeni x noktasi: "+donusturulmusNokta.x);
        System.out.println("Yeni y noktasi: "+donusturulmusNokta.y);
    }

}
