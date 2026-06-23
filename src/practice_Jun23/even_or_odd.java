package practice_Jun23;

interface evenodd{
	void eo(int num);
}

public class even_or_odd {
	public static void main(String[] args) {
		evenodd eos=(num)->{
			if((num & 1)==0) {
				System.out.println("Even Number");
			}else {
				System.out.println("Not a Even Number");
			}
		};
		
		eos.eo(45);
	}

}
