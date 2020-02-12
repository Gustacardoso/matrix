package aplication;

import java.util.Scanner;

public class Programan {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int[][] mat = new int[n][m];
		 
		 for(int i=0; i<mat.length;i++) {//linha da matriz
			 for (int j = 0; j < mat[i].length; j++) {//coluna d matri
				mat[i][j] = sc.nextInt();
			}
		 }
		 
		 for(int i=0; i<mat.length;i++) {//linha da matriz
			 for (int j = 0; j < mat[i].length; j++) {//coluna d matri
				 System.out.print(mat[i][j]+ " ");
			}
			 System.out.println();
		 }
		 
		 System.out.println("informe o numero,para saber a posião na matrix ");
		 int valor = sc.nextInt();
		 int cont = 0;
		 for(int i=0; i<mat.length;i++) {//linha da matriz
			 for (int j = 0; j < mat[i].length; j++) {//coluna d matri
				if (mat[i][j] == valor) {
					    System.out.println("posição: " +i+","+j+ ":l");
					
					if (j < mat[i].length-1) {
						System.out.println("direita "+mat[i][j+1]);
					        }
						
				    if(j > 0) {
				        System.out.println("esquerda "+mat[i][j-1]);
				      }
				    if (i > 0) {
					   System.out.println("cima "+mat[i-1][j]);
				      }
						
					if (i < mat.length-1) {
						System.out.println("baixo "+mat[i+1][j]);
					}	
						
				
						
				}
			
					
				
			}
		 }
		
		
		 sc.close();

	}

}
