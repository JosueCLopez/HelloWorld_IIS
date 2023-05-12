import java.util.Scanner;
public class VerificarNumeroParOImpar {
    
    public static void main(String[] args) {
        //Declaramos las variables
        double numero;
        Scanner sc = new Scanner(System.in);
        //Recibimos el dato
        System.out.println("Ingrese el dato que desea verificar: ");
        numero = sc.nextDouble();
        if(numero % 2 == 0){
            System.out.println("El número es par!!");
        }
        else{
            System.out.println("El número es impar!!");
        }
    }
    
}
