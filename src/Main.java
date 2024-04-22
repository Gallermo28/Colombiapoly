public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia del tablero del juego
        Board board = new Board();

        // Crear jugadores
        Player player1 = new Player("Jugador 1");
        Player player2 = new Player("Jugador 2");

        // Imprimir el dinero inicial de los jugadores
        System.out.println(player1.getName() + " tiene " + player1.getFormattedMoney() + " pesos.");
        System.out.println(player2.getName() + " tiene " + player2.getFormattedMoney() + " pesos.");

        // Aquí puedes comenzar a implementar la lógica de tu juego
    }
}
