
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        // Kullanıcıdan Girdi Alacağımız İçin 'Scanner' ı Kullanıyoruz
        Scanner input = new Scanner(System.in);
        boolean devamEt = true;

        while (devamEt) { 
            
        
        System.out.println("---HESAP MAKİNESİ---");
        // 1. Sayıyı Kullanıcıdan İstiyoruz
        System.out.print("1. Sayıyı Giriniz: ");
        int ilksayi = input.nextInt();
        
        //2. Sayıyı Kullanıcıdan İstiyoruz
        System.out.print("2. Sayıyı Giriniz: ");
        int ikincisayi = input.nextInt();
        char carpma = '3';
        // Hangi İşlemi yapmak istediğini Soruyoruz
        System.out.println("Toplama=> 1 \n Çıkartma=> 2 \n Çarpma=> 3 \n Bölme=> 4");
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
        String islem = input.nextLine();
        int hangi = input.nextInt();
         if ( hangi == 1) {
            System.out.print( "sonuç: " + ilksayi + ikincisayi);
    }
         if ( hangi == 2) {
            System.out.println("Sonuç: " + (ilksayi - ikincisayi));
    }
         if ( hangi == 3) {
            System.out.print( "sonuç: " + ilksayi * ikincisayi);
    }
          if ( hangi == 4) {
            System.out.print( "sonuç: " + ilksayi / ikincisayi);
    }
  }
  }
}
