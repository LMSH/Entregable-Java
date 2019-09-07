public class Profesor {

    private String nombreDelProfesor;
    private String apellidoDelProfesor;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    //Método Constructor.
    public Profesor(String nombreDelProfesor, String apellidoDelProfesor, Integer antiguedad, Integer codigoDeProfesor) {
        this.nombreDelProfesor = nombreDelProfesor;
        this.apellidoDelProfesor = apellidoDelProfesor;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    //Métodos Getter.
    public String getNombreDelProfesor() {
        return nombreDelProfesor;
    }
    public String getApellidoDelProfesor() {
        return apellidoDelProfesor;
    }
    public Integer getAntiguedad(){return antiguedad;}
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
    public Integer setAntiguedad() {
        return antiguedad;
    }
    public Integer setCodigoDeProfesor (){
        return codigoDeProfesor;
    }

    // Un curso es igual a otro si sus códigos de curso son iguales.

}
