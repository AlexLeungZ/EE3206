package hw1.s55724681;

public class Rat {
    private int xPos, yPos;
    private boolean[][] visited = new boolean[7][7];
    public boolean inside;

    public Rat() { // Default Constructor
        this.xPos = 0;
        this.yPos = 0;
        this.visited[0][0] = true;
        this.inside = true;
    }

    public void setPos(int newX, int newY) { // Method to set the mouse's new position
        this.xPos = newX;
        this.yPos = newY;
        this.visited[newX][newY] = true;
    }

    private boolean gameover() { // Check if the mouse is stuck or is at the exit
        if (this.xPos == 6 && this.yPos == 6) { // Check if it is at the exit
            this.inside = false;
            return true;
        }
        // Then Check if it is stuck
        if (!validmove(this.xPos + 1, this.yPos) && !validmove(this.xPos - 1, this.yPos)
                && !validmove(this.xPos, this.yPos + 1) && !validmove(this.xPos, this.yPos - 1))
            return true;

        return false; // Returns false if it is fine
    }

    private static char roll() { // Roll the dice to decide the direction the mouse is going to
        double dice = Math.random();
        return (dice <= 0.36) ? 'N' : (dice <= 0.7) ? 'E' : (dice <= 0.9) ? 'S' : 'W';
        // double dice2 = Math.random();
        // if(dice <= 0.6)
        // if(dice2 < 0.5) return 'N';
        // else return 'E';
        // else
        // if(dice2 < 0.5) return 'S';
        // else return 'W';
    }

    private boolean validmove(int xPos, int yPos) {
        if ((xPos < 0) || (yPos < 0) || (xPos > 6) || (yPos > 6))
            return false;
        if (visited[xPos][yPos])
            return false;
        return true;
    }

    private void move() { // Method to call if the mouse wants to move
        int newX = this.xPos;
        int newY = this.yPos;

        char direction = roll();
        switch (direction) {
            case 'N':
                newY = newY + 1;
                break;
            case 'E':
                newX = newX + 1;
                break;
            case 'S':
                newY = newY - 1;
                break;
            case 'W':
                newX = newX - 1;
                break;
        }

        if (validmove(newX, newY))
            setPos(newX, newY);
    }

    public void escape() { // Method to start the escape route search
        while (!gameover()) {
            move();
        }
    }
}