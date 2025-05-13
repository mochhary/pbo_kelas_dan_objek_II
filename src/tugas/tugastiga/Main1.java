package tugas.tugastiga;

/**
 * 
 * @author Mochammad Hari Fitrian
 * @NIM : 2109106012
 * @version 1.0
 * @since 13-5-2025
 * @description Ini adalah program mereferensikan suatu objek 
 * 
 */
class Lingkaran {
    private double jari2;

    public Lingkaran() {
        jari2 = 1.0;
    }

    public Lingkaran(double r) {
        jari2 = r;
    }

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double r) {
        jari2 = r;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari2(5.0);
        System.out.println("Jari-jari : " + lingkaran.getJari2());
    }
}
