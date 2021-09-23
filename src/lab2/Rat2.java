package lab2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

//todo maze.checkStatus
//todo while (status == ok) mouse keep going
//todo if (location = 6,6) sussess and break
//todo (out of loop) fail

public class Rat2 {
    public static void main(String[] args) throws Exception {
        double[] prob = { 0.2, 0.3, 0.3, 0.2 };
        Mouse mouse = new Mouse(prob);

        System.out.println(mouse.getRollDice());
        System.out.println(mouse.getRollDice());
        System.out.println(mouse.getRollDice());
        System.out.println(mouse.getRollDice());
        System.out.println(mouse.getRollDice());

        Maze map = new Maze(7, 7);
        map.startMaze(0, 0);
        // map.printMaze();
    }

}

class Mouse {
    // ! 0: N, 1: E, 2: S, 3: W
    private double[] prob;

    public Mouse(double[] prob) {
        this.prob = prob.clone();

        for (int i = 1; i < this.prob.length; i++)
            this.prob[i] = this.prob[i] + this.prob[i - 1];
    }

    public Mouse() {
        this(new double[] { 0.25, 0.25, 0.25, 0.25 });
    }

    public int getRollDice() {
        double rand = ThreadLocalRandom.current().nextDouble(0, 1);
        return IntStream.range(0, prob.length).filter(idx -> rand <= prob[idx]).findFirst().orElse(-1);
    }

}

class Maze {
    private static int[][] maze;
    private static int xCur, yCur;

    public Maze(int xDim, int yDim) {
        maze = new int[xDim][yDim];
    }

    public void startMaze(int xPos, int yPos) {
        if (xPos <= maze.length && yPos <= maze[0].length)
            setPos(xPos, yPos);
    }

    private void setPos(int xPos, int yPos) {
        maze[xPos][yPos] = 1;
        xCur = xPos;
        yCur = yPos;
    }

    public void printMaze() {
        for (int[] x : maze) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}