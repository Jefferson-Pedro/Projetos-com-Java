package aircraft;

public class Helicopter implements IAirCraft {

	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Iniciando a decolagem");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros, ok. Ligando hélices");
		
	}

	@Override
	public void wind() {
		System.out.println("Ventos 25km, sudeste, ventos ok");
		
	}
	
}
