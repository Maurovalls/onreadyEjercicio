
package ejerciciotraineeonready;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto() {
    }

    public Auto(int puertas) {
        this.puertas = puertas;
    }
     
    public Auto(String marca, String modelo, float precio, int puertas){
        super(marca,modelo,precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
     public void mostrarDatos(){
        System.out.println("Marca: "+getMarca()+"// Modelo: "+getModelo()+" // Puertas: "+puertas+" // Precio: $"+getPrecio());
    }
    
}
