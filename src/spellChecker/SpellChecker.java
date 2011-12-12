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
	public static int        table_size;
	private final static int dictSize = 3000; 
	
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
	 * Reads a document into an array of single words 
	 * @param docName
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String[] getWordsFromFile(String docName) throws FileNotFoundException{
		return getWords( readFile(docName) );
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
		i = 0;
		//words = null;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
			table_size++;
		}
		return words;
	}
	/**
	 * Reads the text file docName into a single string of words
	 * @param docName
	 * @return Returns the result
	 * @throws FileNotFoundException
	 */
	public static String readFile(String docName) throws FileNotFoundException {
	   
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
