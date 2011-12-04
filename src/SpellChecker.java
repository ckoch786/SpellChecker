import java.io.File;
import java.util.Scanner;

import hash.HashTable;
import hash.Hashable;

/**
 * <p>
 * Uses a hash table to implement a simple spell checker. The spell 
 * checker loads a dictionary into a hash table, and then tests 
 * each word in a given document to see if it is contained in the dictionary.  
 * </p>
 * @author Cory Koch
 * @author Carl Bohman
 *
 */
public class SpellChecker implements Hashable{
	
	
	HashTable hashTable = new HashTable();
	/**
	 * 
	 * @param dictName
	 * @param docName
	 */
	public static void checkSpelling(String dictName, 
			                         String docName){
		
	}
	
	/**
	 * <p>
	 * Let N be the number of words in the dictionary.  
	 * Choose an array size that will have a load factor 
	 * just over 1/2.  That is, make the size of the array larger 
	 * than 2*N.  Choose a modulus that is prime, i.e. choose an 
	 * actual array size that is a prime number just over 2*N, and 
	 * have your program automatically choose this prime number.
	 * </p>
	 */
	
	public int hash(){
		hashTable.setHashValue(size * 2);
		if(hashTable.isPrime(hashTable.getHashValue() == true)
		//TODO
		//HashValue mod array size *2 Check if prime
		//if not generate prime 
		return 0;
	}
	
	//TODO
	//For reading a document into an array of single words, consider:
	public static String[] getWordsFromFile(String docName){
		return getWords( readFile(docName) );
		//TODO set size where size is of the array of 
		//words
	}

	public static String[] getWords(String str){
		return null;
	   // Breaks str into an array of words 
	   // Splits str on the basis of blanks 
	   // Returns an array of words
	}
	
	public static String readFile(String docName) {
	   // Reads the text file docName into a single string of words
	   File F = new File(docName);	
	   Scanner docFile = new Scanner(F);	
	   String result, line;

	   result = "";
	   while (docFile.hasNextLine()) {
	      line = docFile.nextLine();
	      result += line + "\n";
	   } 
	   return result;
	}
	
	//TODO
	//reads a dictionary into a hash table:
		File F = new File("Dictionary.txt");	
		Scanner dictFile = new Scanner(F);		
		String line;''
		while (dictFile.hasNextLine()) {
		   line = dictFile.nextLine();
		   // insert the words in line into the hash table 
		}

}
