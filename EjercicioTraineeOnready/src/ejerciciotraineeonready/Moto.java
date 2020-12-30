
package ejerciciotraineeonready;

public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto() {
    }

    public Moto(String clindrada) {
        this.cilindrada = clindrada;
    }
    
    public Moto(String marca, String modelo, float precio, String cilindrada){
        super(marca,modelo,precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Marca: "+getMarca()+"// Modelo: "+getModelo()+" // Cilindrada: "+cilindrada+" // Precio: $"+getPrecio());
    }
}
