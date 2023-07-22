package main.java.com.interviewbit.tictactoe.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;

    private GameStatus gameStatus;
    private Player winner;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    Game(Board board, List<Player> players){
        this.board=board;
        this.players=players;
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public static GameBuilder getInstance(){
        return new GameBuilder();
    }

    public static class GameBuilder {
        private Board board;
        private List<Player> players;

        public Board getBoard() {
            return board;
        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build(){
            if(isDimensionsValid(board.getCells().size()) && arePlayersValid(players,board.getCells().size())){
                return new Game(board,players);
            }
            return null;
        }

        private boolean isValid(List<Player> players,int dimensions){
            if(isDimensionsValid(dimensions) && arePlayersValid(players,dimensions)){
                return true;
            }
            return false;
        }
        private boolean isDimensionsValid(int dimensions){
            if(dimensions<3 || dimensions>9){
                return false;
            }
            return true;
        }

        private boolean arePlayersValid(List<Player> players,int dimensions){
            if(players.size()!=(dimensions-1)){
                return false;
            }
            return true;
        }
    }
}
