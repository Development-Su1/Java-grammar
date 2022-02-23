// ����ó��
// �Ʒ��� �ڵ带 ���� ������ �迭�� ������ ����� �Է��ߴٴ� ���� �� �� ������, ��ǻ�ʹ� �����ϱ� ������ ������ �ִٴ� ���� �� �� �����ϴ�.
public class trycatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] num = new int[4];
        
        System.out.println("num �迭�� �ִ� ���̴� 4�Դϴ�.");
		
        num[5] = 0;
        System.out.println("num[5]�� ���� �Է��߽��ϴ�.");
       	
	}
}
// �� �ڵ�� ���������� ������ �� num[5]���� ����Ǵٰ� num[5]���� �迭�� ����ٴ� ������ ������ �� ArrayIndexOutOfBoundsException ������ ��ȯ�մϴ�.

// ���� ���� ��Ȳ�� ����ϱ� ���� �ڹٴ� ����ó������ try catch���� �����մϴ�.
// try >> try�� �ȿ� �ִ� �ڵ���� ������ �߻��ϴ� ��� catch������ �����մϴ�.
// catch >> try������ �߻��� ����ó���� �����մϴ�. (catch������ ��� ����ó���� �� �� �ִ°��� �ƴմϴ�.)


// try catch��
// �� ���� �ִ� �ڵ带 try catch������ ����ó���� �ڵ�
public class trycatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	 int [] num = new int[4];  
         
         System.out.println("num �迭�� �ִ� ���̴� 4�Դϴ�.");
      
         num[5] = 0;
         System.out.println("num[5]�� ���� �Է��߽��ϴ�.");
     
      } catch (ArrayIndexOutOfBoundsException e) {
    	  System.out.println("�迭 ���̰� ���� �ʽ��ϴ�.");
      }
       	
	}
}
// try�� ���� num[5]���� ArrayIndexOutOfBoundsException ������ �߻��߰� catch������ ����ó���� �����Ͽ���.


// finally����
// finally������ ����ó���� �߻����θ� ������ ������ ����ǵ��� �ϴ� ����
public class trycatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	 int [] num = new int[4];  
         
         System.out.println("num �迭�� �ִ� ���̴� 4�Դϴ�.");
      
         num[5] = 0;
         System.out.println("num[5]�� ���� �Է��߽��ϴ�.");
      
      } catch (ArrayIndexOutOfBoundsException e) {
    	  System.out.println("�迭 ���̰� ���� �ʽ��ϴ�.");
      
      } finally {
    	  System.out.println("�迭�� �ٽ� �����մϴ�.");
    	  int [] num = new int[6];
    	  
    	  num[5] = 0;
    	  System.out.println(num[5]);
      }
       
       System.out.println("�迭 ���α׷��� �����մϴ�.");
	}
}







