
public class and {

	public static void main(String[] args) {
		if (true && true) {       // &&(and)�� ���װ� ������ ���� ��� ���϶� ���� �ȴ�.
      	   System.out.println(1);  // ����� 1�̴�. and�� �¿����� ��� true�� ���� ù ��° ���ǹ� �ۿ� ���� �����̴�. 
      	   
		}

		if (true && false) {         // �� �߿� �ϳ��� true�� �ƴϸ� false�� �Ǳ� ������ ��µ��� ����
			System.out.println(2);
		
		}
		
		if (false && true) {
			System.out.println(3);   // ��µ��� ����
		
		}
		
		if (false && false) {
			System.out.println(4);   // ��µ��� ����
		
		}
		
	}

}

//   �� �����ڸ� �̿��� ��ʸ� ���캸��. 
//   "id�� ���� egoing�̰� password�� ���� 111111�̸� ���̴�"
//   ��, and �������� ���װ� ������ ��� ���� �� ��ü�� ���� �Ǵ� ���̴�.
public class LoginDemo3 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}


//   ||(or)�� �¿��� �߿� �ϳ��� true��� ��ü�� true�� �Ǵ� �� �����ڴ�. 
public class OrDemo {
	
	public static void main(String[] args) {
		if (true || true) {          // true�� �Ǿ� 1�� ��µȴ�.
			System.out.println(1);
		}
		if (true || false) {         // �� �߿� �ϳ��� true�� ���� ��ü�� true�� �Ǳ� ������ 2�� ��µ�.
			System.out.println(2);
		}
		if (false || true) {         // �̰͵� ����������.
			System.out.println(3);
		}
		if (false || false) {        // �Ѵ� false�̱� ������ 4�� ����� �ȵ�.
			System.out.println(4);
		}
		
      }
  }

//    ���� ������ id ������ egoing, k8805, sorialgi ���� �ϳ��� ����ϰ� 
//    ��й�ȣ�� 111111�� �Է��ϸ� right ���� ��쿡�� wrong�� ����ϴ� ����.
public class LoginDemo4 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
                && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}


//    !�� ������ �ǹ̷� not�̶�� �д´�.
//    Boolean�� ���� ������Ű�� ������ �Ѵ�.
//    true�� !�� ������ false�� �ǰ� false�� !�� ���̸� true�� �ȴ�. �Ʒ��� ����� 2��.
public class NotDemo {
	 
    public static void main(String[] args) {
        if (!true) {
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }
 
    }
 
}




