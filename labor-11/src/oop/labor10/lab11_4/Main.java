package oop.labor10.lab11_4;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        try {
            stack.push(7);
            stack.push(4);
            stack.push(-3);
            stack.push("*");
        }
        catch (StackException ex)
        {
            System.out.println("STACK IS FULL");
        }
        try
        {
            IExpression.evaluate(stack);
        }
        catch (ExpressionException ex)
        {
            System.out.println("WRONG EXPRESSION");
        }
    }
}
