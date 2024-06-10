import java.util.Scanner;
public class JavaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1= scn.nextInt();
        double num2= scn.nextDouble();
        scn.nextLine();
        String name= scn.nextLine();

        System.out.println("String: "+name);
        System.out.println("Double: "+num2);
        System.out.println("Int: "+num1);
    }
}