import java.util.Arrays;

public class TwoDArrayBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {15,25,35},
                {28,29,40},
        };
        System.out.println(Arrays.toString(search(matrix, 25)));
    }

//    Time complexity is O(n) + O(n) = 2 O(n) -> O(n).
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1;
        while(r < matrix.length && c >=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            else if(target < matrix[r][c]){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
