package interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import datos.Encargado;
import datos.Pais;
import datos.Partido;

public class Main {

	public static void main(String[] args) {
		int p = 0;
		String MenuA = "Hola bienvenido a esta Aplicacion" +"\n"+"Usted sera el encargado del Mundial de Qatar 2022"+ "\n" + "Para eso primero necesito su nombre";
		JOptionPane.showMessageDialog(null, MenuA);
		String Nombre= JOptionPane.showInputDialog("Porfavor ingrese su Nombre");
		String Apellido= JOptionPane.showInputDialog("Porfavor ingrese su Nombre");
		Encargado encargado1 = new Encargado(Nombre,Apellido, 1);
		JOptionPane.showInternalMessageDialog(null,"Mucho Gusto "+ Nombre + " "+ Apellido);
		JOptionPane.showInternalMessageDialog(null,"A continuacion le estare dejando las cosas que usted como encargado puede hacer");
		
int opcion =Integer.parseInt(JOptionPane.showInputDialog("Menu:"+"\n"+"Ingrese alguna de las siguientes opciones"+"\n"+"1-Ver Equipos"+"\n"+"2-Ver Partidos fase de grupos"+"\n"+"3-Jugar Mundial"+"\n"+"4-Salir"));
		
		switch (opcion) {

	    case 1:
	    	LinkedList<Pais> Mostrar = encargado1.Fgrupos();
	    	encargado1.MostrarPaises(Mostrar);  
	    	p = JOptionPane.showOptionDialog( null,"Quiere Jugar el Mundial"
					+ "\n"+"1-Si"
					+ "\n"+"2-No",
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {"Si","NO"}, null);
		if (p==0) {
			LinkedList<Pais> Paises = encargado1.Fgrupos();
	          
	    	LinkedList<Pais> GrupoA = encargado1.GrupoA(Paises);
			LinkedList<Pais> GrupoB = encargado1.GrupoB(Paises);
			LinkedList<Pais> GrupoC = encargado1.GrupoC(Paises);
			LinkedList<Pais> GrupoD = encargado1.GrupoD(Paises);
			LinkedList<Pais> GrupoE = encargado1.GrupoE(Paises);
			LinkedList<Pais> GrupoF = encargado1.GrupoF(Paises);
			LinkedList<Pais> GrupoG = encargado1.GrupoG(Paises);
			LinkedList<Pais> GrupoH = encargado1.GrupoH(Paises);
			
			JOptionPane.showMessageDialog(null, "Las posiciones de los equipos son ");
			
			    GrupoA = encargado1.Posiciones(GrupoA);
			    GrupoB = encargado1.Posiciones(GrupoB);
			    GrupoC = encargado1.Posiciones(GrupoC);
		        GrupoD = encargado1.Posiciones(GrupoD);
			    GrupoE = encargado1.Posiciones(GrupoE);
			    GrupoF = encargado1.Posiciones(GrupoF); 
			    GrupoG = encargado1.Posiciones(GrupoG); 
			    GrupoH = encargado1.Posiciones(GrupoH);
			    
			    
			    
			    LinkedList<Pais> Cuartos = encargado1.PaisesOctavos(GrupoA,GrupoB,GrupoC,GrupoD,GrupoE,GrupoF,GrupoG,GrupoH); 
			    LinkedList<Pais> Semifinal = encargado1.Cuartos(Cuartos);
				 LinkedList<Pais> Final= encargado1.Semifinal(Semifinal);
				 encargado1.Final(Final);
		} else if (p==1) {
			JOptionPane.showMessageDialog(null,"Vuelva pronto");
		} 
	    	break;
           
	    case 2:
	    	encargado1.MostrarPartidos();
	    	p = JOptionPane.showOptionDialog( null,"Quiere Jugar el Mundial"
					+ "\n"+"1-Si"
					+ "\n"+"2-No",
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {"Si","NO"}, null);
		if (p==0) {
			LinkedList<Pais> Paises = encargado1.Fgrupos();
	          
	    	LinkedList<Pais> GrupoA = encargado1.GrupoA(Paises);
			LinkedList<Pais> GrupoB = encargado1.GrupoB(Paises);
			LinkedList<Pais> GrupoC = encargado1.GrupoC(Paises);
			LinkedList<Pais> GrupoD = encargado1.GrupoD(Paises);
			LinkedList<Pais> GrupoE = encargado1.GrupoE(Paises);
			LinkedList<Pais> GrupoF = encargado1.GrupoF(Paises);
			LinkedList<Pais> GrupoG = encargado1.GrupoG(Paises);
			LinkedList<Pais> GrupoH = encargado1.GrupoH(Paises);
			
			JOptionPane.showMessageDialog(null, "Las posiciones de los equipos son ");
			
			    GrupoA = encargado1.Posiciones(GrupoA);
			    GrupoB = encargado1.Posiciones(GrupoB);
			    GrupoC = encargado1.Posiciones(GrupoC);
		        GrupoD = encargado1.Posiciones(GrupoD);
			    GrupoE = encargado1.Posiciones(GrupoE);
			    GrupoF = encargado1.Posiciones(GrupoF); 
			    GrupoG = encargado1.Posiciones(GrupoG); 
			    GrupoH = encargado1.Posiciones(GrupoH);
			    
			    
			    
			    LinkedList<Pais> Cuartos = encargado1.PaisesOctavos(GrupoA,GrupoB,GrupoC,GrupoD,GrupoE,GrupoF,GrupoG,GrupoH); 
			    LinkedList<Pais> Semifinal = encargado1.Cuartos(Cuartos);
				 LinkedList<Pais> Final= encargado1.Semifinal(Semifinal);
				 encargado1.Final(Final);
		} else if (p==1) {
			JOptionPane.showMessageDialog(null,"Vuelva pronto");
		} 
	    	break;


	    case 3:
	    	LinkedList<Pais> Paises = encargado1.Fgrupos();
	          
	    	LinkedList<Pais> GrupoA = encargado1.GrupoA(Paises);
			LinkedList<Pais> GrupoB = encargado1.GrupoB(Paises);
			LinkedList<Pais> GrupoC = encargado1.GrupoC(Paises);
			LinkedList<Pais> GrupoD = encargado1.GrupoD(Paises);
			LinkedList<Pais> GrupoE = encargado1.GrupoE(Paises);
			LinkedList<Pais> GrupoF = encargado1.GrupoF(Paises);
			LinkedList<Pais> GrupoG = encargado1.GrupoG(Paises);
			LinkedList<Pais> GrupoH = encargado1.GrupoH(Paises);
			
			JOptionPane.showMessageDialog(null, "Las posiciones de los equipos son ");
			
			    GrupoA = encargado1.Posiciones(GrupoA);
			    GrupoB = encargado1.Posiciones(GrupoB);
			    GrupoC = encargado1.Posiciones(GrupoC);
		        GrupoD = encargado1.Posiciones(GrupoD);
			    GrupoE = encargado1.Posiciones(GrupoE);
			    GrupoF = encargado1.Posiciones(GrupoF); 
			    GrupoG = encargado1.Posiciones(GrupoG); 
			    GrupoH = encargado1.Posiciones(GrupoH);
			    
			    
			    
			    LinkedList<Pais> Cuartos = encargado1.PaisesOctavos(GrupoA,GrupoB,GrupoC,GrupoD,GrupoE,GrupoF,GrupoG,GrupoH); 
			    LinkedList<Pais> Semifinal = encargado1.Cuartos(Cuartos);
				 LinkedList<Pais> Final= encargado1.Semifinal(Semifinal);
				 encargado1.Final(Final);
			
				 
         break;
	    	

	    case 4:

	           JOptionPane.showMessageDialog(null,"Muchas Gracias Por ser el encargado , vuelva pronto");
	    	break;

	    default:

	    	JOptionPane.showMessageDialog(null,"Opcion incorrecta , Intentelo denuevo");
	    	break; 
		
		
		
		
		
	
			
	   
		
		


}

 
	 
}
}
