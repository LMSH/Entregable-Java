import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscriptos;

    public DigitalHouseManager(){
        listaDeCursos = new ArrayList<>();
        listaDeProfesores = new ArrayList<>();
        listaDeAlumnos = new ArrayList<>();
        listaDeInscriptos = new ArrayList<>();
    }


    //Método getter.
    public List<Inscripcion> getListaDeInscriptos(){
        return listaDeInscriptos;
    }

    //Método setter.
    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }


    // 1) Crear un método en la clase DigitalHouseManager que permita dar de alta un curso. El método
    //recibe como parámetros el nombre del curso, el código y el cupo máximo de alumnos que se
    //admite. El método debe crear un curso con los datos correspondientes y agregarlo a la lista de
    //cursos.

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        listaDeCursos.add(new Curso(nombre,codigoCurso,cupoMaximoDealumnos));
        System.out.println(getListaDeInscriptos());
    }



    // 2) Crear un método en la clase DigitalHouseManager que permita dar de baja un curso. El método
    //recibe como parámetro el código del curso. El método debe utilizar el código del curso para
    //buscarlo en la lista de cursos y eliminarlo de la lista.

    public void bajaCurso(Integer codigoCurso) {




        }

    // 3) Crear un método en la clase DigitalHouseManager que permita dar de alta a un profesor
    //adjunto. El método recibe como parámetros el nombre del profesor, el apellido, el código y la
    //cantidad de horas disponibles para consulta. La antigüedad inicial del profesor será cero. El
    //método debe crear un profesor adjunto con los datos correspondientes y agregarlo a la lista de
    //profesores.

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){




    }

    // 4) Crear un método en la clase DigitalHouseManager que permita dar de alta a un profesor titular.
    //El método recibe como parámetros el nombre del profesor, el apellido, el código y la
    //especialidad. La antigüedad inicial del profesor será cero. El método debe crear un profesor
    //titular con los datos correspondientes y agregarlo a la lista de profesores.

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){




    }


    // 5) Crear un método en la clase DigitalHouseManager que permita dar de baja a un profesor. El
    //método recibe como parámetro el código del profesor. El método debe utilizar el código del
    //profesor para buscarlo en la lista de profesores y eliminarlo de la lista.

    public void bajaProfesor(Integer codigoProfesor){




    }

    // 6) Crear un método en la clase DigitalHouseManager que permita dar de alta a un alumno. El
    //método recibe como parámetros el nombre, el apellido y el código del alumno. El método debe
    //crear un alumno con los datos correspondientes y agregarlo a la lista de alumnos.

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){




    }

    // 7) Crear un método en la clase DigitalHouseManager que permita inscribir un alumno a un curso.
    //El método recibe como parámetros el código del alumno y código del curso al que se inscribe.
    //El método debe:
    //● Buscar el curso al que se quiere inscribir.
    //● Buscar al alumno al que se quiere inscribir.
    //● Inscribir al alumno si es posible.
    //● En caso de ser posible, crear una inscripción y setearla con los datos que corresponden.
    //○ Agregar la inscripción a la lista de inscripciones.
    //○ Informar por pantalla la inscripción realizada.
    //● Si no hay cupo disponible:
    //○ Informar por pantalla que no se pudo inscribir porque no hay cupo

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){




    }

    // 8) Crear un método en la clase DigitalHouseManager que permita asignar a un curso sus
    //profesores. El método recibe como parámetros el código del curso, el código del profesor titular y
    //el código del profesor adjunto
    //El método debe:
    //● Buscar al profesor titular en la lista de profesores.
    //● Buscar al profesor adjunto en la lista de profesores.
    //● Asignarle al curso ambos profesores.

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){




    }






}



