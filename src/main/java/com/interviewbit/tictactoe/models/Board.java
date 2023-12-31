package main.java.com.interviewbit.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public Board(int dimensions){
        this.board=new ArrayList<>();
        for(int i=0;i<dimensions;i++){
            this.board.add(new ArrayList<>());
            for(int j=0;j<dimensions;j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    public List<List<Cell>> getCells() {
        return board;
    }

    public void setCells(List<List<Cell>> board) {
        this.board = board;
    }
}
