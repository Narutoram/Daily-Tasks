package dailyTasks;

interface Addition {
	int add(int a, int b);
}

public class LambdaDemo {
	public static void main(String[] args) {

		Addition add1 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(add1.add(100, 200));
	}

}
