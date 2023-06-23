
public class Ejercicio02{
	public static void main(String[] args) {
		
		for (int i=0; i<100; i++) {

			int year = 0;
			int month = 0;
			int day = 0;

			// Generar Año
			do{
				year = ((int) (Math.random()*9999))+1;
			}while( year<1000 || year>9999 );

			// Generar Mes
			do{
				month = ((int) (Math.random()*12))+1;
			}while( month<1 || month>12 );

			// Generar Dia
			boolean bisiesto = ((year%4==0 && year%100!=0) || (year%400==0));
			if (bisiesto && month==2) {
				day = ((int) (Math.random()*29))+1;
			}else if (!bisiesto && month==2){
				day = ((int) (Math.random()*28))+1;
			}else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				day = ((int) (Math.random()*31))+1;
			}else{
				day = ((int) (Math.random()*30))+1;
			}
			
			// Imprimir Fecha
			System.out.println(" Fecha generada: "+day+"-"+month+"-"+year+((bisiesto)? "  -> Bisiesto":"") );

		}


	}
}