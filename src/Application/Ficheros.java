/**
 * @author javiluli (github)
 */

package Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * La clase Ficheros.
 */
public class Ficheros {

  /** Direcctorio donde almacenar los alumnos. */
  final static String D_ALUMNOS = "data/alumnos";

  /** Direcctorio donde almacenar los profesores. */
  final static String D_PROFESORES = "data/profesores";

  /**
   * Contador. Cuenta la cantidad de ficheros en un directorio.
   *
   * @param directorio el directorio para contar sus ficheros internos.
   * @return el int numero de ficheros que almacena el directorio.
   */
  public static int contador(String directorio) {
    File f = new File(directorio);
    return f.list().length;
  }

  /**
   * Guardar. Almacena en un fichero los datos de un Objeto, dado que Alumno y
   * Profesor comparten el atributo Nombre, este sera el nombre del fichero
   * tambien, por simplificar.
   *
   * @param obj        un Objeto, sea Alumno o Profesor.
   * @param directorio el directorio seseado.
   * @throws FileNotFoundException el archivo no se encuentra exceptuado.
   * @throws IOException           Señala que se ha producido una excepción de
   *                               E/S.
   */
  public static void guardar(Object obj, String directorio) throws FileNotFoundException, IOException {
    String FICHERO = directorio + "//" + ((Persona) obj).getNombre() + ".dat";
    ObjectOutputStream oo = null;

    oo = new ObjectOutputStream(new FileOutputStream(FICHERO));
    oo.writeObject(obj);

    oo.close();
  }

  /**
   * Leer. Lee la informacion almacenada en un fichero y la muestra por consola
   *
   * @param obj     un Objeto, sea Alumno o Profesor.
   * @param fichero el fichero que se desea leer.
   * @throws FileNotFoundException el archivo no se encuentra exceptuado.
   * @throws IOException           Señala que se ha producido una excepción de
   *                               E/S.
   */
  public static void leerFichero(Object obj, String fichero) throws FileNotFoundException, IOException {
    boolean fin = false;
    ObjectInputStream oi = null;
    try {
      oi = new ObjectInputStream(new FileInputStream(fichero));
    } catch (Exception e) {
      System.out.println("El fichero no existe");
      fin = true;
    }
    obj = null;
    if (!fin) {
      try {
        obj = (Persona) oi.readObject();
        oi.close();
      } catch (Exception e) {
        System.out.println(e);
      }
      System.out.println(obj);
    }
  }

  /**
   * Leer todo. Por medio de un bucle lee todos los ficheros de un directorio
   * concreto. Se mostrara por consola la informacion almacenada en todos los
   * ficheros de ese directorio.
   *
   * @param obj        un Objeto, sea Alumno o Profesor.
   * @param directorio el directorio seseado.
   */
  public static void leerFicheros(Object obj, String directorio) {
    File f = new File(directorio);
    String v[] = f.list();
    for (String i : v) {
      try {
        leerFichero(obj, directorio + "/" + i);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
