package racingcar;

public class Race {

    public static void racingView() {
        Car[] cars = new Car[Input.carNames().length];
        for (int i = 0; i < Input.carNames().length; i++) {
            cars[i] = new Car(Input.carNames()[i]);
        }
        System.out.println(cars[0].move());

    }

}
