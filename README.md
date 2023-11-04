# Komputer-dan-Pemrograman-G1A023007-Linia-Nur-Aini
1. Buatlah Perulangan hingga 100 menggunakan java dengan output sebagai berikut :
   public class task1 {
    public static void main(String[] args) {
        String name = "Linia Nur Aini";
        String NPM = "G1A023007";
        System.out.println("Nama : " + name);
        System.out.println("NPM : " + NPM);
        System.out.println("=================");
        for (int i = 0 ; i<=100 ; i++){
            if (i>= 10 ){
                System.out.println(name);
            }
            else{
                System.out.println(i);
            }
        }
    }
}

public class task1 {: code dimulai dengan mendefinisikan kelas Java yang dinamakan task1. 
public static void main(String[] args) {: metode utama (entry point) dari program. Semua kode yang ada di dalam blok ini akan dieksekusi saat program dimulai.
String name = "Linia Nur Aini";: Baris ini mendefinisikan variabel name sebagai objek String.
String NPM = "G1A023007";: Baris ini mendefinisikan variabel NPM sebagai objek String.
System.out.println("Nama : " + name);: Baris ini mencetak teks "Nama : " diikuti oleh nilai dari variabel name ke layar menggunakan System.out.println.
System.out.println("NPM : " + NPM);: Baris ini mencetak teks "NPM : " diikuti oleh nilai dari variabel NPM ke layar menggunakan System.out.println.
System.out.println("=================");: Baris ini mencetak garis pemisah berupa karakter "=" ke layar.

for (int i = 0 ; i<=100 ; i++) {: Variabel i diinisialisasi dengan nilai 0, dan perulangan akan terus berlanjut selama i kurang dari atau sama dengan 100. Setiap iterasi, nilai i akan bertambah satu.
if (i >= 10) {: Baris ini memulai sebuah pernyataan if yang akan mengecek apakah nilai i lebih besar dari atau sama dengan 10.
System.out.println(name);: Jika nilai i lebih besar dari atau sama dengan 10,
else {: Bagian else dari pernyataan if.
System.out.println(i);: Jika nilai i kurang dari 10, baris ini akan mencetak nilai i ke layar.
}: Tutup dari blok else.
}: Tutup dari blok for.

2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while.
   import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int faktorial = 1;

        if (angka < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk angka negatif.");
        } else {
            int i = 1;
            while (i <= angka) {
                faktorial *= i;
                i++;
            }
            System.out.println(angka + "! = " + faktorial);
        }

        input.close();
    }
}

import java.util.Scanner; Kelas Scanner digunakan untuk mengambil masukan dari pengguna melalui keyboard.
public class task2 { }: untuk deklarasi kelas Java utama yang disebut task2. 
public static void main(String[] args) { }: Semua pernyataan dalam kurung kurawal { } akan dijalankan ketika program dijalankan.
Scanner input = new Scanner(System.in); membuat objek Scanner dengan nama input untuk mengambil masukan dari pengguna. System.in digunakan untuk menghubungkan Scanner dengan aliran masukan dari keyboard.
System.out.print("Masukkan angka: ");: pesan yang akan ditampilkan kepada pengguna untuk meminta mereka memasukkan angka.
int angka = input.nextInt();: sebuah angka bulat dari masukan yang diberikan oleh pengguna dan menyimpannya dalam variabel angka.
int faktorial = 1; digunakan untuk menyimpan hasil faktorial.

if (angka < 0) { } else { }: pernyataan kondisional. Jika angka kurang dari 0, maka program akan mencetak pesan bahwa faktorial tidak terdefinisi untuk angka negatif. Jika tidak, program akan menghitung faktorial dari angka yang dimasukkan.
Di dalam blok else, program menggunakan perulangan while untuk menghitung faktorial. Perulangan akan terus berlanjut selama i kurang dari atau sama dengan angka. 
program akan mencetak hasil faktorial dari angka yang dimasukkan oleh pengguna.
input.close();: digunakan untuk menutup objek Scanner setelah program selesai.

3. Buatlah Program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan.
   import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir (format: DD/MM):");
        String tanggalLahir = input.next();

        String[] parts = tanggalLahir.split("/");
        if (parts.length != 2) {
            System.out.println("Format tanggal tidak valid. Gunakan format DD/MM.");
            return;
        }

        int tanggal = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);

        String zodiak = findZodiacSign(tanggal, bulan);
        System.out.println("Zodiak Anda adalah: " + zodiak);

        input.close();
    }

    public static String findZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
}

import java.util.Scanner;: digunakan untuk mengambil masukan dari pengguna melalui keyboard.
public class task3 { }: deklarasi kelas utama dengan nama task3. Semua kode program berada di dalam kelas ini.
public static void main(String[] args) { }: Semua instruksi di dalam metode main akan dijalankan.
Scanner input = new Scanner(System.in);: Baris ini membuat objek Scanner bernama input yang digunakan untuk membaca masukan dari pengguna melalui System.in (yaitu keyboard).
System.out.println("Masukkan tanggal lahir (format: DD/MM):");: Ini adalah pernyataan untuk mencetak pesan ke layar, meminta pengguna untuk memasukkan tanggal lahir dalam format DD/MM.
String tanggalLahir = input.next();: Baris ini mengambil masukan pengguna dalam bentuk string dan menyimpannya dalam variabel tanggalLahir.
String[] parts = tanggalLahir.split("/");: Ini adalah pernyataan yang memecah string tanggalLahir berdasarkan tanda "/" dan menyimpan hasilnya dalam array parts. Ini digunakan untuk memisahkan tanggal dan bulan.
if (parts.length != 2) { }: kondisional yang memeriksa apakah array parts memiliki tepat dua elemen.
int tanggal = Integer.parseInt(parts[0]); dan int bulan = Integer.parseInt(parts[1]);: Baris ini mengonversi elemen-elemen yang dipisahkan dari string menjadi integer. Ini akan menjadi tanggal dan bulan dalam bentuk bilangan bulat.
String zodiak = findZodiacSign(tanggal, bulan);: Ini memanggil metode findZodiacSign dengan parameter tanggal dan bulan yang telah diambil dari masukan pengguna. Hasil dari metode ini (nama zodiak) disimpan dalam variabel zodiak.
System.out.println("Zodiak Anda adalah: " + zodiak);: Program mencetak zodiak yang telah ditemukan ke layar bersama dengan pesan "Zodiak Anda adalah: ".
input.close();: Baris ini menutup objek Scanner setelah penggunaan selesai.
public static String findZodiacSign(int day, int month) { }: untuk menentukan zodiak berdasarkan tanggal lahir yang dimasukkan.

4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.
   public class task4 {
    public static void main(String[] args){
        String [] matkul = {
                "fisika, kalkulus, psm, bahasa inggris, ptik"
        };
        for (int i=0 ; i<matkul.length; i++){
            System.out.println(matkul[i]);
        }
    }
}

public class task4 { - memiliki metode main yang merupakan titik awal eksekusi program.
public static void main(String[] args) { -merupakan metode utama yang akan dijalankan saat program dimulai. Metode ini menerima argumen dalam bentuk array string yang disebut args, meskipun dalam kode ini, args tidak digunakan.
String[] matkul = { "fisika, kalkulus, psm, bahasa inggris, ptik" }; - Ini adalah deklarasi variabel matkul yang merupakan array string.
for (int i=0 ; i<matkul.length; i++){ - struktur pengulangan for. Loop berjalan dari i sama dengan 0 hingga kurang dari array matkul.
System.out.println(matkul[i]); - array hanya memiliki satu elemen, maka pernyataan ini hanya akan mencetak satu string ke layar.
