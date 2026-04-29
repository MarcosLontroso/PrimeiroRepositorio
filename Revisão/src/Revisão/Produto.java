package Revisão;

public class Produto {
		String nome;
		double preço;
		
		public double calcDesc(double vlrSDesc, double pDesc){ 
			double vlrCDesc = 0;
			
			vlrCDesc = vlrSDesc * (pDesc / 100);
			
			return vlrCDesc;
			
	}

}


