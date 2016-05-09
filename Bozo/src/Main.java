
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RolaDados roladados = new RolaDados(5);
		Placar placar = new Placar();
		roladados.rolar();
//		System.out.println(roladados);
		int i = 0;
		while(i < 5){
			placar.add(2, roladados.rolar());
			System.out.println(placar);
			i++;
		}
	}
}
