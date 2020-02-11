package Biotren;
import java.util.Scanner;


public class Principal {
	private static Scanner sc;
public static void main(String[] arg) {
	
	sc = new Scanner(System.in);
	tarjeta usuario[]=new tarjeta[10];
	int dsctsaldo=0;
	int opc=0;
	int i=0,j,dias;
	int recargasaldo;
	int numerotarj;
	boolean nt=false,terminar=false;
	
	while(terminar==false) {
	System.out.println("           Menu:");
	System.out.println("------------------------------------");
	System.out.println(" ");
	System.out.println("1. Incripción nuevo ususario.");
	System.out.println("2. Abono de dinero a cuenta.");
	System.out.println("3. Descuento por viaje.");
	System.out.println("4. Consulta saldo.");
	System.out.println("5. Estado de actividad del usuario.");
	
	System.out.println("Ingresar opcion.");
	opc=sc.nextInt();
	
	switch (opc) {
	case 1: {
		usuario[i]= new tarjeta();
		System.out.println("Ingresar nombre de usuario:");
		String nombre=sc.next();
		System.out.println("Ingresar numero tarjeta:");
		int numtarj=sc.nextInt();
		System.out.println("Ingresar tipo tarjeta:");
		String tipo=sc.next();
		
		usuario[i].setNombre(nombre);
		usuario[i].setNumtarj(numtarj);
		usuario[i].setTipo(tipo);
		usuario[i].setSaldo(0);
		usuario[i].setDesc(false);;
		i++;
	break;	
	}
	
     case 2: {
    	System.out.println("Ingresar numero tarjeta:");
    	numerotarj=sc.nextInt();
    	for(j=0;nt!=true&&j<10;j++) {
    		
    		if (usuario[j].getNumtarj()==numerotarj) {
    			nt=true;
    		}
    		
    	}
    	nt=false;
		System.out.println("Ingresar monto a abonar:"+j);
		recargasaldo=sc.nextInt();
		
		usuario[j-1].recarga(recargasaldo);
		
		System.out.println("Nuevo saldo: "+usuario[j-1].getSaldo());
		break;
	}
     
    case 3: {
    	System.out.println("Ingresar tarjeta:");
    	numerotarj=sc.nextInt();
    	for(j=0;nt==false&&j<10;j++) {
    		
    		if (usuario[j].getNumtarj()==numerotarj) {
    			nt=true;
    		}
    		
    	}
    	nt=false;
		
		if(usuario[j-1].getTipo().equalsIgnoreCase("TNE")) {
			dsctsaldo=250;
			usuario[j-1].descuento(dsctsaldo);
			System.out.println("nuevo saldo "+usuario[j-1].getSaldo());
		}
		if(usuario[j-1].getTipo().equalsIgnoreCase("AM")) {
			dsctsaldo=610;
			usuario[j-1].descuento(dsctsaldo);
		}
		else{
			dsctsaldo=750;
			usuario[j-1].descuento(dsctsaldo);
		}
		
	break;
    }
    
    case 4: {
	    System.out.println("Ingresar tarjeta.");
	    numerotarj=sc.nextInt();
    	for(j=0;nt==false&&j<10;j++) {
    		
    		if (usuario[j].getNumtarj()==numerotarj) {
    			nt=true;
    		}
    		
    	}
    	nt=false;
	    System.out.println("Numero tarjeta: "+usuario[j-1].getNumtarj()+"\nSaldo: "+usuario[j-1].getSaldo());
	break;
     }
    
    case 5: {
    	 System.out.println("Inresar tarjeta.");
 	    numerotarj=sc.nextInt();
     	for(j=0;nt==false&&j<10;j++) {
     		
     		if (usuario[j].getNumtarj()==numerotarj) {
     			nt=true;
     		}
     		
     	}
     	nt=false;
	System.out.println("Ingresar dias inactividad:");
	dias=sc.nextInt();
	if (dias>365) {
		usuario[j-1].descuentoinac(true);
		System.out.println("Cuenta inactiva.");
	}
	else if(dias<365&&dias>=0) {
		System.out.println("Cuenta activa.");
	}
	break;
    }
    
    case 6: {
	terminar =true;
	break;
    }

	
	
}
}
}
}