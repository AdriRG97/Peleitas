import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by a5432 on 08/05/2017.
 */

    public class Pelea extends Peleador{

        //Dos peleadores
        //Mostrar stats (vida, defensa, ataque)

        //Mostrar el tiempo o no
        //Victoria al mejor de 3

        int victoriaPeleador = 0;
        int contador = 0;

        List<Peleador> Peleadores;
        String[] nombres= {"Orianna", "Ahri", "Sivir", "Darius", "Zed", "Mordekaiser"};
        Random rnd= new Random();
        int num;

    public Pelea() {
        Peleadores=new ArrayList<>();
        for (int i=0;i<6;i++){
            num=rnd.nextInt(12);
            num+=1;
            Peleadores.add(new Peleador(nombres[i],300*(num%100),num,80+num ));
        }
    }

    Peleador peleador = new Peleador();
        Peleador enemigo = new Peleador();

        /*
        public void mostrarStats(int vida, int defensa, int ataque){
            String statsPeleador = "";
            String statsEnemigo = "";
            statsPeleador = peleador.vida+ peleador.ataque + peleador.defensa;
            System.out.println("" +statsPeleador);
            statsEnemigo = enemigo.vida + enemigo.ataque + enemigo.defensa;
            System.out.println("" +statsEnemigo);
        }

        */
        public void victoria(){
            if (contador != 3){
                if (peleador.vida == 0){
                    victoriaPeleador = 0;
                }else{
                    victoriaPeleador = 1;
                }
            } else{
                if (victoriaPeleador>=2){
                    System.out.println("Enhorabuena, has ganado");
                }else{
                    System.out.println("Oh no, el enemigo te ha ganado");
                }

            }
            contador +=1;
        }

    private String mostrarPeleadores="";
    @Override
    public String toString() {
        for (int i = 0; i < 6; i++) {
            mostrarPeleadores+=(i+1)+". "+Peleadores.get(i).toString()+"\n";
        }
    return mostrarPeleadores;
    }
}


