import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreDelCurso;
    private Integer codigoDelCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnosInscriptos;

    // Método Constructor.
    public Curso  (String nombreDelCurso,Integer codigoDelCurso,Integer cupoMaximoDeAlumnos){
        this.nombreDelCurso = nombreDelCurso;
        this.codigoDelCurso = codigoDelCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    }

    // Métodos Getter.
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }
    public Integer getCodigoDelCurso() {
        return codigoDelCurso;
    }
    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;}
    public ProfesorAdjunto getProfesorAdjunto(){
        return profesorAdjunto;
    }
    public Integer getCupoMaximoDeAlumnos(){
        return cupoMaximoDeAlumnos;
    }
    public List<Alumno> getListaDeAlumnosInscriptos() {
        return listaDeAlumnosInscriptos;
    }

    // Métodos Setters.
    public String setNombreDelCurso() {return nombreDelCurso;}
    public Integer setCodigoDelCurso() {return codigoDelCurso;}
    public ProfesorTitular setProfesorTitular(){
        return profesorTitular;
    }
    public Integer setCupoMaximoDeAlumnos(){
        return cupoMaximoDeAlumnos;
    }
    public ProfesorAdjunto setProfesorAdjunto(){
        return profesorAdjunto;
    }

    //Un curso es igual a otro si sus códigos de curso son iguales.


    // Crear un método que permita agregar un Alumno a la Lista.
    public Boolean agregarUnAlumno(Alumno unAlumno){
       if(listaDeAlumnosInscriptos.size() >= cupoMaximoDeAlumnos){
           listaDeAlumnosInscriptos.add(unAlumno);
        return true;}
       else {return false;}
    }

    // Crear un método en la clase Curso que permita eliminar un alumno de la lista de alumnos del curso.
    public void eliminarAlumno(Alumno unAlumno){
        listaDeAlumnosInscriptos.remove(unAlumno);
    }




}
