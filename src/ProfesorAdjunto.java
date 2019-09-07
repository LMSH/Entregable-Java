public class ProfesorAdjunto extends Profesor {

    private Integer cantidadDeHoras;

    //Método constructor.
    public ProfesorAdjunto(String nombreDelProfesor, String apellidoDelProfesor, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHoras) {
        super(nombreDelProfesor, apellidoDelProfesor, antiguedad, codigoDeProfesor);
        this.cantidadDeHoras = cantidadDeHoras;
    }


    // Método Getter.
    public Integer getCantidadDeHoras (){
    return cantidadDeHoras;
    }

    //Método Setter.
    public Integer setCantidadDeHoras(){
        return cantidadDeHoras;
    }





}