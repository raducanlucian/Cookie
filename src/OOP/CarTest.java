package OOP;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car( 10f,  8f,  false );

        Car dacia = new Car( 10f,  5f,  false);

        bmw.start();
        bmw.drive(180);
        bmw.drive(600);

        System.out.println(bmw.getFuel());
        System.out.println(bmw.range());

        bmw.wheels = 3;
        System.out.println(bmw.wheels);
        System.out.println(dacia.wheels);
    }
}
