// !=  >> ������ �ǹ��Ѵ�. '����'�� ������ '���� �ʴ�'�̴�
// .equals()  >>  ���ڿ��� ���� �� ����ϴ� �޼ҵ��. ��, ���ڿ� ���ڸ� ���ϴ� ����̴�.
// ���ڿ� ���ڸ� ���� ���� '=='�� ������� �ʰ� .equals�� ����Ѵ�.

import java.util.*;
import java.lang.*;
import java.io.*;

public class java_if {

	
	public static void main(String[] args) {
		System.out.println(1==2);  //false
		System.out.println(1==1);  // true
		System.out.println("one"=="two");  //false
		System.out.println("one"=="one");  //true

		System.out.println(1!=2);   //true
		System.out.println(1!=1);   //false
		System.out.println("one"!="two");  //true
		System.out.println("one"!="one");  //false
		
//		String a = "Hello World";
//		String b = new String("Hello World");
//      System.out.println(a==b);
//		System.out.println(a.equals(b));
		
	}
}


//  if��
//       if(true) {
//	           System.out.println("result : true");  //  �������� 'result : true'��. if �ڿ� true�� �Ա� �����̴�.
//	    }


//      if (false) {
//             System.out.println("result : true");  //  �ƹ��͵� ������� ���� ���̴�. if���� false�̱� �����̴�.
//       } 


//	����� 12345�� ����� ���̴�.

	        if (true) {
	            System.out.println(1);
	            System.out.println(2);
	            System.out.println(3);
	            System.out.println(4);
	        }
	        System.out.println(5);
	        
	        
//   ����� 5�� ��µ� ���̴�.
	        
	        if(false){
	            System.out.println(1);
	            System.out.println(2);
	            System.out.println(3);
	            System.out.println(4);
	        }
	        System.out.println(5);
	    
	        
//   if-else���� if���� ���� true�� �� then���� ����ǰ�, false�� �� else���� ����ȴ�.    
	        
//	   	 ����� 1�̴�.
	        public class java_if {
	        	 
	            public static void main(String[] args) {
	                if (true) {
	                    System.out.println(1);
	                } else {
	                    System.out.println(2);  // ������� �ʴ´�.
	                }
	         
	            }
	         
	        }    
	 
//		   	 ����� 2�̴�.
	        if(false){
	            System.out.println(1);  // ������� �ʴ´�.
	        } else {
	            System.out.println(2);
	        }
	        

//  else if
//  if���� ���� true��� then���� ����ȴ�. false��� else if���� �Ѿ��.
//	else if���� ���� true��� else if then���� ����ȴ�. false��� else���� ����ȴ�.        
//	else if���� ���� ���� ������ ������ �� �ְ�, else�� ������ �����ϴ�.
//	else���� else if������ ���� ������ �� ����.
	        
//	    ����� 2��.    
	        public class java_if {
	        	 
	            public static void main(String[] args) {
	                if (false) {
	                    System.out.println(1);
	                } else if (true) {
	                    System.out.println(2);   // �����
	                } else if (true) {
	                    System.out.println(3);   // true�� ó������ ������ ������ ����ǰ� if�� else���� ������� �ʴ´�.
	                } else {
	                    System.out.println(4);
	                }
	         
	            }
	         
	        }
	
//	     ����� 3�̴�. 
	        if(false){
	            System.out.println(1);
	        } else if(false) {
	            System.out.println(2);
	        } else if(true) {
	            System.out.println(3);
	        } else {
	            System.out.println(4);
	        }
	        
//	      ����� 4�̴�.
	        if(false){
	            System.out.println(1);
	        } else if(false) {
	            System.out.println(2);
	        } else if(false) {
	            System.out.println(3);
	        } else {
	            System.out.println(4);
	        }
  
	        
//   	 ����ڰ� �Է��� ���̵� ���� üũ�ϴ� ���α׷��� ����� �� ���̴�. ID�� ������ egoing�� �Է�
public class java_Login {
	  public static void main(String[] args) {
	            	String id = args[0];   // �Է°��� ���´�.
	            	if(id.equals("egoing")) {    // id�� egoing�� ���� �ٸ��� false ������ true
	            	   System.out.println("right");
	            	}  else {
	            	     system.out.println("wrong");
	            	   }
	            	}
	            }
	
//       ���� �������� ���̵�� ��й�ȣ�� ��� �����ؾ� �Ѵٸ� ��� �ϸ� �ɱ�? 
//       ����ڰ� �Է��� ���� ���̵��� ���� ��ġ�ϴ����� Ȯ���� �Ŀ� ��ġ�Ѵٸ� ��й�ȣ�� ��ġ�ϴ��� Ȯ���� ���̴�. 
public class java_Login  {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];  
        if (id.equals("egoing")) {
            if (password.equals("111111")) {
                System.out.println("right");    // ����� true�� ��
            } else {
                System.out.println("wrong");    // ����� false�� ��
            }
 
        } else {
            System.out.println("wrong");   // id�� ���� false�̸� ���⼭ wrong�� ��µȴ�.
        }
    }
}


//  switch��
//  ���󵵴� ������ ������ ���ٸ� switch()���� ������ ���� ����ϰ� ������ �� �ִ�. 
//  ��, switch ���� ��ȣ�� ���ڷ� 1�� �־����� case 1�� �ش��ϴ� ���� ������ ��� case���� ����ȴ�.
public class java_Switch {
	 
    public static void main(String[] args) {
         
        System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
 
    }
//   ����� �Ʒ��� ����.
//   switch(1)
//   one
//   two
//   three
//   switch(2)
//   two
//   three
//   switch(3)
//   three

//     �ڵ带 �ٲ㺸��.
//     break�� ������ switch ���� ������ ��� �����ȴ�.
    public class SwitchDemo {
    	 
        public static void main(String[] args) {
             
            System.out.println("switch(1)");
            switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            }
             
            System.out.println("switch(2)");
            switch(2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            }
             
            System.out.println("switch(3)");
            switch(3){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            }
     
        }
     
    }
//    ����� ������ ����.
//    switch(1)
//    one
//    switch(2)
//    two
//    switch(3)
//    three
    
//    ���� �ڵ�� �Ʒ��� ���� if������ ���� �� �� �ִ�.
//    if���� switch���� ���� ��ü ������ �����.
    public static void main(String[] args) {
        
        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if(val == 2){
            System.out.println("two");
        } else if(val == 3){
            System.out.println("three");
        }
 
    }
 
}
    
//     default��
public class SwitchDemo {
	 
    public static void main(String[] args) {
         
        System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(4)");
        switch(4){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");   // switch(4)���� case4�� ���� ������ �� ���� default�� ��µȴ�. 
            break;
        }
 
    }
 
}
//  ���� �ڵ�� �� switch ���� default:�� �̲��� ������ �߰��ߴ�. �� ����� �Ʒ��� ����.
//  ���� �������� default�� ������. ��, �־��� ���̽��� ���� ��� default ���� ����ȴٴ� ���� �� �� �ִ�. 
//  switch(1)
//  one
//  switch(2)
//  two
//  switch(3)
//  three
//  switch(4)
//  default


