//  while (�ݺ���)
//  while (����) {
//    �ݺ� ���� ����
//  }
//    >>>  Ctrl+C (dnls �� Cmd+.) ����Ű�� �̿��ؼ� ���� �ݺ��� ������ �� �ִ�.

public class java_while {

	public static void main(String[] args) {
		while (true) {                         // ���� �ݺ��� �߻���Ų��.  
			System.out.println("Coding Everybody");
		}

	}

}


//   true�� false�� �ٲ� �Ʒ��� ������ �����غ���. 
//   �ݺ������� false�̱� ������ �ݺ����� �� ���� ������� ���� ���̱� ������ �����Ϸ��� ������ �߻���Ű�� ���̴�.
public class java_while {
	
	public static void main(String[] args) {     
		while (false) {
			System.out.println("Coding Everybody");
		}
	}
	
}

//    �Ʒ��� �ݺ����� i�� ���� 1�� ���������� ������Ŵ���ν� �ݺ��� ���� ���θ� �����ϰ� �ִ�. 
//    ���� i�� ���������� �ݺ��� �������� ����ϴ� ������ ������. ���� �̸����� �ٸ� ���� ����ص� �����ϴ�. 
int i = 0;   //  �������� �ݺ��� ���̳Ŀ� ���� ���������� ����� ��.
// i�� ���� 10���� �۴ٸ� true, ũ�ٸ� false�� �ȴ�. ���� i�� ���� 0�̱� ������ �� �ݺ����� ����ȴ�.  
 while (i <10) {
	 System.out.println("Coding Everybody"+i);
// Coding Everybody�� i�� ���� ���Ѵ�. �ݺ����� �߰�ȣ�� ������ ���ο� �����ϸ� �ݺ����� �ݺ����� ��ȣ���Ѵ�.
	    i++;   // i=i+1;�� ����. �� ������ ���� ���� +i�� ���ԵǴ� ���̴�.
	}
	 

//     for��
//     for���� Ư���� Ƚ����ŭ �ݺ� ������ �ϴ� ��쿡 ���� ���ȴ�. 
//     for (�ʱ�ȭ; ��������; �ݺ�����) {
//          �ݺ������� ����� ����
//      }
//   >>  �ʱ�ȭ : �ݺ����� ����� �� 1ȸ ����ȴ�.
 
 public class ForDemo {
	 
	    public static void main(String[] args) {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Coding Everybody " + i);
	        }
	 
	    }
	 
	}
 
// coding everybody �ڿ� �ٴ� ���ڸ� 2�� ����ϰ� �ʹٸ� ��� �ؾ� �ұ�? 
int = 0;
 while (i < 10) {
	System.out.println("Coding Everybody"+(i+1)*2);
	i++;
}


//   break
//   �ݺ��۾��� �߰��� �ߴܽ�Ű�� �ʹٸ� ��� �ؾ� �ұ�?  break�� ����ϸ� �ȴ�. 
//   �������ǿ� ������ 10���� ��µž� �ϴµ� 5�ุ ��µǾ���. 
//   if(i == 5) �� ���ؼ� i�� ���� 5�� �� break ���� ����Ǹ鼭 �ݺ����� ������ ����� ���̴�. 
//   �ݺ��� �ȿ��� break�� ����Ǹ� �ݺ����� ��� �����Ų��. 
 public class BreakDemo {
	 
	    public static void main(String[] args) {
	        for (int i = 0; i < 10; i++) {
	            if (i == 5)
	                break;
	            System.out.println("Coding Everybody " + i);
	        }
	 
	    }
	 
	}


//    continue
//    ������ ��� �ߴ��ϸ鼭 �ݺ��� �����ذ��� �Ϸ��� ��� �ؾ� �ұ�?   
//    ���� 5�� ������ �ʴ´�. i�� ���� 5�� �Ǿ��� �� ������ �ߴܵƱ� �����̴�. 
//    continue ������ �� ����� ��Ÿ���� ������ ������ �������� �ʵ��� �Ѵ�. ������ �ݺ��� ��ü�� �ߴ��ϴ� ���� �ƴϰ� �ٽ� �ݺ����� ����ȴ�.
public class ContinueDemo {
	 
	    public static void main(String[] args) {
	        for (int i = 0; i < 10; i++) {
	            if (i == 5)
	                continue;
	            System.out.println("Coding Everybody " + i);
	        }
	 
	    }
	 
	}
 
 
 
 
 
 
 
 
 
 

