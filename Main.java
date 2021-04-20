import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        //inisialisasi variabel
        boolean cek = true;
        String jawab;
        do {
            //inisialisasi variabel
            String teksAwal, teksKebalikan = "";
            System.out.println("PENGECEKAN KALIMAT PALINDROME");
            Scanner in = new Scanner(System.in);
            System.out.println("Input kalimat untuk di cek:");
            //mengecilkan huruf yang ada di string
            teksAwal = in.nextLine().toLowerCase();

            //membuat array tandaBaca dengan tipe data String
            String tandaBaca[] = {".", ",", " ", "?", "!", "@", "#", "$", "%", "^", "&", "*", "_", "-", "+", "+", "|", ">", "<", "~", "`"};

            //menghitung panjang dari array tandaBaca
            int jml = tandaBaca.length;
            for (int i = 0; i < jml; i++) {
                //menghilangkan tanda baca
                teksAwal = teksAwal.replace(tandaBaca[i], "");
            }

            //membaca panjang string input
            int ukuran = teksAwal.length();
            for (int i = ukuran - 1; i >= 0; i--) {
                //membalikkan teks awal
                teksKebalikan += teksAwal.charAt(i);
            }
            //mengecek string apakah palindrome atau tidak dari string yang sudah di lowercase/dikecilkan
            if (teksAwal.equalsIgnoreCase(teksKebalikan)) {
                System.out.println("Termasuk kalimat PALINDROME.");
            } else {
                System.out.println("Tidak termasuk kalimat PALINDROME.");
            }
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T]> ");
            jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("Y")) {
                cek = false;
            }
        } while (cek);
    }
}