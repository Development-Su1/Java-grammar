// overriding

class Calculator {
	int left, right;
	
	public void setoprands (int left, int right) {
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
	
	public void sum() {      // �޼ҵ� sum�� SubstractionableCalculator�� �߰�
		System.out.println("���� �����" + (this.left + this.right) + "�Դϴ�.");
	    // �θ� �̹� ���� �ִ� sum�� ������ �� overriding�� ���̴�.
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
// ������   <<    �������� 30�Դϴ�.   15    -10
// �޼ҵ� sum�� SubstractionableCalculator�� �߰� �Ǿ���. �������� c1.sum�� ���� Ŭ������ �޼ҵ尡 �ƴ� ���� Ŭ������ �޼ҵ� sum�� �����ϰ� �ִ� ���� �����ش�.
// ���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ� �θ� Ŭ�����κ��� ���� ���� �⺻ ���� ����� �����ϴ� ȿ���� ���� �ȴ�. 
// �⺻������ ���а� ����ǰ�, �������� ������ �� ���� �켱������ �����ϰ� �ִ�. �̰��� �ٷ� overriding�̴�.


// ���� Ŭ�������� �����ϰ� �ִ� �޼ҵ� avg�� ��� ����� ȭ�鿡 ����ϰ� �ִ�. 
// �׷��� ��� ����� �� �� �پ��ϰ� ����ϱ� ���ؼ� �޼ҵ� avg�� ȭ�鿡 ����� ����ϴ� ��� ��� ����� �������ָ� ���ڴ�.
// �� ���ǿ� �����ϴ� �ڵ�
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

class SubstractionableCalculator extends Calculator {
	
	public void sum() {
		System.out.println("���� �����" + (this.left + this.right) + "�Դϴ�.");
	}
	
	public void avg() {
		return (this.left + this.right) / 2;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1. setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
	
}
// ���� ���� ȭ�� ������ �߻��Ѵ�.
// overriding�� �ϱ� ���ؼ��� �޼ҵ��� ���� ������ ���ƾ� �Ѵ�. �� Ŭ���� Calculator�� �޼ҵ� avg�� ���� Ÿ���� void�̴�. 
// �׷��� �̰��� ����� Ŭ���� SubstractionableCalculator�� ���� Ÿ���� int�̴�.
// �������̵��� �ϱ� ���ؼ��� �޼ҵ� �̸�, �޼ҵ� �Ű������� ���ڿ� ������ Ÿ�� �׸��� ����, �޼ҵ� ���� Ÿ���� �������Ѿ� �Ѵ�.
// �޼ҵ� �Ű����� ���� >> public void avg(int a, int b)���� int a, int b�� �Ű������̴�.

// ���� �Ʒ� �ڵ�� ���� �����ؾ� �Ѵ�.
class Calculator {
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
		
	}
	
	public int avg() {
		return ((this.left + this.right) / 2);
		
	}
}
  
class SubstractionableCalculator extends Calculator {
    
   public void sum() {
       System.out.println("���� ����� " +(this.left + this.right)+ "�Դϴ�.");
   }
    
   public int avg() {
       return ((this.left + this.right) / 2);
   }
    
   public void substract() {
       System.out.println(this.left - this.right);
   }
}

public class CalculatorDemo {
   public static void main(String[] args) {
       SubstractionableCalculator c1 = new SubstractionableCalculator();
       c1.setOprands(10, 20);
       c1.sum();
       c1.avg();
       c1.substract();
   }
}
// ���� Ŭ������ ���� Ŭ������ ������ ���� ������ �޼ҵ� �������̵��� �� �� �־���. 
// �׷��� ���� �ڵ带 ���� �ߺ��� �߻��ߴ�. �޼ҵ� avg�� �θ�� �ڽ� Ŭ������ ���� ������ ������ �ִ�. 
// �ߺ��� ���� �Ǿ�� �Ѵ�. �����ڿ� ���������� super�� ����ϸ� �� ������ �ذ� �� �� �ִ�.
class Calculator {
	int left, right;
	
	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
		
	}
	
	public int avg() {
		return ((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {
	
	public void sum() {
		System.out.println("���� �����" +(this.left + this.right)+ "�Դϴ�.");
		
	}
	
	public void avg() {
		return super.avg();
	}
	
	public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("���� �����" + c1.avg());
        c1.substract();
    }
}














