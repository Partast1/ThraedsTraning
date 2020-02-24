public class Main {
    public static void main(String[] args) {
//Thread Creation
    PlayingWithThread ezThread = new PlayingWithThread();
    PlayingWithMoreThreads multiThread = new PlayingWithMoreThreads();
    TempThread tempThread = new TempThread();
    ThreadWriter writeThread = new ThreadWriter();
    ThreadReader readThread = new ThreadReader();

//        priorities
        ezThread.setPriority(Thread.MAX_PRIORITY);
        multiThread.setPriority(Thread.NORM_PRIORITY);
        tempThread.setPriority(Thread.MAX_PRIORITY);
        writeThread.setPriority(Thread.NORM_PRIORITY);
        readThread.setPriority(Thread.MAX_PRIORITY);
//        ThreadStarter

//        ezThread.start();
//        multiThread.start();
//        tempThread.start();
        while (true){
            writeThread.start();
            try {
                // thread to sleep for 1000 milliseconds
                writeThread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {

                writeThread.join();
            } catch (Exception e) {
                System.out.println(e);
            }

            readThread.start();
            try {
                // thread to sleep for 1000 milliseconds
                readThread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {

                readThread.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }



    }



}
