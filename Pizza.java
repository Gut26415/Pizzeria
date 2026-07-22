public class Pizza {
    
    private String nombre;
    private String tamanio;
    private double precio;
    private Ingrediente[] ingredientes;
    private boolean disponibilidad;

    public Pizza(String nombre, String tamanio, double precio, Ingrediente[] ingredientes){
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
        this.ingredientes = ingredientes;
        disponibilidad = true;
    }

    public void horenar(){
        System.out.println("Horneando la pizza "+nombre);
    }

    public void enfriarse(){
        System.out.println("la pizza se esta enfriando");
    }

    public void cortarRebanada(int rebanadas){
        System.out.println("cortando la pizza en "+rebanadas+" rebanadas");
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        System.out.println("agregando el ingrediente "+ingrediente);
    }

    public void quitarIngrediente(Ingrediente ingrediente){
        System.out.println("quitando el ingrediente "+ingrediente);
    }
    


}
