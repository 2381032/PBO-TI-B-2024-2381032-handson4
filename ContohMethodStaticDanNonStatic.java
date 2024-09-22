public class ContohMethodStaticDanNonStatic {

    //Method static untuk menghitung luas persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    //Method non-static untuk menampilkan pesan selamat datang
    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + "!");
    }

    public static void main(String[] args) {
        // Memanggil method static langsung melalui nama kelas
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5 : " + luasPersegi);

        // Membuat objek dari kelas untuk memanggil method non-static
        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanPesanSelamatDatang("Jhon");
        objek.hitungLuasPersegi(5);
    }
}
