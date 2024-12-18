import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void generatePermutation(int[] A, List<List<Integer>> r, int start) {
        // Base case
        if (start == A.length) {
            List<Integer> c = new ArrayList<>();
            for (int n : A)
                c.add(n);
            r.add(c);
            return;
        }
        // Backtracking
        for (int i = start; i < A.length; i++) {
            swap(A, start, i);
            generatePermutation(A, r, start + 1);
            swap(A, start, i);
        }
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = s.nextInt();

        List<List<Integer>> r = new ArrayList<>();
        Main obj = new Main(); // Create an instance of Main to call the non-static method
        obj.generatePermutation(A, r, 0);
        System.out.println(r);
    }
}
