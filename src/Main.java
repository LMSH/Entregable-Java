public class Main {
    public static void main(String[] args) {

        // TEST MÉTODOS DE LA CLASE CURSO.
        //Metodo 1
        Curso Android = new Curso("Android",123,3);
        Curso FullStack = new Curso("Full Stack", 20002,2);
        Alumno a1 = new Alumno( "Juan", "Gomez",1235);
        Alumno a2 = new Alumno( "Hector", "Ramirez",1235);
        Alumno a3 = new Alumno("Ramon","Perez",123);



        Android.agregarUnAlumno(a1);
        Android.agregarUnAlumno(a2);
        Android.agregarUnAlumno(a3);
        FullStack.agregarUnAlumno(a1);
        FullStack.agregarUnAlumno(a2);


        Android.mostraralumnosinscriptos();

        //Metodo 2.
        Android.eliminarAlumno(a1);
        Android.eliminarAlumno(a2);
        Android.mostraralumnosinscriptos();
        FullStack.mostraralumnosinscriptos();



        // TEST MÉTODOS DE LA CLASE DIGITAL HOUSE MANAGER.

        // Metodo 1.


        // Método 2.

        // Método 3.



        // Métodp 4.
        ProfesorTitular pT = new ProfesorTitular("Juan","Gomez",4,555,"Android");












        /*ProfesorTitular profesorTitular1 = new ProfesorTitular("Jorge","Perez",4,1234,"Java");
        ProfesorTitular profesorTitular2 = new ProfesorTitular("Matias","Alvarez",2,1222,"Javascrpit");

        ProfesorAdjunto profesorAdjjunto1 = new ProfesorAdjunto("Ramon","Vasco",2,1255,6);
        ProfesorAdjunto profesorAdjunto2 = new ProfesorAdjunto("Pablo","Maras",1,1236,6);

        Curso curso1 = new Curso("Full Stack", 20001, 3);
        Curso curso2 = new Curso("Android", 20002,2);

        Alumno alumno1 = new Alumno("Hector", "Martinez", 12345);
        Alumno alumno2 = new Alumno("Juan", "Sanchez", 12356);
        Alumno alumno3 = new Alumno("Luis", "Cramer", 12347);

        curso1.agregarALista(alumno1);
        curso2.agregarALista(alumno1);

        curso1.agregarUnAlumno(alumno1);
        curso2.agregarUnAlumno(alumno2);*/



        //4. Asignarle un profesor titular y un adjunto a cada curso.
        //5. Dar de alta a tres alumnos. (Inventar todos sus valores).
        //6. Inscribir a dos alumnos en el curso de Full Stack.
        //7. Inscribir a tres alumnos en el curso de Android.
        //8. Dar de baja un profesor
        //9. Dar de baja un curso.



    }

}





//¿Cómo modificaría el diagrama de clases para que se le pueda consultar a un alumno a qué
// cursos está inscripto?