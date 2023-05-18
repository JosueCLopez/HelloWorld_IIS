
import java.util.ArrayList;

public class Departamento {
    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.empleados = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Dirección: " + empleado.getDireccion());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("-----------------------");
        }
    }
}
