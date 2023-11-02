import java.util.Scanner;

public class ThangDuTrungHoa {

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Nhap so thu " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < 3; j++){
            System.out.println("Nhap module thu " + (j+1) + ": ");
            b[j] = sc.nextInt();
        }

        int[] M = new int[4];
        M[3] = b[0]*b[1]*b[2];
        M[0] = M[3]/b[0];
        M[1] = M[3]/b[1];
        M[2] = M[3]/b[2];

        int[] y = new int[3];
        boolean check = true;
        for (int i = 0; i < M[0]; i++){
            if((M[0]*i % b[0] == 1) && check == true){
                y[0] = i;
                check = false;
            }
        }
        check = true;
        for (int i = 0; i < M[0]; i++){
            if((M[1]*i % b[1] == 1) && check == true){
                y[1] = i;
                check = false;
            }
        }
        check = true;
        for (int i = 0; i < M[0]; i++){
            if((M[2]*i % b[2] == 1) && check == true){
                y[2] = i;
                check = false;
            }
        }

        int S = a[0]*M[0]*y[0] + a[1]*M[1]*y[1] + a[2]*M[2]*y[2];

        for (int i = 0; i < S; i++){
            if(i%M[3] == S%M[3]){
                S = i;
            }
        }
        System.out.println("Ket qua la: " + S + " (mod " + M[3] + ")");
    }
}
