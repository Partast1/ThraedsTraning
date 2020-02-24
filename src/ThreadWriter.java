import java.util.Scanner;

public class ThreadWriter extends Thread {
    ThreadReader threadR = new ThreadReader();
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(0);
        threadR.CharacterRecieve(character);

    }
}
