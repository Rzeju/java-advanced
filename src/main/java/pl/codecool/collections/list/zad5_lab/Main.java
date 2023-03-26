package pl.codecool.collections.list.zad5_lab;

public class Main {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Element-1");
        stringStack.push("Element-2");
        stringStack.push("Element-3");
        stringStack.push("Element-4");
        stringStack.push("Element-5");
        stringStack.push("Element-6");

        System.out.println(stringStack);


        String expression = "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---+";
        Stack<String> expressionStack = new Stack<>();

        calculateExpression(expression, expressionStack);
    }

    public static void calculateExpression(String expression, Stack<String> stack) {

        String[] symbols = expression.split("");

        boolean isNewElement = false;
        for (String symbol : symbols) {
            if (isNewElement) {
                //System.out.printf("Adding %s to stack\n", symbol);
                stack.push(symbol);
                isNewElement = false;
            } else if (symbol.equals("+")) {
                //System.out.println("Next symbol will be added");
                isNewElement = true;
            } else if (symbol.equals("-")) {
                System.out.printf("Printed from stack: %s\n", stack.pop());
            } else {
                System.out.println("Incorrect symbol. Nothing happened.");
            }
        }
    }
}
