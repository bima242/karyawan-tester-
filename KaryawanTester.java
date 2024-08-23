//object class

import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Karyawan melvin = new Karyawan(21,"melvin","kurir","TulungAgung");
        Karyawan Ibra = new Karyawan(29,"Ibra","satpam","papua nugini");
        Karyawan naufal = new Karyawan(28,"naufal","pemasak","Malang");
        Karyawan erwan = new Karyawan(7,"erwan","tukang sapu","Papua");
        Karyawan ryuci = new Karyawan(20,"ryuci","pemanjat tiang","lamongan");

        melvin.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        naufal.print();
        System.out.println();
        erwan.print();
        System.out.println();
        ryuci.print();

         Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nama siswa");
        String nama = input.nextLine();
        System.out.println("inputkan id siswa");
        int id = input.nextInt();
        System.out.println("inputkan IPk");
        double ipk = input.nextDouble();

        
    }
}