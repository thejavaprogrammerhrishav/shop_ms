
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer PC
 */
public class Delay {
    
    public static void delay(int Seconds){
        try {
            TimeUnit.SECONDS.sleep(Seconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(Delay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
