package main.java.com.interviewbit.tictactoe.models;

public class Move {
    private Cell src;
    private Cell dest;

    public Cell getSrc() {
        return src;
    }

    public void setSrc(Cell src) {
        this.src = src;
    }

    public Cell getDest() {
        return dest;
    }

    public void setDest(Cell dest) {
        this.dest = dest;
    }
}
