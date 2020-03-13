package myfirstproject;

interface VariableAccess
{
    int publicValue = 100;
    static int publicStaticValue = 200;
    final int publicFinalValue = 300;
    static final int publicStaticFinalValue = 400;
}

public class InterfaceVariables implements VariableAccess {
    public static void main(String arg[])
    {
        System.out.println("Public Value is:" + publicValue);
        System.out.println("Public Static Value is:" + publicStaticValue);
        System.out.println("Public Final Value is:" + publicFinalValue);
        System.out.println("Public Static Final Value is:" + publicStaticFinalValue);
    }
}