package oop.labor10.lab11_4;

public interface IExpression {
    public static boolean isoperator(String op)
    {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }
    public static double evaluate( Stack postfixExpression) throws ExpressionException{
        int num1,num2,op;
        return -1;

    }


}
