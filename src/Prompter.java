import java.io.Console;

/**
 * Created by caleb.king on 1/19/16.
 */
public class Prompter {
    private Game mGame;


    public Prompter(Game game){
        mGame = game;
    }

    public boolean promptForGuess(){
        Console console = System.console();
        String guessAsString = console.readLine("Enter a letter       ");

        char guess = guessAsString.charAt(0);
        return mGame.applyGuess(guess);
    }
}
