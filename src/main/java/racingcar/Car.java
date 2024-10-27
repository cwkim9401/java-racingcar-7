package racingcar;

public class Car {

    private String name;
    private int position = 0;

    public Car(String carName) {
        this.name = carName;
    }

    public int move() {
        return position + RandomNumber.go();
    }

    public String positionView() {
        return "-".repeat(move());
    }
}
