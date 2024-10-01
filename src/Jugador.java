public class Jugador {

    public int dado1;
    public int dado2;
    public int dado3;

    public Jugador() {
        // NO NECESITAMOS INICIAR NADA, TENEMOS EL METODO tirarDados()
    }

    public void tirarDados(int dado1, int dado2, int dado3) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.dado3 = dado3;
    }

    public void determinarGanador(Jugador oponente){
        // Creeis que con estas condiciones esta completo?
        if(this.dado1 == this.dado2 && this.dado1 == this.dado3){
            System.out.println("El jugador principal es el ganador");
        } else if (oponente.dado1 == oponente.dado2 && oponente.dado1 == oponente.dado3) {
            System.out.println("El jugador oponente es el ganador");
        } else {
            int sumaDadosJugadorPrincipal = this.dado1 + this.dado2 + this.dado3;
            int sumaDadosJugadorOponente = oponente.dado1 + oponente.dado2 + oponente.dado3;
            if(sumaDadosJugadorPrincipal > sumaDadosJugadorOponente) {
                System.out.println("El jugador principal es el ganador");
            } else if (sumaDadosJugadorPrincipal < sumaDadosJugadorOponente) {
                System.out.println("El jugador oponente es el ganador");
            } else {
                System.out.println("EMPATE.");
            }
        }
    }
}
