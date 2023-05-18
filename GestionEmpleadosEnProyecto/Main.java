
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();
        Empleado empleado1 = new Empleado("Juan", 25, "Calle 123", 1500.0);
        Empleado empleado2 = new Empleado("Nauj", 26, "Calle 123", 2000.0);
        proyecto.agregarEmpleado(empleado1);
        proyecto.agregarEmpleado(empleado2);
        proyecto.agregarEmpleado(empleado1);
        proyecto.agregarEmpleado(empleado2);
        proyecto.mostrarEmpleados();

    }
}
