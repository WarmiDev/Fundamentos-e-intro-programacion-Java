public class TanqueAgua{
	public double calcularTiempoLlenado(){
		double tChorro=10;
		double tDesag=15;
		double volChorroHora=1/tChorro;
		double volDesagHora=1/tDesag;
		double volFinalHora=volChorroHora-volDesagHora;
		double res=1/volFinalHora;
		return res;
	}
}
