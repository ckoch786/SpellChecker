package spellChecker;

import java.io.FileNotFoundException;
import hash.HashTable;



/**
 * Just a test driver to test HashTable and HashEnry
 * 
 *
 */
public class Testing {
	public static void main(String[] args) throws FileNotFoundException {
	   
		HashTable ht = new HashTable();
		
		String[] values = {"are", "dog", "cow","cat", "lepard", "car", "house", "that", "Those", "my","tac" };
		String dictvalues, docvalues;
		String dick[];
		String doc[];
		int x, doclength;
		
//		dick = new String[2744];
		dictvalues=SpellChecker.readFile("Dictionary.txt");
		
		dick=SpellChecker.getWords(dictvalues);
		
		x=dick.length;
		
		docvalues=SpellChecker.readFile("MyDocument.txt");
		doc=SpellChecker.getWords(docvalues);
		doclength=doc.length;
		
		System.out.println(x);
		System.out.println(doclength);

		//Fill table with values array
		for (int i = 0; i <2749; i++){//values.length; i++){		//22222	dick.length-1
			ht.Insert(dick[i]);											//22222
		}
		System.out.println("The values in the hash table are:");
		for (int k = 0; k < ht.NumEntries(); k++){
			System.out.println("at " + ""  +ht.get(dick[k]));			//22222
		}
		for(int z=0; z<2749; z++){
			ht.Contains(doc[z]);
			System.out.println("Hash Table contains "+doc[z] +" "+ht.Contains(doc[z]));
		}
		String b = "beautiful";
		System.out.println("The hash table contains beautiful: " + ht.Contains(b));
		System.out.println("The hash table contains sat: " + ht.Contains("sat"));
		System.out.println("The hash table contains are: " + ht.Contains("are"));
		System.out.println("The number of entries in the hash table is: "+ht.NumEntries());
                
		//Two dimension array testing operations.
		System.out.println();
                System.out.println();
                System.out.println("2d Array test----------------------");

		//2 dimension array test
	        final int ROW_SIZE    = 5;
	        final int COLUMN_SIZE = 10;

                int [][]testArray = new int[ROW_SIZE][COLUMN_SIZE];
                
                //initialize 2d array
		for (int row = 0; row < testArray.length; row++) {
	           for(int column = 0; column < testArray[row].length; column++) {
		      testArray[row][0] = row;
		   }
		}		

                //Print out contents of 2d array
               	for (int row = 0; row < testArray.length; row++) {
	           for(int column = 0; column < testArray[row].length; column++) {
		      System.out.print(testArray[row][column]+ " ");
		   }
		   System.out.println();
		}		

	}

	

}
