package tugas.tugastiga;

/**
 * 
 * @author Mochammad Hari Fitrian
 * @NIM : 2109106012
 * @version 1.0
 * @since 13-5-2025
 * @description Ini adalah program latihan untuk mengubah referensi ke objek lain
 * 
 */

class Student {
    private String nrp;

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }
}

public class LatihanStudent {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;

        x.setNrp("01");
        y.setNrp("02");

        System.out.println("x.nrp: " + x.getNrp()); 

        Student z = new Student();
        z.setNrp("03");

        x = z;

        System.out.println("x.nrp: " + x.getNrp()); 
        System.out.println("y.nrp: " + y.getNrp()); 
    }
}

