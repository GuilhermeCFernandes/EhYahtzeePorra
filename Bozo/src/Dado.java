
public class Dado {
	int lado, faces;
	String desenho = new String();
	Random rd = new Random();
	public Dado(){
		faces = 6;
		rolar();
		//lado = rd.getIntRand(1, faces + 1);
	}
	public Dado(int n){
		faces = n;
		rolar();
		//lado = rd.getIntRand(1, faces + 1);
	}
	public int getLado(){
		return lado;
		
	}
	public static void main(String[] args) {
		
	}
	public int rolar(){
		lado = rd.getIntRand(1, faces + 1);
		return getLado();
	}
	@Override
		public String toString(){
			if(faces != 6)
				return "";
			switch(lado){
				case 1:
					desenho = ("+-----+\n");
					desenho +=("|     |\n");
					desenho +=("|  *  |\n");
					desenho +=("|     |\n");
					desenho +=("+-----+\n");
					break;
				case 2:
					desenho = ("+-----+\n");
					desenho +=("|*    |\n");
					desenho +=("|     |\n");
					desenho +=("|    *|\n");
					desenho +=("+-----+\n");
					break;
				case 3:
					desenho = ("+-----+\n");
					desenho +=("|*    |\n");
					desenho +=("|  *  |\n");
					desenho +=("|    *|\n");
					desenho +=("+-----+\n");
					break;
				case 4:
					desenho = ("+-----+\n");
					desenho +=("|*   *|\n");
					desenho +=("|     |\n");
					desenho +=("|*   *|\n");
					desenho +=("+-----+\n");
					break;
				case 5:
					desenho = ("+-----+\n");
					desenho +=("|*   *|\n");
					desenho +=("|  *  |\n");
					desenho +=("|*   *|\n");
					desenho +=("+-----+\n");
					break;
				case 6:
					desenho = ("+-----+\n");
					desenho +=("|*   *|\n");
					desenho +=("|*   *|\n");
					desenho +=("|*   *|\n");
					desenho +=("+-----+\n");
					break;
			}
			return desenho;
		}
}
