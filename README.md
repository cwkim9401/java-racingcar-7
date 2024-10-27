# java-racingcar-precourse

1. 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.
- String input = Console.readLine() 을 이용한다

2. 경주할 자동차 이름 입력 후 시도할 횟수를 입력한다

3. 자동차이름이 null 이거나 5자가 초과할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료한다.

4. 자동차 이름은 쉼표(,)를 기준으로 구분할 수 있도록 한다.

5 .시도할 횟수가 null, 0, 문자열일경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료한다.

6. 게임이 완료된 후 우승자를 알려준다. ("최종 우승자 : 창우, 다연"))

7. 공동우승이가능하고 여러명일 경우 쉼표(,)를이용하여 구분한다,

8. 전진자동차 출력 양식은 (이름 : ---)으로 하고 전진하는 조건이 되었을때 (-)하나씩 추가한다.

9. 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.

10. Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
