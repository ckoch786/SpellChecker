import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
	
	/**
	 * 
	 * @param dictName
	 * @param docName
	 */
	public static void checkSpelling(String dictName, 
			                         String docName){
		
	}
	
	/**
	 * 
	 */
	public int hash(){
		return 0;
	}
	
	//TODO
	//For reading a document into an array of single words, consider:
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
		
		words = null;
		i=0;
		while(st.hasMoreTokens()){
			words[i]=st.nextToken();
			i++;
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
	      result += line + "\n";
	   } 
	   return result;
	}
	
	//TODO
	//reads a dictionary into a hash table:
	public static void dictread() throws FileNotFoundException{
		File F = new File("Dictionary.txt");	
		Scanner dictFile = new Scanner(F);
		String line;
		
		while (dictFile.hasNextLine()) {
		   line = dictFile.nextLine();
		   
		   HashTable.Insert(line);
		   // insert the words in line into the hash table 
		}
	}
}
