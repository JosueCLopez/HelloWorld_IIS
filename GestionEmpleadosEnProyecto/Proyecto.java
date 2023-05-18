
public class Proyecto {
    private Departamento departamento;

    public Proyecto() {
        this.departamento = new Departamento();
    }

    public void agregarEmpleado(Empleado empleado) {
        departamento.agregarEmpleado(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        departamento.eliminarEmpleado(empleado);
    }

    public void mostrarEmpleados() {
        departamento.mostrarEmpleados();
    }
}
