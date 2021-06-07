package casteo;


public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento=" + departamento; //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  super.toString() +  "Gerente{" + "departamento=" + departamento + '}';
    }

}
