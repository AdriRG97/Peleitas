/**
 * Created by a5432 on 08/05/2017.
 */
public class Peleador {
    String nombre;
    int vida;
    int defensa;
    int ataque;


    public Peleador() {
    }

    public Peleador(String nombre, int vida, int defensa, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Peleador " +
                    nombre  +
                ", vida=" + vida +
                ", defensa=" + defensa +
                ", ataque=" + ataque;
    }
}
