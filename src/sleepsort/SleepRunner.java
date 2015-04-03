package sleepsort;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Justin Ricks
 */
public class SleepRunner implements Runnable {
    private List <Integer> sorted;
    private int value;
    
    public SleepRunner(int value, List <Integer> sorted) {
        this.sorted = sorted;
        this.value = value;
    }

    @Override
    public void run() {
        
        try {
            Thread.sleep(value);
        } catch (InterruptedException ex) {
            Logger.getLogger(SleepRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sorted.add(value);
    }
    
}
