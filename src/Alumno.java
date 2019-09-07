public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigodealumno;

    // Método Constructor.
    public Alumno(String nombre, String apellido, Integer codigodealumno){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigodealumno = codigodealumno;
    }

    // Métodos Getter.
    public String getNombre(){
        return nombre; }
    public String getApellido() {return apellido;}
    public Integer getCodigodealumno() {return codigodealumno;}

    // Método Setter.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCodigodealumno(Integer codigodealumno) {
        this.codigodealumno = codigodealumno;
    }



}
