package HomeWork_Week_8;

    public class Simple_Calculator {
        double firstNumber;
        double secondNumber;

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        public double getDivisionResult() {

            if (secondNumber == 0) {

                return this.secondNumber = 0;

            } else {

                return firstNumber / secondNumber;

            }
        }

        public static void main(String[] args) {
            Simple_Calculator calculator = new Simple_Calculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());
        }

}
