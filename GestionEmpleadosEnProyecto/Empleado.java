
public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, String direccion, double salario) {
        super(nombre, edad, direccion);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
