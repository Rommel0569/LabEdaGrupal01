public class javaForLoop {
    public static void main (String[] args){
        //El ejemplo de abajo imprime los numeros del 0 al 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //Bucle exterior
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); //Se ejecuta 2 veces
            
            //Bucle interior
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); //Se ejecuta 6 veces (2*3)
            }
        }

        //Bucle for-each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}