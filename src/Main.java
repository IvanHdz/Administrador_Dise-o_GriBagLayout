import javax.swing.JFrame;

public class Main{
    public static void main (String [] args){
        Impresora marco = new Impresora ();
        marco.setSize(420,190);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}