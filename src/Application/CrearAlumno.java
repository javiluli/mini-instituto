/**
* @author javiluli (github)
*/

package Application;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

/**
 * The Class CrearAlumno.
 */
public class CrearAlumno {

  private JFrame     frame;
  private JTextField textNombre;
  private JTextField textDni;
  private JTextField textEdad;
  private JTextField textCurso;
  private JTextField textMedia;

  /**
   * Create the application.
   */
  public CrearAlumno() {
    initialize();
  }

  /**
   * Initialize.
   */
  private void initialize() {

    setFrame(new JFrame());
    getFrame().setBounds(100, 100, 300, 270);
    getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JLabel lblTitle = new JLabel("Crear nuevo alumno");
    lblTitle.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
    lblTitle.setBounds(10, 11, 274, 14);
    frame.getContentPane().add(lblTitle);

    JLabel lblNombre = new JLabel("Nombre");
    lblNombre.setFont(new Font("Arial", Font.PLAIN, 11));
    lblNombre.setBounds(10, 36, 46, 14);
    frame.getContentPane().add(lblNombre);

    textNombre = new JTextField();
    textNombre.setBounds(66, 33, 86, 20);
    frame.getContentPane().add(textNombre);
    textNombre.setColumns(10);

    JLabel lblDni = new JLabel("DNI");
    lblDni.setFont(new Font("Arial", Font.PLAIN, 11));
    lblDni.setBounds(10, 61, 46, 14);
    frame.getContentPane().add(lblDni);

    textDni = new JTextField();
    textDni.setBounds(66, 58, 86, 20);
    frame.getContentPane().add(textDni);
    textDni.setColumns(10);

    JLabel lblEdad = new JLabel("Edad");
    lblEdad.setFont(new Font("Arial", Font.PLAIN, 11));
    lblEdad.setBounds(10, 86, 46, 14);
    frame.getContentPane().add(lblEdad);

    textEdad = new JTextField();
    textEdad.setBounds(66, 83, 86, 20);
    frame.getContentPane().add(textEdad);
    textEdad.setColumns(10);

    JLabel lblCurso = new JLabel("Curso");
    lblCurso.setFont(new Font("Arial", Font.PLAIN, 11));
    lblCurso.setBounds(10, 111, 46, 14);
    frame.getContentPane().add(lblCurso);

    textCurso = new JTextField();
    textCurso.setBounds(66, 108, 86, 20);
    frame.getContentPane().add(textCurso);
    textCurso.setColumns(10);

    JLabel lblMedia = new JLabel("Media");
    lblMedia.setFont(new Font("Arial", Font.PLAIN, 11));
    lblMedia.setBounds(10, 136, 46, 14);
    frame.getContentPane().add(lblMedia);

    textMedia = new JTextField();
    textMedia.setBounds(66, 133, 86, 20);
    frame.getContentPane().add(textMedia);
    textMedia.setColumns(10);

    JButton btnCrear = new JButton("Crear alumno");
    btnCrear.setForeground(Color.WHITE);
    btnCrear.setBackground(Color.DARK_GRAY);
    btnCrear.setFont(new Font("Arial", Font.BOLD, 12));
    btnCrear.addActionListener(new ActionListener() {

      /**
       * Al presionar el boton 'btnCrear' este crea un objeto de tipo Alumno y accede
       * la informacion dentreo de cada JTextField() asignanco al objeto creado estos
       * valores obtenidos.
       *
       * @param e el evento.
       * @see #Ficheros.
       */
      public void actionPerformed(ActionEvent e) {
        Alumno a = new Alumno();
        a.setNombre(textNombre.getText().toUpperCase());
        a.setDni(textDni.getText().toUpperCase());
        a.setEdad(Integer.parseInt(textEdad.getText()));
        a.setCurso(Integer.parseInt(textCurso.getText()));
        a.setMedia(Integer.parseInt(textMedia.getText()));
        try {
          Ficheros.guardar(a, Ficheros.D_ALUMNOS);
        } catch (IOException e2) {
          System.out.println("Fichero no encontrado - guardarAlumno()");
        }
      }
    });
    btnCrear.setBounds(10, 186, 111, 33);
    frame.getContentPane().add(btnCrear);

    JLabel lblAdvertencia = new JLabel("Todos los campos son obligatorios");
    lblAdvertencia.setForeground(Color.RED);
    lblAdvertencia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
    lblAdvertencia.setBounds(10, 161, 274, 14);
    frame.getContentPane().add(lblAdvertencia);

    JButton btnMostrar = new JButton("Mostrar alumnos");
    btnMostrar.setForeground(Color.WHITE);
    btnMostrar.setBackground(Color.DARK_GRAY);
    btnMostrar.setFont(new Font("Arial", Font.BOLD, 12));
    btnMostrar.addActionListener(new ActionListener() {

      /**
       * Muestra los alumnos almacenados en los ficheros desde Class Ficheros.
       *
       * @param e el evento.
       * @see #Ficheros.
       */
      public void actionPerformed(ActionEvent e) {
        Alumno a = null;
        System.out.println("---- Alumnos ----");
        Ficheros.leerFicheros(a, Ficheros.D_ALUMNOS);
      }
    });
    btnMostrar.setBounds(139, 186, 135, 33);
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
