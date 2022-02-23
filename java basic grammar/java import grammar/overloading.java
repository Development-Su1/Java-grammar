// overloading

// �츮�� ����� 2���� ��(left, right)�� ���� ����(sum, avg) ���� ���� �� �� �ִ�.
// �׷��� ���� 3���� ���� ������� ������ �ؾ� �Ѵٸ� ��� �ؾ��ұ�? �켱 �Ʒ��� ���� �Է°��� 3�� �޾ƾ� �� ���̴�. 
// c1.setoprands(10, 20, 30);
class Calculator {
	int left, right;
	int third = 0;   // ������ ������ ���� ������ �̻� ���� ���� ������ 0���� ������ ���ذ��̴�.
	                 // �� �Ű����� 2���� sum�� ����Ҷ� �̻��� ���� ���°��� �����ϱ� ���� third�� 0���� �ʱ�ȭ�ߴ�.
	                  
	public void setoprands(int left, int right) {
		System.out.println("setoprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setoprands(int left, int right, int third) {
		System.out.println("setoprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
		
	}
	
	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.setoprands(10, 20, 30);
		c1.sum();
		c1.avg();
	}
}
// ������
// setoprands(int left, int right)   30    15   setOprands(int left, int right, int third)   60    30
// �̸� ���ؼ� �� �� �ִ� ���� �Ű������� ���ڿ� ���� ���� �̸���, ���� �ٸ� �޼ҵ带 ȣ���ϰ� �ִٴ� ���� �� �� �ִ�.
// �̸��� ������ �ñ״�ó�� �ٸ� �޼ҵ带 �ߺ����� ���� �� �� �ִ� ����� �޼ҵ� �����ε�(overloading)�̶�� �Ѵ�.

// �� �ڵ� �� 12~13��� 18~19���� ���� ������ �ڵ� �� �ߺ��� �߻��Ͽ���.
// ���� �ߺ��Ǵ� 18~19���� �����Ѵ�.
// �׸��� this�� �ڱ� �ڽ��� ��Ÿ���� Ư���� �����̱⿡ ���� this.setoprands(left, right);�� ���ش�.
// ��������� �ߺ��� �Ǵ� �ڵ带 ���� ȣ���� ������ this.setoprands(left, right);ó�� 
// �׸��� �޼ҵ忡�� �߰������� �ʿ��� �۾��� this.third = third;�� �ΰ��Ѵ�.
public void setoprands(int left, int right) {
	System.out.println("setoprands(int left, int right)");
	this.left = left;
	this.right = right;
}

public void setoprands(int left, int right, int third) {
	this.setoprands(left, right);
	System.out.println("setoprands(int left, int right, int third)");
	this.third = third;
}


// �޼ҵ� �����ε��� �Ű������� ����Ѵ�. �� �Ű������� �ٸ��� �̸��� ���Ƶ� ���� �ٸ� �޼ҵ尡 �Ǵ� ���̴�. 
// �ݸ鿡 �Ű������� ������ ����Ÿ���� �ٸ��� ������ �߻��Ѵ�. 


// �� ���� ���� ������� ������ �ؾ� �Ѵٸ� ��� �ؾ��ұ�?
// �Ʒ��� �ڵ�� ���ڷ� �迭�� ����ϰ� �ִ�. �̷����ϸ� �ϳ��� ���ڷ� �������� ���� ���� �� �ִ�.
class Calculator {
	int[] oprands;
	
	public void setoprands(int[] oprands) {
		this.oprands = oprands;
	}
	 
	public void sum() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total);
	
	}
	
	public void avg() {
		
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total / this.oprands.length);	
	}
}
public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setoprands(new int[] {10, 20});
		c1.sum();
		c1.avg();
		c1.setoprands(new int[] {10, 20, 30});
		c1.sum();
		c1.avg();
	}
}










