import java.time.LocalDate;

public class Cliente extends Usuario{

     enum TipoCliente{
        TRADICIONAL, 
        MUY_FRECUENTE,
        VIP,
        ESTUDIANTES
    }
    
    private int puntos;
   
    private Pedido pedido;
    private TipoCliente tipoCliente;

    public Cliente(int id, String nombre, LocalDate fechaNacimiento,
                   String telefono, String direccion, int puntos, 
                   TipoCliente tipoCliente, Pedido pedido) {

        super(id, nombre, fechaNacimiento, telefono, direccion);

        this.puntos = puntos;
        this.tipoCliente = tipoCliente;
        this.pedido = pedido;
    }

    public Pedido hacerPedido(Pedido pedido){
        return pedido;
    }

    public int verPuntos(){
        return puntos;
    }

    public void acumularPuntos(int puntos){
        System.out.println("Acumulando "+puntos+" puntos");
    }

    public void acumularPuntos(double compra, boolean promocion){
        System.out.println("Acumulando puntos por la compra de "+compra+" con promocion: "+promocion);
    }

    //Getter Setter

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}

