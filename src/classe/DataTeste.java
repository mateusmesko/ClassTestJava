package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		
		d2.DD=26;
		d2.MM=02;
		d2.AAAA=1999;
		System.out.printf("NASCEU EM %d / %d / %d \n",d2.DD,d2.MM,d2.AAAA);
		
		d1.DD=26;
		d1.MM=01;
		d1.AAAA=1998;
		System.out.printf("NASCEU EM %d / %d / %d",d1.DD,d1.MM,d1.AAAA);
	}
}
