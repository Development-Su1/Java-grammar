// ����� enum
// ����� ������ �ʴ� ���̴�. �Ʒ����� ������ �����̰� ������ ����̴�.
// int x = 1;

// ����� �̷� Ư���� �̿��ؼ� �Ʒ��� ���� ������ �ۼ��� �� �ִ�.
public class ConstantDemo {
	public static void main(String[] args) {
	/*
     * 1. ���
     * 2. ������
     * 3. �ٳ���
     */
	int type = 1;   //  1�̴�.(1�� ����)
	switch (type) {    // ���� type�� 1�̱� ������ switch(type)���� case1�� ����ȴ�.
	case 1:
		System.out.println(57);
	    break;
	    
	case 2:
		System.out.println(34);
		break;
		
	case 3:
		System.out.println(93);
		break;
     	}		
	}
}
// ���� ���� �������� ���� 1�� �ش��ϴ� ������ ������ ������� �Ѵ�. �׷��Ƿ� ������ �ʴ� ���� ������� ���� �� ���� �ش��ϴ� ������ �ǹ̸� �����ϰ� �ִ�
// �ν��Ͻ��� ����� switch���� ���ǰ����� ���� �� ����.


// �׷��� �ּ����� ����� �ǹ̸� �����ϰ� ������ �ּ��� �������ų�, �ּ��� ����� ����ϴ� �ڵ�� �־����ٸ� 
// �� ���ڿ� �ش��ϴ� ������ ������ ��Ÿ������ �˾ƺ���� ��ưų� �Ұ������� �� �ִ�.
// �̷� ���� �̸��� �ִٸ� �� ���� ���̴�. ������ ����� �� �� �ִ�. 
// ������ �����ϰ� �� ������ final�� ó���ϸ� �ѹ� ������ ������ ���� �� �̻� �ٲ��� �ʴ´�. 
// ���� �ٲ��� �ʴ� ���̶�� �ν��Ͻ� ������ �ƴ϶� Ŭ���� ����(static)�� �����ϴ� ���� �� ���� ���̴�.
// private: �ڱ� �ڽ��� Ŭ���� �������� ������ ����
public class ConstantDemo {
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;

	public static void main(String[] args) {
		
		int type = APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57 + "kcal");	
		    break;
		    
		case PEACH:
			System.out.println(34 + "kcal");	
		    break;
		    
		case BANANA:
			System.out.println(93 + "kcal");	
		    break;
		}
	}	
}

// ���α׷��� Ŀ���鼭 ������ ����� ���� ����� �ʿ�������.
public class ConstantDemo {
	
	// fruit
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	// company
	private final static int GOOGLE = 1;
//  private final static int APPLE = 2;	 // ���� APPLE�� ��� APPLE�� ���� ���� �̸��� ������. �̷��� �Ǹ� APPLE ���� 2���� 1�� �ٲ��.
	private final static int ORACLE = 3;
	
	public static void main(String[] args) {
		
		int type = 1;
		switch(type) {
		case APPLE:
		   System.out.println(57 + "kcal");	
		   break;	
		    
		case PEACH:
			System.out.println(34 + "kcal");	
		    break;
				    
		case BANANA:
			System.out.println(93 + "kcal");	
		    break;  
		    
		}	
	}
}
// ���� APPLE�� ��� APPLE�� ���� ���� �̸��� ������. �̷��� �Ǹ� APPLE ���� 2���� 1�� �ٲ��.
// ������ ���� final�� �����߱� ������ �������� ���� �ʰ� �̸��� �ߺ��Ǵ� ������ ������ �� �ִ�.

// �׷��� ����� ���� ����� �ۼ��߰� �̰��� �̹� �پ��� �������� ���ǰ� �ִ� ���¿��� APPLE�� �߰��Ϸ��� ���а� �ɰ��̴�.
// �̷��� ������ �ذ��ϱ� ���� ���λ縦 �ٿ� �ڵ带 �ۼ��Ͽ���.
public class ConstantDemo {
	
	// fruit
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	// company
	private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;	 
	private final static int COMPANY_ORACLE = 3;
	
	public static void main(String[] args) {
		
		int type = FRUIT_APPLE;
		switch(type) {
		case FRUIT_APPLE:
		   System.out.println(57 + "kcal");	
		   break;	
		    
		case FRUIT_PEACH:
			System.out.println(34 + "kcal");	
		    break;
				    
		case FRUIT_BANANA:
			System.out.println(93 + "kcal");	
		    break;  
		    
		}	
	}
}


// ���ӽ����̽�
// �̰��� �ߺ��� Ȯ���� ���� �� �ִ�.
// �׷��� ����� �ʹ� �������ϴ�. �̰��� ����ϰ� �ٲ� �� �ִµ� �̶����� �������̽��� ����ϸ� �ȴ�.
interface FRUIT {
	int APPLE=1, PEACH=2, BANANA=3;
}

interface COMPANY {
	int COOGLE=1, APPLE=2, ORACLE=3;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		
		int type = FRUIT.APPLE;
		switch(type) {
		case FRUIT.APPLE:
			System.out.println(57 + "kcal");	
			   break;	
		
		case FEUIT.PEACH:
			System.out.println(34 + "kcal");	
			   break;	
			   
		case FRUIT.BANANA:
			System.out.println(93 + "kcal");	
			   break;	
		}	
	}
}
// ���̻�(FRUIT_, COMPANY_)�� �̸��� �����ߴ� �κ��� �������̽��� ���еǱ� ������ ����� Ư���� ���� �� �츰 ������ �Ǿ���. 
// �������̽��� �̷��� ����� �� �ִ� ���� �������̽����� ����� ������ ������ public static final�� �Ӽ��� ���� �����̴�.


// �츮 �ڵ�� ���ϰ� ����̶�� �� ���� ��� �׷��� �����Ѵ�. 
// ���� �ٸ� ����׷��� �񱳸� �õ��߰� ���� ��� ���� ���� 1�̱� ������ ������ ������ ã������ ���ϰ� �ִ�. 
// �����Ϸ��� �̷� �Ǽ��� ������ ã���� �� �ְ� �Ϸ��� ��� �ؾ� �ұ�?
class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}
class company {
	public static final company COOGLE = new company();
	public static final company APPLE = new company();
	public static final company ORACLE = new company();
}

public class ConstantDemo {
	public static void main(String[] args) {
		
		if(Fruit.APPLE == company.APPLE) {   // ���� �߻�
			System.out.println("���� ���ð� ȸ�� ������ ����.");	
				
		}	
	}
}
// Fruit�� Company Ŭ������ ����� Ŭ���� ������ �ش� Ŭ������ �ν��Ͻ��� ����ϰ� �ִ�. 
// ������ ������ final�̱� ������ �Һ��̰�, Static�̹Ƿ� �ν��Ͻ��� ������ �ʾƵ� �ȴ�.
// ����� 17�࿡�� ������ �߻��Ѵ�. �̰��� �츮�� �ٶ�� ���̴�. ���� �ٸ� ī�װ��� ����� ���ؼ��� ������ �����ϰ� �� ���̴�. 
// ������ ������ ������ �ÿ� ��Ÿ������ �ϴ� ���� �ٶ����ϴ�. ���� �߿� �߻��ϴ� ������ ã�Ƴ��Ⱑ ���� ��ƴ�.
// ���� �ڵ�� �� ���� �������� �ִµ� �ϳ��� switch ������ ����� �� ���� �� �ϳ��� ������ �ʹ� �����ϴٴ� ���̴�. �̰��� �ذ��� ����� enum�̴�.


// enum
// enum�� �����ڰ� ���� ������ private���� ����ϱ� �����̴�.
// enum�� ������(enumerated type)�̶�� �θ���. �������� ���� ������ ������� �����̶�� �� �� �ִ�. 
// ���� ���������� Fruit�� Company�� �����ڸ� ������ ���̴�. ���� �ڵ带 enum���� �ٲ㺸��.
enum fruit {
	APPLE, PEACH, BANANA;		
}

enum Company {      // enum�� class, interface�� ������ ������ ������ ������. ������ enum�� ��ǻ� class�̴�. 
	COOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
//		if(Fruit.APPLE == Company.APPLE){    >> ������ ������ �߻��� ���̴�. �ؿ� �κ�����
//            System.out.println("���� ���ð� ȸ�� ������ ����.");
//	    }  	
//  enum�� ���� �ٸ� ��� �׷쿡 ���� �񱳸� ������ �������� ������ �� �ִٴ� ���� �ǹ��Ѵ�.	
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:    // APPLE�� ���̺��̶�� ��.
			System.out.println(57 + "kcal");
			break;
			
		case PEACH:   //
			System.out.println(34 + "kcal");
	        break;
	        
		case BANANA:   //
			System.out.println(93 + "kcal");
			break;
		}	
	}
}

//   enum fruit {
//      APPLE, PEACH, BANANA;		
//   }

//  ���� �ڵ�� �Ʒ��� �ڵ�� ����.

//    class Fruit{
//    public static final Fruit APPLE  = new Fruit();
//    public static final Fruit PEACH  = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//    private Fruit(){}
//    }
// �������� ���� �����ڰ� private�̴�. �װ��� Ŭ���� Fruit�� �ν��Ͻ��� ���� �� ���ٴ� ���� �ǹ��Ѵ�. �ٸ� �뵵�� ����ϴ� ���� �����ϰ� �ִ� ���̴�.


// enum�� ��� Ŭ������. �׷��� ������ �����ڸ� ���� �� �ִ�.
enum Fruit {
	APPLE, PEACH, BANANA;   // ��� ����
	Fruit() {    // ������ 
		System.out.println("Call Constructor "+this);
	}
}

enum Company {      
	COOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
		
//		if(Fruit.APPLE == Company.APPLE){
//            System.out.println("���� ���ð� ȸ�� ������ ����.");
//        }
	
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57 + "kcal");
			break;
			
		case PEACH:
			System.out.println(34 + "kcal");
			break;
		
		case BANANA:
			System.out.println(93 + "kcal");
			break;
			
		}	
	}
}
// ������
//  Call Constructor APPLE
//  Call Constructor PEACH
//  Call Constructor BANANA
//  57kcal
// >> Call Constructor�� ��µ� ���� ������ Fruit�� ȣ��Ǿ����� �ǹ��Ѵ�. 
//    �̰��� 3�� ȣ��Ǿ��ٴ� ���� �ʵ��� ���ڸ�ŭ ȣ��Ǿ��ٴ� ���̴�. �� enum�� �����ڸ� ���� �� �ִ�.


// �������� �Ű������� ���ؼ� �ʵ�(APPLE..)�� �ν��Ͻ� ���� ���� �ο��� �� �ִ�. 
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow"); //  Fruit�� ����� �����ϸ鼭 ���ÿ� �����ڸ� ȣ���ϰ� �ִ�.
	
//	�Ʒ� �ڵ�� �����ڴ�. �������� �Ű������� ���޵� ���� this.color�� ���ؼ� 301���� �ν��Ͻ� ������ ������ �Ҵ�ȴ�.
	public String color;   // ��������
	Fruit(Stirng color) {    // �Ű�����(= ��������)
		System.out.println("Call Construtor" +this);
		this.color = color;   // this�� �ִ� ���� ���������� �ǹ��ϰ�, ���� ���� �Ű����� �� ���������� �ǹ��Ѵ�.
	}
}

enum Company {
	COOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void mian(Stirng[] args) {
		
//		if(Fruit.APPLE == Company.APPLE){
//            System.out.println("���� ���ð� ȸ�� ������ ����.");
//        }
		
	Fruit type = Fruit.APPLE;
	switch(type) {
	case APPLE:
		System.out.println(57 + "kcal,"+Fruit.APPLE.color);  // APPLE�� �Ҵ�� Fruit �ν��Ͻ��� color �ʵ带 ��ȯ�ϰ� �ȴ�.
		break;
		
	case PEACH:
		System.out.println(34 + "kcal"+Fruit.PEACH.color);
		break;
	
	case BANANA:
		System.out.println(93 + "kcal"+Fruit.BANANA.color);
		break;
	}	
  }
}


// �������� �޼ҵ带 �������� �ִ�. �Ʒ� �ڵ�� ���� ������ ������ ����� ����Ѵ�.
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
	Fruit(String color) {
		System.out.println("Call Construtor" +this);
		this.color = color;

	}
	
	String getcolor() {
		return this.color;
		
	}
}

enum Company {
	COOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void main(String[] args) {
	    Fruit type = Fruit.APPLE;
	    switch(type) {
	    case APPLE:
	    	System.out.println(57 + "kcal,"+Fruit.APPLE.getcolor());  
			break;
	    
	    case PEACH:
	    	System.out.println(34 + "kcal"+Fruit.PEACH.getcolor());  
			break;
	    
	    case BANANA:	
			System.out.println(93 + "kcal"+Fruit.BANANA.getcolor());  
			break;	
			
	    }		
	}
}


// enum�� �ɹ� ��ü�� ���� �� �� �ִ� ��ɵ� �����Ѵ�.
// �������� ������ ������ �����Ѵ�. �� �� ������ ������� �ʵ��� �����Ѵ�. 
// �Ӹ� �ƴ϶� ������ ��ü�� Ŭ�����̱� ������ ������ ���ο� ������, �ʵ�, �޼ҵ带 ���� �� �ִ�.
enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow")
	
	private String color;
	Fruit(String color) {
		System.out.println("Call Constructor "+this);
        this.color = color;
		
	}
	
	String getcolor() {
		return this.color;
			
	}
}

enum Company {
	COOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	
	public static void main(Stirng[] args) {
		for(Fruit f : Fruit.valuse()) {    // valuse()�� ȣ��Ǹ鼭 Fruit�� ������ �ִ� �����͵��� f�� ���� ��.
//			:�ڿ��� ��� ������ ���� ���̰� �տ��� �� ������ ������ �ҼӵǾ� �ִ� ���� �ϳ��ϳ� ������ ����(f)�� ����ִ� ���̴�.
			
			System.out.println(f+ " , " +f.getcolor());
			
		}
	}
}
//    .valuse()��� �޼ҵ�
// >> �������� ��� �����Ͱ� �ִ��� ���� ��ġ �迭ó�� �� �ȿ� ����ִ� �������� ���� �ִ� �����͸� �ϳ��� ������ ó���� �� �ִ� ���










 






















