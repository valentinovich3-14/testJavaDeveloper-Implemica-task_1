import org.junit.Assert;
import org.junit.Test;

public class TestCorrectParenthesisExpression {

    @Test
    public void testCount(){
        CorrectParenthesesExpression correctPE = new CorrectParenthesesExpression(6);
        long actual = correctPE.countAmount();
        long expected = 132;

        Assert.assertEquals(expected, actual);
    }

}
