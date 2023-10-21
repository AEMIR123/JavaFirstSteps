import java.util.LinkedList;
public class FibbonaciSequence{
    public static void main(String[] args) {

        LinkedList<Integer> fibbonaciList = new LinkedList<>();
        fibbonaciList.add(0);
        fibbonaciList.add(1);
        fibbonaciList.add(1);

        int n = Integer.parseInt(args[0]);
            for (int i = 2; i < n; i++) {
                int fibbonaciNextElement = fibbonaciList.get(i) + fibbonaciList.get(i-1);
                fibbonaciList.add(fibbonaciNextElement);
            }

        System.out.println(fibbonaciList.get(n));
    }
}