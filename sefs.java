public class sefs extends Thread{
		picas pica;
		pasutijums nolasit;
		
		public sefs(picas pica, pasutijums nolasit) {
			super();
			this.pica = pica;
			this.nolasit = nolasit;
		}
		
	@Override
	public void run() {
		try {
			Thread.sleep((long)(pica.getCeplaiks()*1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nolasit.picaIzcepta(pica);
	}
		
}