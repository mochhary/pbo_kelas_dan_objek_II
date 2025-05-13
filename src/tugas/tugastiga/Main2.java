package tugas.tugastiga;

/**
 * 
 * @author Mochammad Hari Fitrian
 * @NIM : 2109106012
 * @version 1.0
 * @since 13-5-2025
 * @description Ini adalah program mengubah referensi ke objek lain
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

    public void setJari2(double r) {
        jari2 = r;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        System.out.println("l1 : " + l1.getJari2()); 
        System.out.println("l2 : " + l2.getJari2()); 

        l2.setJari2(10);

        System.out.println("l1 : " + l1.getJari2()); 
        System.out.println("l2 : " + l2.getJari2()); 
    }
}
