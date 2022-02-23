// ��� (�����شٴ� �ǹ�)
// � ��ü�� ���� �� �� ��ü�� �ʵ�(����)�� �޼ҵ带 �ٸ� ��ü�� ���� ���� �� �ִ� ���
// ����� ���� ��ü�� �״�� �����ϸ鼭 � ����� �߰��� �� ���̴� ���

// ����
// ��ü Calculator�� ���ϱ�� ��տ� �ش��ϴ� sum�� avg �޼ҵ带 ������ �ִ�.
// �׷��� �� ��ü�� ������ �ִ� ��ɿ� ����(substract)�� �߰��ϰ� �ʹ�.
// ������ ��ü�� ����� �����شٴ� �ǹ̿��� �θ� ��ü�� �ǰ� ���ο� ��ü�� ���� ��ü�� ����� �����޴´ٴ� �ǹ̿��� �ڽ� ��ü�� �ȴ�. 
class Calculator {
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;	
	}
	
	public void sum() {
		System.out.println(this.left + this.right );
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {  // ���ο� Ŭ������ SubstractionableCalculator�� ����
	public void substract() { 
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
// ������ >> 30  15  -10
// extends Calculator�� Ŭ���� Calculator�� ��� �޴´ٴ� �ǹ̴�.
// ���� SubstaractableCalculator�� Calculator���� ������ �޼ҵ� setOprands, sub, avg�� ����� �� �ְ� �ȴ�. 

// Calculator�� ��� �޴� Ŭ������ �ϳ� �� ������. �� Ŭ������ ���ϱ⸦ �� �� �ִ� Ŭ������.
class MultiplicationableCalculator extends Calculator {
	
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	
	public static void main(String[] args) {
		
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}
}
// ������ >> 30   15    200

// ����� Ŭ������ �ٽ� ����� �� ������? �����ϴ�. 
// �Ʒ��� ������ ���ϱⰡ ������ Ŭ������ MultiplicationableCalculator�� ��ӹް� �ִ�.
// ������(division) �߰�, ���ο� Ŭ������ DivisionableCalculator ����
class DivisionableCalculator extends MultiplicationableCalculator {
	
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();
	}
}





























