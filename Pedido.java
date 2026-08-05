public class Pedido {

    enum EstadoPedido {
        RECIBIDO,
        EN_PREPARACION,
        HORNEANDO,
        EN_CAMINO,
        ENTREGADO
    }

    private int numeroPedido;
    private double total;
    private Pizza[] pizzas;
    private EstadoPedido estado;

    
    public Pedido(int numeroPedido, double total, Pizza[] pizzas, EstadoPedido estado) {
        this.numeroPedido = numeroPedido;
        this.total = total;
        this.pizzas = pizzas;
        this.estado = estado;
    }

    public void agregarPizza(Pizza pizza) {
        System.out.println("Agregando pizza " + pizza);
    }

    public void agregarPizza(Pizza pizza, int cantidad) {
        System.out.println("Agregando " + cantidad + " pizzas de " + pizza);
    }

    public double calcularTotal() {
        return total;
    }

    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
        System.out.println("Cambiando el estado del pedido a " + estado);
    }

    // Getters  Setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}