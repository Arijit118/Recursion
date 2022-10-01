package Recursion;

public class TilingProblem {
    public static void main(String args[]) {
        System.out.println(countWayToPlaceTile(5));
    }

    // Calculate no. of ways to place tile in floor or board
    public static int countWayToPlaceTile(int n) {// area of floor is 2 * n, n is length
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // job(make choice to place tile horizontal or vertical).
        // choice vertical
        int verticalTiles = countWayToPlaceTile(n - 1);// fill n-1 tiles(after 1st tile placement)

        // choice horizontal
        int horizontalTiles = countWayToPlaceTile(n - 2); // for n-2 tiles

        int totalWays = verticalTiles + horizontalTiles;

        return totalWays;

    }
}
