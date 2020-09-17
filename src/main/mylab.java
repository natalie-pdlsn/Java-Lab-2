package main;

public class mylab {

	public static void main(String[] args) {
		 
		    String word = "Короxк";
	        
		    // перетворює всі символи рядка з великих букв в маленькі
		    word = word.toLowerCase(); 
		    
		    //Всі знаки та пробіл 
	        word = word.replace(" ", "");
	        word = word.replace(".", "");
	        word = word.replace(",", "");
	        word = word.replace("!", "");
	        word = word.replace(":", "");
	        word = word.replace(";", "");
	        word = word.replace("`", ""); 

	        //Алгоритм 1: побуквенно порівнюємо початок і кінець

	        boolean flag = true; 

	        /*Створюємо цикл: i = 0. 
	        /*Цикл проходиться від 0(і) до довжини слова
	        /*Якщо результат є істинним, то виконується оператор і++. 
	        /*Процес повторюється до тих пір, поки [і] не буде більше довжини слова.
			*/
	        
	        for (int i = 0; i < word.length(); i++) { 
	        	if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
	                /* Вводимо умову: Якщо символ, розташований за індексом [і] не дорівнює 
	        		/*символу, розташованому за індексом (довжина слова -1 -і), 
	        		/*то змінна flag брехня
	        		/*Тобто ми перевіряєм перший та останній символ та зсуваємось
	        		/*до центру.
	        	    */
	        		flag = false;
				    break; 
		        }
	        }
	        
	        //Вводимо умову: Якщо змінна flag = true, то виводимо, що інформацію, 
	        //що рядок є паліндромом, інакше - не є паліндромом
	        if (flag == true) {
	            System.out.println("Algorithm 1. It is a Palindrome");
	        } else {
	            System.out.println("Algorithm 1. It is not a Palindrome");
	        } 

	        //Aлгоритм №2: створюємо нове слово (те саме, але перевернуто)

	        //Створює нову порожню строку
	        String backward = ""; 
	        
	        // Створюємо цикл як і в 1 алгоритмі. У порожню строку записується символ, 
	        //розташований за індексом ([довжина слова]-1-і)
	        for (int i = 0; i < word.length(); i++){
	            backward += word.charAt(word.length() - 1 - i);
	        } 
	        
	        //Виводимо рядки початкового і зворотнього слова
	        System.out.println(word);
	        System.out.println(backward); 

	        //Умова: якщо рядок word такий самий як рядок backward, 
	        //то виводимо, що рядок є паліндромом, інакше - не є
	        if(word.equals(backward)) {
	            System.out.println("Algorithm 2. It is a Palindrome");
	        } else {
	            System.out.println("Algorithm 2. It is not a palindrome");
	        } 
	    }
	}
