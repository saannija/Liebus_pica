
public class picas {

	private String nos;
	private double cena;
	private double ceplaiks;
	public picas(String nos,double cena,double ceplaiks) {
		super();
		this.nos=nos;
		this.cena=cena;
		this.ceplaiks=ceplaiks;
	}
	public String getNos() {
		return nos;
	}
	public void setNos(String nos) {
		this.nos = nos;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public double getCeplaiks() {
		return ceplaiks;
	}
	public void setCeplaiks(double ceplaiks) {
		this.ceplaiks = ceplaiks;
	}
	
	public String ierakstit(){
		return getNos()+", cena: "+getCena()+"€, cepsanas laiks: ‎"+getCeplaiks()+"min";
	}

}
