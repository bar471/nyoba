public class ContohProgram {
    // Atribut
    private String nama;
    private int umur;

    // Konstruktor
    public ContohProgram(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void main(String[] args) {
        // Membuat objek ContohProgram
        ContohProgram objek = new ContohProgram("John", 25);

        // Memanggil metode tampilkanInfo
        objek.tampilkanInfo();
    }
}
