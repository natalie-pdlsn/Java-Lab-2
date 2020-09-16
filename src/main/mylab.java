package main;

public class mylab {

	public static void main(String[] args) {
		 
			String word = "��� ����� ���� �������� �����";
	        
			// ���������� �� ������� ����� � ������� ���� � �������
		 	word = word.toLowerCase(); 
	        
		 	//�� ����� �� ����� 
		 	word = word.replaceAll( " ", "");
	        word = word.replaceAll( ".", "");
	        word = word.replaceAll( ",", "");
	        word = word.replaceAll( "!", "");
	        word = word.replaceAll( ":", "");
	        word = word.replaceAll( ";", "");
	        word = word.replaceAll( "`", ""); 

	        
	        //�������� 1: ���������� ��������� ������� � �����

	        boolean flag = false; 

	        /*��������� ����: i = 0. 
	        /*���� ����������� �� 0(�) �� ������� �����
	        /*���� ��������� � ��������, �� ���������� �������� �++. 
	        /*������ ������������ �� ��� ��, ���� [�] �� ���� ����� ������� �����.
			*/
	        
	        for (int i = 0; i < word.length(); i++) { 
	        	if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
	                /* ������� �����: ���� ������, ������������ �� �������� [�] ������� 
	        		/*�������, ������������� �� �������� (������� ����� -1 -�), 
	        		/*�� ����� flag �������
	        		/*����� �� ��������� ������ �� ������� ������ �� ���������
	        		/*�� ������.
	        	    */
	        		flag = true; 
	            } }
	        
	        //������� �����: ���� ����� flag = true, �� ��������, �� ����������, 
	        //�� ����� � ����������, ������ - �� � ����������
	        if (flag == true) {
	            System.out.println("Algorithm 1. It is a Palindrome");
	        } else {
	            System.out.println("Algorithm 1. It is not a Palindrome");
	        } 

	        //A������� �2: ��������� ���� ����� (�� ����, ��� �����������)

	        //������� ���� ������� ������
	        String backward = ""; 
	        
	        // ��������� ���� �� � � 1 ��������. � ������� ������ ���������� ������, 
	        //������������ �� �������� ([������� �����]-1-�)
	        for (int i = 0; i < word.length(); i++){
	            backward += word.charAt(word.length() - 1 - i);
	        } 
	        
	        //�������� ����� ����������� � ����������� �����
	        System.out.println(word);
	        System.out.println(backward); 

	        //�����: ���� ����� word ����� ����� �� ����� backward, 
	        //�� ��������, �� ����� � ����������, ������ - �� �
	        if(word.equals(backward)) {
	            System.out.println("Algorithm 2. It is a Palindrome");
	        } else {
	            System.out.println("Algorithm 2. It is not a palindrome");
	        } 
	    }
	}