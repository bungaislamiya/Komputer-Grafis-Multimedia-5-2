/* Bunga IslamiyaPutri - 20191310053
 * Transformasi - Rotasi
 */
package grafika052;

/**
 *
 * @author lenovo
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotationEX extends JFrame {
   
    public RotationEX() {
        
        initUI();
    }
    
    private void initUI() {
        
    add(new Surface());
    
    setTitle("Contoh Transformation - Rotasi");
    setSize(400, 400); // resolusi layar
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                
            RotationEX ex = new RotationEX();
            ex.setVisible(true);
            }
        });
    }
    
    
}
