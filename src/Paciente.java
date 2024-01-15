public class Paciente {

    private String nombre;
    private String apellido;
    private int edad;

    public Paciente (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return String.format("%s, %s. %d años", apellido,nombre,edad);
    }
}
