package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String[] carNames() {
        String nameInput = Console.readLine();
        return nameInput.split(",");
    }

    public static void errors() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        for (int i = 0; i < carNames().length; i++) {
            if (carNames()[i].length() > 5 || carNames()[i].length() <= 0) {
                throw new IllegalArgumentException("5자 이하로 입력하십시오");
            }
        }
    }

    public static int rounds() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String numberInput = Console.readLine();
        if (numberInput.isEmpty()) {
            throw new IllegalArgumentException("값을 입력하십시오");
        }
        return Integer.parseInt(numberInput);
    }
}
