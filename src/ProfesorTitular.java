public class ProfesorTitular extends Profesor {

    private String especialidad;

    //Método contructor.
    public ProfesorTitular(String nombreDelProfesor, String apellidoDelProfesor, Integer antiguedad, Integer codigoDeProfesor, String especialidad)
    {
        super(nombreDelProfesor, apellidoDelProfesor, antiguedad, codigoDeProfesor);
        this.especialidad = especialidad;
    }


    //Método Getter.
    public String getEspecialidad() {
        return especialidad;}

    //Método Setter.
    public String setEspecialidad(){
        return especialidad;}






}