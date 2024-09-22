import java.util.Scanner;

public class SoSanhChuoi {
    public static void main(String[] args)
    {

        // nhap chuoi thu nhat va thu hai
        System.out.println("nhap chuoi thu nhat: ");
        String a = new Scanner(System.in).nextLine();


        System.out.println("nhap chuoi thu hai: ");
        String b = new Scanner(System.in).nextLine();

        // hien thi ket qua phep so sanh hai chuoi
        System.out.println( "ket qua so sanh 2 chuoi: " + a.equals(b) );

    }

}
