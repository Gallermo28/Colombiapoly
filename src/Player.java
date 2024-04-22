import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;

// Clase para representar a un jugador
public class Player {
    private String name;
    private int money;
    private List<Property> properties;

    public Player(String name) {
        this.name = name;
        this.money = 6000000; // El dinero inicial del jugador
        this.properties = new ArrayList<>();
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
}
