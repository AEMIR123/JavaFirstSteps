import java.util.Scanner;

public class FibbonaciSequence{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int[] FibbonaciTab = new int[n+3];
        FibbonaciTab[0] = 0;
        FibbonaciTab[1] = 1;
        FibbonaciTab[2] = 1;
        int kolejna;
            for (int i = 3; i < n; i++) {
                FibbonaciTab[i] = FibbonaciTab[i - 1] + FibbonaciTab[i - 2];
            }
        System.out.println(FibbonaciTab[n-1]);
    }
}