import java.util.Arrays;

public class Placar {
	
	int score;
	int [][] vetor = new int [10][5];
	int [] matrizDePontos = new int [10];
	
	public Placar(){
//		for (int[] v : vetor)
//			v = null;
		Arrays.fill(matrizDePontos, 0);
	}

	private int sumAux (int [] dados, int h){
		int resultado = 0;
		for (int v: dados)
			if(v == h)
				resultado += v;
		return resultado;
	}
	
	private int counter (int [] dados, int h){
		return sumAux(dados, h) / h;
	}
	
	private int [] countAll (int [] dados){
		int [] result = new int [6];
		for(int i = 0; i < 5; i ++){
			result[i] = counter(dados, i + 1);
		}
		return result;
	}
	
	boolean isValid(int posicao, int [] dados){
		
		int [] aux = new int [6];
		aux = countAll(dados);
		if (matrizDePontos[posicao] != 0)
			return false;
		//parte facil
		if(posicao >= 0 && posicao <= 5 && sumAux(dados, posicao + 1) != 0){
			matrizDePontos[posicao] += sumAux(dados, posicao + 1);
			return true;
		}
		//full house/hand
		if(posicao == 6){
			boolean flag2 = false, flag3 = false;
			for(int v: aux){
				if(v == 2)
					flag2 = true;
				if(v == 3)
					flag3 = true;
			}
			if(flag2 && flag3){
				matrizDePontos[posicao] += 15;
				return true;
			}
		}
		if(posicao == 7){
			if(Arrays.equals(aux, new int[]{1,1,1,1,1,0}) || Arrays.equals(aux, new int[]{0,1,1,1,1,1})){
				matrizDePontos[posicao] += 20;
				return true;
			}
		}
		if(posicao == 8){
			for(int v: aux)
				if(v == 4){
					matrizDePontos[posicao] += 30;
					return true;
				}
		}
		if(posicao == 9){
			for(int v: aux)
				if(v == 5){
					matrizDePontos[posicao] += 40;
					return true;
				}
		}
		
		return false;
	}
	
	public void add (int posicao, int [] dados){
		if(isValid(posicao, dados))
			vetor[posicao] = dados;
	}
	
	public int getScore(){
		return score;
	}
	
	@Override
		public String toString(){
		return String.format("(%d)\t|(%d)\t|(%d)\n--------------------------\n(%d)\t|(%d)\t|(%d)\n--------------------------\n(%d)\t|(%d)\t|(%d)\n--------------------------\n\t|(%d)\t|\n        +-------+\n",matrizDePontos[0], matrizDePontos[6], matrizDePontos[3], matrizDePontos[1], matrizDePontos[7], matrizDePontos[4], matrizDePontos[2], matrizDePontos[8], matrizDePontos[5], matrizDePontos[9]);
	}
}
