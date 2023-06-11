public class Cliente {
    private String Dni;
    private String nombre;
    private boolean registro;

    public Cliente(String dni, String nombre,boolean registro) {
        Dni = dni;
        this.nombre = nombre;
        this.registro=registro;
    }

    public Cliente() {
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
}
