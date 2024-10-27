package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumber {

    public static int go() {
        if(pickNumberInRange(0,9) > 4) {
            return 1;
        } else {
            return 0;
        }
    }
}
