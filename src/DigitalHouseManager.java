import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public abstract class  DigitalHouseManager  {

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscriptos;
    private Curso Curso;


    public DigitalHouseManager(){
        listaDeCursos = new ArrayList<>();
        listaDeProfesores = new ArrayList<>();
        listaDeAlumnos = new ArrayList<>();
        listaDeInscriptos = new ArrayList<>();
        this.Curso = Curso;
    }


    //Método getter.
    public List<Inscripcion> getListaDeInscriptos(){
        return listaDeInscriptos;
    }
    public List<Curso> getListaDeCursos() { return listaDeCursos;}

    public Curso getUnCurso() {
        return Curso;
    }

    //Método setter.
    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
        this.listaDeProfesores = listaDeProfesores;
    }
    public void setUnCurso(Curso unCurso) {
        this.Curso = unCurso;
    }


    // 1) Crear un método en la clase DigitalHouseManager que permita dar de alta un curso. El método
    //recibe como parámetros el nombre del curso, el código y el cupo máximo de alumnos que se
    //admite. El método debe crear un curso con los datos correspondientes y agregarlo a la lista de
    //cursos.

    public void altaCurso (String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        Curso Curso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        listaDeCursos.add(Curso);
        System.out.println(getListaDeCursos());
    }



    // 2) Crear un método en la clase DigitalHouseManager que permita dar de baja un curso. El método
    //recibe como parámetro el código del curso. El método debe utilizar el código del curso para
    //buscarlo en la lista de cursos y eliminarlo de la lista.


    public void bajaCurso(Integer codigoCurso) {
        for (Curso curso:listaDeCursos){
                Curso cursoAEliminar = null;
            if(curso.getCodigoDelCurso().equals(codigoCurso)){
                cursoAEliminar = curso;
                System.out.println(getListaDeCursos());
            }
        }
    }

    // 3) Crear un método en la clase DigitalHouseManager que permita dar de alta a un profesor
    //adjunto. El método recibe como parámetros el nombre del profesor, el apellido, el código y la
    //cantidad de horas disponibles para consulta. La antigüedad inicial del profesor será cero. El
    //método debe crear un profesor adjunto con los datos correspondientes y agregarlo a la lista de
    //profesores.

    public void altaProfesorAdjunto(String nombreDelProfesor, String apellidoDelProfesor, Integer antiguedad, Integer codigoDeProfesor,Integer cantidadDeHoras){

        ProfesorAdjunto nuevoProfesorAdjunto = new ProfesorAdjunto(nombreDelProfesor, apellidoDelProfesor, antiguedad, codigoDeProfesor, cantidadDeHoras);
        listaDeProfesores.add(nuevoProfesorAdjunto);
        System.out.println("El Profesor Adjunto: " + nombreDelProfesor + " " + apellidoDelProfesor + "fue dado de alta.");
            }

    // 4) Crear un método en la clase DigitalHouseManager que permita dar de alta a un profesor titular.
    //El método recibe como parámetros el nombre del profesor, el apellido, el código y la
    //especialidad. La antigüedad inicial del profesor será cero. El método debe crear un profesor
    //titular con los datos correspondientes y agregarlo a la lista de profesores.

    public void altaProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor,Integer antiguedad, Integer codigoDeProfesor, String especialidad){

        ProfesorTitular nuevoProfesorTitular = new ProfesorTitular(nombreDelProfesor,apellidoDelProfesor,antiguedad, codigoDeProfesor,especialidad);

        listaDeProfesores.add(nuevoProfesorTitular);
        System.out.println("El Profesor Titular: " + nombreDelProfesor + " " + apellidoDelProfesor + "fue dado de alta.");
    }


    // 5) Crear un método en la clase DigitalHouseManager que permita dar de baja a un profesor. El
    //método recibe como parámetro el código del profesor. El método debe utilizar el código del
    //profesor para buscarlo en la lista de profesores y eliminarlo de la lista.

    public void bajaProfesor(Integer codigoProfesor){

         /* for (Profesor profesorAEliminar: listaDeProfesores) {
            if (codigoProfesor.equals(codigoProfesor)) {
                listaDeProfesores.remove(codigoProfesor);*/

            }




    // 6) Crear un método en la clase DigitalHouseManager que permita dar de alta a un alumno. El
    //método recibe como parámetros el nombre, el apellido y el código del alumno. El método debe
    //crear un alumno con los datos correspondientes y agregarlo a la lista de alumnos.

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){

    Alumno nuevoAlumno = new Alumno(nombre,apellido,codigoAlumno);
    listaDeAlumnos.add(nuevoAlumno);
        System.out.println("El Alumno: " + nombre + " " + apellido + "Fue dado de Alta.");
        System.out.println(listaDeAlumnos);
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



