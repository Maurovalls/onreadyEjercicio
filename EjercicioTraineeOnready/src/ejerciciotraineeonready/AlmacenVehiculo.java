
package ejerciciotraineeonready;

import java.util.ArrayList;
import java.util.Comparator;

public class AlmacenVehiculo implements Comparator {
    private ArrayList <Vehiculo> vehiculos = new ArrayList <>();

    public AlmacenVehiculo() {
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void vehiculosDisponibles(){
        for(Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarDatos();
        }
    }
   
    public void vehiculoMasCaro(){
        float aux = -2000;
        int cont = 0;
        for(int i = 0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getPrecio() > aux){
                aux = vehiculos.get(i).getPrecio();
            }
        }       
        for(int j = 0; j<vehiculos.size(); j++){
            if(vehiculos.get(j).getPrecio() == aux){
               cont = j;
            }
        }        
        System.out.println("Vehículo más caro: "+vehiculos.get(cont).getMarca()+" "+vehiculos.get(cont).getModelo());
    }
    
    public void vehiculoMasBarato(){
        float aux = 300000;
        int cont = 0;
        for(int i = 0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getPrecio() < aux){
                aux = vehiculos.get(i).getPrecio();
            }
        }       
        for(int j = 0; j<vehiculos.size(); j++){
            if(vehiculos.get(j).getPrecio() == aux){
               cont = j;
            }
        }        
        System.out.println("Vehículo más barato: "+vehiculos.get(cont).getMarca()+" "+vehiculos.get(cont).getModelo());
    }
    
    public void contieneLetraY(){
        int cont = 0;
        for(int i = 0; i<vehiculos.size(); i++){
            if(vehiculos.get(i).getModelo().contains("Y")){
                cont = i;
            }
        }
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:"+vehiculos.get(cont).getMarca()+" "
                +vehiculos.get(cont).getModelo()+"  $"+vehiculos.get(cont).getPrecio());
    }

    @Override
    public int compare(Object a, Object b) {
        Vehiculo v1 =(Vehiculo) a;
        Vehiculo v2 = (Vehiculo)b;
        return (int) (v2.getPrecio() - v1.getPrecio());
    }
    
    @Override
    public boolean equals(Object o){
        return this == o;
    }
    
    




}


      
    

    
    
    
    

