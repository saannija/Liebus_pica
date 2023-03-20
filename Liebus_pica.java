import javax.swing.JOptionPane;

public class Liebus_pica {
	static double delivery_cena=0;
	static String[] adrese={"Ziemelu priekspils.","Karosta","Tosmare",
			"Zala birze","Jaunliepaja","Vecliepaja","Jauna pasaule",
			"Dienvdrietumi","Ezerkrasts","Arpus pilsetas"};
	static int[] att={1,3,2,
			3,1,3 ,2,
			5,4,7};
	
	static String pasutit[]={"To-go/pasutijums", "Uz vietas"};
	static String picas[]={"Siera","Tropiska","Studentu","Margarita","Galas","Asa","Peperoni"};
	static String piedevas[]={"Siers","Bekons","Ananasi","Jalapeno","Zalumi"};
	static int picu_izm[]={15,20,30,50};
	static String merces[]={"BBQ","Ranch","Kecups","Saldskaba","Asa"};
	static int talrunis;
	static String vards;
	
	
	static void pasutijums(boolean delivery){
		if(delivery==false){
			delivery_cena=0;
		}else{
			
		}
	}
	
	public static void main(String[] args) {
		
		String izvele, pasut;
		String darbibas[]={"Pasutit","Iznemt picu","Aizvert"};
		
		boolean delivery=false;
		
		izvele=(String)JOptionPane.showInputDialog(null, "Izvelies darbibu","Darbibas",JOptionPane.INFORMATION_MESSAGE,null,darbibas,darbibas[0]);
		
		switch(izvele){
		case "Pasutit":
		pasut=(String)JOptionPane.showInputDialog(null, "Izvelies uz kurieni ir pasutijums","Darbibas",JOptionPane.INFORMATION_MESSAGE,null,pasutit,pasutit[0]);
		if(pasut==pasutit[0]){
			delivery=true;
			pasutijums(delivery);
		}else{
			delivery=false;
			pasutijums(delivery);
		}
		break;
		case "Iznemt picu":
			
		break;
		case "Aizvert":
			JOptionPane.showMessageDialog(null,"Programma aptureta","Warning",JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Sada darbiba neeksiste","Warning",JOptionPane.WARNING_MESSAGE);
		}
	}
}

