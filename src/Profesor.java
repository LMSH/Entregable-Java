public class Profesor {

    private String nombreDelProfesor;
    private String apellidoDelProfesor;
    private Integer codigoDeProfesor;

    //Métodos Getter.
    public String getNombreDelProfesor() {
        return nombreDelProfesor;
    }
    public String getApellidoDelProfesor() {
        return apellidoDelProfesor;
    }
    public Integer getCodigoDeProfesor(){
        return codigoDeProfesor;
    }

    // Métodos Setter
    public String setNombreDelProfesor(){
        return nombreDelProfesor;
    }
    public String setApellidoDelProfesor () {
        return apellidoDelProfesor;
    }
    public Integer setCodigoDeProfesor (){
        return codigoDeProfesor;
    }

    // Un curso es igual a otro si sus códigos de curso son iguales.

}
