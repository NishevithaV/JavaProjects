package csci1110.Homework.Other;

public class markAsX {
    public static void main(String[] args){
        char[][] grid = {
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'}
        };

        int centerX = 2; // X-coordinate of the point
        int centerY = 2; // Y-coordinate of the point


        // Define the range of rows and columns to update
        int startRow = (centerX - 2);
        int endRow = centerX + 2;
        int startCol = (centerY-2);
        int endCol = centerY+2;

        // Mark the elements within the specified rows as 'X'
        for (int i = startRow; i <= endRow; i++) {
            if (i<5) {
                grid[i][centerY] = 'X';
            }
        }
        // Mark elements within specified cols as 'X'
        for (int j=startCol; j<=endCol; j++){
            if (j<5){
                grid[centerX][j] = 'X';
            }
        }
        // if that diag isn't null then we put 'X' into it
        if ((centerX-1)<5 && (centerY-1)<5) {
            grid[centerX-1][centerY-1] = 'X';
        }
        if ((centerX+1)<5 && (centerY+1)<5) {
            grid[centerX+1][centerY+1] = 'X';
        }
        if ((centerX-1)<5 && (centerY+1)<5){
            grid[centerX-1][centerY+1] = 'X';
        }
        if ((centerX+1)<5 && (centerY-1)<5){
            grid[centerX+1][centerY-1] = 'X';
        }


        // Display the updated grid
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
