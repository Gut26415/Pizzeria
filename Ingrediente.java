public class Ingrediente {
    
    private String nombre;
    private double cantidad;
    private String unidadMedida;
    private boolean fresco;

    public Ingrediente(String nombre){
        this.nombre = nombre;
    }

    public Ingrediente(String nombre, double cantidad, String unidadMedida){
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
}


