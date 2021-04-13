package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Carro;
import br.edu.univas.vo.Competidor;
import br.edu.univas.vo.Moto;
import br.edu.univas.vo.Veiculo;

public class StartApp {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Competidor> comp = new ArrayList <>();		
		Random random = new Random();
		int velFin [] = new int [5];
		
		int aux = 0;
		
		
		System.out.println("Bem vindo á corrida Maluca!!");
		System.out.println("Cadastre a seguir seus competidores;\n");
		
		for (int i = 0; i < 5; i++ ) {
			
		
			System.out.println("Digite agora a sua opção!!");
			System.out.println("1 - Carro");
			System.out.println("2 - Moto\n");
			
			aux = readInt(aux);
			
			if (aux == 1) {
				
				Competidor competidor = new Competidor ();
				Carro carro = new Carro ();
				competidor.setVeiculo(carro);
				competidor.setApelido("Competidor " + i);
				comp.add(competidor);
				
			}else if (aux == 2) {
				
				Competidor competidor = new Competidor ();
				Moto moto = new Moto ();
				competidor.setVeiculo(moto);
				competidor.setApelido("Competidor " + i);
				comp.add(competidor);
				
			}
		
			
		} // end for
	
		for (int i = 0; i < 10; i++) {
			
			
			for (int j = 0; j < 5; j++) {
				
				int charInt = (int) (Math.random() * 21);
			
				if (charInt < 5) {				
				i--;
				continue;
				}
				
				comp.get(j).getVeiculo().acelerar(charInt);
						
			}
									
			
			
		}
		
		for(int i = 0; i < 5; i++) {
			
			velFin[i] = comp.get(i).getVeiculo().getVelocidadeAtual();
			
		}
		
		 int n = velFin.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(velFin[j-1] > velFin[j]){  
	                                 
	                                 temp = velFin[j-1];  
	                                 velFin[j-1] = velFin[j];  
	                                 velFin[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
		
	    System.out.println("o ganhador é o que tinha velocidade: " + velFin[4]);
	         
	}
	
	public static int readInt (int num) {
		
		num = scan.nextInt();
		scan.nextLine();
		return num;
	}
	
}
