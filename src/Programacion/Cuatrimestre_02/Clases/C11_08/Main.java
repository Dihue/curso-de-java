package Programacion.Cuatrimestre_02.Clases.C11_08;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.nombre = "Ferrari";

        System.out.println(auto.hashCode());

        // 557041912 sin nombre asignado
        // 557041912 con nombre asignado

        Auto auto1 = new Auto();
        auto1.nombre = "Ferrari";
        System.out.println(auto1.hashCode());
        // 1134712904

        auto = auto1;
        /*                  Heap
        Stack:  auto    ->  []
                auto1   ->  []
         */

        // equals compara donde está guardado en el heap
        boolean resultado = auto.equals(auto1);
        System.out.println(resultado);

        HashSet hashSet = new HashSet<>();

        hashSet.add(auto);

        // getClass usado para downcasting
    }
}
