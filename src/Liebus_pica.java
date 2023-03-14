import javax.swing.JOptionPane;

public class Liebus_pica {

	public static void main(String[] args) {
		String izvele, pasut;
		String darbibas[]={"Pasutit","Iznemt picu","Aizvert"};
		String pasutit[]={"To-go/pasutijums", "Uz vietas"};
		izvele=(String)JOptionPane.showInputDialog(null, "Izvelies darbibu","Darbibas",JOptionPane.INFORMATION_MESSAGE,null,darbibas,darbibas[0]);
		
		switch(izvele){
		case "Pasutit":
		pasut=(String)JOptionPane.showInputDialog(null, "Izvelies uz kurieni ir pasutijums","Darbibas",JOptionPane.INFORMATION_MESSAGE,null,pasutit,pasutit[0]);
		if(pasut==pasutit[0]){
			
		}else{
			
		}
		break;
		case "Iznemt picu":
			
		break;
		case "Aizvert":
			JOptionPane.showMessageDialog(null,"Programma aptureta","Warning",JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		break;
		}
		JOptionPane.showInputDialog("");
	}
}
