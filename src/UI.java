import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
	
	public class UI implements pasutijums{
		static String izm="",mer="",pie="", str="";
		
		static void ierakstit(picas pica) {
			Writer writer = null;
			str="";
			try {
				writer = new BufferedWriter(new FileWriter("ceks.txt",true));
				str+="Pica "+pica.getNos()+"\nCena: "+pica.getCena()+"€‎";
				str+="\nIzmers: "+izm;
				if(pie!="") {
					str+="\nPiedevas: ";
					String[] strArray = pie.split(" ");
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<strArray.length; i++) {
					  sb.append(strArray[i]);      
					  if(i%2!=0) {
					    sb.append(",");
					  }
					  sb.append(" ");
					}
					sb.deleteCharAt(sb.length() - 2);
						str+=sb.toString();
				}
				if(mer!="") {
					str+="\nMerces: ";
					String[] strArray = mer.split(" ");
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<strArray.length; i++) {
					  sb.append(strArray[i]);      
					  if(i%2!=0) {
					    sb.append(",");
					  }
					  sb.append(" ");
					}
					sb.deleteCharAt(sb.length() - 1);
					
						str+=sb.toString();
				}
				//str+="\nKlients: "+klients.getVards()+"\nAdrese: "+klients.getAdrese()+"\nNr. +371"+klients.getTlf();
				str+="\n----------------\n";
			writer.write(str);
			} catch (IOException e) {
			    e.printStackTrace();
			} finally {
			    if (writer != null) try { writer.close(); } catch (IOException ignore) {}
			}
			
		}
		
		static void ierakstit(picas pica, klienti klients) {
			Writer writer = null;
			str="";
			try {
				writer = new BufferedWriter(new FileWriter("ceks.txt",true));
				str+="Pica "+pica.getNos()+"\nCena: "+pica.getCena()+"€‎";
				str+="\nIzmers: "+izm;
				str+="\nKlients: "+klients.getVards()+"\nAdrese: "+klients.getAdrese()+"\nNr. +371"+klients.getTlf();
				
				if(pie!="") {
					str+="\nPiedevas: ";
					String[] strArray = pie.split(" ");
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<strArray.length; i++) {
					  sb.append(strArray[i]);      
					  if(i%2!=0) {
					    sb.append(",");
					  }
					  sb.append(" ");
					}
					sb.deleteCharAt(sb.length() - 2);
						str+=sb.toString();
				}
				if(mer!="") {
					str+="\nMerces: ";
					String[] strArray = mer.split(" ");
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<strArray.length; i++) {
					  sb.append(strArray[i]);      
					  if(i%2!=0) {
					    sb.append(",");
					  }
					  sb.append(" ");
					}
					sb.deleteCharAt(sb.length() - 1);
					
						str+=sb.toString();
				
				}
				
				str+="\n----------------\n";
			writer.write(str);
			} catch (IOException e) {
			    e.printStackTrace();
			} finally {
			    if (writer != null) try { writer.close(); } catch (IOException ignore) {}
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
	
	public void prompt(){
		File file = new File("ceks.txt");
		int izvele,iz;
		String tlf="", nos = null;
		String vards="";
		double cena = 0, attalums=0, laiks = 0;
		String metodes[]= {"Pasutit","Apskatit cekus","Aizvert"};
		
		String pizza[]={"Siera","Tropiska","Studentu","Margarita","Galas","Asa","Peperoni"};
		String izmers[]= {"Maza 3.50€‎","Videja 5€‎","Liela 6.50€‎"};
		String pasutit[]={"Uz vietas","Pasutijums"};
		String[] adrese={"Ziemelu priekspils.","Karosta","Tosmare",
				"Zala birze","Jaunliepaja","Vecliepaja","Jauna pasaule",
				"Dienvdrietumi","Ezerkrasts","Arpus pilsetas","Pie veikala"};
		String piedevas[]={"Next","Siers 0.5€‎","Bekons 0.75€‎‎","Ananasi 0.75€‎","Jalapeno 0.5€‎","Zalumi 0.5€‎"};
		String merces[]={"Next","BBQ","Ranch","Kecups","Saldskaba","Asa"};
		klienti klients=null;
		/////////////////
		do{
			iz=JOptionPane.showOptionDialog(null,"Darbibu izvele","Izvelies darbibu",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,metodes,metodes[0]);
			switch(iz) {
			case 0:
				picas pica=new picas(nos, cena, laiks);
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
			}
			izvele=JOptionPane.showOptionDialog(null,"Picas izmera izvele","Izvelies picas izmeru",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
			izm=izmers[izvele];
			if(izvele==0) {
				cena+=3.50;
			}else if(izvele==1) {
				cena+=5;
			}else if(izvele==2) {
				cena+=6.50;
			}
			izvele = JOptionPane.showOptionDialog(null,"Picas izvele","Izvelies picu",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,pizza,pizza[0]);
			if(izvele==0||izvele==4||izvele==6){
				laiks=5;
			}else if(izvele==1||izvele==2){
				laiks=2;
			}else {
				laiks=7;
			}
			pie="";
			do{
				izvele=JOptionPane.showOptionDialog(null,"Picas piedevu izvele","Izvelies piedevas",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,piedevas,piedevas[0]);
				
				if(izvele==0) {
					cena+=0;
				}else if(izvele==1||izvele==5||izvele==4) {
					pie+=piedevas[izvele]+" ";
					cena+=0.5;
				}else if(izvele==2||izvele==3) {
					pie+=piedevas[izvele]+" ";
					cena+=0.75;
				}else{
					pie+=piedevas[izvele]+" ";
					cena+=0;
				}
			}while(izvele!=0);
			
			mer="";
			do{
				izvele=JOptionPane.showOptionDialog(null,"Picas merces izvele 0.5€‎","Izvelies merci",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,merces,merces[0]);
				if(izvele==0) {
					cena+=0;
				}else {
					mer+=merces[izvele]+" ";
					cena+=0.5;
				}
			}while(izvele!=0);
			
			
			pica.setNos(pizza[izvele]);
			pica.setCena(cena);
			pica.setCeplaiks(laiks);
			pica=new picas(pizza[izvele],cena,laiks);
			picas izveles = pica;
			sefs sefs = new sefs(izveles,this);
			sefs.start();
			if(klients==null){
				ierakstit(pica);
			}else{
				ierakstit(pica, klients);//izveidot picas objektu lai var ievietot
			}
			break;
			///////////////
			case 1:
				if(file.length()>1){
					nolasit();	
				}else{
					JOptionPane.showMessageDialog(null, "Nav veikts neviens pasutijums","Warning",JOptionPane.WARNING_MESSAGE);
				}
			break;
			///////////////
			case 2:
				System.exit(0);
			break;
			//default: System.exit(0);
			}
		}while(iz!=2);
	}
	
	public void picaIzcepta(picas pica){
		JOptionPane.showMessageDialog(null, pica.getNos()+" pica ir izcepta, cena "+pica.getCena()+"€\n");//\n Klients: "+klients.getVards()+" Nr. "+klients.getTlf()+" Adrese: "+klients.getAdrese());
	}
}
