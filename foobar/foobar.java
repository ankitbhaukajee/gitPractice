
public class foobar {

	public static void main(String[] args) {
		for (int i=1;i<=110;i++){
			if (i%3==0 && i%5==0){
				System.out.println("foobar");
			}
			else if (i%5==0){
				System.out.println("bar");
			}
			else if (i%3==0){
				System.out.println("foo");
			}
			else if(i%7==0){
				System.out.println("Baz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}