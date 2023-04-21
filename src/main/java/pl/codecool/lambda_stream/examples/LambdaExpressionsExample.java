package pl.codecool.lambda_stream.examples;



public class LambdaExpressionsExample {

    public static void main(String[] args) {

        MyLambdaInterface myLambda = s -> {
            if (s.isEmpty()) {
                return 1;
        } else {
               return 0;
            }
        };

        int notEmpty = myLambda.isEmpty("hello");
        int empty = myLambda.isEmpty("");

        System.out.println(notEmpty);
        System.out.println(empty);
    }


}
