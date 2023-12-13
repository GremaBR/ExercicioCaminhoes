package LevantamentoMeteorologico;
import java.util.ArrayList;
public class CaminhaoAlfa extends Caminhao {
	double cargaTotalKg = 0;
	ArrayList <Pluviometro> carga = new ArrayList<Pluviometro>();
	

	public boolean inserePluviometro(Pluviometro pluviometro) {
		if(getCargaTotal() + pluviometro.getPeso() < 500) {
			carga.add(pluviometro);
			cargaTotalKg += pluviometro.getPeso();
			return true;
		}
		else return false;
	}


	public double getCargaTotal() {
		return cargaTotalKg;
	}

}
