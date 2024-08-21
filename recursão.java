import javax.swing.*;

class fatorial{
	static void fatP (int n, int x, int f)
	{
		if (x == 0 || x == 1 ) {
			System.out.println("O fatorial de " + n + " é " + f);
			
		}
		else 
		{
			fatP(n, x-1, f*x);
		}
	}

	public static void main (String arg [])
	{
		int nro;
		
		nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
		
		if (nro < 0)
		{
			System.out.println("Valor inválido para calcular fatorial, digite um número igual ou maior que zero");
			System.exit(0);
		}
		else 
		{
			fatP(nro, nro, 1);
		}
		System.exit(0);
	}
}
						