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
		int dicklength, doclength;
		
		dictvalues=SpellChecker.readFile("Dictionary.txt");
		dick=SpellChecker.getWords(dictvalues);
		dicklength=SpellChecker.table_size;
		
		docvalues=SpellChecker.readFile("Dictionary.txt");
		doc=SpellChecker.getWords(docvalues);
		doclength=SpellChecker.table_size;
		
		//Fill table with values array
		for (int i = 0; i <dicklength; i++){//values.length; i++){
			ht.Insert(dick[i]);
		}
		System.out.println("The values in the hash table are:");
//		for (int k = 0; k < ht.NumEntries(); k++){
//			System.out.println("at " + ""  +ht.get(dick[k]));
//		}
		System.out.println("Dictionary compare check");
		for(int z=0; z<dicklength; z++){
			System.out.println("Hash Table contains "+dick[z] +" "+ht.Contains(dick[z]));
		}
		System.out.println(" ");
		System.out.println(dicklength);
		System.out.println(doclength);
		
		System.out.println("The values in the document are: ");
		for(int q=0; q<doclength; q++){
			System.out.println(doc[q]);
		}
		System.out.println("Document compare check");
		for(int z=0; z<doclength; z++){
			System.out.println("Hash Table contains "+doc[z] +" "+ht.Contains(doc[z]));
		}
//		
//		System.out.println("Dictionary compare check");
//		for(int w=0; w<doclength; w++){
//			System.out.println("Hash Table contains "+doc[w] +" "+ht.Contains(doc[w]));
//		}
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
