/**
 * Created by caleb.king on 1/19/16.
 */
public class Hangman {
    public static void main(String[]args) {

        Game game = new Game("Caleb");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        prompter.play();
    }
}
