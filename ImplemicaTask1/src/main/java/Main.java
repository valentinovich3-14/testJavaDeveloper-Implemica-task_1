public class Main {
    public static void main(String[] args) {

        CorrectParenthesesExpression correctPE = new CorrectParenthesesExpression();
        long number = correctPE.countAmount();

        System.out.println("the number of correct parentheses: " + number);
    }
}
