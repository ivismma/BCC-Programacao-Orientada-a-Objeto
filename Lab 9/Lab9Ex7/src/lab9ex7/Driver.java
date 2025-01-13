package lab9ex7;

public class Driver {
	public static int lista[] = new int[3];
	public static void main(String[] args) {
		try {
			System.out.println("inicio da main");
			Exercicio.metodo1();
			System.out.println("fim da main");
		} catch(Exception e) {
			System.out.println("Exceção genérica capturada");
		}
	}
}

/*

inicio da main
    inicio do metodo1
        inicio do metodo2
             inicio do metodo3
             fim do metodo3
        fim do metodo2
    fim do metodo1
fim da main

*/

/*

inicio da main
    inicio do metodo1
        inicio do metodo2
             inicio do metodo3
             ERRO DE EXCEPTION

*/