package Calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String input) {
        return this.isValid(input) ?
                this.sum(Arrays.stream(this.split(input)).mapToInt(Integer::parseInt).toArray()) : 0;
    }

    private String[] split(final String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        return matcher.lookingAt() ?
                matcher.group(2).split(matcher.group(1)) : input.split(",|:");

    }

    private int sum(final int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                throw new RuntimeException("음수는 계산할 수 없습니다");
            }
            sum += number;
        }
        return sum;
    }

    private boolean isValid(String input) {
        return input != null && !input.isEmpty();
    }
}

/**
 * 새로 안것
 *  - 삼항연산자
 *  - group
 */
