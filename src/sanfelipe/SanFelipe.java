
package sanfelipe;

import Presentacion.Login;
import Presentacion.frminventario;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;



public class SanFelipe {

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
        public void run(){
            try{
                JFrame.setDefaultLookAndFeelDecorated(true);                                
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");
                SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceCremeTheme" );
                            
            }              
            catch(Exception e){
            } 
            
            new Login().setVisible(true);
        }
        });
    
}
}
