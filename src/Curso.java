import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Curso {
    private String nombreDelCurso;
    private Integer codigoDelCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnosInscriptos;

    // Método Constructor.
    public Curso(String nombreDelCurso, Integer codigoDelCurso, Integer cupoMaximoDeAlumnos) {
        this.nombreDelCurso = nombreDelCurso;
        this.codigoDelCurso = codigoDelCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
        listaDeAlumnosInscriptos = new ArrayList<>();
    }

    // Métodos Getter.
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public Integer getCodigoDelCurso() {
        return codigoDelCurso;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public List<Alumno> getListaDeAlumnosInscriptos() {
        return listaDeAlumnosInscriptos;
    }

    // Métodos Setters.
    public String setNombreDelCurso() {
        return nombreDelCurso;
    }

    public Integer setCodigoDelCurso() {
        return codigoDelCurso;
    }

    public ProfesorTitular setProfesorTitular() {
        return profesorTitular;
    }

    public Integer setCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public ProfesorAdjunto setProfesorAdjunto() {
        return profesorAdjunto;
    }

    //Un curso es igual a otro si sus códigos de curso son iguales.


    // Crear un método que permita agregar un Alumno a la Lista.
    public Boolean agregarUnAlumno(Alumno unAlumno) {
        if (listaDeAlumnosInscriptos.size() <= cupoMaximoDeAlumnos) {
            listaDeAlumnosInscriptos.add(unAlumno);
            System.out.println("Cupo Disponible, " + unAlumno + " fue inscripto al curso");
            return true;
        } else {
            System.out.println("No hay Cupo Disponible, " + unAlumno + " El Curso esta Completo, su inscrión no fue realizada");
            return false;
        }
    }

    public void mostraralumnosinscriptos() {
        System.out.println(getListaDeAlumnosInscriptos());}


    // Crear un método en la clase Curso que permita eliminar un alumno de la lista de alumnos del curso.

    public void eliminarAlumno (Alumno unAlumno){
        for (Alumno listaDeAlumnosInscripto : listaDeAlumnosInscriptos) {
            if (!unAlumno.equals(unAlumno)) {
                listaDeAlumnosInscriptos.remove(unAlumno);
                System.out.println(unAlumno + "Fue Eliminado de la Lista");


            }
        }


    }}
