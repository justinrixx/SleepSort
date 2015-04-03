package sleepsort;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Justin Ricks
 */
public class SleepSort {
    
    private final List <Integer> sorted = new ArrayList<>();
    List <Thread> threads = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SleepSort().run(args);
    }
    
    public void sortSleep(String[] args) {
                
        // start all the threads
        for (String s : args) {
            int value = Integer.parseInt(s);
            
            threads.add(new Thread(new SleepRunner(value, sorted)));
            threads.get(threads.size() - 1).start();
        }
        
        // wait for all of them to join back in
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(SleepSort.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void run(String[] args) {
        
        sortSleep(args);
        
        System.out.println("------Sorted List------");
        // output the list
        for (Integer i : sorted) {
            System.out.println(i);
        }
    }    
}
