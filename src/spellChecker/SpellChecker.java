package spellChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import hash.HashTable;

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
public class SpellChecker {
	public static int table_size;
	private final static int dictSize = 3000; //TODO add comment
	//ht shorter is simpler since we will be using it several times through out the program
	HashTable ht = new HashTable();
	/**
	 * 
	 * @param dictName
	 * @param docName
	 */
	public void checkSpelling(String dictName, 
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
	
	
	//TODO
	//For reading a document into an array of single words, consider:
	public static String[] getWordsFromFile(String docName) throws FileNotFoundException{
		return getWords( readFile(docName) );
		//TODO set size where size is of the array of 
		//words
	}
	/**
 	* <p>
 	* Breaks the string into an array of words
 	* determined by blank spaces and returns
 	* the array.  
 	* <p>
 	* @param str
 	* @return words
 	*/
	public static String[] getWords(String str){
		StringTokenizer st = new StringTokenizer(str);
		String[] words;
		int i;
		
		table_size = 0;
		words      = new String[dictSize];
		i=0;
		//words = null;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
			table_size++;
		}
		return words;
	}
	
	public static String readFile(String docName) throws FileNotFoundException {
	   // Reads the text file docName into a single string of words
	   File F = new File(docName);	
	   Scanner docFile = new Scanner(F);	
	   String result, line;

	   result = "";
	   while (docFile.hasNextLine()) {
	      line = docFile.nextLine();
	      result += line + " ";
	   } 
	   return result;
	}
}
