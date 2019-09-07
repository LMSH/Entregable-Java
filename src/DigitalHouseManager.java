import java.util.List;

public class DigitalHouseManager {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscriptos;

    //Método getter.
    public List<Inscripcion> getListaDeInscriptos(){
        return listaDeInscriptos;
    }




    // Crear un método en la clase DigitalHouseManager que permita dar de alta un curso. El método
    //recibe como parámetros el nombre del curso, el código y el cupo máximo de alumnos que se
    //admite. El método debe crear un curso con los datos correspondientes y agregarlo a la lista de
    //cursos.

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        listaDeCursos.add(new Curso(nombre,codigoCurso,cupoMaximoDealumnos));
    }



}
