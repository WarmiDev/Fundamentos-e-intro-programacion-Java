public class CopiaSeguridad{
	public int calcularCantCds(){
		int infoTotalGb=5;
		int tamCdEnMb=700;
		int infoTotalMb=infoTotalGb*1024;
		int res=infoTotalMb/700+1;
		return res;
	}
}
