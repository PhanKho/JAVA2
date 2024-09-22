import java.util.InputMismatchException;
import java.util.Scanner;

public class ChiaLayDu {
    public static void main(String[] args) {

        try {

            // nhap so thu nhat tu ban phim
            System.out.println("so thu nhat: ");
            int a = new Scanner(System.in).nextInt();

            // nhap so thu nhat tu ban phim
            System.out.println("so thu hai: ");
            int b = new Scanner(System.in).nextInt();

            // hien thi phan du cua phep chia (a % B)
            System.out.println("phan du cua phep chia: " + (a % b));

        }
        catch (ArithmeticException e)  // bat ngoai le khi b = 0
        {
            System.out.println("Lỗi chia cho 0 "); // thong bao loi khi xay ra ngoai le
        }
        catch (InputMismatchException e)  // bat ngoai le khi du lieu dau vao khong phai la so nguyen
        {
            System.out.println("nhap du lieu khong dung");  // thong bao loi khi xay ra ngoai le
        }

    }
}
