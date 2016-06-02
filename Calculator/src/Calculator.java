
public class Calculator {
	public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	    	sum += Integer.valueOf(summand);
	    return sum;

}
	public int add(int a, int b) {
		int suma = a + b;
		return suma;
}
	public int sub(int a, int b) {
		int suma = a - b;
		return suma;
}
}

