package hw1.s55724681;

public class Maze {
    public boolean[][] visited;

    public Maze() {
        visited = new boolean[7][7];
    }

    public Maze(int dimensionSize) {
        visited = new boolean[dimensionSize][dimensionSize];
    }
}
