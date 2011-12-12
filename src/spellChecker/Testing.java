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
		int dictLength, doclength;
		
		//Read in Dictionary into array
		dictvalues = SpellChecker.readFile("Dictionary.txt");
		dick       = SpellChecker.getWords(dictvalues);
		dictLength = SpellChecker.table_size;
		
		//Read in Document into array
		docvalues = SpellChecker.readFile("MyDocument.txt");
		doc       = SpellChecker.getWords(docvalues);
		doclength = SpellChecker.table_size;
		
		//Fill hash table with contents of dict array
		for (int i = 0; i < 2749; i++){//values.length; i++){		
			ht.Insert(dick[i]);											
		}
		//Print out values in the hash table for dict array as a test
		System.out.println("The values in the hash table are:");
		for (int k = 0; k < ht.NumEntries(); k++){
			System.out.println("at " + ""  +ht.get(dick[k]));			
		}
		//Test that the hashtable's Contains function is working
		for(int z=0; z < dictLength; z++){
			System.out.println("Hash Table contains "+dick[z] +" "+ht.Contains(dick[z]));
		}
		//Test that the lengths of dict and doc are correct
		System.out.println(" ");
		System.out.println(dictLength);
		System.out.println(doclength);

        //Check to see if the values stored in the doc array are in the hash table
		for(int z = 0; z < doclength; z++){
			System.out.println("Hash Table contains "+doc[z] +" "+ht.Contains(doc[z]));
		
		}
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
