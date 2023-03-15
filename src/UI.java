import javax.swing.JOptionPane;

	public class UI implements pasutijums{
		
		
	
	
	public static void main(String[] args) {
		UI ui=new UI();
		ui.prompt();
	 }
	
	public void prompt(){
		
	}
	
	public void picaIzcepta(picas pica){
		JOptionPane.showMessageDialog(null, pica.getNos()+" pica ir izcepta, cena "+pica.getCena()+"€\n");//\n Klients: "+klients.getVards()+" Nr. "+klients.getTlf()+" Adrese: "+klients.getAdrese());
	}
}
