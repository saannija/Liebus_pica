import java.io.Serializable;

public class klienti implements Serializable{

	private static final long serialVersionUID = 1L;
	
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
	/*
	 @Override
	    public String toString() {
	        return "Klients: "+getVards()+" Nr. "+getTlf()+" Adrese: "+getAdrese();   
	 }*//*
	 @Override
	    public String toString() {
	      //  return "Klients: "+getVards()+" Nr. "+getTlf()+" Adrese: "+getAdrese();   
		 return new StringBuffer(" Klients: ").append(this.vards)
	                .append("\n Nr: +371").append(this.tlf).append("\n Adrese: ").append(this.adrese).toString();
	 }*/
}
