/**
* @author javiluli (github)
*/

package Application;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Persona.
 */
public abstract class Persona implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The dni. */
  private String nombre, dni;

  /** The edad. */
  private int edad;

  /**
   * Instantiates a new persona.
   */
  public Persona() {
  }

  /**
   * Instancia de una nueva Persona.
   *
   * @param nombre el nombre de la persona.
   * @param dni    el dni de la persona.
   * @param edad   la edad de la persona.
   */
  public Persona(String nombre, String dni, int edad) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  /**
   * Gets the nombre.
   *
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Sets the nombre.
   *
   * @param nombre the new nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Gets the dni.
   *
   * @return the dni
   */
  public String getDni() {
    return dni;
  }

  /**
   * Sets the dni.
   *
   * @param dni the new dni
   */
  public void setDni(String dni) {
    this.dni = dni;
  }

  /**
   * Gets the edad.
   *
   * @return the edad
   */
  public int getEdad() {
    return edad;
  }

  /**
   * Sets the edad.
   *
   * @param edad the new edad
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Nombre: " + nombre + " | DNI: " + dni + " | Edad: " + edad;
  }
}
