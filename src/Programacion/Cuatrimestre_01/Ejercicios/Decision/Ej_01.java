package Cuatrimestre_01.Ejercicios.Decision;
/*
Escribir una funcion que, dados cuatro numeros, devuelva el mayor producto
de dos de ellos. Por ejemplo: si recibe los numero 1,5,-2,-4 debe devolver
8, que es el producto mas grande que se puede obtener entre ellos.
 */
public class Ej_01 {
    public static void main(String[] args) {
        Productos(4,3,2,1);
        Productos(1,5,-2,-4);
    }

    public static int Productos(int a, int b, int c, int d) {

        int pro_00 = a * b, pro_01 = a * c, pro_02 = a * d;
        int pro_10 = b * c, pro_11 = b * d;
        int pro_20 = c * d;

        if (pro_00 > pro_01 && pro_00 > pro_02 && pro_00 > pro_10
                && pro_00 > pro_11 && pro_00 > pro_20) {
            System.out.println("El producto más grande que se puede obtener es " + pro_00);

        } else if (pro_01 > pro_00 && pro_01 > pro_02 && pro_01 > pro_10
                && pro_01 > pro_11 && pro_01 > pro_20) {
            System.out.println("El producto más grande que se puede obtener es " + pro_01);

        } else if (pro_02 > pro_00 && pro_02 > pro_01 && pro_02 > pro_10
                && pro_02 > pro_11 && pro_02 > pro_20) {
            System.out.println("El producto más grande que se puede obtener es " + pro_02);

        } else if (pro_10 > pro_00 && pro_10 > pro_01 && pro_10 > pro_02
                && pro_10 > pro_11 && pro_10 > pro_20) {
            System.out.println("El producto más grande que se puede obtener es " + pro_10);

        } else if (pro_11 > pro_00 && pro_11 > pro_01 && pro_11 > pro_02
                && pro_11 > pro_10 && pro_11 > pro_20) {
            System.out.println("El producto más grande que se puede obtener es " + pro_11);

        } else if (pro_20 > pro_00 && pro_20 > pro_01 && pro_20 > pro_02
                && pro_20 > pro_10 && pro_20 > pro_11) {
            System.out.println("El producto más grande que se puede obtener es " + pro_20);

        } else {
            System.out.println("No existe un único producto mayor");
        }
            return 0;
    }
}