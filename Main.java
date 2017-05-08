import java.util.Scanner;

/**
 * Created by a5432 on 08/05/2017.
 */
public class Main {
    public static void main(String[] args) {

        //Crear dos peleadores.
        //Un menú con las opciones de inicio de juego
        //Select-switch de las opciones

        Scanner lector = new Scanner(System.in);
        Pelea peleita = new Pelea();
        int opcion;


        System.out.println("Bienvenido al juego Peleitas");
        do{
            System.out.println("Selecciona una opción:");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            opcion=lector.nextInt();
        } while(opcion<0 && opcion >3);

        if (opcion ==1){
            do{
                System.out.println("Selecciona un campeón:");
                System.out.println(peleita.toString());
                opcion=lector.nextInt();
            } while(opcion<0 && opcion >6);
        }else{
            System.exit(0);
        }




    }
}
