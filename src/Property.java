import java.text.NumberFormat;
import java.util.Locale;

// Clase para representar una propiedad
public class Property {
    private String name;
    private int cost;
    private int rent;
    private int houseCost; // Costo de una casa
    private int[] rentWithHouses; // Alquiler con 1, 2, 3 y 4 casas
    private Player owner;
    private int mortgageValue; //Valor de la hipoteca de la propiedad

    public Property(String name, int cost, int rent, int mortgageValue, int[] rentWithHouses) {
        this.name = name;
        this.cost = cost;
        this.rent = rent; //El alquiler de la propiedad
        this.mortgageValue = mortgageValue;
        this.rentWithHouses = rentWithHouses;
    }

    // Métodos getters y setters para los atributos
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    public int getRent() {
        return rent;
    }
    public int getMortgageValue() {
        return mortgageValue;
    }

    public String getFormattedCost() {
        // Crear una instancia de NumberFormat para el formato de moneda en Colombia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("es", "CO"));

        // Usar el formateador para convertir el costo a un String con separadores de miles
        return formatter.format(cost);
    }
    public String getFormattedRent() {
        // Crear una instancia de NumberFormat para el formato de moneda en Colombia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("es", "CO"));

        // Usar el formateador para convertir el alquiler a un String con separadores de miles
        return formatter.format(rent);
    }
    public String getFormattedMortgageValue() {
        // Crear una instancia de NumberFormat para el formato de moneda en Colombia
        NumberFormat formatter = NumberFormat.getInstance(new Locale("es", "CO"));

        // Usar el formateador para convertir el valor de la hipoteca a un String con separadores de miles
        return formatter.format(mortgageValue);
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
    public int getHouseCost() {
        return houseCost;
    }

    public int getRentWithHouses(int numberOfHouses) {
        return rentWithHouses[numberOfHouses - 1];
    }
}
