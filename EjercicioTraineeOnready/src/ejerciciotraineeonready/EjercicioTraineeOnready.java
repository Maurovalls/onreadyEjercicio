
package ejerciciotraineeonready;

import java.util.Collections;

public class EjercicioTraineeOnready {

    public static void main(String[] args) {
       Vehiculo vehiculo1 = null ;
       Vehiculo vehiculo2 =null;
       Vehiculo vehiculo3 =null;
       Vehiculo vehiculo4 =null;
       AlmacenVehiculo almacen = null;
       inicio(vehiculo1,vehiculo2,vehiculo3,vehiculo4,almacen);
    }
    
    public static void inicio(Vehiculo vehiculo1,Vehiculo vehiculo2,Vehiculo vehiculo3,Vehiculo vehiculo4,AlmacenVehiculo almacen){
       vehiculo1 = new Auto("Peugeot","206",200000,4);
       vehiculo2 = new Moto("Honda","Titan",60000,"125cc");
       vehiculo3 = new Auto("Peugeto","208",250000,5);
       vehiculo4 = new Moto("Yamaha","YRB",80500,"160cc");
       almacen = new AlmacenVehiculo();
       almacen.getVehiculos().add(vehiculo1);
       almacen.getVehiculos().add(vehiculo2);
       almacen.getVehiculos().add(vehiculo3);
       almacen.getVehiculos().add(vehiculo4);
       almacen.vehiculosDisponibles();
       System.out.println("============================");
       almacen.vehiculoMasCaro();
       almacen.vehiculoMasBarato();
       almacen.contieneLetraY();
       System.out.println("=============================");
       Collections.sort(almacen.getVehiculos(),new AlmacenVehiculo());
       System.out.println("Vehículos ordenados por precio de mayor a menor:");
       for(int i =0; i<almacen.getVehiculos().size();i++){
       System.out.println(almacen.getVehiculos().get(i).getMarca()+" "+almacen.getVehiculos().get(i).getModelo());
       }
    }
    
    }
    
    
    

