package Cuatrimestre_01.Clases;

public class C03_Decision {
    public static void main(String[] args) {

        // Condicion Simple
        if (true){
            System.out.println("Condicion");
        }

        // Condicion Doble
        if (true){
            System.out.println("Condicion Doble True");
        } else {
            System.out.println("Condicion Doble False");
        }

        // Condicion encadenada
        if (true){
            System.out.println("Encadenado True");
        } else if (true) {
            System.out.println("Encadenado else if True");
        } else {
            System.out.println("Encadenado else True");
        }

        // Seleccion multiple
        int condicion = 1;

        switch (condicion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
