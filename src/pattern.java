public class pattern {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int top = 0, bottom = 3, left = 0, right = 3;

        while (top <= bottom && left <= right) {

            // left to right
            for (int i = left; i <= right; i++)
                System.out.print(a[top][i] + " ");
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");
            right--;

            // right to left
            for (int i = right; i >= left; i--)
                System.out.print(a[bottom][i] + " ");
            bottom--;

            // bottom to top
            for (int i = bottom; i >= top; i--)
                System.out.print(a[i][left] + " ");
            left++;


        }
    }
}

