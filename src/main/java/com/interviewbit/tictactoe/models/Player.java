package main.java.com.interviewbit.tictactoe.models;

public class Player {
    private char symbol;
    private String name;

    private PlayerType playerType;

    public Player(char symbol, String name, PlayerType playerType){
        this.symbol=symbol;
        this.name=name;
        this.playerType=playerType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
