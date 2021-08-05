package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("BVB087","Ford","Fusion Titanium");
		misVehiculos[1] = new VehiculoTurismo("NSD765","Platino","Platino Oro",4);
		misVehiculos[2] = new VehiculoDeportivo("KÑS087","Ferrari","La Ferrari",100);
		misVehiculos[3] = new VehiculoFurgoneta("LHS573","DOGDE","DOGDE",4);

		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.print("\n");
		}
	}

}
