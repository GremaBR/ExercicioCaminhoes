package LevantamentoMeteorologico;

public class Main {

	public static void main(String[] args) {
		CaminhaoAlfa caminhaoAlfa = new CaminhaoAlfa();
		CaminhaoBeta caminhaoBeta = new CaminhaoBeta();
		
		Pluviometro pluviometro = new Pluviometro("principal", 250, 20);
		Pluviometro pluviometro1 = new Pluviometro("secundário", 300, 25 );
		Pluviometro pluviometro2 = new Pluviometro("principal", 250, 20);
		
		caminhaoAlfa.inserePluviometro(pluviometro);
		caminhaoAlfa.inserePluviometro(pluviometro1);
		caminhaoAlfa.inserePluviometro(pluviometro2);
		
		caminhaoBeta.inserePluviometro(pluviometro);
		caminhaoBeta.inserePluviometro(pluviometro1);
		caminhaoBeta.inserePluviometro(pluviometro2);
		
	}

}
