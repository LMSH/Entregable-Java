import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreDelCurso;
    private Integer codigoDelCurso;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listaDeAlumnos;


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
    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
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




}
