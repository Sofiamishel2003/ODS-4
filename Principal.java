import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Matematica mate = new Matematica();
        int opcion1 = 0;
        System.out.println("¿Qué deseas hacer? \n [1] sign in \n [2] log in");
        opcion1 = keyboard.nextInt();
        if(opcion1 == 1){
            String nombreUsuario, contraseña, colegio;
            int grado;
            System.out.println("Escoge tu nombre de usuario: ");
            nombreUsuario = keyboard.nextLine();
            nombreUsuario = keyboard.nextLine();
            System.out.println("Escribe tu contreaseña: ");
            contraseña = keyboard.nextLine();
            System.out.println("¿Cuál es tu colegio?: ");
            colegio = keyboard.nextLine();
            System.out.println("¿Cuál es tu grado? \n [1] 1ro y 2ndo primaria \n [2] 3ro y 4to primaria \n [3] 5to y 6to primaria \n [4] Secundaria");
            grado = keyboard.nextInt();
            Estudiante estudiante = new Estudiante(nombreUsuario, contraseña, colegio,grado, 0);
            System.out.println("Bienvenido!");
            System.out.println("Práctica de matemática: ");
            mate.preguntas(grado);
        }else if(opcion1 == 2){
            System.out.println("Ingrese su usuario: ");
            System.out.println("Ingrese su contraseña: ");
        }

    }
}
