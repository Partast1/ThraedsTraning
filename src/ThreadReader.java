public class ThreadReader extends  Thread {

 char input ;
    @Override
    public void run() {
        while (true){
            System.out.print(input);
            try {
                // thread to sleep for 1000 milliseconds
             Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void CharaterRecieve(char c){
        input = c;
    }
}
