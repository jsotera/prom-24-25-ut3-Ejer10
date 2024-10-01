public class Main {
    public static void main(String[] args) {
        Jugador javi = new Jugador();
        Jugador mikel = new Jugador();

        javi.tirarDados(4, 4, 4);
        mikel.tirarDados(4, 4, 4);

        javi.determinarGanador(mikel);
    }
}