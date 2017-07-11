
public class Methods {
	int total = 0;
	int n;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void addition(int num1, int num2) {
		total = num1 + num2;
	}
	public void subtraction(int num1, int num2) {
		total = num1 - num2;
	}
	public void multiplication(int num1, int num2) {
		total = num1 * num2;
	}
	public void division(int num1, int num2) {
		total = num1/num2;
	}
	public void modulus(int num1, int num2) {
		total = num1%num2;
	}
	public void singleMethod(int n1,int n2) {
		if (n == 1) {
			total = n1 + n2;
		}
		if (n == 2) {
			total = n1 - n2;
		}
		if (n == 3) {
			total = n1 * n2;
		}
		if (n == 4) {
			total = n1/n2;
		}
		if (n == 5) {
			total = n1%n2;
		}
	}
}
