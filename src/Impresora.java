import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class Impresora extends JFrame {
    public Impresora(){
        super("Viruz Blog: Impresora con GridBagLayout");
        this.getContentPane().setLayout (new GridBagLayout());
        agregarEtiqueta(); 
        agregarTextArea();
        agregarCheckBox();
        agregarTextArea2();
        agregarRadioButton();
        agregarTextArea3();
        agregarBotones();
        agregarEtiqueta2();
        agregarComboBox();
        agregarCheckBox2();
    }
      
    private void agregarEtiqueta(){
        GridBagConstraints constraints = new GridBagConstraints();
        JLabel eti = new JLabel ("Impresora: Mi Impresora");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
       
        constraints.weightx = -1.0;
        this.getContentPane().add (eti, constraints);       
    }
      
    private void agregarTextArea(){
        JTextArea areaTexto = new JTextArea ();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 1; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa una columna.
        constraints.gridheight = 1; // El área de texto ocupa 3 filas.
        this.getContentPane().add (areaTexto, constraints);       
    }

    private void agregarCheckBox(){
        JCheckBox ch1=new JCheckBox("Imagen");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.SOUTH;
        this.getContentPane().add (ch1, constraints);
          
        JCheckBox ch2=new JCheckBox("Texto   ");
        constraints.gridx = 1; 
        constraints.gridy = 2; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add (ch2, constraints);
          
        JCheckBox ch3=new JCheckBox("Codigo");
        constraints.gridx = 1; 
        constraints.gridy = 3; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (ch3, constraints);  
    }
     
    private void agregarTextArea2(){
        JTextArea areaTexto2 = new JTextArea ();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 2; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        this.getContentPane().add (areaTexto2, constraints);
    }
     
    private void agregarRadioButton(){
        GridBagConstraints constraints = new GridBagConstraints();
        JRadioButton  radio = new JRadioButton("Seleccion",false);
        constraints.gridx = 3; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.SOUTH;
        this.getContentPane().add (radio, constraints);

        JRadioButton  radio2 = new JRadioButton("Todo         ",true);
        constraints.gridx = 3; 
        constraints.gridy = 2; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add (radio2, constraints);

        JRadioButton  radio3 = new JRadioButton("Applet      ",false);
        constraints.gridx = 3; 
        constraints.gridy = 3; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (radio3, constraints);

        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add( radio );
        grupoOpciones.add( radio2 );
        grupoOpciones.add( radio3 );   
    }
    
    private void agregarTextArea3(){
        JTextArea areaTexto3 = new JTextArea ();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 4; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 2; 
        this.getContentPane().add (areaTexto3, constraints);
    }
      
    private void agregarBotones(){
        JButton boton1 = new JButton("   Aceptar  ");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 5;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 2.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add (boton1, constraints);
        constraints.weighty = 0.0;

        JButton boton2 = new JButton("  Cancelar ");
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;

    constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (boton2, constraints);


        JButton boton3 = new JButton("Configurar");
        constraints.gridx = 5;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.CENTER;
        this.getContentPane().add (boton3, constraints);
        constraints.weighty = 0.0;


        JButton boton4 = new JButton("    Ayuda    ");
        constraints.gridx = 5;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (boton4, constraints);
        constraints.weighty = 1.0;
    }
      
    private void agregarEtiqueta2(){
        GridBagConstraints constraints = new GridBagConstraints();
        JLabel eti2 = new JLabel ("Calidad de " + "Impresion   ");
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (eti2, constraints);
    }
       
    private void agregarComboBox(){
         GridBagConstraints constraints = new GridBagConstraints();
         String[] selecciones = {"Alta"};
         JComboBox cb1 = new JComboBox(selecciones);
         constraints.gridx = 2;
         constraints.gridy = 4;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (cb1, constraints);
    }
       
    private void agregarCheckBox2(){
          JCheckBox ch4=new JCheckBox("Imprimir a archivo");
          GridBagConstraints constraints = new GridBagConstraints();
          constraints.gridx = 3; 
          constraints.gridy = 4; 
          constraints.gridwidth = 1; 
          constraints.gridheight = 1;
          constraints.weightx = 1.0;
          this.getContentPane().add (ch4, constraints);
          constraints.weightx = 0.0;
    }
}