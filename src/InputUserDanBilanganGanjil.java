import java.util.Scanner;

public class InputUserDanBilanganGanjil {
    public static void main(String[] args) {

        // Deklarasi Judul / Tittle dalam bentuk String
        String Judul1 = "PROGRAM MENENTUKAN BILANGAN GANJIL";
        String Judul2 = ".....................................";
        System.out.println(Judul1);
        System.out.println(Judul2);

        String textAngka;
        Scanner myInput = new Scanner(System.in); // deklarasi 'myInput' sebagai variable input dari user


        System.out.println("\nMasukkan Angka : ");
        int angka = myInput.nextInt(); // memasukkan input 'nilai' ke variabel 'angka'
        System.out.println("Angka yang dimasukkan : "+angka);
        System.out.println("\nStatus Bilangan : ");


        // Memvalidasi apakah angka yang dimasukan adalah bilangan ganjil atau bukan dengan menggunakan IF ELSE Statement
        // Jika suatu angka di bagi 2 hasilnya bersisa maka angka tersebut termasuk bilangan ganjil
        if (angka %2 == 1) {
            textAngka = "adalah Bilangan Ganjil";
            System.out.println("\nAngka " +angka+ " " +textAngka);
        } else{
            textAngka = "adalah Bilangan Genap";
            System.out.println("\nAngka " +angka+ " " +textAngka);
        }

        // Memvalidasi apakah Bilangan ganjil tersebut dibawah range 1000
        if (angka < 1000){
            System.out.println(angka +" "+ "merupakan bilangan di bawah Range 1000");
        }else {
            System.out.println(angka +" "+ "merupakan bilangan di atas Range 1000");
        }

    }
}
