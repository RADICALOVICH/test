import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello new branch");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println(pochtoviYashik(email));
        int[] shit = new int[5];
        System.out.println(shit.length);
    }


    public static String pochtoviYashik(String a) {
        int indexSobaka = a.indexOf('@');
        String pochtoviYashik = a.substring(indexSobaka + 1);
        return pochtoviYashik;

    }

}