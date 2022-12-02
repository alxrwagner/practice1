public class Main {
    public static void main(String[] args) {
        float inputNumber = 10f;
        float checkNumber1 = 8.5f;
        float checkNumber2 = 9.5f;

        boolean isEqualToInputNumber = inputNumber != checkNumber1 && inputNumber != checkNumber2;
        boolean isMoreThanInputNumber = checkNumber1 < inputNumber && checkNumber2 < inputNumber;

        if(isEqualToInputNumber && isMoreThanInputNumber){
            if(inputNumber - checkNumber1 > inputNumber - checkNumber2){
                System.out.println("Число, которое ближе к числу " + inputNumber + " это число " + checkNumber2);
            }
            else if (inputNumber - checkNumber1 > inputNumber - checkNumber2) {
                System.out.println("Проверяемые числа равны");
            }
            else{
                System.out.println("Число, которое ближе к числу " + inputNumber + " это число " + checkNumber1);
            }
        }
        else{
            System.out.println("Одно или оба условия не соблюдены, проверьте что: " +
                    "\n- заданное число точно не равно ни одному из проверяемых" +
                    "\n- проверяемые числа не больше заданного");
        }
    }
}