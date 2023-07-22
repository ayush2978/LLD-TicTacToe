import main.java.com.interviewbit.tictactoe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the board: ");
        int dimensions=sc.nextInt();
        Board board=new Board(dimensions);

        int noOfHumanPlayers=dimensions-1;

        List<Player> playerList=new ArrayList<>();
        System.out.println("Is Bot available for play ?");
        String isBotAvailable=sc.next();

        if(isBotAvailable.equals("Yes")){
            noOfHumanPlayers=noOfHumanPlayers-1;
            System.out.println("Enter the name of the bot: ");
            String botName=sc.next();
            System.out.println("Enter the symbol of bot: ");
            String botSymbol=sc.next();
            playerList.add(new Bot(botSymbol.charAt(0),botName,PlayerType.BOT,BotDifficultyLevel.MEDIUM));
        }

        for(int i=0;i<noOfHumanPlayers;i++){
            System.out.println("Enter player name: ");
            String playerName=sc.next();
            System.out.println("Enter the player symbol: ");
            String playerSymbol=sc.next();
            playerList.add(new Player(playerSymbol.charAt(0),playerName,PlayerType.HUMAN));
        }

        Game game=Game.getInstance().setPlayers(playerList).setBoard(board).build();
        System.out.println(game.getBoard());
        for(int i=0;i<game.getPlayers().size();i++){
            System.out.println("Player Name: "+game.getPlayers().get(i).getName());
            System.out.println("Player Symbol: "+game.getPlayers().get(i).getSymbol());
            System.out.println("Player Type: "+game.getPlayers().get(i).getPlayerType());
        }
    }
}