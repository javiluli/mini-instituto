/**
* @author javiluli (github)
*/

package Application;

import java.io.Serializable;

/**
 * La Clase Alumno.
 */
public class Alumno extends Persona implements Serializable {

  private static final long serialVersionUID = 1L;
  private int               curso, media;

  /**
   * Instantiates a new alumno.
   */
  public Alumno() {
  }

  /**
   * Instancia de un nuevo Alumno.
   *
   * @param nombre nombre del alumno.
   * @param dni    dni del alumno.
   * @param edad   edad del alumno.
   * @param curso  curso del alumno.
   * @param media  media del alumno.
   */
  public Alumno(String nombre, String dni, int edad, int curso, int media) {
    super(nombre, dni, edad);
    this.curso = curso;
    this.media = media;
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
   * Gets the media.
   *
   * @return the media
   */
  public int getMedia() {
    return media;
  }

  /**
   * Sets the media.
   *
   * @param media the new media
   */
  public void setMedia(int media) {
    this.media = media;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return super.toString() + " | Curso: " + curso + " | Media: " + media;
  }

}
