import java.util.Arrays;
import java.util.StringTokenizer;

public class RolaDados {
	
	int n;
	Dado[] dados;
	int[] valores;
 	
	public RolaDados (int n){
		this.n = n;
		this.dados = new Dado[n];
			for(int i = 0; i < n; i ++){
				dados[i] = new Dado();
			}
		this.valores = new int[n];
	}
	
	public static void main(String[] args) {
		
	}
	public int[] rolar (){
		for(int i = 0; i < n; i ++){
			valores[i] = dados[i].rolar();
		}
		return valores;
	}

	public int [] rolar(boolean [] quais){
		for(int i = 0; i < n; i ++){
			if(quais[i])
				dados[i].rolar();
			valores[i] = dados[i].getLado();
		}
		return valores;
	}
	public int [] rolar(String s){
		boolean [] quais = new boolean[n];
		Arrays.fill(quais, false);
		for(int i = 0; i < s.length(); i ++){
				int aux = (int) s.charAt(i);
				aux --;
			if (aux < n && aux >= 0);
				quais[aux] = true;
		}
		return rolar(quais);
	}
	
	@Override
		public String toString(){
			String faces = new String();
			StringTokenizer[] vetor = new StringTokenizer[n] ;
			for(int i = 0; i < n; i ++){
				faces += "   ";
				faces += (i+1);
				faces += '\t';
				vetor[i] = new StringTokenizer(dados[i].toString());
			}
			faces += '\n';
			for(int i = 0; i < 5; i ++){
				for(int j = 0; j < n; j ++){
					faces += vetor[j].nextToken("\n");
					if(j < n-1)
						faces += "\t";
					else
						faces += "\n";
				}
			}
			
			return faces;
			
	}
	
}
