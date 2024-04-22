import java.util.ArrayList;
import java.util.List;


// Clase para representar el tablero del juego
public class Board {
    private List<Property> properties;

    public Board() {
        properties = new ArrayList<>();
        // Agregar todas las propiedades al tablero
        properties.add(new Property("Bogotá", 1200000, 100000, 50000, new int[]{50000, 100000, 150000, 200000}));
        properties.add(new Property("Medellín", 1000000, 80000, 40000, new int[]{40000, 80000, 120000, 160000}));
        properties.add(new Property("Cartagena de Indias", 800000, 60000, 30000, new int[]{30000, 60000, 90000, 120000}));
        properties.add(new Property("Barranquilla", 700000, 50000, 25000, new int[]{25000, 50000, 75000, 100000}));
        properties.add(new Property("Santa Marta", 600000, 40000, 20000, new int[]{20000, 40000, 60000, 80000}));
        properties.add(new Property("Eje Cafetero", 500000, 30000, 15000, new int[]{15000, 30000, 45000, 60000}));
        properties.add(new Property("Bucaramanga", 400000, 20000, 10000, new int[]{10000, 20000, 30000, 40000}));
        properties.add(new Property("Cúcuta", 300000, 10000, 5000, new int[]{5000, 10000, 15000, 20000}));
        properties.add(new Property("Pereira", 300000, 10000, 5000, new int[]{5000, 10000, 15000, 20000}));
        properties.add(new Property("Ibagué", 200000, 8000, 4000, new int[]{4000, 8000, 12000, 16000}));
        properties.add(new Property("Villavicencio", 200000, 8000, 4000, new int[]{4000, 8000, 12000, 16000}));
        properties.add(new Property("Buenaventura", 200000, 8000, 4000, new int[]{4000, 8000, 12000, 16000}));
        properties.add(new Property("Riohacha", 150000, 6000, 3000, new int[]{3000, 6000, 9000, 12000}));
        properties.add(new Property("San Andrés", 150000, 6000, 3000, new int[]{3000, 6000, 9000, 12000}));
        properties.add(new Property("Pasto", 150000, 6000, 3000, new int[]{3000, 6000, 9000, 12000}));
        properties.add(new Property("Popayán", 100000, 4000, 2000, new int[]{2000, 4000, 6000, 8000}));
        properties.add(new Property("Neiva", 100000, 4000, 2000, new int[]{2000, 4000, 6000, 8000}));
        properties.add(new Property("Tunja", 100000, 4000, 2000, new int[]{2000, 4000, 6000, 8000}));
        properties.add(new Property("Montería", 50000, 2000, 1000, new int[]{1000, 2000, 3000, 4000}));

    }

    // Método para obtener una propiedad en una posición específica en el tablero
    public Property getProperty(int position) {
        return properties.get(position);
    }
    // Método para obtener todas las propiedades
    public List<Property> getProperties() {
        return properties;
    }
}
