/**
* @author javiluli (github)
*/

package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * The Class Main.
 */
public class Main {

  private JFrame frame;

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Main window = new Main();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Main() {
    initialize();
  }

  /**
   * Initialize.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setResizable(false);
    frame.setBounds(100, 100, 314, 141);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JLabel lblTitle = new JLabel("Profesores y alumnos de un instituto");
    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    lblTitle.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
    lblTitle.setBounds(10, 11, 278, 24);
    frame.getContentPane().add(lblTitle);

    JButton btnCrearAlumnado = new JButton("Crear alumnado");
    btnCrearAlumnado.setForeground(Color.WHITE);
    btnCrearAlumnado.setBackground(Color.DARK_GRAY);
    btnCrearAlumnado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        EventQueue.invokeLater(new Runnable() {

          /**
           * Run para la creacion de un alumno.
           */
          public void run() {
            try {
              CrearAlumno window = new CrearAlumno();
              window.getFrame().setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        });
      }
    });
    btnCrearAlumnado.setFont(new Font("Arial", Font.BOLD, 12));
    btnCrearAlumnado.setBounds(10, 62, 130, 29);
    frame.getContentPane().add(btnCrearAlumnado);

    JButton btnCrearProfesor = new JButton("Crear profesor");
    btnCrearProfesor.setForeground(Color.WHITE);
    btnCrearProfesor.setBackground(Color.DARK_GRAY);
    btnCrearProfesor.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        EventQueue.invokeLater(new Runnable() {

          /**
           * Run para la creacion de un profesor.
           */
          public void run() {
            try {
              CrearProfesor window = new CrearProfesor();
              window.getFrame().setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        });
      }
    });
    btnCrearProfesor.setFont(new Font("Arial", Font.BOLD, 12));
    btnCrearProfesor.setBounds(158, 62, 130, 29);
    frame.getContentPane().add(btnCrearProfesor);
  }
}
