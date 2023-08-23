import java.util.ArrayList;
import java.util.List;

class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}

class CarCollection<T extends Car> {
    private List<T> cars = new ArrayList<>();

    public void addCar(T car) {
        cars.add(car);
    }

    public List<T> getAllCars() {
        return cars;
    }
}

public class App {
    public static void main(String[] args) {
        Car sedan = new Car("Toyota", "Camry");
        Car suv = new Car("Ford", "Explorer");

        CarCollection<Car> carCollection = new CarCollection<>();
        carCollection.addCar(sedan);
        carCollection.addCar(suv);

        List<Car> allCars = carCollection.getAllCars();

        System.out.println("All Cars:");
        for (Car car : allCars) {
            System.out.println(car);
        }
    }
}
