// ����
public class ReferenceDemo1 {
	
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue," +a);
		
	}
   
       public static void main(String[] args) {
    	   runValue();
    	   
       }
}
// ���� ��� >>  runValue, 1
// ���� ������ ���� ���� b�̱� ������ ���� a�� ����ִ� ���� �״���̴�. ���� b�� ���� ���� a�� ���� ������ ���̴�. 


// ����
class A {
	public int id;
	A(int id) {
		this.id= id;
			
	}
}

public class ReferenceDemo1 {
	
	public static void runValue () {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue," +a);
		
	}
	
	public static void runReference () {
		A a = new A(1);
		A b = a;
	
		b.id = 2;
		System.out.println("runReference," +a.id);
//		���� b�� ��� �ν��Ͻ��� id ���� 2�� �������� ���ε� a.id�� ���� 2�� �� ���̴�. 
//		�̰��� ���� b�� ���� a�� ��� �ν��Ͻ��� ���� ���ٴ� ���� �ǹ��ϴ�. 
	
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
		
	}
}
























































