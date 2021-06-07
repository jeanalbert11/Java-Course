
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);//Inheritance
        this.departamento = departamento;
    }

    //SobreEscritura del metodo de la clas padre 
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " Departamento: " + departamento; //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }

}
