import java.util.Scanner;

/**
 * CorrectParenthesesExpression is the class
 * which allows an application to do calculations
 * related to "Parentheses Expression".
 *
 * @author    Denys Honcharenko
 */
public class CorrectParenthesesExpression {

    /** Number of pairs of brackets */
    private int bracketsNumber = -1;

    /**
     * Class constructor specifying number of pairs of brackets.
     */
    public CorrectParenthesesExpression(int bracketsNumber) {
        this.bracketsNumber = bracketsNumber;
    }

    /**
     * Class constructor.
     */
    public CorrectParenthesesExpression() {
        while (bracketsNumber < 0 ){
            Scanner in = new Scanner(System.in);
            System.out.println("Input the number of pairs of brackets");
            bracketsNumber = in.nextInt();
            if(bracketsNumber < 0){
                System.out.println("Incorrect");
            }
        }
    }

    /**
     * The method finds the number of correct parentheses
     *
     * @return the number of correct parentheses.
     */
    public long countAmount(){
        return calculateСatalanNumber(bracketsNumber);
    }

    /**
     * The method finds the meaning of the Catalan number.
     */
    private long calculateСatalanNumber(int number){
        return factorial(2 * number) / (factorial(number) * factorial(number + 1));
    }

    /**
     * The method calculates the factorial of a number.
     */
    private long factorial(int number) {
        if( number < 0){
            return -1;
        }else if( number == 0 || number == 1){
            return 1;
        }else {
            return number * factorial(number-1);
        }
    }

    public int getBracketsNumber() {
        return bracketsNumber;
    }

    public void setBracketsNumber(int bracketsNumber) {
        this.bracketsNumber = bracketsNumber;
    }
}
