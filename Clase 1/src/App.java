import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner(System.in);

        System.out.println("=====================================================================");

        System.out.println("Binevenido");

        System.out.println("=====================================================================");

        System.out.println("Ingrese su nombre");
        String Name = Leer.nextLine();
        System.out.println("Ingrese su apellido");
        String Apellido = Leer.nextLine();

        System.out.println("Este es su nombre y apellido");
        System.out.println(Name + " " + Apellido);

        System.out.println("=====================================================================");

        System.out.println("Ingrese su edad");
        int Edad = Leer.nextInt();

        System.out.println("=====================================================================");

        System.out.println("Este es tu nombre: " + Name + " " + Apellido + " y tienes " + Edad + " años");

        System.out.println("=====================================================================");

        System.out.println("Comprobando si eres mayor de edad...");

        boolean Verificacion;

        if (Edad >= 18) {
            Verificacion = true;
            System.out.println("Eres mayor de edad");
        } else {
            Verificacion = false;
            System.out.println("Eres menor de edad");
        }

        System.out.println("=====================================================================");
        Leer.close();

        
    }
}
