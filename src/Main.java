import com.zubiri.matriculas.Alumno;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int seleccion=-1;
		ArrayList<Alumno> alumnos= new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);

		do {
			try{
				//Visualiza por terminal (stdout) las opciones del menu
				System.out.println("Matricular---------------------------------------------1");
				System.out.println("Mostrar alumnos matriculados---------------------------2");
				System.out.println("SALIR DEL PROGRAMA-------------------------------------0");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					
					case 1: //Matricular alumno
						Alumno alumno = new Alumno(sc);
						alumnos.add(alumno);
						break;
					
					case 2: //Mostrar alumnos
						try{
							System.out.println("Listad de Alumnos matriculados: ");	
							for (int i=0;i<alumnos.size();i++){
								System.out.println("Alumno "+i+1+": \n");
								alumnos.get(i).mostrarPersona();
							}
						}catch(NullPointerException e){
							System.out.println("No hay alumnos matriculados");
						}
							
						break;
					case 0: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opción correcta");
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insertado la opción correcta");
				sc.nextLine();
			}
		} while (seleccion != 0);
		System.out.println("Gracias por usar mi programa. Que tenga un buen día!");
		sc.close();
	}
}