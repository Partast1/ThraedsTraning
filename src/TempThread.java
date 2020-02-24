import java.util.Random;

public class TempThread extends Thread {
//    Checks if tempature is within limites
//    Assigment 3
    @Override
    public void run() {

        Random rnd = new Random();
        Integer max = 140;

        boolean tempLegal = true;
        Integer alarmCount = 0;

        while(tempLegal) {
            if (alarmCount <= 2) {
                Integer  temp = rnd.nextInt(max);
                if (temp > 20 && temp < 120)
                {
                    System.out.println(temp);
                }
                else {
                    System.out.println("alarm");
                    alarmCount++;

                }
            }
            else{
                tempLegal = false;
            }

        }
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
