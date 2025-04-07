public class ConwayLife {
    public static int[][] getGeneration(int[][] cells, int generations) {
        for (int g = 0; g < generations; g++) {
            System.out.println("Generation " + (g + 1) + " starting...");
            LifeDebug.print(cells); // Print the current board

            // Expand the board to allow space for cell growth at the edges
            cells = expand(cells);
            int[][] next = new int[cells.length][cells[0].length];

            // Apply Conway's rules to every cell
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells[0].length; j++) {
                    int neighbors = countNeighbors(cells, i, j);

                    // Apply rules based on current cell state and number of neighbors
                    if (cells[i][j] == 1) {
                        // Cell survives if it has 2 or 3 neighbors
                        next[i][j] = (neighbors == 2 || neighbors == 3) ? 1 : 0;
                    } else {
                        // Dead cell becomes alive only if it has exactly 3 neighbors
                        next[i][j] = (neighbors == 3) ? 1 : 0;
                    }
                }
            }

            // Crop the board to remove unnecessary dead borders
            cells = crop(next);
            System.out.println("Generation " + (g + 1) + " complete:");
            LifeDebug.print(cells);
        }

        // Return at least an empty array if no living cells remain
        return cells.length == 0 ? new int[][]{{}} : cells;
    }

    // Expands the board by 1 row/column on all sides
    private static int[][] expand(int[][] cells) {
        int rows = cells.length;
        int cols = cells[0].length;
        int[][] expanded = new int[rows + 2][cols + 2];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(cells[i], 0, expanded[i + 1], 1, cols);
        }

        System.out.println("Board expanded:");
        LifeDebug.print(expanded);
        return expanded;
    }

    // Counts the number of live neighbors for the cell at position (x, y)
    private static int countNeighbors(int[][] cells, int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i == x && j == y) continue; // skip the current cell
                if (i >= 0 && j >= 0 && i < cells.length && j < cells[0].length) {
                    count += cells[i][j];
                }
            }
        }
        return count;
    }

    // Crops the grid to only include the bounding box of live cells
    private static int[][] crop(int[][] cells) {
        int top = cells.length, bottom = -1, left = cells[0].length, right = -1;

        // Identify the bounding box around all live cells
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (cells[i][j] == 1) {
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }

        // If there are no live cells, return empty board
        if (top > bottom || left > right) {
            System.out.println("No living cells remaining. Returning empty grid.");
            return new int[0][0];
        }

        // Copy only the cropped portion of the board
        int[][] cropped = new int[bottom - top + 1][right - left + 1];
        for (int i = top; i <= bottom; i++) {
            System.arraycopy(cells[i], left, cropped[i - top], 0, right - left + 1);
        }

        System.out.println("Board cropped to live cell area:");
        LifeDebug.print(cropped);
        return cropped;
    }



    public class LifeDebug {
        public static void print(int[][] board) {
            System.out.println(htmlize(board));
        }

        public static String htmlize(int[][] board) {
            StringBuilder sb = new StringBuilder();
            for (int[] row : board) {
                for (int cell : row) {
                    sb.append(cell == 1 ? "▓▓" : "░░");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

        public static boolean equals(int[][] a, int[][] b) {
            if (a.length != b.length) return false;
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length) return false;
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]) return false;
                }
            }
            return true;
        }
    }

}
