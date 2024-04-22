import java.util.ArrayList;
import java.util.List;


// Clase para representar el tablero del juego
public class Board {
    private List<Property> properties;

    public Board() {
        properties = new ArrayList<>();
        // Aquí puedes agregar todas las propiedades a tu tablero
        // Por ejemplo:
        properties.add(new Property("Bogotá", 1200000));
        properties.add(new Property("Medellín", 1000000));
        properties.add(new Property("Cartagena de Indias", 800000));
        properties.add(new Property("Barranquilla", 700000));
        properties.add(new Property("Santa Marta", 600000));
        properties.add(new Property("Eje Cafetero", 500000));
        properties.add(new Property("Bucaramanga", 400000));
        properties.add(new Property("Cúcuta", 300000));
        properties.add(new Property("Pereira", 300000));
        properties.add(new Property("Ibagué", 200000));
        properties.add(new Property("Villavicencio", 200000));
        properties.add(new Property("Buenaventura", 200000));
        properties.add(new Property("Riohacha", 150000));
        properties.add(new Property("San Andrés", 150000));
        properties.add(new Property("Pasto", 150000));
        properties.add(new Property("Popayán", 100000));
        properties.add(new Property("Neiva", 100000));
        properties.add(new Property("Tunja", 100000));
        properties.add(new Property("Montería", 50000));

        // ... y así sucesivamente para todas las propiedades
    }

    // Método para obtener una propiedad en una posición específica en el tablero
    public Property getProperty(int position) {
        return properties.get(position);
    }
}
