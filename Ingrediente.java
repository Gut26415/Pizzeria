public class Ingrediente {
    enum UnidadMedida{
        GRAMOS,
        KILOGRAMOS,
        LITROS,
        MILILITROS,
        CUCHARADAS,
        CUCHARADITAS,
        TAZAS
    }

    private String nombre;
    private double cantidad;
    private UnidadMedida unidadMedida;
    private boolean fresco;

    public Ingrediente(String nombre){
        this.nombre = nombre;
    }

    public Ingrediente(String nombre, double cantidad, UnidadMedida unidadMedida){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }
    
    public boolean estaDisponible(){
        return true;
    }

    public double reabastecerIngrediente(double cantidad){
        return cantidad;
    }

    public void vence(){
    }

    //Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean getFresco() {
        return fresco;
    }

    public void setFresco(boolean fresco) {
        this.fresco = fresco;
    }
}


