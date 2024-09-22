package BT_MaTran;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ma_Tran {
    public static void main(String[] args) {
        int [][] A = taoMaTran(); // neu nhap k phai so nguyen duong thi yeu nhap lai
        /*timMaxHang2(A);
        System.out.println(A[1].length);*/
        tongHang0(A);




    }



    // ham tao ma tran
    public static int[][] taoMaTran()
    {
        // khai bao bien
        int [][] Array  = new int[0][0];
                try {
                    // nhap so hang so cot cua ma tran
                    System.out.println("so hang cua ma tran: ");
                    int h = new Scanner(System.in).nextInt();

                    System.out.println("so cot cua ma tran:");
                    int c = new Scanner(System.in).nextInt();


                    // Khai bao kich thuoc ma tran
                    Array = new int[h][c];


                    // duyet qua cac vi tri phan tu trong ma tran
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < c; j++) {


                            // hien thi yeu cau nhap phan tu vao vi tri
                            System.out.print("Nhap phan tu A[" + i + ":" + j + "]= ");
                            Array[i][j] = new Scanner(System.in).nextInt();
                        }
                    }
                    return Array;

                }catch (InputMismatchException e) // bat ngoai le khi du lieu nhap vao khong phai so nguyen
                {
                    // hien thi thong bao loi
                    System.out.println("nhap sai du lieu \nDu lieu nhap vao phai la so nguyen");
                }


        return Array;
    }




    //Ham hien thi ma tran
    public static void hienThiMaTran (int [][] A)
    {
        System.out.println("Ma tran vua nhap: ");

        //  duyet qua cac phan tu trong ma tran
        for (int i = 0; i < A.length ; i++ ){
            for (int j = 0 ; j < A[i].length ; j++ )
            {
                // hien thi cac phan tu
                System.out.print( A [i][j] + "  ");
            }
            System.out.println();
        }
    }


    // tinh tong cac pha tu trong ma tran
    public static void tinhTongPhanTu(int [][] A){
        // khai bao bien tong ban dau
        int tong = 0 ;

        // duyet qua cac phan tu trong mat ran
        for (int i = 0 ; i < A.length ; i++ )
        {
            for (int j = 0 ; j < A[i].length ; j++ )
            {
                tong += A[i][j] ;    //tinh tong cac pha tu
            }
        }
        // hien thi tong cac phan tu ra man hinh
        System.out.println("tong cac phan tu trong ma tran: " + tong ) ;
    }



    // hinh tong phan tu tren hang 0 cua ma tran
   // TODO co loi xay ra --- tim loi

    public static void tongHang0( int [][] Array )
    {
        // khai bao bien tong ban dau
        int tongA0 = 0 ;

        // duyet qua cac phan tu tren hang 0 cua ma tran
        for ( int i = 0; i < Array[0].length ; i++ ) {

            // tinh tong cac phan tu
            tongA0 += Array[0][i] ;
        }
        // hien thi tong phan tu ra man hinh
        System.out.println( "tong phan tu hang 0 cua mt = " + tongA0 ) ;
    }


    // tinh tong phan tu tren duong cheo chinh cua ma tran
    public static void tongCheoChinh(int [][] Array)
    {

        // kiem tra xem ma tran co phai ma tran vuong?
        if ( Array.length == Array[0].length) // neu la ma tran vuong
        {
            // khai bao bien tong ban dau
            int tongcc = 0 ;

            // duyet qua phan tu o duong chao chinh
            for ( int i = 0 ; i < Array.length ; i ++ )
            {
                // tinh tong cac phan tu
                tongcc += Array [i][i] ;
            }
            // hien thi tong cua cac phan tu
            System.out.println( "tong phan tu duong cheo chinh = " + tongcc );
        }
        else // neu khong phai ma tran vuong
        {
            // hien thi thong bao
            System.out.println( "mt khong co duong cheo chinh" ) ;
        }
    }



    // hien thi cac phan tu duong cheo phu
    public static void hienThiCheoPhu(int [][] Array){

        System.out.print("cac phan tu tren duong cheo phu mt A: ");

        if ( Array.length == Array[0].length )   //neu la ma tran vuong
        {
            // duyet qua cac phan tu tren duong cheo phu
            for (int i = 0; i < Array.length; i++ )
            {
                // hien thi phan tu tren duong cheo phu
                System.out.print( Array [ i ] [ Array.length - i - 1 ] + "  ");
            }
            System.out.println();
        }
        else  // neu khong ohai la ma tran vuong
        {
            // hien thi thong bao
            System.out.println("mtA k co duong cheo phu");
        }
    }

    // Tim phan tu lon nhat tren hang 2 cua ma tran

    public static void timMaxHang2( int [][] Array ){
        try {
            // khai bao va gan gia tri mac ban dau    TODO  nham vi tri hang -- ngoai le khi khong co hang thu 2
            int max = Array[1][0] ;

        // duyet qua cac phan tu hang 2

        for (int i = 1 ; i < Array[1].length ; i++ )
        {
            if ( Array[1][i] > max ) // neu phan tu lon hon max
            {
                max = Array[1][i] ; // luu phan tu vao max
            }
        }
        // hien thi phan tu lon nhat hang 2
        System.out.println("phan tu lon nhat hang 2  : " + max );

        }
        catch (ArrayIndexOutOfBoundsException e) // bat ngoai le khi ma tran khong co hang 2

        {
            System.out.println("Ma tran khong co hang 2");  // hien thi thong bao loi
        }

    }


    // dem so chan trong ma tran
    public static void demSoChan(int[][] Array   ) {
        // khai bao bien dem so phan tu chan
        int dem = 0;

        // duyet qua cac phan tu trong ma tran
        for (int i = 0; i < Array.length ; i++ ){
            for ( int j =0 ; j < Array[i].length ; j++ ) {

                // kiem tra phan tu co phai so chan?
                if ( Array[i][j] !=  0   &&     Array[i][j]%2 == 0 )
                {
                    dem ++ ;   // dem so phan tu chan
                }
            }
        }
        // hien thi so luong phan tu chan
        System.out.println( "ma tran co " + dem + " so chan." ) ;


    }


}

