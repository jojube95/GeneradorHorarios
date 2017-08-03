package vista;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modelo.Asignatura;
import modelo.GrupoP;
import modelo.GrupoT;

public class AsignaturasDialog{
	static ArrayList<CheckBox> checkBoxes;
	static ArrayList<Boolean> grupos;
	static ArrayList<String[]> calendarios;
	static ArrayList<Asignatura> asignaturas;
	//static TextArea textArea;
	
	public AsignaturasDialog() {
		//Inicializar la lista de checkboxes
		this.checkBoxes = new ArrayList<>();
		this.grupos = new ArrayList<>();
		this.calendarios = new ArrayList<>();
		//Crear el dialogo
		Dialog<String> dialog = new Dialog<>();
		dialog.setTitle("Grupos");
		//dialog.setHeaderText("Selecciona los grupos disponibles");
			
		//Crear los botones
		Button aceptar = new Button("Aceptar");
		Button button = new Button("Seleccionar todos");
			
		//Crear el hBox
		HBox hBox = new HBox();
		//Crear el textArea
		//this.textArea = new TextArea();
		//textArea.setEditable(false);
		//textArea.setText("");
		//this.textArea.setWrapText(false);
		//Crear el grid panel
		GridPane grid = new GridPane();
		grid.setHgap(7);
		grid.setVgap(22);
		grid.setPadding(new Insets(10, 20, 10, 20));
		
		//Crear los checkboxes, añadirlos a la lista de checkboxes y añadirlos al grid
		ArrayList<CheckBox> checkBoxes = new ArrayList<>();
		CheckBox tsrTA = new CheckBox();checkBoxes.add(tsrTA);grid.add(tsrTA, 1, 1);
		CheckBox tsrTB = new CheckBox();checkBoxes.add(tsrTB);grid.add(tsrTB, 2, 1);
		CheckBox tsrTC = new CheckBox();checkBoxes.add(tsrTC);grid.add(tsrTC, 3, 1);
		CheckBox tsrTD = new CheckBox();checkBoxes.add(tsrTD);grid.add(tsrTD, 4, 1);
		CheckBox tsrTF = new CheckBox();checkBoxes.add(tsrTF);grid.add(tsrTF, 5, 1);
		CheckBox tsrTFl = new CheckBox();checkBoxes.add(tsrTFl);grid.add(tsrTFl, 6, 1);
		CheckBox tsrL1A = new CheckBox();checkBoxes.add(tsrL1A);grid.add(tsrL1A, 1, 2);
		CheckBox tsrL1B = new CheckBox();checkBoxes.add(tsrL1B);grid.add(tsrL1B, 2, 2);
		CheckBox tsrL1C = new CheckBox();checkBoxes.add(tsrL1C);grid.add(tsrL1C, 3, 2);
		CheckBox tsrL1D = new CheckBox();checkBoxes.add(tsrL1D);grid.add(tsrL1D, 4, 2);
		CheckBox tsrL1F = new CheckBox();checkBoxes.add(tsrL1F);grid.add(tsrL1F, 5, 2);
		CheckBox tsrL1Fl = new CheckBox();checkBoxes.add(tsrL1Fl);grid.add(tsrL1Fl, 6, 2);
		CheckBox tsrL2A = new CheckBox();checkBoxes.add(tsrL2A);grid.add(tsrL2A, 1, 3);
		CheckBox tsrL2B = new CheckBox();checkBoxes.add(tsrL2B);grid.add(tsrL2B, 2, 3);
		CheckBox tsrL2C = new CheckBox();checkBoxes.add(tsrL2C);grid.add(tsrL2C, 3, 3);
		CheckBox tsrL2D= new CheckBox();checkBoxes.add(tsrL2D);grid.add(tsrL2D, 4, 3);
		CheckBox tsrL2F = new CheckBox();checkBoxes.add(tsrL2F);grid.add(tsrL2F, 5, 3);
		CheckBox sinTA = new CheckBox();checkBoxes.add(sinTA);grid.add(sinTA, 1, 4);
		CheckBox sinTB = new CheckBox();checkBoxes.add(sinTB);grid.add(sinTB, 2, 4);
		CheckBox sinTC = new CheckBox();checkBoxes.add(sinTC);grid.add(sinTC, 3, 4);
		CheckBox sinTD = new CheckBox();checkBoxes.add(sinTD);grid.add(sinTD, 4, 4);
		CheckBox sinTF = new CheckBox();checkBoxes.add(sinTF);grid.add(sinTF, 5, 4);
		CheckBox sinTFl = new CheckBox();checkBoxes.add(sinTFl);grid.add(sinTFl, 6, 4);
		CheckBox sinL1A = new CheckBox();checkBoxes.add(sinL1A);grid.add(sinL1A, 1, 5);
		CheckBox sinL1B = new CheckBox();checkBoxes.add(sinL1B);grid.add(sinL1B, 2, 5);
		CheckBox sinL1C = new CheckBox();checkBoxes.add(sinL1C);grid.add(sinL1C, 3, 5);
		CheckBox sinL1D = new CheckBox();checkBoxes.add(sinL1D);grid.add(sinL1D, 4, 5);
		CheckBox sinL1F = new CheckBox();checkBoxes.add(sinL1F);grid.add(sinL1F, 5, 5);
		CheckBox sinL1Fl = new CheckBox();checkBoxes.add(sinL1Fl);grid.add(sinL1Fl, 6, 5);
		CheckBox sinL2A = new CheckBox();checkBoxes.add(sinL2A);grid.add(sinL2A, 1, 6);
		CheckBox sinL2B = new CheckBox();checkBoxes.add(sinL2B);grid.add(sinL2B, 2, 6);
		CheckBox sinL2C = new CheckBox();checkBoxes.add(sinL2C);grid.add(sinL2C, 3, 6);
		CheckBox sinL2D= new CheckBox();checkBoxes.add(sinL2D);grid.add(sinL2D, 4, 6);
		CheckBox sinL2F = new CheckBox();checkBoxes.add(sinL2F);grid.add(sinL2F, 5, 6);
		CheckBox dbdTA = new CheckBox();checkBoxes.add(dbdTA);grid.add(dbdTA, 1, 7);
		CheckBox dbdL1A = new CheckBox();checkBoxes.add(dbdL1A);grid.add(dbdL1A, 1, 8);
		CheckBox dbdL2A = new CheckBox();checkBoxes.add(dbdL2A);grid.add(dbdL2A, 1, 9);
		CheckBox mneTA = new CheckBox();checkBoxes.add(mneTA);grid.add(mneTA, 1, 10);
		CheckBox mneL1A = new CheckBox();checkBoxes.add(mneL1A);grid.add(mneL1A, 1, 11);
		CheckBox mneL2A = new CheckBox();checkBoxes.add(mneL2A);grid.add(mneL2A, 1, 12);
		CheckBox copTA = new CheckBox();checkBoxes.add(copTA);grid.add(copTA, 1, 13);
		CheckBox copL1A = new CheckBox();checkBoxes.add(copL1A);grid.add(copL1A, 1, 14);
		CheckBox copL2A = new CheckBox();checkBoxes.add(copL2A);grid.add(copL2A, 1, 15);
		CheckBox irLu = new CheckBox();checkBoxes.add(irLu);grid.add(irLu, 1, 16);
		CheckBox irViM = new CheckBox();checkBoxes.add(irViM);grid.add(irViM, 1, 17);
		CheckBox irViT = new CheckBox();checkBoxes.add(irViT);grid.add(irViT, 1, 18);
		CheckBox itLabT = new CheckBox();checkBoxes.add(itLabT);grid.add(itLabT, 1, 19);
		CheckBox irTarde = new CheckBox();checkBoxes.add(irTarde);grid.add(irTarde, 1, 20);
		
		//Añadir los labels
		grid.add(new Label("A"), 1, 0);
		grid.add(new Label("B"), 2, 0);
		grid.add(new Label("C"), 3, 0);
		grid.add(new Label("D"), 4, 0);
		grid.add(new Label("F"), 5, 0);
		grid.add(new Label("Fl"), 6, 0);
		grid.add(new Label("TSR:"), 0, 1);
		grid.add(new Label("lab1:"), 0, 2);
		grid.add(new Label("lab2:"), 0, 3);
		grid.add(new Label("SIN:"), 0, 4);
		grid.add(new Label("lab1:"), 0, 5);
		grid.add(new Label("lab2:"), 0, 6);
		grid.add(new Label("DBD:"), 0, 7);
		grid.add(new Label("lab1:"), 0, 8);
		grid.add(new Label("lab2:"), 0, 9);
		grid.add(new Label("MNE:"), 0, 10);
		grid.add(new Label("lab1:"), 0, 11);
		grid.add(new Label("lab2:"), 0, 12);
		grid.add(new Label("COP:"), 0, 13);
		grid.add(new Label("lab1:"), 0, 14);
		grid.add(new Label("lab2:"), 0, 15);
		grid.add(new Label("Ir lunes:"), 0, 16);
		grid.add(new Label("Ir viernesM:"), 0, 17);
		grid.add(new Label("Ir viernesT:"), 0, 18);
		grid.add(new Label("Ir labTarde:"), 0, 19);
		grid.add(new Label("Ir tardes:"), 0, 20);
		
		//Poner checked los necesarios
		checkBoxes.get(34).setSelected(true);
		checkBoxes.get(34).setDisable(true);
		checkBoxes.get(37).setSelected(true);
		checkBoxes.get(37).setDisable(true);
		checkBoxes.get(40).setSelected(true);
		checkBoxes.get(40).setDisable(true);
		
		//Añadir cosas a los containers
		grid.add(button, 0, 21);
		grid.add(aceptar, 0, 22);
		hBox.getChildren().add(grid);
		//hBox.getChildren().add(textArea);
		dialog.getDialogPane().setContent(hBox);
		
		//Crear los listeners de los botones
				button.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				        for(int i = 0; i < checkBoxes.size(); i++){
				        	checkBoxes.get(i).setSelected(true);
			        	}
				    }
				});
				
				aceptar.setOnAction(new EventHandler<ActionEvent>() {
				    @Override public void handle(ActionEvent e) {
				    grupos.clear();
				    for(int i = 0; i < 150; i++){
				    	System.out.println();
				    }
					
				    //textArea.setText("");
				    for(int i = 0; i < checkBoxes.size(); i++){
			    		grupos.add(checkBoxes.get(i).isSelected());
		    		}
				    inicializarGrupos();
				    crearCalendarios(asignaturas);
				    mostrarCalendarios();
			    }
				});
				
		//Mostrar el dialogo	
		dialog.showAndWait();
		
	}
	
	private void inicializarGrupos(){
		//Crear calendarios
		//Ir por la tarde
		//-----NO TOCAR------
		boolean tarde = grupos.get(47);
		//-----NO TOCAR------
		
		//Ir el lunes
		boolean lunes = grupos.get(43);
		//Ir viernes mañana
		boolean viernesMañana = grupos.get(44);
		//Ir viernes tarde
		boolean viernesTarde = grupos.get(45); //no anar a ferse cerveses
		//Ir lab tarde
		boolean labTarde = grupos.get(46);
		
		calendarios = new ArrayList<String[]>();
		asignaturas = new ArrayList<>();
		//Inicializar grupos y asignaturas
		//TSR					    
		GrupoT ta3a = new GrupoT("TSR-TA____|", 105, 107, 210, 212);
		GrupoT ta3b = new GrupoT("TSR-TB____|", 56, 58, 207, 209);
		GrupoT ta3c = new GrupoT("TSR-TC____|", 65, 67, 158, 160);
		GrupoT ta3d = new GrupoT("TSR-TD____|", 78, 80, 171, 173);
		GrupoT ta3f = new GrupoT("TSR-TF____|", 70, 72, 214, 216);
		GrupoT ta3flip = new GrupoT("TSR-TFlip_|", 104, 106, 203, 205);
								
		GrupoP l13a = new GrupoP("TSR-L1A___|", 169, 171);
		GrupoP l13b = new GrupoP("TSR-L1B___|", 109, 111);
		GrupoP l13c = new GrupoP("TSR-L1C___|", 57, 59);
		GrupoP l13d = new GrupoP("TSR-L1D___|", 128, 130);
		GrupoP l13f = new GrupoP("TSR-L1F___|", 221, 223);
		GrupoP l13flip = new GrupoP("TSR-LFlip_|", 63, 65);
		GrupoP l23a = new GrupoP("TSR-L2A___|", 166, 168);
		GrupoP l23b = new GrupoP("TSR-L2B___|", 200, 202);
		GrupoP l23c = new GrupoP("TSR-L2C___|", 70, 72);
		GrupoP l23d = new GrupoP("TSR-L2D___|", 125, 127);
		GrupoP l23f = new GrupoP("TSR-L2D___|", 26, 28);
		
		ArrayList<GrupoT> gruposT = new ArrayList<>();
		
		if(grupos.get(0)){gruposT.add(ta3a);}
		if(grupos.get(1)){gruposT.add(ta3b);}
		if(grupos.get(2)){gruposT.add(ta3c);}
		if(tarde && grupos.get(3)){gruposT.add(ta3d);}
		if(tarde && grupos.get(4)){gruposT.add(ta3f);}
		if(grupos.get(5)){gruposT.add(ta3flip);}
		
		ArrayList<GrupoP> gruposP = new ArrayList<>();
		
		if(tarde && labTarde && grupos.get(6)){gruposP.add(l13a);}
		if(grupos.get(7)){gruposP.add(l13b);}
		if(grupos.get(8)){gruposP.add(l13c);}
		if(tarde && labTarde && grupos.get(9)){gruposP.add(l13d);}
		if(tarde && viernesTarde && labTarde && grupos.get(10)){gruposP.add(l13f);}
		if(grupos.get(11)){gruposP.add(l13flip);}
		if(tarde && labTarde && grupos.get(12)){gruposP.add(l23a);}
		if(viernesMañana && grupos.get(13)){gruposP.add(l23b);}
		if(tarde && labTarde && grupos.get(14)){gruposP.add(l23c);}
		if(tarde && labTarde && grupos.get(15)){gruposP.add(l23d);}
		if(tarde && lunes && labTarde && grupos.get(16)){gruposP.add(l23f);}
		
		Asignatura tsr = new Asignatura(1, "TSR", gruposT, gruposP);
		
		//SIN
						  
		ta3a = new GrupoT("SIN-TA____|", 157, 160);
		ta3b = new GrupoT("SIN-TB____|", 112, 115);
		ta3c = new GrupoT("SIN-TC____|", 153, 156);
		ta3d = new GrupoT("SIN-TD____|", 70, 73);
		ta3f = new GrupoT("SIN-TF____|", 170, 173);
		ta3flip = new GrupoT("SIN-TFlip_|", 111, 114);
						  
		l13a = new GrupoP("SIN-L1A___|", 207, 209);
		l13b = new GrupoP("SIN-L1B___|", 118, 120);
		l13c = new GrupoP("SIN-L1C___|", 22, 24);
		l13d = new GrupoP("SIN-L1D___|", 174, 176);
		l13f = new GrupoP("SIN-L1F___|", 128, 130);
		l13flip = new GrupoP("SIN-L1Flip|", 66, 68);
		              
		l23a = new GrupoP("SIN-L2A___|", 56, 58);
		l23b = new GrupoP("SIN-L2B___|", 169, 171);
		l23c = new GrupoP("SIN-L2C___|", 200, 202);
		l23d = new GrupoP("SIN-L2D___|", 26, 28);
		l23f = new GrupoP("SIN-L2F___|", 29, 31);
		
		gruposT = new ArrayList<>();
		
		if(grupos.get(17)){gruposT.add(ta3a);}
		if(grupos.get(18)){gruposT.add(ta3b);}
		if(grupos.get(19)){gruposT.add(ta3c);}
		if(tarde && grupos.get(20)){gruposT.add(ta3d);}
		if(tarde && grupos.get(21)){gruposT.add(ta3f);}
		if(grupos.get(22)){gruposT.add(ta3flip);}
		
		gruposP = new ArrayList<>();
		
		if(grupos.get(23)){gruposP.add(l13a);}
		if(tarde && labTarde && grupos.get(24)){gruposP.add(l13b);}
		if(tarde && labTarde && lunes && grupos.get(25)){gruposP.add(l13c);}
		if(tarde && labTarde && grupos.get(26)){gruposP.add(l13d);}
		if(tarde && labTarde && grupos.get(27)){gruposP.add(l13f);}
		if(grupos.get(28)){gruposP.add(l13flip);}
		if(grupos.get(29)){gruposP.add(l23a);}
		if(tarde && labTarde && grupos.get(30)){gruposP.add(l23b);}
		if(viernesMañana && grupos.get(31)){gruposP.add(l23c);}
		if(tarde && labTarde && lunes && grupos.get(32)){gruposP.add(l23d);}
		if(tarde && labTarde && lunes && grupos.get(33)){gruposP.add(l23f);}
		
		Asignatura sin = new Asignatura(2, "SIN", gruposT, gruposP);
		
		//MNE
		
		ta3a = new GrupoT("MNE-TA____|", 61, 63, 152, 154);
						
						  
		l13a = new GrupoP("MNE-L1A___|", 64, 66);
		l13b = new GrupoP("MNE-L2A___|", 208, 210);
		
		gruposT = new ArrayList<>();
		if(grupos.get(37)){gruposT.add(ta3a);}
		gruposP = new ArrayList<>();
		if(grupos.get(38)){gruposP.add(l13a);}
		if(grupos.get(39)){gruposP.add(l13b);}
		
		
		Asignatura mne = new Asignatura(3, "MNE", gruposT, gruposP);
		
		//COP
						  
		ta3a = new GrupoT("COP-TA____|", 56, 59);
		
		l13a = new GrupoP("COP-L1A___|", 158, 160);
		l13b = new GrupoP("COP-L2A___|", 155, 157);
		
		gruposT = new ArrayList<>();
		if(grupos.get(40)){gruposT.add(ta3a);}
		gruposP = new ArrayList<>();
		if(grupos.get(41)){gruposP.add(l13a);}
		if(grupos.get(42)){gruposP.add(l13b);}
		
		
		Asignatura cop = new Asignatura(4, "COP", gruposT, gruposP);
		
		//DBD
						 
		ta3a = new GrupoT("DBD-TA____|", 109, 111, 205, 207);
		
		l13a = new GrupoP("DBD-L1A___|", 208, 210);
		l13b = new GrupoP("DBD-L2A___|", 112, 114);
		
		gruposT = new ArrayList<>();
		
		if(grupos.get(34)){gruposT.add(ta3a);}//viernes 10:30
		
		gruposP = new ArrayList<>();
		
		if(grupos.get(35)){gruposP.add(l13a);}
		if(grupos.get(36)){gruposP.add(l13b);}
		
		
		Asignatura dbd = new Asignatura(5, "DBD", gruposT, gruposP);
		
		//Añadir todas las asignaturas
		asignaturas.add(sin);
		asignaturas.add(tsr);
		asignaturas.add(mne);
		asignaturas.add(cop);
		asignaturas.add(dbd);
	}
	
	private void crearCalendarios(ArrayList<Asignatura> asignaturas){
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
		
	}
	
	private void mostrarCalendarios(){
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
			
			System.out.println("Calendario: "+ (x+1));
			//textArea.appendText("Calendario: "+ (x+1) + "\n");
			
			for(int k = 0; k < 30; k++){
				System.out.println(columna1[k]+columna2[k]+columna3[k]+columna4[k]+columna5[k]+columna6[k]);
				//textArea.appendText(columna1[k]+columna2[k]+columna3[k]+columna4[k]+columna5[k]+columna6[k] + "\n");
				
				
			}
			
			
			
		}
		System.out.println("Se han creado "+calendarios.size()+" calendarios.");
		//textArea.appendText("Se han creado "+calendarios.size()+" calendarios.");
		
		
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
		}
		
		
}
	