import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;

// Clase para representar a un jugador
public class Player {
    private String name;
    private int money;
    private int position;
    private List<Property> properties;
    private List<Property> mortgagedProperties;

    public Player(String name) {
        this.name = name;
        this.money = 6000000; // El dinero inicial del jugador
        this.position = 0; // La posición inicial del jugador en el tablero
        this.properties = new ArrayList<>();
        this.mortgagedProperties = new ArrayList<>();
    }

    // Métodos getters y setters para los atributos
    public String getName() {
        return name;
    }


    public int getMoney() {
        return money;
    }


    public String getFormattedMoney() {
        // Crear una instancia de NumberFormat para el formato de moneda en Colombia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("es", "CO"));

        // Usar el formateador para convertir el dinero a un String con separadores de miles
        return formatter.format(money);
    }

    public List<Property> getProperties() {
        return properties;
    }

    // Método para comprar una propiedad
    public void buyProperty(Property property) {
        if (money >= property.getCost()) {
            money -= property.getCost();
            properties.add(property);
            property.setOwner(this);
        } else {
            System.out.println("No tienes suficiente dinero para comprar esta propiedad.");
        }
    }
    public int getPosition() {
        return position;
    }

    public void move(int spaces) {
        position = (position + spaces) % 40; // El tablero tiene 40 espacios
    }

    public void payRent(Property property) {
        if (money >= property.getRent()) {
            money -= property.getRent();
            property.getOwner().receiveMoney(property.getRent());
        } else {
            System.out.println(name + " no puede pagar el alquiler. Puede optar por hipotecar una propiedad.");
        }
    }
    public void mortgageProperty(Property property) {
        if (properties.contains(property) && !mortgagedProperties.contains(property)) {
            money += property.getMortgageValue();
            mortgagedProperties.add(property);
            System.out.println(name + " ha hipotecado " + property.getName() + " y ha recibido " + property.getFormattedMortgageValue() + " pesos.");
        } else {
            System.out.println("No puedes hipotecar esta propiedad.");
        }
    }

    public void receiveMoney(int amount) {
        money += amount;
    }
}
