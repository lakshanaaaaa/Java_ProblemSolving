import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] A = new int[n][m];

        int top = 0;
        int left = 0;
        int bottom = A.length - 1;
        int right = A[0].length - 1;
        int c = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                A[top][i] = c++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                A[i][right] = c++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    A[bottom][i] = c++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    A[i][left] = c++;
                }
                left++;
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
