import java.io.Serializable;

public class klienti implements Serializable{

	private String vards, tlf, adrese;

	public klienti(String vards, String tlf, String adrese) {
		super();
		this.vards = vards;
		this.tlf = tlf;
		this.adrese = adrese;
	}

	public String getVards() {
		return vards;
	}

	public void setVards(String vards) {
		this.vards = vards;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getAdrese() {
		return adrese;
	}

	public void setAdrese(String adrese) {
		this.adrese = adrese;
	}
	public String ierakstit(){
		return "Klients: "+getVards()+" Nr. "+getTlf()+" Adrese: "+getAdrese();
	}
	 @Override
	    public String toString() {
	        return "Klients: "+getVards()+" Nr. "+getTlf()+" Adrese: "+getAdrese();   
	 }
}
