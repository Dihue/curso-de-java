package Cuatrimestre_01.Clases;

public class C05_Metodos {

    public static void main(String[] args) {
        // Principal
        int a, b, rta;

        rta = SumarNum(4,5);
        System.out.println("Resultado de la suma es " + rta);
    }

    public static int SumarNum(int x, int y) {
        // Cuerpo
        int suma = x + y;

        return suma;
    }
}
