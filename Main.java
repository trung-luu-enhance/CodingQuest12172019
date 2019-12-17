import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    for (int i = 0; i < 16; ++i)
	        fizzBuzz(i);
	}
	
	public static void findDuplicates(List<String> strings){
	    HashSet<String> hash = new HashSet<String>();
	    
	    for (int i = 0; i < strings.size(); ++i) {
	        if (hash.contains(strings.get(i)))
	            System.out.println(strings.get(i));
	        else
	            hash.add(strings.get(i));
	    }
	}
	
	public static boolean checkPalindrome(String word){
	    int size = word.length() - 1;
	    for (int i = 0; i < size/2; ++i){
	        if (word.charAt(i) != word.charAt(size - i))
	            return false;
	    }
	    
	    return true;
	}
	
	public static void fizzBuzz(int target) {
	    if (target%15==0)
	        System.out.println("fizzbuzz");
        else if (target%3==0)
            System.out.println("fizz");
        else if (target%5==0)
            System.out.println("buzz");
	}
}
