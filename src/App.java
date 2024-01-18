import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[]arr = a.split(" ");
        sc.close();

        long b = Integer.parseInt(arr[0]);
        long c = Integer.parseInt(arr[1]);

        long soma = b * c; 
        System.out.println(soma);

    }
}
