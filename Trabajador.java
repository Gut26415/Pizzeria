import java.time.LocalDate;
import interfaces.InterfaceTrabajador;

public class Trabajador extends Usuario implements InterfaceTrabajador {

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

    @Override
    public void ingresar() {}

    @Override
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