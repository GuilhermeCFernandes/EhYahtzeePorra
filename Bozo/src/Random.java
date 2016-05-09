import java.util.Calendar;

public class Random {
	
	public Random (int k){
	
	}
	
	public Random (){
		x = -1 * Calendar.getInstance().getTimeInMillis();
	}
	@Override
		public String toString(){
			return "Esse eh um objeto Random " + x;
		}
	
	private long a = 453816693, m = 843314861, p = 2147483648L;
	public long x = 1023;
	
	
	public double getRand(){
		x = (a + m * x) % p;
		return (double) x / p;
	}
	
	public void setSement (int k){
		x = k;
	}
	
	public int getIntRand(int max){
		
		return 1 + (int) (getRand() * (double) max);
	}
	public int getIntRand(int min, int max) throws IllegalArgumentException{
		if(min >= max)
			throw new IllegalArgumentException("Parametros invalidos");
		
		return (int) (getRand() * (max - min) + min);
	}
	public int getIntRand(){
		return (int) (getRand() * Integer.MAX_VALUE);
	}
}
