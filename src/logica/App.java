package logica;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class App {
	public static void main(String[] args){
		sistemaUniversidadImlp sistema = new sistemaUniversidadImlp();
		leerProfesors(sistema);
		leerEstudiantes(sistema);
		leerParalelos(sistema);	
		
		
		
		
		menu(sistema);

	}


	public static void leerProfesors(sistemaUniversidadImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Profesors.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");

				profesor profesor = new profesor();
				
				system.agregarProfesor(profesor);
				
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	
	public static void leerEstudiantes(sistemaUniversidadImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Estudiantes.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");
				
		
					
				}				
				estudiante estudiante = new estudiante();
				system.agregarEstudiante(estudiante);
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}	
	
	public static void leerParalelos(sistemaUniversidadImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Paralelos.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");
				
			}
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	private static void menu(sistemaUniversidadImlp system) {
		System.out.println("Bienvenido al sistema de la Universidad");
		int sesion = 0;
		Scanner sc = new Scanner(System.in);
		boolean closeProgram = false; 
		while (closeProgram == false) {
			while (sesion == 0) {
				System.out.println("Ingrese su correo:");
				String usuario = sc.next();
				System.out.println("Ingrese su contraseña:");
				String password = sc.next();
				sesion = system.iniciarSesion(usuario, password);
				switch (sesion) {
				case 1:
					{
					menuEstudiante(usuario);
				}
				case 2:
					{
					
				}
				default:
					System.out.println("No encontrada desea salir?");
					System.out.println("No = 3");
					System.out.println("Si = 0");
					sesion = Integer.parseInt(sc.next());
				}
			}
		}	
	}
	
	public static void menuEstudiante(String usuario) {
		int cond = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			int opcion;
			System.out.println("Su rut no se encuentra o esta mal escrito desea: "
					+ "\n1) Comprar entrada "
					+ "\n2) Info usuario"
					+ "\n3) Devolver entrada"
					+ "\n4) Cartelera"
					+ "\n5) Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Que estudiante va a comprar?: ");
				String perosnaje = sc.next();
				
		
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
			}
		} while (cond != 1);
	}
	
	
}
