# Komputer-dan-Pemrograman-G1A023007-Linia-Nur-Aini
1. Buatlah Perulangan hingga 100 menggunakan java dengan output sebagai berikut :
   class linia {
    public static void main(String[] args) {
        String name = "Linia Nur Aini";
        String NPM = "G1A023007";
        System.out.println("Nama : " + name);
        System.out.println("NPM : " + NPM);
        System.out.println("=================");
        for (int i = 0; i <= 100; i++) {
            if (i >= 10) {
                System.out.println(name);
            } else {
                System.out.println(i);
            }
        }
    }
}

Kode Java di atas adalah program sederhana yang mencetak informasi tentang nama dan NPM, serta melakukan perulangan dari 0 hingga 100.

class linia { - Ini adalah deklarasi kelas Java dengan nama "linia". Semua kode program Java harus berada dalam kelas, dan dalam kasus ini, kelas ini bernama "linia".

public static void main(String[] args) { - Ini adalah metode utama dalam kelas "linia". Metode main adalah titik awal eksekusi program Java. Program akan dimulai dari sini. String[] args adalah argumen yang dapat diterima oleh program.

String name = "Linia Nur Aini"; - Ini adalah deklarasi variabel name yang menyimpan string "Linia Nur Aini".

String NPM = "G1A023007"; - Ini adalah deklarasi variabel NPM yang menyimpan string "G1A023007".

System.out.println("Nama : " + name); - Ini mencetak teks "Nama :" diikuti oleh nilai dari variabel name ke layar.

System.out.println("NPM : " + NPM); - Ini mencetak teks "NPM :" diikuti oleh nilai dari variabel NPM ke layar.

System.out.println("================="); - Ini mencetak garis putus-putus (seperti garis pemisah).

for (int i = 0; i <= 100; i++) { - Ini adalah perulangan for yang akan berjalan dari 0 hingga 100 dengan variabel i sebagai penghitung.

if (i >= 10) { - Ini adalah pernyataan if yang memeriksa apakah nilai i lebih besar atau sama dengan 10.

System.out.println(name); - Jika i lebih besar atau sama dengan 10, program akan mencetak nilai dari variabel name ke layar.

else { - Jika i kurang dari 10, program akan masuk ke bagian else.

System.out.println(i); - Dalam bagian else, program akan mencetak nilai i ke layar.

Kode ini pada dasarnya mencetak informasi nama dan NPM, lalu mencetak angka dari 0 hingga 100. Jika angka lebih besar atau sama dengan 10, maka nama akan dicetak; jika tidak, angka tersebut akan dicetak.

2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while.
3. Buatlah Program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan.
   public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir (contoh: 10): ");
        int tanggal = input.nextInt();

        System.out.print("Masukkan bulan lahir (contoh: 5): ");
        int bulan = input.nextInt();

        if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            System.out.println("Zodiak Anda adalah Aries");
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Taurus");
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Gemini");
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Cancer");
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Leo");
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Virgo");
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            System.out.println("Zodiak Anda adalah Libra");
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            System.out.println("Zodiak Anda adalah Scorpio");
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            System.out.println("Zodiak Anda adalah Sagittarius");
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            System.out.println("Zodiak Anda adalah Capricorn");
        } else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            System.out.println("Zodiak Anda adalah Aquarius");
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            System.out.println("Zodiak Anda adalah Pisces");
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }
    }
}

import java.util.Scanner; - Ini adalah pernyataan impor yang mengimpor kelas Scanner dari paket java.util, yang digunakan untuk membaca input dari pengguna.

public class Main { - Ini adalah deklarasi kelas utama dengan nama "Main."

public static void main(String[] args) { - Ini adalah metode utama dari program, yang akan dieksekusi saat program dijalankan. Ini mengambil argumen dalam bentuk array args, tetapi dalam program ini, argumen tidak digunakan.

Scanner input = new Scanner(System.in); - Ini adalah inisialisasi objek Scanner yang digunakan untuk membaca input dari pengguna yang dimasukkan dari konsol.

Berikutnya, program meminta pengguna untuk memasukkan tanggal dan bulan lahir dengan menggunakan input.nextInt() untuk membaca nilai numerik dari pengguna.

Kemudian, program melakukan serangkaian perbandingan menggunakan pernyataan if-else if. Ini memeriksa nilai bulan dan tanggal yang dimasukkan oleh pengguna dan mencocokkan dengan rentang tanggal tertentu untuk menentukan zodiak yang sesuai. Setiap pernyataan if berisi dua kondisi yang harus dipenuhi untuk menampilkan zodiak yang sesuai.

Jika tidak ada zodiak yang cocok dengan tanggal lahir yang dimasukkan, maka program akan mencetak "Tanggal lahir tidak valid."

Akhirnya, program menutup objek Scanner dan berakhir.

Ini adalah program sederhana yang mengambil input tanggal dan bulan lahir, kemudian memeriksa zodiak yang sesuai dengan input tersebut dan mencetak hasilnya ke konsol.

4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.
