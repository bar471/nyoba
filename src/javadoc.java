import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        // Membaca input suhu dalam Celsius dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        // Melakukan konversi suhu ke Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Menampilkan hasil konversi
        System.out.println(celsius + " Celsius sama dengan " + fahrenheit + " Fahrenheit");

        // Menutup scanner
        input.close();
    }
}
