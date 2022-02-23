// ���� ������

// Ŭ������ �ɹ�(������ �޼ҵ�)���� ���� ������ �����Ѵ�.
// Ŭ���� �ɹ��� ���� ���� ������
class A {
	public String y() {
		return "public void y()";
	}
	
	private String z() {    
		return "public void z()";
		
	}
	
	public String x() {    // ���� �����ڰ� public�̱� ������ ȣ�� �� �� �ִ�. 
		return z();
	}
	
}
public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
     // System.out.println(a.z());  >> �� �ڵ�� ������ �߻��Ѵ�. ��, �޼ҵ� z�� ���� �� �� ���ٴ� �ǹ�
	    System.out.println(a.x());	
	}
}
// �� �ڵ��� ���
// 8�࿡ private�� Ŭ����(A) �ۿ����� ���� �� �� ���ٴ� �ǹ̴�.
// �� private�� �ڸ��� ���� �͵��� ���� ������(access modifier)��� �Ѵ�.
// �̰� ������ 22�࿡�� ����� �� ������ ���� ���̴�.
// �׷��� 13���� �� ��µȴ�. �� ������ ���� �����ڰ� public�̱� �����̴�.
// �׸��� �޼ҵ��� ������ ���� ���������� �޼ҵ� z�� ȣ���ϰ� �ִ�. �޼ҵ� z�� ���������� ȣ��ȴ�.
// �ֳ��ϸ� �޼ҵ� x�� �޼ҵ� z�� ���� Ŭ������ �Ҽ��̱� �����̴�. ���� �޼ҵ� x���� z�� ȣ�� �� �� �ִ� ���̴�.

// ����
class Calculator {
	private int left, right;   
// �ν��Ͻ� �ʵ��� left�� right�� private���� �����Ǿ���.
// �� �ΰ��� ������ ��ü �ܺο��� ȣ��� �ʿ䰡 ����. ���� �ܺηκ��� �� ������ ����� ���ؼ� ���� �����ڷ� private�� �����ߴ�.
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int _sum () {
		return this.left + this.right;
		
	}
	
	public void sumDecoplus() {
		System.out.println("++++" + _sum() + "++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("----" + _sum() + "----");
	}
}
public class CalculatorDemo {
	
	public static void main(String[] args) {
	    Calculator c1 = new Calculator();
	    c1.setoprands(10, 20);
	    c1.sumDecoplus();
	    c1.sumDecoMinus();	
	}
}
// ������ << ++++30++++     ----30----
// �޼ҵ� _sum�� �߰� �Ǿ��µ� ���� ����� �� �޼ҵ尡 ���������� ó���ϰ�, 
// ���� ����� �ܺο� ������ִ� �޼ҵ�� sumDecoPlus, sumDecoMinus���� ó���Ѵ�.


// Ŭ������ ���� ������
// Ŭ������ ���� �����ڴ� �� 2���� public�� default�̴�. default�� ���� �����ڸ� ������ ���� ��� default�� �ȴ�.
// ���� �����ڰ� public�� Ŭ������ �ٸ� ��Ű���� Ŭ���������� ����� �� �ְ�, default�� ���� ���� ��Ű�������� ��� �����ϴ�.

























