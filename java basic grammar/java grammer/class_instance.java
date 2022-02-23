// �Ʒ� ������ ������ ���ϱ� ���α׷����̴�.
// ���� ������ �������� ����� ������ �۾��� �����ϰ� �ִ� �����̶�� ��������.
public class ClaculatorDemo1 {

	public static void main(String[] args) {
		// �Ʒ��� ������ 1000�� ¥���� ������ �����̶�� ��������.
		System.out.println(10 + 20);
		System.out.println(20 + 40);

	}

}

// �޼ҵ�ȭ
// ���� ����� 30�� 60�̴�. ���α׷����� �⺻�� �ߺ��� �����ϴ� ���̴�. ���� ������ �ΰ��� ���� ���Ѵٴ� �ߺ��� �����Ѵ�. 
// �� �ߺ��� �����ϱ� ���� ������� ����غ� �� �ִ� ����� �޼ҵ��.
// �Ʒ��� �ڵ�� ���� �ڵ带 �޼ҵ�ȭ��Ų ������.
public class ClaculatorDemo2 {
	public static void sum(int left, int right) {   // sum�� �հ��� ��
		System.out.println(left + right);
	}
	
	public static void main (String[] args) {
		sum(10, 20);
		sum(20, 40);
	}
	
}

// �Ȱ��� ���� �̿��ؼ� ���ϱ� �� �ƴ϶� ��յ� ���ؾ� �Ѵٸ� ��� �ؾ��ұ�?
// �Է°�(left, right)�� ����ȭ��Ű�� �޼ҵ��(sum, avg)�� �� ���� ����ϸ� �ڵ��� ���� ���� �� �ְ� �ȴ�.
public class ClaculatorDemo3 {
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
	
	public static void sum (int left, int right) {
		System.out.println(left + right);
	}
	
	public static void main (String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);
	}
}


// ��üȭ
// �Ʒ��� ������ �ǹ������� ������ �������� ���������� ������ �ϳ��� ��ü�� ����� ���� �����ϴ� ������. 

// Ŭ������ �����Ǿ� �ִ� ������ �޼ҵ��� �����̴�. << ���� left�� right, �޼ҵ� sum�� avg
// �̰͵��� Calculator�̶�� �̸����� �׷����ϰ� �ʹ�. �̷� �� ����ϴ� Ű���尡 class�̴�. 
// class Ű���� �ڿ��� Ŭ���� �̸��� ���� �� ���� �߰�ȣ�� Ŭ������ ���۰� ���� ��踦 �ǹ��Ѵ�. 
// �̷��� �ؼ� ���ϱ�(sum)�� ���(avg)�� ��� �� �� �ִ� Ŭ������ ���������.
class Calculator {     // �� �������� ��ǥ�ϴ� �̸��� ������ �ǹ��� Calculator��� ������.
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;      // this�� Ŭ������ ���ؼ� ������� �ν��Ͻ� �ڽ��� ����Ų��.
		this.right = right;
		
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

// ���赵�� ��ü���� ��ǰ���� ������ �Ѵ�. �� �� ����ϴ� Ű���尡 new�̴�. ��ü���� ��ǰ�� �ν��Ͻ�(instance)��� �θ���. 
// Ŭ���� : ���赵, �ν��Ͻ� : ��ǰ
// new Calculator()�� Calculator�� ��ü���� ��ǰ���� ����� ����̴�.

// Calculator c1�� Calculator��� �ǹ̴�. �� Ŭ������ ����ٴ� ���� ����� ���� ������ Ÿ���� ����� �Ͱ� ���� �ǹ̴�. 
// Ŭ������ �ν��Ͻ�ȭ �� ���� ������ ��ƾ� �Ѵٴ� �Ͱ� �� �� ����ϴ� ������ ������ Ÿ���� �� Ŭ������ �ȴٴ� ���̴�.
// ������ �ν��Ͻ��� �޼ҵ� setOprands�� ���ؼ� ���� left, right�� ���� �����ϰ� �ִ�.
public class ClaculatorDemo4 {
	
	public static void main (String[] args) {
		
		Calculator c1 = new Calculator();   //  new�� �̿��ؼ� ���� �ν��Ͻ��� ���� c1�� ��� �ִ�. 
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setoprands(20, 40);
		c2.sum();
		c2.avg();
		
	}
}

























