import java.text.NumberFormat;
import java.util.Locale;

// Clase para representar una propiedad
public class Property {
    private String name;
    private int cost;
    private Player owner;

    public Property(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // Métodos getters y setters para los atributos
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getFormattedCost() {
        // Crear una instancia de NumberFormat para el formato de moneda en Colombia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("es", "CO"));

        // Usar el formateador para convertir el costo a un String con separadores de miles
        return formatter.format(cost);
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
