package practice_Jun23;

interface Max {
    int maximum(int firstInput, int secondInput);
}

public class Maximum_of_Two_Nos_Using_LambdaExpression {
    public static void main(String[] args) {

        Max max = (firstInput, secondInput) -> {
            if (firstInput > secondInput) {
                return firstInput;
            } else {
                return secondInput;
            }
        };

        System.out.println(max.maximum(20, 40));
    }
}