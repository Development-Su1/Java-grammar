import javax.sql.rowset.serial.SQLOutputImpl;

// final
// ��� / ������ �����ϴ� �����̴�.


// final�ʵ�
// �ʵ�� ������ ���� �ǹ��̴�. 
// ����Ǵ� �������� �ѹ� ���� ������ ���Ŀ��� ���� ���� ���� �ٲ��� �ʵ��� �����Ѵ�.

// ����
class Calculator {
	static final double PI = 3.14;
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;	
//      Calculator.PI = 3.14;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
		
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
//      Calculator.PI = 10;			
	}
}
// ���� �տ� final�� �پ��ִٴ� ���̴�. 
// �׸��� 19��� 37�࿡ Calculator.PI�� ���ؼ� Ŭ���� ���� PI�� ���� �����Ϸ��� �ϰ� ������ �ڹٴ� �̰��� ������� �ʴ´�. 
// final�� ������ �������� �ѹ� ���� �Ҵ�Ǹ� �� ���� �ٲ� �� ���� �����̴�.
// �̷��� Ư¡�� Ŭ���� ������ ���� ������� �ν��Ͻ� �������� ����ȴ�.



































