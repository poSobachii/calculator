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
        double c = Double.parseDouble(expression[4]);
        double result;
        switch (expression[1] + expression[3]) {
            case "+ *":
                result = a + (b * c);
                break;
            case "+ -":
                result = a + b - c;
                break;
            default:
                return "ERROR";
        }
        return String.valueOf(result);
    }

}
