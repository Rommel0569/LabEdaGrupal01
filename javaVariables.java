public class javaVariables {
    public static void main (String[] args){
        //VARIABLES
        //type variableName = value;

        String name = "MAX"; //Variable de tipo String
        System.out.println(name);

        int myNum = 15; //Variable de tipo int
        System.out.println(myNum);

        int myOtherNum = 15;
        myOtherNum = 20;  // myNum is now 20
        System.out.println(myOtherNum);

        final int num = 15; //Es tratada como constante
        System.out.println(num);

        int aNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //IMPRIMIR VARIABLES

        String nombre = "MAX";
        System.out.println("Hello " + nombre);

        String firstName = "Max"; //Realiza una concatenación de dos cadenas de String
        String lastName = "Soncco";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); //Imprime el valor de x + y

        //DECLARAR VARIAS VARIABLES
        /*Forma 1
        int a = 5;
        int b = 6;
        int c = 50;
        System.out.println(a + b + c);*/

        //Forma 2
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        //Un valor para múltiples variables
        int m, n, o;
        m = n = o = 50;
        System.out.println(m + n + o);

    }
}