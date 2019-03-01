
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Changed it once more.");

		int s = fact(5);
		System.out.println(s);
		System.out.println("Text, that somebody probably will change");
	}
	
	private int fact(int k)
	{
		int s = 1;
		for(int i = 2; i <= k; i++)
			s*=i;
		return s;
	}

}
