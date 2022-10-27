package Programacion.Cuatrimestre_02.Clases.C08_25;

public class C03_POO {

	public static void main(String[] args) {
		C03_Auto auto1 = new C03_Auto();

		auto1.setNombre("Falcon");
		auto1.setMarca("Ford");
		auto1.setCantidadPuertas(-1);

		System.out.println(auto1.getNombre());
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getCantidadPuertas());
	}

}
