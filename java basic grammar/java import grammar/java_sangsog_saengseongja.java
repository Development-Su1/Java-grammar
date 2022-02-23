// ��Ӱ� ������

class Calculator {
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {    // Calculator�� SubstractionableCalculator�� �θ�Ŭ�����̴�.
	
	public SubstractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {
	
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		// SubstractionableCalculator��� �ϴ� Ŭ������ �����ڷ� left(10)�� right(20)�� ���� ��ó�� �޵��� ������.
		c1.sum();
        c1.avg();
        c1.substract();
	}
}
// ������ >> 30   15   -10
// SubstractionableCalculator�� �����ڷ� left�� right�� ���� �޾Ƽ� �ʱ�ȭ��Ű�� �ִ�.


// ��� �ϸ� ���� Ŭ������ �����ڸ� ȣ���� �� ������?
// super 
// super Ű����� �θ� Ŭ������ �ǹ��Ѵ�. ���⿡ ()���̸� �θ� Ŭ������ �����ڸ� �ǹ��ϰ� �ȴ�. 
// �̷��� �ϸ� �θ� Ŭ������ �⺻ �����ڰ� �������� ������ �߻����� �ʴ´�.
// ���� Ŭ������ �����ڿ��� super�� ����� �� ������ ���� super�� �ʱ�ȭ���� ���� ���� ��Ÿ���� �Ѵٴ� ���̴�. 
// ���⼭ �ʱ�ȭ�� � ���� �����ϱ� ���� �غ��ϴ� ���� ���Ѵ�.
class Calculator {
	int left, right;
	
	public Calculator() {}  // �θ�Ŭ������ �⺻������
		
	public Calculator(int left, int right) {    // �� �⺻�����ڰ� �߰��� �ڿ� �ؾ��Ѵ�.
		this.left = left;
		this.right = right;
	}
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
}

class SubstractionableCalculator extends Calculator {   
	
	public SubstractionableCalculator (int left, int right) {
		super(left, right);
	    // 80�࿡���� this ��� super�� ����� ����.
		// this. -> Ŭ���� ������ �޼��忡�� �Ҽӵ� Ŭ���� ������ ȣ�� �� ����
		// super -> �θ�Ŭ���� ������ �޼��忡�� �Ҽӵ� Ŭ���� ������ ȣ�� �� ����
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo5 {
	
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);  // �����ڸ� �̿��ؼ� ��ü ����
		c1.sum();
		c1.avg();
		c1.substract();
	}
}


















