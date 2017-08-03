package modelo;

import javafx.application.Application;
import javafx.stage.Stage;
import vista.AsignaturasDialog;


public class Calendarios extends Application{
	
	
	public static AsignaturasDialog asignaturasDialog;
	public static Stage stageAsignaturasDialog;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		@SuppressWarnings("unused")
		AsignaturasDialog asignaturasDialog = new AsignaturasDialog();
		
	}
	
	public static void main(String args[]){
		launch(args);
			
	}
	
	
	/*
	public static void crearCalendarios(ArrayList<Asignatura> asignaturas){
		//Creal lista auxiliar de caliendarios para poner los que se crean.
		ArrayList<String[]> calendariosAux = new ArrayList<>();
		//Recorrer asignaturas
		for(int i = 0; i < asignaturas.size(); i++){
			calendariosAux = new ArrayList<>();
			//Reorrer grupoT
			for(int j = 0; j < asignaturas.get(i).gruposT.size(); j++){
				//Primera asignatura?
				if(i == 0){
					//Cuando finaliza la inicializacion de la primera asignatura
					String[] calendarioAux = new String[241];
					if(j == asignaturas.get(i).gruposT.size() - 1){
						anyadirCalendarioPrimeraAsignatura(calendarioAux, asignaturas.get(i).gruposT.get(j));
						calendariosAux = calendarios;
					}else{
						//Inicializa calendarios
						calendarioAux = new String[241];
						anyadirCalendarioPrimeraAsignatura(calendarioAux, asignaturas.get(i).gruposT.get(j));
					}
					
					
				}
				else{
					calendariosAux = new ArrayList<>();
					//Recorrer calendarios
					for(int x = 0; x < calendarios.size(); x++){
						//Cabe?
						if(cabeTMargen(calendarios.get(x), asignaturas.get(i).gruposT.get(j))){
							String[] calendarioAux = new String[241];
							calendarioAux = Arrays.copyOf(calendarios.get(x), calendarios.get(x).length);
							calendariosAux = anyadirCreandoCalendarioT(calendariosAux, calendarioAux, asignaturas.get(i).gruposT.get(j));
						}
						
					}
				}
				
			}
			calendarios = calendariosAux;
			calendariosAux = new ArrayList<>();
			
			//Recorrer grupoP
			for(int k = 0; k < asignaturas.get(i).gruposP.size(); k++){
				//Recorrer calendarios
				for(int y = 0; y < calendarios.size(); y++){
					//Cabe?
					if(cabePMargen(calendarios.get(y), asignaturas.get(i).gruposP.get(k))){
						String[] calendarioAux = new String[241];
						calendarioAux = Arrays.copyOf(calendarios.get(y), calendarios.get(y).length);
						calendariosAux = anyadirCreandoCalendarioP(calendariosAux, calendarioAux, asignaturas.get(i).gruposP.get(k));
					}
				}
				
			}
			calendarios = calendariosAux;
			
		}
		mostrarCalendarios();
		System.out.println("Se han creado "+calendarios.size()+" calendarios.");
		
	}
	
	
	public static void mostrarCalendarios(){
		
		
		for(int x = 0; x < calendarios.size(); x++){
			String columna1[] = new String[30];
			String columna2[] = new String[30];
			String columna3[] = new String[30];
			String columna4[] = new String[30];
			String columna5[] = new String[30];
			String columna6[] = new String[30];
			
			//Inicializar la columna1
			              
			columna1[0] = "HORA______|";
			int j = 8;
			for(int i = 1; i < columna1.length; i = i+2){
				if(j >= 10){
					columna1[i] = j+":00-"+j+":3|";
					j++;
				}
				else{
					columna1[i] = j+":00-"+j+":30_|";
					j++;
				}
			}
			for(int i = 2; i < columna1.length; i = i+2){
				columna1[i] = "__________|";
			}
			
			
			columna2[0] = "LUNES_____|";
			//Inicializar la columna2
			for(int i = 8; i < 37; i++){
				if(calendarios.get(x)[i] == null){
					columna2[i-7] = "__________|";
				}
				else{
					columna2[i-7] = calendarios.get(x)[i];
				}
			}
			columna3[0] = "MARTES____|";
			//Inicializar la columna3
			for(int i = 56; i < 85; i++){
				if(calendarios.get(x)[i] == null){
					columna3[i-55] = "__________|";
				}
				else{
					columna3[i-55] = calendarios.get(x)[i];
				}
			}
			columna4[0] = "MIERCOLES_|";
			//Inicializar la columna4
			for(int i = 104; i < 133; i++){
				if(calendarios.get(x)[i] == null){
					columna4[i-103] = "__________|";
				}
				else{
					columna4[i-103] = calendarios.get(x)[i];
				}
			}
			columna5[0] = "JUEVES____|";
			//Inicializar la columna5
			for(int i = 152; i < 181; i++){
				if(calendarios.get(x)[i] == null){
					columna5[i-151] = "__________|";
				}
				else{
					columna5[i-151] = calendarios.get(x)[i];
				}
			}
			columna6[0] = "VIERNES___|";
			//Inicializar la columna6
			for(int i = 200; i < 229; i++){
				if(calendarios.get(x)[i] == null){
					columna6[i-199] = "__________|";
				}
				else{
					columna6[i-199] = calendarios.get(x)[i];
				}
			}
			
			//System.out.println("Calendario: "+ (x+1));
			
			for(int k = 0; k < 30; k++){
				//System.out.println(columna1[k]+columna2[k]+columna3[k]+columna4[k]+columna5[k]+columna6[k]);
				
			}
			
			
			
		}
		
		
	}
			
	//Añade un grupo y crea un calendario aparte
	public static ArrayList<String[]> anyadirCreandoCalendarioT(ArrayList<String[]> calendariosAux, String[] calendario, GrupoT grupoT){
		if(grupoT.isUna(grupoT)){
			for(int i = grupoT.ini1; i <= grupoT.fin1; i++ ){
				calendario[i] = grupoT.nombre;
			}
		}
		else{
			for(int i = grupoT.ini1; i <= grupoT.fin1; i++ ){
				calendario[i] = grupoT.nombre;
			}
			for(int i = grupoT.ini2; i <= grupoT.fin2; i++ ){
				calendario[i] = grupoT.nombre;
			}
		}
		calendariosAux.add(calendario);
		return calendariosAux;
	}
	
	public static ArrayList<String[]> anyadirCreandoCalendarioP(ArrayList<String[]> calendariosAux, String[] calendario, GrupoP grupoP){
		for(int i = grupoP.ini1; i <= grupoP.fin1; i++ ){
			//----------------Falla-----------
			calendario[i] = grupoP.nombre;
			//Esta instruccion modifica el calendarios.
		}
		calendariosAux.add(calendario);
		return calendariosAux;
	}
	
	public static void anyadirCalendarioPrimeraAsignatura(String[] calendario, GrupoT grupoT){
		if(grupoT.isUna(grupoT)){
			for(int i = grupoT.ini1; i <= grupoT.fin1; i++ ){
				calendario[i] = grupoT.nombre;
			}
		}
		else{
			for(int i = grupoT.ini1; i <= grupoT.fin1; i++ ){
				calendario[i] = grupoT.nombre;
			}
			for(int i = grupoT.ini2; i <= grupoT.fin2; i++ ){
				calendario[i] = grupoT.nombre;
			}
		}
		calendarios.add(calendario);
	}
	
	
	//Comprobar si cabe un grupo en el calendario
	public static boolean cabeT(String[] calendario, GrupoT grupoT){
		if(grupoT.isUna(grupoT)){
			int ini = grupoT.ini1;
			for(int i = ini; i <= grupoT.fin1; i++  ){
				if(calendario[i] != null){
					return false;
				}
			}
			return true;
		}
		else{
			int ini = grupoT.ini1;
			for(int i = ini; i <= grupoT.fin1; i++  ){
				if(calendario[i] != null){
					return false;
				}
			}
			ini = grupoT.ini2;
			for(int i = ini; i <= grupoT.fin2; i++  ){
				if(calendario[i] != null){
					return false;
				}
			}
			return true;
			
		}
		
	}
	
	//Comprobar si cabe un grupo en el calendario
		public static boolean cabeTMargen(String[] calendario, GrupoT grupoT){
			boolean cabePrimera = false;
			boolean cabeSegunda = false;
			
			if(grupoT.isUna(grupoT)){
				int ini = grupoT.ini1;
				int fin = grupoT.fin1;
				//Ver si cabe la primera con margen
				if((calendario[fin]!= null && calendario[fin-1]==null) || (calendario[ini]!=null && calendario[ini+1]==null)){
					return true;
				}
				//Ver si cabe la primera normal
				for(int i = ini; i <= grupoT.fin1; i++  ){
					if(calendario[i] != null){
						return false;
					}
				}
				return true;
			}
			else{
				int ini = grupoT.ini1;
				int fin = grupoT.fin1;
				int ini2 = grupoT.ini2;
				int fin2 = grupoT.fin2;
				//Ver si cabe la primera con margen
				if((calendario[fin]!= null && calendario[fin-1]==null) || (calendario[ini]!=null && calendario[ini+1]==null)){
					cabePrimera = true;
				}
				
				//Ver si cabe la primera normal
				if(!cabePrimera){
					for(int i = ini; i <= grupoT.fin1; i++  ){
						if(calendario[i] != null){
							return false;
						}
						
					}
					cabePrimera = true;
				}
				
				
				//Ver si cabe la segunda con margen
				if((calendario[fin2]!= null && calendario[fin2-1]==null) || (calendario[ini2]!=null && calendario[ini2+1]==null)){
					cabeSegunda = true;
				}
				//Ver si cabe la segunda normal
				if(!cabeSegunda){
					for(int i = ini2; i <= grupoT.fin2; i++  ){
						if(calendario[i] != null){
							return false;
						}
					}
					cabeSegunda = true;
				}
				
				
			}
			
			if(cabePrimera && cabeSegunda){
				return true;
				
			}
			else{
				return false;
			}
			
		}
	
	public static boolean cabeP(String[] calendario, GrupoP grupoP){
		int ini = grupoP.ini1;
		for(int i = ini; i <= grupoP.fin1; i++  ){
			if(calendario[i] != null){
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean cabePMargen(String[] calendario, GrupoP grupoP){
		int ini = grupoP.ini1;
		int fin = grupoP.fin1;
		//Ver si cabe la primera con margen
		if((calendario[fin]!= null && calendario[fin-1]==null) || (calendario[ini]!=null && calendario[ini+1]==null)){
			return true;
		}
		//Ver si cabe la primera normal
		for(int i = ini; i <= grupoP.fin1; i++  ){
			if(calendario[i] != null){
				return false;
			}
		}
		return true;
	}*/


	
}
