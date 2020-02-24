public class PlayingWithMoreThreads extends Thread {
//    Assignment 2
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Also with multiple threads \n");
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
