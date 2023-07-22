package main.java.com.interviewbit.tictactoe.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(char symbol, String name, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, PlayerType.BOT);
        this.botDifficultyLevel=botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }


}
