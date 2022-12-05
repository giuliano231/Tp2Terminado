package datos;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;





public class Encargado {
	
	private String nombre;
	private String apellido;
	private int id_encargado;
	
	public Encargado(String nombre, String apellido, int id_encargado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_encargado = id_encargado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	

	@Override
	public String toString() {
		return "Encargado [nombre=" + nombre + ", apellido=" + apellido + ", id_encargado=" + id_encargado + "]";
	}

	
	public static LinkedList<Pais> GrupoA(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoA = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'A') {
			
					GrupoA.add(Pais);	
		}
	}
		return GrupoA;
	}
	
	public static LinkedList<Pais> GrupoB(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoB = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'B') {
				GrupoB.add(Pais);	
			}
		
	}
		return GrupoB;
	}		
	
	
	public static LinkedList<Pais> GrupoC(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoC = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'C') {
				
				GrupoC.add(Pais);
		}
	}
		return GrupoC;
	}
	
	public static LinkedList<Pais> GrupoD(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoD = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'D') {
				
				GrupoD.add(Pais);
		}
	}
		return GrupoD;
	}
	
	
	public static LinkedList<Pais> GrupoE(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoE = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'E') {
				
				GrupoE.add(Pais);
		}
	}
		return GrupoE;
	}
	
	
	public static LinkedList<Pais> GrupoF(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoF = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'F') {
				
				GrupoF.add(Pais);
		}
	}
		return GrupoF;
	}
	public static LinkedList<Pais> GrupoG(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoG = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'G') {
				
				GrupoG.add(Pais);
		}
	}
		return GrupoG;
	}
	
	public static LinkedList<Pais> GrupoH(LinkedList<Pais> Fgrupos1){
		LinkedList<Pais> GrupoH = new LinkedList<Pais>();
		for (Pais Pais : Fgrupos1) {
			
			if(Pais.getGrupo() == 'H') {
				
				GrupoH.add(Pais);
		}
	}
		return GrupoH;
	}
	public static void MostrarFgrupos(LinkedList<Pais> Fgrupos){
		for (Pais Pais : Fgrupos) {
			System.out.println("Grupo "+Pais.getGrupo());
			System.out.println(Pais.getNombre() + " este pais gano "+ Pais.getSelección().getPartidos_ganados()+ " empato " + Pais.getSelección().getEmpates() + " Perdio "+ Pais.getSelección().getPartidos_perdidos() + " Goles a Favor  "+ Pais.getSelección().getGoles_a_favor()+ " Goles en Contra " + Pais.getSelección().getGoles_en_contra()+ " Puntos "+ Pais.getSelección().getPuntos_Fgrupos());
		}
	} 
	
	
	public static void MostrarGrupo(LinkedList<Pais> Grupo) {
		for (Pais Pais : Grupo) {
		    System.out.println("Grupo "+Pais.getGrupo());
			System.out.println(Pais.getNombre() + " este pais gano "+ Pais.getSelección().getPartidos_ganados()+ " empato " + Pais.getSelección().getEmpates() + " Perdio "+ Pais.getSelección().getPartidos_perdidos() + " Goles a Favor  "+ Pais.getSelección().getGoles_a_favor()+ " Goles en Contra " + Pais.getSelección().getGoles_en_contra()+ " Puntos "+ Pais.getSelección().getPuntos_Fgrupos());
		}
	}
	
	public static void MostrarPaises(LinkedList<Pais> Paises) {
		String Mostrarpaises = Paises.get(0).getNombre() +" Su grupo es "+ Paises.get(0).getGrupo() + " La getAbreviación para los partidos es "+ Paises.get(0).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(0).getSelección().getJugador_estrella() +
			"\n"+Paises.get(1).getNombre() +" Su grupo es "+ Paises.get(1).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(1).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(1).getSelección().getJugador_estrella()+
			"\n"+Paises.get(2).getNombre() +" Su grupo es "+ Paises.get(2).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(2).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(2).getSelección().getJugador_estrella()+
			"\n"+Paises.get(3).getNombre() +" Su grupo es "+ Paises.get(3).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(3).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(3).getSelección().getJugador_estrella()+
			"\n"+Paises.get(4).getNombre() +" Su grupo es "+ Paises.get(4).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(4).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(4).getSelección().getJugador_estrella()+
			"\n"+Paises.get(5).getNombre() +" Su grupo es "+ Paises.get(5).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(5).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(5).getSelección().getJugador_estrella()+
			"\n"+Paises.get(6).getNombre() +" Su grupo es "+ Paises.get(6).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(6).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(6).getSelección().getJugador_estrella()+
			"\n"+Paises.get(7).getNombre() +" Su grupo es "+ Paises.get(7).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(7).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(7).getSelección().getJugador_estrella()+
			"\n"+Paises.get(8).getNombre() +" Su grupo es "+ Paises.get(8).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(8).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(8).getSelección().getJugador_estrella()+
			"\n"+Paises.get(9).getNombre() +" Su grupo es "+ Paises.get(9).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(9).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(9).getSelección().getJugador_estrella()+
			"\n"+Paises.get(10).getNombre() +" Su grupo es "+ Paises.get(10).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(10).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(10).getSelección().getJugador_estrella()+
			"\n"+Paises.get(11).getNombre() +" Su grupo es "+ Paises.get(11).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(11).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(11).getSelección().getJugador_estrella()+
			"\n"+Paises.get(12).getNombre() +" Su grupo es "+ Paises.get(12).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(12).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(12).getSelección().getJugador_estrella()+
			"\n"+Paises.get(13).getNombre() +" Su grupo es "+ Paises.get(13).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(13).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(13).getSelección().getJugador_estrella()+
			"\n"+Paises.get(14).getNombre() +" Su grupo es "+ Paises.get(14).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(14).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(14).getSelección().getJugador_estrella()+
			"\n"+Paises.get(15).getNombre() +" Su grupo es "+ Paises.get(15).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(15).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(15).getSelección().getJugador_estrella()+
			"\n"+Paises.get(16).getNombre() +" Su grupo es "+ Paises.get(16).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(16).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(16).getSelección().getJugador_estrella()+
			"\n"+Paises.get(17).getNombre() +" Su grupo es "+ Paises.get(17).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(17).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(17).getSelección().getJugador_estrella()+
			"\n"+Paises.get(18).getNombre() +" Su grupo es "+ Paises.get(18).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(18).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(18).getSelección().getJugador_estrella()+
			"\n"+Paises.get(19).getNombre() +" Su grupo es "+ Paises.get(19).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(19).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(19).getSelección().getJugador_estrella()+
			"\n"+Paises.get(20).getNombre() +" Su grupo es "+ Paises.get(20).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(20).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(20).getSelección().getJugador_estrella()+
			"\n"+Paises.get(21).getNombre() +" Su grupo es "+ Paises.get(21).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(21).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(21).getSelección().getJugador_estrella()+
			"\n"+Paises.get(22).getNombre() +" Su grupo es "+ Paises.get(22).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(22).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(22).getSelección().getJugador_estrella()+
			"\n"+Paises.get(23).getNombre() +" Su grupo es "+ Paises.get(23).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(23).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(23).getSelección().getJugador_estrella()+
			"\n"+Paises.get(24).getNombre() +" Su grupo es "+ Paises.get(24).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(24).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(24).getSelección().getJugador_estrella()+
			"\n"+Paises.get(25).getNombre() +" Su grupo es "+ Paises.get(25).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(25).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(25).getSelección().getJugador_estrella()+
			"\n"+Paises.get(26).getNombre() +" Su grupo es "+ Paises.get(26).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(26).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(26).getSelección().getJugador_estrella()+
			"\n"+Paises.get(27).getNombre() +" Su grupo es "+ Paises.get(27).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(27).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(27).getSelección().getJugador_estrella()+
			"\n"+Paises.get(28).getNombre() +" Su grupo es "+ Paises.get(28).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(28).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(28).getSelección().getJugador_estrella()+
			"\n"+Paises.get(29).getNombre() +" Su grupo es "+ Paises.get(29).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(29).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(29).getSelección().getJugador_estrella()+
			"\n"+Paises.get(30).getNombre() +" Su grupo es "+ Paises.get(30).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(30).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(30).getSelección().getJugador_estrella()+
			"\n"+Paises.get(31).getNombre() +" Su grupo es "+ Paises.get(31).getGrupo() + " La Abreviación para los partidos es "+ Paises.get(31).getAbreviación() +" Y su jugador a Prestar atencion es "+ Paises.get(31).getSelección().getJugador_estrella();
		JOptionPane.showMessageDialog(null, Mostrarpaises);	
	}

	
	
	public LinkedList<Pais> Posiciones( LinkedList<Pais> grupoA) {
		int max=-1, max2=-1, max3=-1, max4=-1;
		
		Pais pais1=null;
		Pais pais2=null;
		Pais pais3=null;
		Pais pais4=null;
		
		for (int i = 0; i <4; i++) {
			if (grupoA.get(i).getSelección().getPuntos_Fgrupos()>max) {
				max = grupoA.get(i).getSelección().getPuntos_Fgrupos();
				pais1 = grupoA.get(i); 
			} else if (grupoA.get(i).getSelección().getPuntos_Fgrupos() == max) {
				if (grupoA.get(i).getSelección().getGoles_a_favor() > pais1.getSelección().getGoles_a_favor()) {
					pais1 = grupoA.get(i);
				} else {
					pais1 = pais1;
				}
			}
		}
		for (int j = 0; j < 4; j++) {
			if (grupoA.get(j).getSelección().getPuntos_Fgrupos()>max2 && grupoA.get(j) != pais1 ) {
					max2 = grupoA.get(j).getSelección().getPuntos_Fgrupos();
					pais2= grupoA.get(j);
			} else if (grupoA.get(j).getSelección().getPuntos_Fgrupos() == max2 && grupoA.get(j) != pais1 ) {
				if (grupoA.get(j).getSelección().getGoles_a_favor() > pais2.getSelección().getGoles_a_favor()) {
					pais2 = grupoA.get(j);
				} else {
					pais2 = pais2;
				}
			}
		}
		for (int j2 = 0; j2 < 4; j2++) {
				if (grupoA.get(j2).getSelección().getPuntos_Fgrupos()>max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
						max3 = grupoA.get(j2).getSelección().getPuntos_Fgrupos();
						pais3= grupoA.get(j2);
				} else if (grupoA.get(j2).getSelección().getPuntos_Fgrupos() == max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
					if (grupoA.get(j2).getSelección().getGoles_a_favor() > pais3.getSelección().getGoles_a_favor()) {
						pais3 = grupoA.get(j2);
					} else {
						pais3 = pais3;
					}
				}
		}
		for (int x = 0; x < 4; x++) {
			if (grupoA.get(x) != pais1 && grupoA.get(x) != pais2 && grupoA.get(x) != pais3) {
				
				max4 = grupoA.get(x).getSelección().getPuntos_Fgrupos();
				pais4= grupoA.get(x);
			} 
			}

		grupoA.clear();
		grupoA.add(pais1);
		grupoA.add(pais2);
		grupoA.add(pais3);
		grupoA.add(pais4);

		String TablaPosicion = "Grupo "+ grupoA.get(0).getGrupo()+
				"\n PAIS  PTS  PG  PE  PP  GF  GC "+ 
				"\n"+" "+grupoA.get(0).getAbreviación() + "      " + grupoA.get(0).getSelección().getPuntos_Fgrupos() + "      " + grupoA.get(0).getSelección().getPartidos_ganados() + "    " + grupoA.get(0).getSelección().getEmpates() + "    " + grupoA.get(0).getSelección().getPartidos_perdidos() + "    " + grupoA.get(0).getSelección().getGoles_a_favor() + "    " + grupoA.get(0).getSelección().getGoles_en_contra()+
				"\n"+" "+grupoA.get(1).getAbreviación() + "      " + grupoA.get(1).getSelección().getPuntos_Fgrupos() + "      " + grupoA.get(1).getSelección().getPartidos_ganados() + "    " + grupoA.get(1).getSelección().getEmpates() + "    " + grupoA.get(1).getSelección().getPartidos_perdidos() + "    " + grupoA.get(1).getSelección().getGoles_a_favor() + "    " + grupoA.get(1).getSelección().getGoles_en_contra()+
				"\n"+" "+grupoA.get(2).getAbreviación() + "      " + grupoA.get(2).getSelección().getPuntos_Fgrupos() + "      " + grupoA.get(2).getSelección().getPartidos_ganados() + "    " + grupoA.get(2).getSelección().getEmpates() + "    " + grupoA.get(2).getSelección().getPartidos_perdidos() + "    " + grupoA.get(2).getSelección().getGoles_a_favor() + "    " + grupoA.get(2).getSelección().getGoles_en_contra()+
				"\n"+" "+grupoA.get(3).getAbreviación() + "      " + grupoA.get(3).getSelección().getPuntos_Fgrupos() + "      " + grupoA.get(3).getSelección().getPartidos_ganados() + "    " + grupoA.get(3).getSelección().getEmpates() + "    " + grupoA.get(3).getSelección().getPartidos_perdidos() + "    " + grupoA.get(3).getSelección().getGoles_a_favor() + "    " + grupoA.get(3).getSelección().getGoles_en_contra();
				
		JOptionPane.showMessageDialog(null, TablaPosicion);
		
				return grupoA;
	}
	
	
	
	public static LinkedList<Pais> Octavos(LinkedList<Pais>Cuartos){
	
		String CuartosLista = "Los paises que pasan a octavos son"+ 
				"\n"+Cuartos.get(0).getNombre()+
				"\n"+Cuartos.get(1).getNombre()+
				"\n"+Cuartos.get(2).getNombre()+
				"\n"+Cuartos.get(3).getNombre()+
				"\n"+Cuartos.get(4).getNombre()+
				"\n"+Cuartos.get(5).getNombre()+
				"\n"+Cuartos.get(6).getNombre()+
				"\n"+Cuartos.get(7).getNombre();
		JOptionPane.showMessageDialog(null, CuartosLista);
		   
		return Cuartos;
	}

	public static LinkedList<Pais> PaisesOctavos(LinkedList<Pais>grupoA,LinkedList<Pais>grupoB,LinkedList<Pais>grupoC,LinkedList<Pais>grupoD,LinkedList<Pais>grupoE,LinkedList<Pais>grupoF,LinkedList<Pais>grupoG,LinkedList<Pais>grupoH) {
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		Scanner entrada = new Scanner(System.in);
		octavos.add(grupoA.get(0));
		octavos.add(grupoA.get(1));
		octavos.add(grupoB.get(0));
		octavos.add(grupoB.get(1));
		octavos.add(grupoC.get(0));
		octavos.add(grupoC.get(1));
		octavos.add(grupoD.get(0));
		octavos.add(grupoD.get(1));
		octavos.add(grupoE.get(0));
		octavos.add(grupoE.get(1));
		octavos.add(grupoF.get(0));
		octavos.add(grupoF.get(1));
		octavos.add(grupoG.get(0));
		octavos.add(grupoG.get(1));
		octavos.add(grupoH.get(0));
		octavos.add(grupoH.get(1));
		
		
		String primerosTabla = "Los paises que pasan a octavos son"+ 
				"\n"+octavos.get(0).getNombre()+
				"\n"+octavos.get(1).getNombre()+
				"\n"+octavos.get(2).getNombre()+
				"\n"+octavos.get(3).getNombre()+
				"\n"+octavos.get(4).getNombre()+
				"\n"+octavos.get(5).getNombre()+
				"\n"+octavos.get(6).getNombre()+
				"\n"+octavos.get(7).getNombre()+
				"\n"+octavos.get(8).getNombre()+
				"\n"+octavos.get(9).getNombre()+
				"\n"+octavos.get(10).getNombre()+
				"\n"+octavos.get(11).getNombre()+
				"\n"+octavos.get(12).getNombre()+
				"\n"+octavos.get(13).getNombre()+
				"\n"+octavos.get(14).getNombre()+
				"\n"+octavos.get(15).getNombre();
		
		JOptionPane.showMessageDialog(null, primerosTabla);
		
		LinkedList<Pais> Cuartos = new LinkedList<Pais>();
		int p;
		JOptionPane.showMessageDialog(null, "A continuacion ingresara los ganadores de cada Partido: ");
		do {
		p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
				+ "\n"+"1-"+grupoA.get(0).getNombre()
				+ "\n"+"2-"+grupoB.get(1).getNombre(),
				  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,null,
				  new Object[] { grupoA.get(0).getNombre(), grupoB.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoA.get(0));
		} else if (p==1) {
			Cuartos.add(grupoB.get(1));
		} 
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoB.get(0).getNombre()
					+ "\n"+"2-"+grupoA.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoB.get(0).getNombre(), grupoA.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoB.get(0));
		} else if (p==1) {
			Cuartos.add(grupoA.get(1));
		}
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoC.get(0).getNombre()
					+ "\n"+"2-"+grupoD.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoC.get(0).getNombre(), grupoD.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoC.get(0));
		} else if (p==1) {
			Cuartos.add(grupoD.get(1));
		}
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoD.get(0).getNombre()
					+ "\n"+"2-"+grupoC.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoD.get(0).getNombre(), grupoC.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoD.get(0));
		} else if (p==1) {
			Cuartos.add(grupoC.get(1));
		}
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoE.get(0).getNombre()
					+ "\n"+"2-"+grupoF.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoE.get(0).getNombre(),grupoF.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoE.get(0));
		} else if (p==1) {
			Cuartos.add(grupoF.get(1));
		}
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoF.get(0).getNombre()
					+ "\n"+"2-"+grupoE.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoF.get(0).getNombre(),grupoE.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoF.get(0));
		} else if (p==1) {
			Cuartos.add(grupoE.get(1));
		} 
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoG.get(0).getNombre()
					+ "\n"+"2-"+grupoH.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoG.get(0).getNombre(),grupoH.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoG.get(0));
		} else if (p==1) {
			Cuartos.add(grupoH.get(1));
		} 
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+grupoH.get(0).getNombre()
					+ "\n"+"2-"+grupoG.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {grupoH.get(0).getNombre(),grupoG.get(1).getNombre()}, null);
		if (p==0) {
			Cuartos.add(grupoH.get(0));
		} else if (p==1) {
			Cuartos.add(grupoG.get(1));
		} 
		} while (p!=0 && p!=1);
		
		return Cuartos;
	}
	
	public static LinkedList<Pais> Cuartos(LinkedList<Pais> cuartos ) {
		LinkedList<Pais> Semifinal = new LinkedList<Pais>();
		int p;
		String CuartosMostrar = "Los paises que pasan a Cuartos son"+ 
				"\n"+cuartos.get(0).getNombre()+
				"\n"+cuartos.get(1).getNombre()+
				"\n"+cuartos.get(2).getNombre()+
				"\n"+cuartos.get(3).getNombre()+
				"\n"+cuartos.get(4).getNombre()+
				"\n"+cuartos.get(5).getNombre()+
				"\n"+cuartos.get(6).getNombre()+
				"\n"+cuartos.get(7).getNombre();
			JOptionPane.showMessageDialog(null, CuartosMostrar);	
		
		
		JOptionPane.showMessageDialog(null, "A continuacion se jugaran los siguientes partidos");
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+cuartos.get(0).getNombre()
					+ "\n"+"2-"+cuartos.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {cuartos.get(0).getNombre(),cuartos.get(1).getNombre()}, null);
		if (p==0) {
			Semifinal.add(cuartos.get(0));
		} else if (p==1) {
			Semifinal.add(cuartos.get(1));
		} 
		} while (p!=1 && p!=2);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+cuartos.get(2).getNombre()
					+ "\n"+"2-"+cuartos.get(3).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {cuartos.get(2).getNombre(),cuartos.get(3).getNombre()}, null);
		if (p==0) {
			Semifinal.add(cuartos.get(2));
		} else if (p==1) {
			Semifinal.add(cuartos.get(3));
		}
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+cuartos.get(4).getNombre()
					+ "\n"+"2-"+cuartos.get(5).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {cuartos.get(4).getNombre(),cuartos.get(5).getNombre()}, null);
		if (p==0) {
			Semifinal.add(cuartos.get(4));
		} else if (p==1) {
			Semifinal.add(cuartos.get(5));
		} 
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+cuartos.get(6).getNombre()
					+ "\n"+"2-"+cuartos.get(7).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {cuartos.get(6).getNombre(),cuartos.get(7).getNombre()}, null);
		if (p==0) {
			Semifinal.add(cuartos.get(6));
		} else if (p==1) {
			Semifinal.add(cuartos.get(7));
		}
		 } while (p!=0 && p!=1);

		return Semifinal;
		}
	
	public static  LinkedList<Pais> Semifinal( LinkedList<Pais> Semifinal) {
		LinkedList<Pais> Final = new LinkedList<Pais>();
		int p;
		
		String SemiFinalMostrar = "Los paises que pasan a Cuartos son"+ 
				"\n"+Semifinal.get(0).getNombre()+
				"\n"+Semifinal.get(1).getNombre()+
				"\n"+Semifinal.get(2).getNombre()+
				"\n"+Semifinal.get(3).getNombre();
				
			JOptionPane.showMessageDialog(null, SemiFinalMostrar);
			
		JOptionPane.showMessageDialog(null, "A continuacion se jugaran los siguientes partidos");
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+Semifinal.get(0).getNombre()
					+ "\n"+"2-"+Semifinal.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {Semifinal.get(0).getNombre(),Semifinal.get(1).getNombre()}, null);
		if (p==0) {
			Final.add(Semifinal.get(0));
		} else if (p==1) {
			Final.add(Semifinal.get(1));
		}  
		} while (p!=0 && p!=1);
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador del Partido"
					+ "\n"+"1-"+Semifinal.get(2).getNombre()
					+ "\n"+"2-"+Semifinal.get(3).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {Semifinal.get(2).getNombre(),Semifinal.get(3).getNombre()}, null);
		if (p==0) {
			Final.add(Semifinal.get(2));
		} else if (p==1) {
			Final.add(Semifinal.get(3));
		}
		} while (p!=0 && p!=1);
		
		return Final;
		}
	
	
	public void Final(LinkedList<Pais> Final) {
		int p;
		
		String FinalMostrar = "Los Finalistas del mundo son"+ 
				"\n"+Final.get(0).getNombre()+
				"\n"+Final.get(1).getNombre();
				
			JOptionPane.showMessageDialog(null, FinalMostrar);
			
		JOptionPane.showMessageDialog(null, "A continuacion se jugaran los siguientes partidos");
		
		do {
			p = JOptionPane.showOptionDialog( null,"Indique el ganador de la Copa del Mundo"
					+ "\n"+"1-"+Final.get(0).getNombre()
					+ "\n"+"2-"+Final.get(1).getNombre(),
					  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
					   JOptionPane.QUESTION_MESSAGE,null,
					  new Object[] {Final.get(0).getNombre(),Final.get(1).getNombre()}, null);
		if (p==0) {
			JOptionPane.showMessageDialog(null,"El Campeon de la copa del mundo es: "+Final.get(0).getNombre()+"\n"+ " Y el que levanta la copa es " + Final.get(0).getSelección().getJugador_estrella());
			JOptionPane.showMessageDialog(null, "Muchas Gracias por ser el Encargado. Vuelva pronto");
		} else if (p==1) {
			JOptionPane.showMessageDialog(null,"El Campeon de la copa del mundo es: "+Final.get(1).getNombre()+"\n"+ " Y el que levanta la copa es " + Final.get(1).getSelección().getJugador_estrella());
			JOptionPane.showMessageDialog(null, "Muchas Gracias por ser el Encargado. Vuelva pronto");
		}
		} while (p!=0 && p!=1);
		
		}
		
	
	
	public static LinkedList<Pais> Fgrupos(){
		LinkedList<Partido> todos = FParajugar();
		LinkedList<Pais> Fgrupos = new LinkedList<Pais>();
		for (Partido partido : todos) {
				partido.setGoles1((int)(Math.random()*3+1));
				partido.setGoles2((int)(Math.random()*3+1));
				
				
				if(partido.getPais1().getPosibilidades() == 3) {
					partido.setGoles1(partido.getGoles1()+ 1);
				}else if(partido.getPais1().getPosibilidades()== 4) {
					partido.setGoles1(partido.getGoles1()+ 2);
				}
				
				
				if(partido.getPais2().getPosibilidades() == 3) {
					partido.setGoles2(partido.getGoles2()+ 1);
				}else if(partido.getPais2().getPosibilidades()== 4) {
					partido.setGoles2(partido.getGoles2()+ 2);
				}
				
			if(partido.getGoles1() > partido.getGoles2() ) {
				partido.getPais1().getSelección().setPartidos_ganados(partido.getPais1().getSelección().getPartidos_ganados()+1);
				partido.getPais1().getSelección().setPuntos_Fgrupos(partido.getPais1().getSelección().getPuntos_Fgrupos()+3);
				partido.getPais2().getSelección().setPartidos_perdidos(partido.getPais2().getSelección().getPartidos_perdidos()+1);
				
				partido.getPais1().getSelección().setGoles_a_favor(partido.getPais1().getSelección().getGoles_a_favor() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_en_contra(partido.getPais1().getSelección().getGoles_en_contra() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_a_favor(partido.getPais2().getSelección().getGoles_a_favor() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_en_contra(partido.getPais2().getSelección().getGoles_en_contra() +partido.getGoles1() );
			}else {
				partido.getPais2().getSelección().setPartidos_ganados(partido.getPais2().getSelección().getPartidos_ganados()+1);
				partido.getPais2().getSelección().setPuntos_Fgrupos(partido.getPais2().getSelección().getPuntos_Fgrupos()+3);
				partido.getPais1().getSelección().setPartidos_perdidos(partido.getPais1().getSelección().getPartidos_perdidos()+1);
				
				partido.getPais2().getSelección().setGoles_a_favor(partido.getPais2().getSelección().getGoles_a_favor() + partido.getGoles2());
				partido.getPais2().getSelección().setGoles_en_contra(partido.getPais2().getSelección().getGoles_en_contra() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_a_favor(partido.getPais1().getSelección().getGoles_a_favor() + partido.getGoles1());
				partido.getPais1().getSelección().setGoles_en_contra(partido.getPais1().getSelección().getGoles_en_contra() +partido.getGoles2() );
			}
			
			if (Fgrupos.contains(partido.getPais1())==false) {
				Fgrupos.add(partido.getPais1());
			}
			if(Fgrupos.contains(partido.getPais2())==false){
				Fgrupos.add(partido.getPais2());				
		}
		}
		
		return Fgrupos;
	}

	
	public static void MostrarPartidos() {
		 LinkedList<Partido> Partidos = FParajugar();
		 JOptionPane.showMessageDialog(null, "Los partidos son");
			for (Partido partido : Partidos) {
				JOptionPane.showMessageDialog(null, partido.getPais1().getNombre() +" Vs " + partido.getPais2().getNombre() );
				
			}
		
		
		
	}
	public static LinkedList<Partido> FParajugar(){
	       LinkedList<Partido> todos = new LinkedList<Partido>();
			 Selección S_Qatar = new  Selección("S_Qatar","Hassan Al Haydos",0,0,0,0,0,0);
			 Pais Qatar = new Pais("Qatar",true,'A',S_Qatar,1,"QAT");
			 
			 Selección S_Ecuador = new  Selección("S_Ecuador","Valencia",0,0,0,0,0,0);
			 Pais Ecuador = new Pais("Ecuador",true,'A',S_Ecuador,2,"SEN");
			 
			 Selección S_Senegal = new  Selección("S_Senegal","Mane",0,0,0,0,0,0);
			 Pais Senegal = new Pais("Senegal",true,'A',S_Senegal,1,"SEN");
			 
			 Selección S_Pbajos = new  Selección("S_Pbajos","Gakpo",0,0,0,0,0,0);
			 Pais Pbajos = new Pais("Paises bajos",true,'A',S_Pbajos,3,"HOL");
			 
			
			 Selección S_Inglaterra = new  Selección("S_Inglaterra","Sterling",0,0,0,0,0,0);
			 Pais Inglaterra = new Pais("Inglaterra",true,'B',S_Inglaterra,4,"ING");
			 
			
			 Selección S_EEUU = new  Selección("S_EEUU","Pulisic",0,0,0,0,0,0);
			 Pais Estados_Unidos = new Pais("Estados Unidos",true,'B',S_EEUU,2,"USA");
			 
			 
			 Selección S_Iran = new  Selección("S_Iran","Taremi",0,0,0,0,0,0);
			 Pais Iran = new Pais("Iran",true,'B',S_Iran,1,"IRN");
			 
			
			 Selección S_Gales = new  Selección("S_Gales","Bale",0,0,0,0,0,0);
			 Pais Gales = new Pais("Gales",true,'B',S_Gales,2,"GAL");
			 
			 
			 Selección S_argentina = new  Selección("S_Argentina","Messi",0,0,0,0,0,0);
			 Pais Argentina = new Pais("Argentina",true,'C',S_argentina,4,"ARG");
			 
			
			 Selección S_Arabia = new  Selección("S_Arabia","Salem Al Dawsari",0,0,0,0,0,0);
			 Pais Arabia = new Pais("Arabia Saudi",true,'C',S_Arabia,1,"ARB");
			 
			
			 Selección S_Mexico = new  Selección("S_Mexico","Ochoa",0,0,0,0,0,0);
			 Pais Mexico = new Pais("Mexico",true,'C',S_Mexico,2,"MEX");
			 
			 
			 Selección S_Polonia = new  Selección("S_Polonia","Lewandowski",0,0,0,0,0,0);
			 Pais Polonia = new Pais("Polonia",true,'C',S_Polonia,3,"POL");
			 
			
			 Selección S_Francia = new  Selección("S_Francia","Mbappe",0,0,0,0,0,0);
			 Pais Francia = new Pais("Francia",true,'D',S_Francia,4,"FRA");
			 
			 
			 Selección S_Australia = new  Selección("S_Australia","Goodwin",0,0,0,0,0,0);
			 Pais Australia = new Pais("Australia",true,'D',S_Australia,1,"AUS");
			 
			 
			 Selección S_Dinamarca = new  Selección("S_Dinamarca","Eriksen",0,0,0,0,0,0);
			 Pais Dinamarca = new Pais("Dinamarca",true,'D',S_Dinamarca,2,"DIN");
			 
			 
			 Selección S_Tunez = new  Selección("S_Tunez","Khazri",0,0,0,0,0,0);
			 Pais Tunez = new Pais("Tunez",true,'D',S_Tunez,1,"TUN");
			 
			
			 Selección S_España = new  Selección("S_España","Pedri",0,0,0,0,0,0);
			 Pais España = new Pais("España",true,'E',S_España,4,"ESP");
			 
			 
			 Selección S_Costa_Rica = new  Selección("S_Costa_Rica","Navas",0,0,0,0,0,0);
			 Pais Costa_Rica = new Pais("Costa Rica",true,'E',S_Costa_Rica,2,"CRC");
			 
			 
			 Selección S_Alemania = new  Selección("S_Alemania","Havertz",0,0,0,0,0,0);
			 Pais Alemania = new Pais("Alemania",true,'E',S_Alemania,4,"ALE");
			 
			 
			 Selección S_Japon = new  Selección("S_Japon","Doan",0,0,0,0,0,0);
			 Pais Japon = new Pais("Japon",true,'E',S_Japon,2,"JAP");
			 
			 
			 Selección S_Belgica = new  Selección("S_Belgica","De Bruyne",0,0,0,0,0,0);
			 Pais Belgica = new Pais("Belgica",true,'F',S_Belgica,4,"BEL");
			 
			
			 Selección S_Canada = new  Selección("S_Canada","Buchanan",0,0,0,0,0,0);
			 Pais Canada = new Pais("Canada",true,'F',S_Canada,1,"CAN");
			 
			 
			 Selección S_Marruecos = new  Selección("S_Marruecos","Sabiri",0,0,0,0,0,0);
			 Pais Marruecos = new Pais("Marruecos",true,'F',S_Marruecos,1,"MAR");
			 
			 
			 Selección S_Croacia = new  Selección("S_Croacia","Modric",0,0,0,0,0,0);
			 Pais Croacia = new Pais("Croacia",true,'F',S_Croacia,4,"CRO");
			 
			 
			 Selección S_Brasil = new  Selección("S_Brasil","Neymar",0,0,0,0,0,0);
			 Pais Brasil = new Pais("Brasil",true,'G',S_Brasil,4,"BRA");
			 
			 
			 Selección S_Serbia = new  Selección("S_Serbia","Mitrovic",0,0,0,0,0,0);
			 Pais Serbia = new Pais("Serbia",true,'G',S_Serbia,1,"SER");
			 
			
			 Selección S_Suiza = new  Selección("S_Suiza","Shaqiri",0,0,0,0,0,0);
			 Pais Suiza = new Pais("Suiza",true,'G',S_Suiza,1,"SUI");
			 
			
			 Selección S_Camerun = new  Selección("S_Camerun","Koulou",0,0,0,0,0,0);
			 Pais Camerun = new Pais("Camerun",true,'G',S_Camerun,2,"CAM");
			 
		
			 Selección S_Portugal = new  Selección("S_Portugal","Cristiano Ronaldo",0,0,0,0,0,0);
			 Pais Portugal = new Pais("Portugal",true,'H',S_Portugal,3,"POR");
			 
			
			 Selección S_Ghana = new  Selección("S_Ghana","Iñaki Williams",0,0,0,0,0,0);
			 Pais Ghana = new Pais("Ghana",true,'H',S_Ghana,1,"GHA");
			 
			
			 Selección S_Uruguay = new  Selección("S_Uruguay","Suarez",0,0,0,0,0,0);
			 Pais Uruguay = new Pais("Uruguay",true,'H',S_Uruguay,3,"URU");
			 
			
			 Selección S_Corea_sur = new  Selección("S_Corea del sur","Son",0,0,0,0,0,0);
			 Pais Corea_sur = new Pais("Corea del sur",true,'H',S_Corea_sur,1,"COR");
			 
			Partido partido1 = new Partido (Qatar,Ecuador,1,90,0,0,0,0);
			Partido partido2 = new Partido (Senegal,Pbajos,2,90,0,0,0,0);
			Partido partido3 = new Partido (Pbajos,Ecuador,3,90,0,0,0,0);
			Partido partido4 = new Partido (Qatar,Senegal,4,90,0,0,0,0);
			Partido partido5 = new Partido (Pbajos,Qatar,5,90,0,0,0,0);
			Partido partido6 = new Partido (Ecuador,Senegal,6,90,0,0,0,0);
			todos.add(partido1);
			todos.add(partido2);
			todos.add(partido3);
			todos.add(partido4);
			todos.add(partido5);
			todos.add(partido6);
			Partido partido7 = new Partido (Inglaterra,Iran,7,90,0,0,0,0);
			Partido partido8 = new Partido (Estados_Unidos,Gales,8,90,0,0,0,0);
			Partido partido9 = new Partido (Inglaterra,Estados_Unidos,9,90,0,0,0,0);
			Partido partido10 = new Partido (Gales,Iran,10,90,0,0,0,0);
			Partido partido11 = new Partido (Iran,Estados_Unidos,11,90,0,0,0,0);
			Partido partido12 = new Partido (Gales,Inglaterra,12,90,0,0,0,0);
			todos.add(partido7);
			todos.add(partido8);
			todos.add(partido9);
			todos.add(partido10);
			todos.add(partido11);
			todos.add(partido12);
			Partido partido13 = new Partido (Argentina,Arabia,13,90,0,0,0,0);
			Partido partido14 = new Partido (Mexico,Polonia,14,90,0,0,0,0);
			Partido partido15 = new Partido (Argentina,Mexico,15,90,0,0,0,0);
			Partido partido16 = new Partido (Polonia,Arabia,16,90,0,0,0,0);
			Partido partido17 = new Partido (Arabia,Mexico,17,90,0,0,0,0);
			Partido partido18 = new Partido (Polonia,Argentina,18,90,0,0,0,0);
			todos.add(partido13);
			todos.add(partido14);
			todos.add(partido15);
			todos.add(partido16);
			todos.add(partido17);
			todos.add(partido18);
			Partido partido19 = new Partido (Dinamarca,Tunez,19,90,0,0,0,0);
			Partido partido20 = new Partido (Francia,Australia,20,90,0,0,0,0);
			Partido partido21 = new Partido (Tunez,Australia,21,90,0,0,0,0);
			Partido partido22 = new Partido (Francia,Dinamarca,22,90,0,0,0,0);
			Partido partido23 = new Partido (Tunez,Francia,23,90,0,0,0,0);
			Partido partido24 = new Partido (Australia,Dinamarca,24,90,0,0,0,0);
			todos.add(partido19);
			todos.add(partido20);
			todos.add(partido21);
			todos.add(partido22);
			todos.add(partido23);
			todos.add(partido24);
			
			
			Partido partido25 = new Partido (Alemania,Japon,25,90,0,0,0,0);
			Partido partido26 = new Partido (España,Costa_Rica,26,90,0,0,0,0);
			Partido partido27 = new Partido (Japon,Costa_Rica,27,90,0,0,0,0);
			Partido partido28 = new Partido (España,Alemania,28,90,0,0,0,0);
			Partido partido29= new Partido (Costa_Rica,Alemania,29,90,0,0,0,0);
			Partido partido30= new Partido (Japon,España,30,90,0,0,0,0);
			todos.add(partido25);
			todos.add(partido26);
			todos.add(partido27);
			todos.add(partido28);
			todos.add(partido29);
			todos.add(partido30);
			Partido partido31 = new Partido (Marruecos,Croacia,31,90,0,0,0,0);
			Partido partido32 = new Partido (Belgica,Canada,32,90,0,0,0,0);
			Partido partido33 = new Partido (Belgica,Marruecos,33,90,0,0,0,0);
			Partido partido34 = new Partido (Canada,Croacia,34,90,0,0,0,0);
			Partido partido35 = new Partido (Belgica,Croacia,35,90,0,0,0,0);
			Partido partido36 = new Partido (Canada,Marruecos,36,90,0,0,0,0);
			todos.add(partido31);
			todos.add(partido32);
			todos.add(partido33);
			todos.add(partido34);
			todos.add(partido35);
			todos.add(partido36);
			Partido partido37 = new Partido (Suiza,Camerun,37,90,0,0,0,0);
			Partido partido38 = new Partido (Brasil,Serbia,38,90,0,0,0,0);
			Partido partido39 = new Partido (Serbia,Camerun,39,90,0,0,0,0);
			Partido partido40 = new Partido (Brasil,Suiza,40,90,0,0,0,0);
			Partido partido41 = new Partido (Brasil,Camerun,41,90,0,0,0,0);
			Partido partido42 = new Partido (Serbia,Suiza,42,90,0,0,0,0);
			todos.add(partido37);
			todos.add(partido38);
			todos.add(partido39);
			todos.add(partido40);
			todos.add(partido41);
			todos.add(partido42);
			Partido partido43 = new Partido (Uruguay,Corea_sur,43,90,0,0,0,0);
			Partido partido44 = new Partido (Portugal,Ghana,44,90,0,0,0,0);
			Partido partido45 = new Partido (Ghana,Corea_sur,45,90,0,0,0,0);
			Partido partido46 = new Partido (Portugal,Uruguay,46,90,0,0,0,0);
			Partido partido47 = new Partido (Portugal,Corea_sur,47,90,0,0,0,0);
			Partido partido48 = new Partido (Ghana,Uruguay,48,90,0,0,0,0);
			todos.add(partido43);
			todos.add(partido44);
			todos.add(partido45);
			todos.add(partido46);
			todos.add(partido47);
			todos.add(partido48);
		

	
			return todos;
		
}

}
