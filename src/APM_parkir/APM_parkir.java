/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APM_parkir;
import javax.swing.UIManager;

/**
 *
 * @author zurin
 */
public class APM_parkir {

    /**
     * @param HafiyyanSilmi the command line arguments
     */
    public static void main(String[] HafiyyanSilmi) {
        // TODO code application logic here
        koneksi konek = new koneksi();
        konek.koneksi();
        try 
        {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel");
        } 
        catch (Exception e) 
        {
          e.printStackTrace();
        }
        new utama().setVisible(true);
    }
    
}
