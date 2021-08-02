/**
* @author javiluli (github)
*/

package Application;

import java.io.Serializable;

/**
 * La Clase Profesor.
 */
public class Profesor extends Persona implements Serializable {

  private static final long serialVersionUID = 1L;
  private int               curso, sueldo;

  /**
   * Instantiates a new profesor.
   */
  public Profesor() {
  }

  /**
   * Instancia de un nuevo Profesor.
   *
   * @param nombre el nombre del profesor
   * @param dni    el dni del profesor
   * @param edad   la edad del profesor
   * @param curso  el curso del profesor
   * @param sueldo el sueldo del profesor
   */
  public Profesor(String nombre, String dni, int edad, int curso, int sueldo) {
    super(nombre, dni, edad);
    this.curso = curso;
    this.sueldo = sueldo;
  }

  /**
   * Gets the curso.
   *
   * @return the curso
   */
  public int getCurso() {
    return curso;
  }

  /**
   * Sets the curso.
   *
   * @param curso the new curso
   */
  public void setCurso(int curso) {
    this.curso = curso;
  }

  /**
   * Gets the sueldo.
   *
   * @return the sueldo
   */
  public int getSueldo() {
    return sueldo;
  }

  /**
   * Sets the sueldo.
   *
   * @param sueldo the new sueldo
   */
  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return super.toString() + " | Curso: " + curso + " | Sueldo: " + sueldo;
  }
}
