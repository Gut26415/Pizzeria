import java.time.LocalDate;

public class Trabajador extends Usuario {

    public enum Puesto {
        GERENTE,
        PIZZERO,
        RECEPTOR
    }

    private Puesto puesto;
    private double salario;
    private int codigo;

    public Trabajador(int id, String nombre, LocalDate fechaNacimiento, String telefono, String direccion, Puesto puesto, double salario, int codigo) {
        super(id, nombre, fechaNacimiento, telefono, direccion);
        this.puesto = puesto;
        this.salario = salario;
        this.codigo = codigo;
    }

    public void prepararPizza(Pizza pizza) {}

    public void tomarPedido() {}

    public void ingresar() {}

    public void salir() {}

    public void entregarPizza(Pizza pizza) {}

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }
}