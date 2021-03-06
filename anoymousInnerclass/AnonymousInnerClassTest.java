import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 * This class demonstrates anonymous inner classes
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args)
{
    TalkingClock clock= new TalkingClock();
    clock.start(1000,true);

    //keep program running until user select "Ok"
    JOptionPane.showMessageDialog(null,"Quit Program?");
    System.exit(0);
}    
}

/**
 * A clock that prints the time in regular intervals
 */

 class TalkingClock
 {
     /**
      * Starts the clock.
      *@param interval the interval between the messages(in milliseconds)
      *@param beep true if the clock should beep
    */
    public static void start(int interval, boolean beep)
    {
        ActionListener listener=new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                System.out.println("At the tone, the time is" +new Date());
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t=new Timer(interval,listener);
        t.start();
    }
 }