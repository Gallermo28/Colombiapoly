import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia del tablero del juego
        Board board = new Board();

        // Crear jugadores
        Player player1 = new Player("Jugador 1");
        Player player2 = new Player("Jugador 2");

        // Crear un array de jugadores
        Player[] players = {player1, player2};

        // Imprimir el dinero inicial de los jugadores
        printInitialMoney(players);

        // Variable para seguir el turno del jugador
        int playerTurn = 0;

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mientras el juego esté en marcha
        while (true) {
            // Obtener el jugador actual
            Player currentPlayer = players[playerTurn];

            // Lanzar los dados
            int diceRoll = rollDice();

            // Mover al jugador en el tablero
            currentPlayer.move(diceRoll);

            // Obtener la propiedad en la que el jugador ha caído
            Property currentProperty = board.getProperty(currentPlayer.getPosition());

            // Si la propiedad no tiene dueño
            if (currentProperty.getOwner() == null) {
                // El jugador compra la propiedad si puede
                currentPlayer.buyProperty(currentProperty);
            } else if (currentProperty.getOwner() != currentPlayer) {
                // El jugador paga el alquiler al dueño de la propiedad
                currentPlayer.payRent(currentProperty);
            }

            // Opción para comprar casas o hipotecar propiedades
            System.out.println("¿Quieres comprar una casa o hipotecar una propiedad? (s/n)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("s")) {
                // Aquí puedes implementar la lógica para comprar casas o hipotecar propiedades
                System.out.println("¿Quieres comprar una casa (c) o hipotecar una propiedad (h)?");
                response = scanner.nextLine();
                if (response.equalsIgnoreCase("c")) {
                    // El jugador compra una casa
                    System.out.println("¿Para qué propiedad quieres comprar una casa?");
                    String propertyName = scanner.nextLine();
                    Property property = findPropertyByName(propertyName, currentPlayer.getProperties());
                    if (property != null) {
                        currentPlayer.buyProperty(property);
                    } else {
                        System.out.println("No posees esa propiedad.");
                    }
                } else if (response.equalsIgnoreCase("h")) {
                    // El jugador hipoteca una propiedad
                    System.out.println("¿Qué propiedad quieres hipotecar?");
                    String propertyName = scanner.nextLine();
                    Property property = findPropertyByName(propertyName, currentPlayer.getProperties());
                    if (property != null) {
                        currentPlayer.mortgageProperty(property);
                    } else {
                        System.out.println("No posees esa propiedad.");
                    }
                }
            }

            // Pasar al siguiente jugador
            playerTurn = (playerTurn + 1) % players.length;
        }
    }

    // Método para lanzar los dados
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Método para imprimir el dinero inicial de los jugadores
    public static void printInitialMoney(Player[] players) {
        for (Player player : players) {
            System.out.println(player.getName() + " tiene " + player.getFormattedMoney() + " pesos.");
        }
    }

    // Método para encontrar una propiedad por su nombre
    public static Property findPropertyByName(String name, List<Property> properties) {
        for (Property property : properties) {
            if (property.getName().equalsIgnoreCase(name)) {
                return property;
            }
        }
        return null;
    }
}
