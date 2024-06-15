import java.util.Scanner;
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=scn.next();
            int x=scn.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
