import java.util.Timer;
import java.util.TimerTask;
public class Prueba {
	
	    Timer timer;

	    public Prueba(int seconds) {
	        timer = new Timer();
	        timer.schedule(new StopTask(), seconds * 1000);
	    }

	    public static void main(String[] args) {
	        new Prueba(10);
	        System.out.println("StopWatch Started.");
	    }

	    class StopTask extends TimerTask {
	        public void run() {
	            System.out.println("Time Up!");
	            timer.cancel();
	        }}}
	    
	