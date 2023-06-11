public class Vehiculos {
    private String kilometraje;
    private String anio;
    private String codigoInterno;
    private int tarifa;

    private Tipo tipo;
     enum Tipo{
        DOSPUERTAS,
        CUATROPUERTAS,
        CAMIONETA;
    }

    public Vehiculos(String kilometraje, String anio, String codigoInterno, int tarifa) {
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.codigoInterno = codigoInterno;
        this.tarifa = tarifa;
    }

    public Vehiculos() {

    }


    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
