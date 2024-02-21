public class HPmain {

    public static void main(String[] args) {
        hp phone1 = new hp();
        phone1.merk = "Samsung";
        phone1.tipe = "S23 Ultra";
        phone1.ukuranLayar = 6.8f;
        phone1.harga = 20000000;
        phone1.tampilInformasi();
        phone1.cekKondisi(false);
        hp phone2 = new hp("iphone", "15 Plus", 6.69f, 30000000);
    }
}