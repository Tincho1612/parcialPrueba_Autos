public class Alquiler {
    private String fechaInicio;
    private String fechaFinal;
    Vehiculos vehiculo;
    Cliente ususario;
    private final int costoFijo = 50;
    private int diasRentados;
    private Sucursal sucursal;
    private int kilometrosRealizados;

    public double calcularCostoTotal(){
        return (kilometrosRealizados + costoFijo) + diasRentados;
    }
    public Alquiler(String fechaInicio, String fechaFinal, Vehiculos vehiculo, Cliente ususario, int diasRentados, Sucursal sucursal,int kilometrosRealizados) {
        if (ususario.isRegistro() && ususario.getDni() !=null && ususario.getNombre() !=null){
            this.diasRentados=diasRentados;
            this.fechaFinal=fechaFinal;
            this.fechaInicio=fechaInicio;
            this.vehiculo=vehiculo;
            this.ususario=ususario;
            this.kilometrosRealizados=kilometrosRealizados;
        }
        else {
            System.out.println("No cuumple los requisitos");
        }
    }

    public Alquiler() {

    }


    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getUsusario() {
        return ususario;
    }

    public void setUsusario(Cliente ususario) {
        this.ususario = ususario;
    }

    public int getCostoFijo() {
        return costoFijo;
    }

    public int getDiasRentados() {
        return diasRentados;
    }

    public void setDiasRentados(int diasRentados) {
        this.diasRentados = diasRentados;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
