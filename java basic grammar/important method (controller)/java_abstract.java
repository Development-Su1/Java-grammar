// abstract
// ����� �����ϴ� ������ ����
// ��, Ŭ������ �޼ҵ带 ����ϱ� ���ؼ��� �ݵ�� ����ؼ� ����ϵ��� �����ϴ� ���̴�.

// �߻� �޼ҵ� (�޼ҵ��� �ñ״�ó�� ���ǵ� ����ִ� �޼ҵ带 �ǹ��Ѵ�.)
abstract class A {
	public abstract int b();
    // ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
    // public abstract int c(){System.out.println("Hello")}
    // ������ �߻���Ű�µ� ��ü�� {System.out.println("Hello")}�� �����ϴµ� �߻� �޼ҵ带 �ǹ��ϴ� abstract�� ����ϰ� �ֱ� �����̴�. 
		
	public void d() {
		System.out.println("world");    // �߻� Ŭ�������� �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.
	}
}
public class AbstractDemo {
	
	public static void main(String[] args) {
		A obj = new A ();    // �߻� Ŭ������ ��ü���� �޼ҵ��� ������ �������� �ʱ� ������ �ν��Ͻ�ȭ���Ѽ� ����� �� ����.
		
	}
}
// �޼ҵ� b�� ���� �κп��� abstract��� Ű���尡 �����ϰ� �ִ�. 
// �� Ű����� �޼ҵ� b�� �޼ҵ��� �ñ״�ó�� ���� �Ǿ� �ְ� �� �޼ҵ��� ��ü���� ������ ���� Ŭ�������� �������̵� �ؾ� �Ѵٴ� �ǹ̴�. 
// �̷��� ������ ����ִ� �޼ҵ带 �߻� �޼ҵ��� �θ���. 
// �߻� �޼ҵ带 �ϳ��� �����ϰ� �ִ� Ŭ������ �߻� Ŭ������ �ǰ�, �ڿ������� Ŭ������ �̸� �տ� abstract�� �ٴ´�. 

// ���� �������� �ذ��ϱ� ���� �ڵ�
// Ŭ���� A�� ����� ���� Ŭ������ ����� �߻� �޼ҵ带 �������̵��ؼ� �����ִ� �޼ҵ带 ������ �Ѵ�.
abstract class A {
	public abstract int b();
	public void d() {
	   System.out.println("world");
	}	
} 
class B extends A {    // Ŭ���� B�� Ŭ���� A�� ����ߴ�. 
	public int b () {return 1;}   // Ŭ���� A�� �߻� �޼ҵ��� �޼ҵ� b�� �������̵� �ϰ� �ִ�. �� ��� Ŭ���� A�� ����� �� �ִ�.
}
public class AbstractDemo {
	
	public static void main(String[] args) {
		B odj = new B();
		System.out.println(obj.b());
	}
}
// �θ� Ŭ�������� �޼ҵ��� �ñ״�ó�� �����س���(31��ó��) �� �޼ҵ��� ���� ���� ����� �� �޼ҵ带 ��� ���� ���� Ŭ������ å������ �����ϰ� �ִ�.(37��ó��)


// ���� ������ �߻� Ŭ���� ������ ������ �ڵ�
abstract class Calculator {
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + (this.left + this.right));
	}
	
	public void avg() {
		System.out.println("+ avg :"+(this.left+this.right)/2);

	}
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum :" + (this.left + this.right));
	}
	
	public void avg() {
		System.out.println("- avg :" + (this.left - this.right)/2);
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setoprands(10, 20);
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setoprands(10, 20); 
		c2.run();
	}
}
// ������
// + sum : 30
// + avg : 15
// - sum : 30
// - avg : 15
// ���� ������ �հ�(sum)�� �����ϰ� ���(avg)�� �����ϴ� ������ �޼ҵ� run�� ���ؼ� �� ���� ����ǵ��� �� �ڵ��̴�. 

















