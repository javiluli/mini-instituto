/**
 * @author javiluli (github)
 */

package Application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

/**
 * The Class CrearProfesor.
 */
public class CrearProfesor {

  private JFrame     frame;
  private JTextField textNombre;
  private JTextField textDni;
  private JTextField textEdad;
  private JTextField textCurso;
  private JTextField textSueldo;

  /**
   * Create the application.
   */
  public CrearProfesor() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    setFrame(new JFrame());
    getFrame().setBounds(100, 100, 310, 270);
    getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    getFrame().getContentPane().setLayout(null);

    JLabel lblTitle = new JLabel("Crear nuevo profesor");
    lblTitle.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
    lblTitle.setBounds(10, 11, 264, 16);
    getFrame().getContentPane().add(lblTitle);

    JLabel lblNombre = new JLabel("Nombre");
    lblNombre.setBounds(10, 36, 46, 14);
    getFrame().getContentPane().add(lblNombre);

    textNombre = new JTextField();
    textNombre.setBounds(66, 33, 86, 20);
    getFrame().getContentPane().add(textNombre);
    textNombre.setColumns(10);

    JLabel lbDni = new JLabel("DNI");
    lbDni.setBounds(10, 61, 46, 14);
    getFrame().getContentPane().add(lbDni);

    textDni = new JTextField();
    textDni.setBounds(66, 58, 86, 20);
    getFrame().getContentPane().add(textDni);
    textDni.setColumns(10);

    JLabel lblEdad = new JLabel("Edad");
    lblEdad.setBounds(10, 86, 46, 14);
    getFrame().getContentPane().add(lblEdad);

    textEdad = new JTextField();
    textEdad.setBounds(66, 83, 86, 20);
    getFrame().getContentPane().add(textEdad);
    textEdad.setColumns(10);

    JLabel lbCurso = new JLabel("Curso");
    lbCurso.setBounds(10, 111, 46, 14);
    getFrame().getContentPane().add(lbCurso);

    textCurso = new JTextField();
    textCurso.setBounds(66, 108, 86, 20);
    getFrame().getContentPane().add(textCurso);
    textCurso.setColumns(10);

    JLabel lblSueldo = new JLabel("Sueldo");
    lblSueldo.setBounds(10, 136, 46, 14);
    getFrame().getContentPane().add(lblSueldo);

    textSueldo = new JTextField();
    textSueldo.setBounds(66, 133, 86, 20);
    getFrame().getContentPane().add(textSueldo);
    textSueldo.setColumns(10);

    JLabel lblNewLabel = new JLabel("Todos los campos son obligatorios");
    lblNewLabel.setForeground(Color.RED);
    lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
    lblNewLabel.setBounds(10, 161, 264, 14);
    getFrame().getContentPane().add(lblNewLabel);

    JButton btnCrear = new JButton("Crear profesor");
    btnCrear.setForeground(Color.WHITE);
    btnCrear.setBackground(Color.DARK_GRAY);
    btnCrear.setFont(new Font("Arial", Font.BOLD, 12));
    btnCrear.addActionListener(new ActionListener() {

      /**
       * Al presionar el boton 'btnCrear' este crea un objeto de tipo Profesor y
       * accede la informacion dentreo de cada JTextField() asignanco al objeto creado
       * estos valores obtenidos.
       *
       * @param e el evento.
       * @see #Ficheros.
       */
      public void actionPerformed(ActionEvent e) {
        Profesor p = new Profesor();
        p.setNombre(textNombre.getText().toUpperCase());
        p.setDni(textDni.getText().toUpperCase());
        p.setEdad(Integer.parseInt(textEdad.getText()));
        p.setCurso(Integer.parseInt(textCurso.getText()));
        p.setSueldo(Integer.parseInt(textSueldo.getText()));
        try {
          Ficheros.guardar(p, Ficheros.D_PROFESORES);
        } catch (IOException e2) {
          System.out.println("Fichero no encontrado - guardarAlumno()");
        }
      }
    });
    btnCrear.setBounds(10, 186, 119, 33);
    getFrame().getContentPane().add(btnCrear);

    JButton btnMostrar = new JButton("Mostrar profesores");
    btnMostrar.setForeground(Color.WHITE);
    btnMostrar.setBackground(Color.DARK_GRAY);
    btnMostrar.setFont(new Font("Arial", Font.BOLD, 12));
    btnMostrar.setBounds(139, 186, 145, 33);
    btnMostrar.addActionListener(new ActionListener() {
      /**
       * Muestra los profesores almacenados en los ficheros desde Class Ficheros.
       *
       * @param e el evento.
       * @see #Ficheros.
       */
      public void actionPerformed(ActionEvent e) {
        Profesor p = null;
        System.out.println("---- Profesores ----");
        Ficheros.leerFicheros(p, Ficheros.D_PROFESORES);
      }
    });
    getFrame().getContentPane().add(btnMostrar);
  }

  /**
   * Gets the frame.
   *
   * @return the frame
   */
  public JFrame getFrame() {
    return frame;
  }

  /**
   * Sets the frame.
   *
   * @param frame the new frame
   */
  public void setFrame(JFrame frame) {
    this.frame = frame;
    frame.setResizable(false);
  }
}
