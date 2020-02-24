public class ThreadReader extends  Thread {

 char input ;

    public void setInput(char input) {
        this.input = input;
    }

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

     public void CharacterRecieve(char c)
     { setInput(c); };

}
