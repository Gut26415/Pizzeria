import java.time.LocalDate;

public class Usuario {

    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String direccion;

    public Usuario(int id, String nombre, LocalDate fechaNacimiento, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarDireccion(String direccion) {
        this.direccion = direccion;
    }
}