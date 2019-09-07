import java.util.Date;

public class Inscripcion {

    private Alumno alumno;
    private Curso curso;
    private Date fechaDeInscripcion;

    //Método constructor.
    public void alumno (Alumno alumno, Curso curso){
        this.alumno = alumno;
        this.curso = curso;
        this.fechaDeInscripcion = new Date();
        ;}



}
