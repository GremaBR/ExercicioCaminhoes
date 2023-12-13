package LevantamentoMeteorologico;
import java.util.ArrayList;
public class CaminhaoBeta extends Caminhao{
	double cargaTotalKg = 0;
	ArrayList <Pluviometro> carga = new ArrayList<Pluviometro>();
	
	public boolean inserePluviometro(Pluviometro pluviometro) {
		boolean aux = true;
		for(Pluviometro pluv : carga) {
			if(pluv.getTipo() == pluviometro.getTipo()) aux = false;
		}
		return aux;
	}

	public double getCargaTotal() {
		return cargaTotalKg;
	}

}
