package exercicioJava;

import java.util.Scanner;

public class PrimeGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kalq=new Scanner(System.in); 		 
		
		double um;
		double outro;
		double soma,subtracao,multiplicacao,divisao,pot,raiz;
		int a, res =1; // Para o cálculo da Potência, a: base, n : expoênte.
		int n =2;
		
		 
		
		System.out.println("Digite um número");
		um=(int)kalq.nextDouble();
		
		System.out.println("Digite outro número ");
		outro=(int)kalq.nextDouble();
		
		soma=um+outro;
		subtracao=um-outro;
		multiplicacao=um*outro;
		divisao=(int)(um/outro);
		 
		System.out.println("Veja os resultados");
		
		System.out.println("A soma dos dois números é : " +soma);
		if(soma%2==0) {
			System.out.println("O resultado é  Par! ");
		}else {
			System.out.println("O resultado é Ímpar ! ");
		}
		
		if(soma%3==0) {
			System.out.println("Este reultado  é divisível por 3");
		}else {
			System.out.println("Esse resultado não  é divisível por 3 .");
		}
		
		System.out.println("A subtração dos dois números é : " +subtracao);
		if(subtracao%2==0) {
			System.out.println("O resultado é Par! ");
		}else {
			System.out.println("O resultado é Ípar ! ");
		}
		if(subtracao%3==0) {
			System.out.println("Este reultado  é divisível por 3");
		}else {
			System.out.println("Esse resultado não  é divisível por 3 .");
		}
		System.out.println("A multiplicação dos dois números é : " +multiplicacao);
		if(multiplicacao%2==0) {
			System.out.println("O resultado é Par! ");
		}else {
			System.out.println("O resultado é Ímpar ! ");
		}
		if(multiplicacao%3==0) {
			System.out.println("Este reultado  é divisível por 3");
		}else {
			System.out.println("Esse resultado não  é divisível por 3 .");
		}
		System.out.printf("A divisao dos dois números é : %.2f \n" , divisao);
		if(divisao%2==0) {
			System.out.println("O resultado é Par! ");
			
			
		}else {
			System.out.println("O resultado é Ímpar ! ");
		}
		if(divisao%3==0) {
			System.out.println("Este reultado  é divisível por 3");
		}else {
			System.out.println("Esse resultado não  é divisível por 3 .");
		}
			
			System.out.println(" Para a potência digite a Base ");
			
			a=kalq.nextInt();
			System.out.println("Agora digite o expoênte");
			n=kalq.nextInt();
			 
			Math.pow(a,n);
			
			 
			System.out.println("O resultado é : " + Math.pow(a, n));
			if(res%3==0) {
				System.out.println("Este reultado  é divisível por 3");
			}else {
				System.out.println("Esse resultado não  é divisível por 3 .");
			}
			
			System.out.println("Digite um número para tira a Raiz Quadrada");
			raiz=kalq.nextDouble();
			Math.sqrt(raiz);
			System.out.println("A raiz Quadrada do número é :" + Math.sqrt(raiz));
			if(raiz%3==0) {
				System.out.println("Este reultado  é divisível por 3");
			}else {
				System.out.println("Esse resultado não  é divisível por 3 .");
				System.out.println("    Acabou a brincadeira!!! ");
			}
			kalq.close();
			
			}
			
			
		

	}


