import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Birinci Kenar : ");
        a = girdi.nextInt();
        System.out.println("İkinci Kenar : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenus : " + c);

    }
}