import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
	
	public class UI implements pasutijums{
		
		static void ierakstit(Object klients){
			try {
				FileOutputStream f = new FileOutputStream(new File("ceks.txt"));
				ObjectOutputStream o = new ObjectOutputStream(f);

				// Write objects to file
			//	o.writeObject(a);
				o.writeObject(klients);

				o.close();
				f.close();

				FileInputStream fi = new FileInputStream(new File("ceks.txt"));
				ObjectInputStream oi = new ObjectInputStream(fi);

				// Read objects
			//	picas a1 = (picas) oi.readObject();
				klienti a2 = (klienti) oi.readObject();
				JOptionPane.showMessageDialog(null, a2.toString());
				oi.close();
				fi.close();

			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Fails nav atrasts","Warning",JOptionPane.WARNING_MESSAGE);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Kluda inicializejot stream","Warning",JOptionPane.WARNING_MESSAGE);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
		static void nolasit(){
			String txt, str="";
			try{
				FileReader fr=new FileReader("ceks.txt");
				BufferedReader br=new BufferedReader(fr);
				while((txt=br.readLine())!=null){
					str+=txt+"\n";
				}
				br.close();
				JOptionPane.showMessageDialog(null, str, "ceks.txt"+" saturs",JOptionPane.PLAIN_MESSAGE);
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Kluda nolasot failu","Kluda",JOptionPane.WARNING_MESSAGE);
			}
		}
		
		
	public static void main(String[] args) {
		UI ui=new UI();
		ui.prompt();
	 }
	
	private String vards;
	private String tlf;
	private String[] adrese;
	private int attalums;
	
	public void prompt(){
		int izvele,iz;
		String tlf="";
		String vards="";
		double cena = 0, attalums=0;
		String metodes[]= {"Pasutit","Apskatit cekus","Aizvert"};
		picas p = null,p1 = null,p2 = null,p3 = null,p4 = null,p5 = null,p6 = null;
		String pizza[]={"Siera","Tropiska","Studentu","Margarita","Galas","Asa","Peperoni"};
		String izmers[]= {"Maza 3.50€‎","Videja 5€‎","Liela 6.50€‎"};
		String pasutit[]={"Uz vietas","Pasutijums"};
		String[] adrese={"Ziemelu priekspils.","Karosta","Tosmare",
				"Zala birze","Jaunliepaja","Vecliepaja","Jauna pasaule",
				"Dienvdrietumi","Ezerkrasts","Arpus pilsetas","Pie veikala"};
		String piedevas[]={"Neko","Siers 0.5€‎","Bekons 0.75€‎‎","Ananasi 0.75€‎","Jalapeno 0.5€‎","Zalumi 0.5€‎"};
		String merces[]={"Neko","BBQ","Ranch","Kecups","Saldskaba","Asa"};
		klienti klients=new klienti("Uz vietas", "20000000", "Pie veikala");
		
		/////////////////
		do{
			iz=JOptionPane.showOptionDialog(null,"Darbibu izvele","Izvelies darbibu",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,metodes,metodes[0]);
			switch(iz) {
			case 0:
			izvele=JOptionPane.showOptionDialog(null,"Pasutijuma izvele","Izvelies kur edisi",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,pasutit,pasutit[0]);
			if(izvele==0) {
				cena=0;
				
			}else if(izvele==1) {
				vards=(String)JOptionPane.showInputDialog(null, "Ievadi pasutitaja vardu: ","Varda ievade",JOptionPane.INFORMATION_MESSAGE);
				do {
				tlf=JOptionPane.showInputDialog(null,"Ievadi savu talruna numuru:","Talruna ievade",JOptionPane.INFORMATION_MESSAGE);
				}while(!Pattern.matches("^[2]{1}[0-9]{7}$", tlf));
				attalums=JOptionPane.showOptionDialog(null,"Pasutijuma izvele","Izvelies kur edisi",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,adrese,adrese[0]);
				if(attalums==0||attalums==4||attalums==8) {
					cena+=attalums+1;
				}else if(attalums==1||attalums==3||attalums==5||attalums==7) {
					cena+=attalums+3;
				}else if(attalums==2||attalums==6) {
					cena+=attalums+2;
				}else if(attalums==9) {
					cena+=attalums+4;
				}else{
					cena+=0;
				}
				klients=new klienti(vards,tlf,adrese[(int) attalums]);
				//cena=+attalums;
			}
			izvele=JOptionPane.showOptionDialog(null,"Picas izmera izvele","Izvelies picas izmeru",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
			if(izvele==0) {
				cena+=3.50;
			}else if(izvele==1) {
				cena+=5;
			}else if(izvele==2) {
				cena+=6.50;
			}else{
				cena+=0;
			}
			do{
				izvele=JOptionPane.showOptionDialog(null,"Picas piedevu izvele","Izvelies piedevas",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,piedevas,piedevas[0]);
				if(izvele==0) {
					cena+=0;
				}else if(izvele==1||izvele==5||izvele==4) {
					cena+=0.5;
				}else if(izvele==2||izvele==3) {
					cena+=0.75;
				}else{
					cena+=0;
				}
			}while(izvele!=0);
			
			do{
				izvele=JOptionPane.showOptionDialog(null,"Picas merces izvele 0.5€‎","Izvelies merci",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,merces,merces[0]);
				if(izvele==0) {
					cena+=0;
				}else cena+=0.5;
			}while(izvele!=0);
			
			p=new picas("Siera",cena,5);
			p1=new picas("Tropiska",cena,4);
			p2=new picas("Studentu",cena,3);
			p3=new picas("Margarita",cena,6);
			p4=new picas("Galas",cena,7);
			p5=new picas("Asa",cena,4);
			p6=new picas("Peperoni",cena,9);
			picas[] pieejamasPicas=new picas[] {p,p1,p2,p3,p4,p5,p6};
			izvele= JOptionPane.showOptionDialog(null,"Picas izvele","Izvelies picu",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,pizza,pizza[0]);
			picas pica=new picas(pizza[izvele],cena,5);
			picas izveles = pieejamasPicas[izvele];
			sefs sefs = new sefs(izveles,this);
			sefs.start();
			ierakstit(klients);//izveidot picas objektu lai var ievietot
			break;
			///////////////
			case 1:
			nolasit();
			break;
			///////////////
			case 2:
				System.exit(0);
			break;
			default: System.exit(0);
			}
		}while(iz!=1);
	}
	
	public void picaIzcepta(picas pica){
		JOptionPane.showMessageDialog(null, pica.getNos()+" pica ir izcepta, cena "+pica.getCena()+"€\n");//\n Klients: "+klients.getVards()+" Nr. "+klients.getTlf()+" Adrese: "+klients.getAdrese());
	}
}
