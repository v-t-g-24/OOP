import java.util.Scanner;

public class stringcomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        sc.close();
    }
}