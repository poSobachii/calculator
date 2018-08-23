package calculator;

import java.sql.SQLOutput;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {

        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double result;
        double resultx;
        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                return "ERROR";
        }
        if (expression.length <4){
            return String.valueOf(result);
        }
        double c = Double.parseDouble(expression[4]);
        switch (expression[3]) {
            case "+":
                resultx = result + c;
                break;
            case "-":
                resultx = result - c;
                break;
            case "/":
                resultx = result / c;
                break;
            case "*":
                resultx = result * c;
                break;
            default:
                return "ERROR";
        }
        return String.valueOf(resultx);
    }

}
