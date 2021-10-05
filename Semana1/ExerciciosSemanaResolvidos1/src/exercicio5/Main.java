package exercicio5;


public class Main {

	public static void main(String[] args) {
	
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(4,0,-16);
			
		if(equacao.raizesReais())
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.delta() == 256)
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.resolver().equalsIgnoreCase("2.0;-2.0"))
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		equacao = new EquacaoSegundoGrau(1,2,1);

		if(equacao.raizesReais())
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.delta() == 0)
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.resolver().equalsIgnoreCase("-1.0"))
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		equacao = new EquacaoSegundoGrau(2,1,2);

		if(!equacao.raizesReais())
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.resolver().equalsIgnoreCase("sem raizes reais"))
			System.out.println("OK");
		else
			System.out.println("ERRO");
	
		if(equacao.delta() == -15)
			System.out.println("OK");
		else
			System.out.println("ERRO");
		
		if(equacao.imprimir().equalsIgnoreCase("a=2;b=1;c=2;"))
			System.out.println("OK");
		else
			System.out.println("ERRO");
				
	}
}
//SAIDA ESPERADA
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK
//OK















