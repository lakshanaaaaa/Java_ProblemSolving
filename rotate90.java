import java.util.*;
public class Main{
    public static void main(String args[])
    {
        int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                            };
        int n=matrix.length;
        //transporse
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        //reverse row
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][j]=t;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}