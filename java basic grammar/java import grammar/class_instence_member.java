// Ŭ���� �ɹ��� �ν��Ͻ� �ɹ�
// ��ü�� ����� ���ؼ� �켱 Ŭ������ �����ϰ�, Ŭ������ ���� �ν��Ͻ��� �������. 

// Ŭ���� ����
// �츮�� ���� ���Ⱑ �������� ���� ����ڿ��� �����ϵ��� �ϰ� �ʹٰ� �����غ���. �׷��� �������� 3.14�� �̹� �˷����ִ� ���̴�. 
// ���� ������ �ν��Ͻ� ���� �������� ���� ������ ������ ���� �ʿ䰡 ����. �̷� ��� ������ Ŭ������ �ɹ��� ����� �ȴ�. 
// �Ʒ� �ڵ�� �������� ��� �ִ� ���� PI�� Ŭ������ �Ҽ��� �ɹ��� ���� ������. 
class Calculator {
	static double PI = 3.14;  // static�� �ɹ�(����, �޼ҵ�) �տ� ���̸� Ŭ������ �ɹ��� �Ȱ� ��� �ν��Ͻ����� ���� ���� ������.
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum () {
		System.out.println(this.left + this.right);
	}
	
	public void avg () {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	
	public static void main (String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);       // �ν��Ͻ��� ���ؼ� PI�� ����
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		 
		System.out.println(Calculator.PI);   // // Ŭ������ ���ؼ� PI�� ����
}
	
	
// ���� ����� �� �� Ư���� ���� ���Խ��Ѿ� �Ѵٸ� ��� �ؾ� �ұ�? 
// sum�� avg�� ������ ������ Ư���� ���� ���꿡 ���Խ�Ű�� ���� �� �õ��غ� �� �ִ� ����̴�. 
class  Calculator2 {
	static double PI = 3.14;
	static int base = 0;   // Ŭ���� ������ base�� �߰��Ǿ���.
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);  // ���ϱ⿡ base�� ���� ���Խ�Ų��.
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base) / 2);  // ���ġ�� base�� ���� ���Խ�Ų��.
	}
}

class CalculatorDemo2 {
	
	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.setoprands(10, 20);
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setoprands(20, 40);
		c2.sum();
		
		Calculator2.base = 10;  // Ŭ���� ���� base�� ���� 10���� �����ߴ�.
		c1.sum();   // 40 ���
		c2.sum();   // 70 ���
	}
}


// Ŭ���� �޼ҵ�
// ���� �ν��Ͻ��� left�� right�� ���� �׻� �����ϰ� �־�� �� ������ ����. 
// �հ質 ����� ���� ������ ���װ� ������ ���� �ִ� ������� ����� �� ���� �ִ�. 
class Calculator3 {
	
	public static void sum(int left, int right) {
		  System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

class CalculatorDemo3 {
	
	public static void main(String[] args) {
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}
}


// Ŭ������ �ν��Ͻ��� �������� �����ֱ� ���� ����
// �ν��Ͻ� �޼ҵ�� Ŭ���� �ɹ��� ���� �� �� �ִ�.
// Ŭ���� �޼ҵ�� �ν��Ͻ� �ɹ��� ���� �� �� ����.
class c1 {
	static int static_variable = 1;    // Ŭ���� ����
	int instance_variable = 2;        // �ν��Ͻ� ����
	static void static_static() {    // Ŭ���� �޼ҵ尡 Ŭ���� ������ ȣ���� �� static_static�̴�.
		System.out.println(static_variable);
	}
	static void static_instance() {    // Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� �� �� ����. 
        //System.out.println(instance_variable);
	}
	void instance_static() {   // �ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ���� �� �� �ִ�.
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(static_variable);
	}	
}
public class  ClassMemberDemo {  
	
	public static void mian(String[] agrs) {
		c1 c = new c1 ();
		// �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
        c.static_static();             // >> �ν��Ͻ�(c)�� ���ؼ� Ŭ������ ���� ����
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.static_instance();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        c.instance_static();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ���� 
        // �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.instance_instance();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        C1.static_static();         // >> Ŭ����(c1)�� ���ؼ��� ���� Ŭ���� �޼ҵ忡 ���� ����
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        C1.static_instance();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        C1.instance_static();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.instance_instance();
	}
}












