class Calculator {

    String calculate(String[] expression) {

        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double c = Double.parseDouble(expression[4]);
        double result;
        switch (expression[1] + expression[3]) {
            case "++":
                result = a + b + c;
                break;
            case "+-":
                result = a + b - c;
                break;
            case "+*":
                result = a + (b * c);
                break;

            default:
                return "STOP";
        }
        return String.valueOf(result);
    }

}
