public class Usuario {
    private int id = 0;
    private String nombre;
    private int edad;
    private String telefono;
    private String direccion;
    
    public Usuario(int id, String nombre, int edad, String telefono, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion; 
    }

    public Usuario(String nombre, String direccion){
        id = id+1;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId(){
        return id;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreNuevo){
        nombre = nombreNuevo;
    }
}
