package tugas.tugastiga;

/**
 * 
 * @author Mochammad Hari Fitrian
 * @NIM : 2109106012
 * @version 1.0
 * @since 13-5-2025
 * @description Ini adalah program mengatasi objek yang isinya null
 * 
 */

 class Lingkaran {
    private double jari2;

    public Lingkaran(double r) {
        jari2 = r;
    }

    public double getJari2() {
        return jari2;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        System.out.println("l1 : " + l1.getJari2());
        System.out.println("l2 : " + l2.getJari2());
        System.out.println("l3 : " + l3.getJari2());

        l2 = null;

        System.out.println("l1 : " + l1.getJari2());

        if (l2 != null) {
            System.out.println("l2 : " + l2.getJari2()); // baris ini tidak akan tereksekusi, karena l2 adalah null
        } else {
            System.out.println("l2 is null");
        }

        System.out.println("l3 : " + l3.getJari2());
    }
}

