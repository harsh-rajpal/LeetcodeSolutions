package Snakes_Ladder;

public class Solution {
    public int snakesAndLadders(int[][] board) {
        int minSteps = 0;
        int n = board.length;
        int start = 1, end = n * n;
        boolean[][] visited = new boolean[n][n];
        Queue<Integer> queue = new LinkedList<>();

        visited[n - 1][0] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentPosition = queue.poll();
                if (currentPosition == end)
                    return minSteps;
                // Roll the dice 6 times and add the possible destinations to the Queue.
                for (int dice = 1; dice <= 6; dice++) {
                    if (dice + currentPosition > end)
                        break;
                    int[] nextPosition = findCoordinates(currentPosition + dice, n);
                    int nextRow = nextPosition[0], nextColumn = nextPosition[1];
                    if (!visited[nextRow][nextColumn]) {
                        visited[nextRow][nextColumn] = true;
                        if (board[nextRow][nextColumn] != -1) {
                            queue.add(board[nextRow][nextColumn]);
                        } else {
                            queue.add(currentPosition + dice);
                        }
                    }
                }
            }
            minSteps++;
        }
        return -1;
    }

    private int[] findCoordinates(int currentPosition, int n) {
        int row = n - (currentPosition - 1) / n - 1;
        int col = (currentPosition - 1) % n;
        if (row % 2 == n % 2)
            return new int[] { row, n - 1 - col };
        else
            return new int[] { row, col };
    }
}