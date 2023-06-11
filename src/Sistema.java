import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Alquiler>alquileres=new ArrayList<>();
    private ArrayList<Sucursal>sucursales = new ArrayList<>();
    private ArrayList<Vehiculos>autos = new ArrayList<>();

    public void agregarVehiculo(Vehiculos auto){
        this.autos.add(auto);
    }
    public void agregarAlquiler (Alquiler alquiler){
        this.alquileres.add(alquiler);
    }
    public void agregarSucursal(Sucursal suc){
        this.sucursales.add(suc);
    }
    public void encontrarAlquilerConMayorValor (){
        Alquiler mayor=this.alquileres.get(0);
        for (Alquiler aux:this.alquileres){
            if (aux.calcularCostoTotal() > mayor.calcularCostoTotal()){
                mayor=aux;
            }
        }
        System.out.println(mayor);
    }
    public int cantidadAlquileresPorTipo(Vehiculos.Tipo modelo){
        int cantidad=0;
        for (Alquiler aux:alquileres){
            if (aux.vehiculo.getTipo() == modelo){
                cantidad++;
            }
        }
        return cantidad;
    }
    public void exportarJson(String path){
        File file = new File(path);
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file,this.autos);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void exportarAArchivoTxt(String path){
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter writer1 = new BufferedWriter(writer);
            writer1.write(alquileres.toString());
            writer1.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
