public class CountingCellsBlob {
  private static int BACKGROUND_COLOR = 0;
  private static int IMAGE_COLOR = 1;
  private static int ALREADY_COUNTED = 2;
  private static int N = 8;
  private static int[][] grid = {
      {1, 0, 0, 0, 0, 0, 0, 1},
      {0, 1, 1, 0, 0, 1, 0, 0},
      {1, 1, 0, 0, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 1, 0, 0},
      {0, 1, 0, 1, 0, 1, 0, 0},
      {0, 1, 0, 1, 0, 1, 0, 0},
      {1, 0, 0, 0, 1, 0, 0, 1},
      {0, 1, 1, 0, 0, 1, 1, 1},
  };

  public static int countCells(int x, int y) {
    if (x < 0 || x >= N || y < 0 || y >= N)
      return 0;
    else if (grid[x][y] != IMAGE_COLOR)
      return 0;
    else {
      grid[x][y] = ALREADY_COUNTED;
      return 1 + countCells(x, y + 1) + countCells(x + 1, y + 1)
          + countCells(x + 1, y) + countCells(x + 1, y - 1)
          + countCells(x, y - 1) + countCells(x - 1, y - 1)
          + countCells(x - 1, y) + countCells(x - 1, y + 1);
    }
  }

  public static void main(String[] args) {
    printGrid();
    int blobCount = countCells(3, 5);
    System.out.println();
    System.out.println("BlobCount : " + blobCount);
    printGrid();
  }

  private static void printGrid() {
    for (int x = 0; x < N; x++) {
      System.out.print("[");
      for (int y = 0; y < N; y++)
        System.out.print(grid[x][y] + ", ");
      System.out.println("]");
    }
  }
}
