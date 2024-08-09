import java.util.Scanner;

public class maior {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int C = scanner.nextInt();

            if(A>B && A>C) {
                System.out.println(A + " eh o maior");
            } else if (B>A && B>C){
                System.out.println(B + " eh o maior");
            } else {System.out.println(C + " eh o maior");}

    }

}
