package exercicioJava;

import java.util.Scanner;

public class PrimeGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kalq=new Scanner(System.in); 		 
		
		double um;
		double outro;
		double soma,subtracao,multiplicacao,divisao,pot,raiz;
		int a, res =1; // Para o c�lculo da Pot�ncia, a: base, n : expo�nte.
		int n =2;
		
		 
		
		System.out.println("Digite um n�mero");
		um=(int)kalq.nextDouble();
		
		System.out.println("Digite outro n�mero ");
		outro=(int)kalq.nextDouble();
		
		soma=um+outro;
		subtracao=um-outro;
		multiplicacao=um*outro;
		divisao=(int)(um/outro);
		 
		System.out.println("Veja os resultados");
		
		System.out.println("A soma dos dois n�meros � : " +soma);
		if(soma%2==0) {
			System.out.println("O resultado �  Par! ");
		}else {
			System.out.println("O resultado � �mpar ! ");
		}
		
		if(soma%3==0) {
			System.out.println("Este reultado  � divis�vel por 3");
		}else {
			System.out.println("Esse resultado n�o  � divis�vel por 3 .");
		}
		
		System.out.println("A subtra��o dos dois n�meros � : " +subtracao);
		if(subtracao%2==0) {
			System.out.println("O resultado � Par! ");
		}else {
			System.out.println("O resultado � �par ! ");
		}
		if(subtracao%3==0) {
			System.out.println("Este reultado  � divis�vel por 3");
		}else {
			System.out.println("Esse resultado n�o  � divis�vel por 3 .");
		}
		System.out.println("A multiplica��o dos dois n�meros � : " +multiplicacao);
		if(multiplicacao%2==0) {
			System.out.println("O resultado � Par! ");
		}else {
			System.out.println("O resultado � �mpar ! ");
		}
		if(multiplicacao%3==0) {
			System.out.println("Este reultado  � divis�vel por 3");
		}else {
			System.out.println("Esse resultado n�o  � divis�vel por 3 .");
		}
		System.out.printf("A divisao dos dois n�meros � : %.2f \n" , divisao);
		if(divisao%2==0) {
			System.out.println("O resultado � Par! ");
			
			
		}else {
			System.out.println("O resultado � �mpar ! ");
		}
		if(divisao%3==0) {
			System.out.println("Este reultado  � divis�vel por 3");
		}else {
			System.out.println("Esse resultado n�o  � divis�vel por 3 .");
		}
			
			System.out.println(" Para a pot�ncia digite a Base ");
			
			a=kalq.nextInt();
			System.out.println("Agora digite o expo�nte");
			n=kalq.nextInt();
			 
			Math.pow(a,n);
			
			 
			System.out.println("O resultado � : " + Math.pow(a, n));
			if(res%3==0) {
				System.out.println("Este reultado  � divis�vel por 3");
			}else {
				System.out.println("Esse resultado n�o  � divis�vel por 3 .");
			}
			
			System.out.println("Digite um n�mero para tira a Raiz Quadrada");
			raiz=kalq.nextDouble();
			Math.sqrt(raiz);
			System.out.println("A raiz Quadrada do n�mero � :" + Math.sqrt(raiz));
			if(raiz%3==0) {
				System.out.println("Este reultado  � divis�vel por 3");
			}else {
				System.out.println("Esse resultado n�o  � divis�vel por 3 .");
				System.out.println("    Acabou a brincadeira!!! ");
			}
			kalq.close();
			
			}
			
			
		

	}


