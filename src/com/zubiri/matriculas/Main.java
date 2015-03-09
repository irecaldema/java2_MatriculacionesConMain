package com.zubiri.matriculas;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int seleccion=-1;
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
						Matricula matricula = new Matricula(sc);
						break;
						
					case 2: //Mostrar alumnos
						try{
							System.out.println("Listad de Alumnos matriculados: ");	
							System.out.println(Alumnos.formatted());
						}catch (Exception e){
							System.out.println(e);
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