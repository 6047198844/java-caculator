package Calculator;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


public class StringCalculatorTest {
    private StringCalculator strCal;

    @Before
    public void setup() {
        strCal = new StringCalculator();
    }

    /**
     * 입력이 null이거나 공백일때 테스트
     */
    @Test
    public void 입력테스트() {
        Assert.assertEquals(0, strCal.add(""));
        Assert.assertEquals(0, strCal.add(null));
    }

    /**
     * 토큰이 , : 일때 테스트
     */
    @Test
    public void defaultToken() {
        final String input = "1:12:13";
        Assert.assertEquals(strCal.add(input), 26);
    }

    /**
     * 토큰이 커스텀 구분자일때 테스트
     */
    @Test
    public void customToken() {
        final String input = "//;\n1;12;13";
        Assert.assertEquals(strCal.add(input), 26);
    }
}

// flapmap / map : https://mangkyu.tistory.com/115
// assertArrayEquals
// https://www.baeldung.com/java-test-a-list-for-ordinality-and-equality
// varargs 와 array차이. 언제 쓰는지.
// https://guy-who-writes-sourcecode.tistory.com/48