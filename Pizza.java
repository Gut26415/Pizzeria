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
        this.disponibilidad = true;
    }

    public void hornear(){
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

    // Getter Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
