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



for (int i = 0; i < 5; i++) {
.
.
.
.
}
инициализация - Начинаем считать i с нуля , условие - до тех пор пока i не станет =5 . инкремент i++ 
