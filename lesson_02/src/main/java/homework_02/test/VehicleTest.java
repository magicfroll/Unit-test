package homework_02.test;

import homework_02.Car;
import homework_02.Motorcycle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class VehicleTest {

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof)
     */

    @Test
    void isInstanceOfCarClass(){
        Car car = new Car("Audi", "A4", 2004);
        assertThat(car instanceof Car).isEqualTo(true);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами
     */

    @Test
    void carNumWheels() {
        Car car = new Car("Audi", "A4", 2004);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами
     */
    @Test
    void motorcycleNumWheels() {
        Motorcycle motorcycle = new Motorcycle("Audi", "A4", 2004);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
     */

    @Test
    void carDriveSpeed() {
        Car car = new Car("Audi", "A4", 2004);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */

    @Test
    void motorcycleDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Audi", "A4", 2004);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0).
     */

    @Test
    void carParkSpeed() {
        Car car = new Car("Audi", "A4", 2004);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     мотоцикл останавливается (speed = 0).
     */

    @Test
    void motorcycleParkSpeed() {
        Motorcycle motorcycle = new Motorcycle("Audi", "A4", 2004);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
