import hash.HashTable;


/**
 * Just a test driver to test HashTable and HashEnry
 * 
 *
 */
public class Testing {
	public static void main(String[] args) {
	   
		HashTable ht = new HashTable();
		
		String[] values = {"are", "dog", "cow","cat", "lepard", "car", "house", "that", "Those", "my","tac" };
	
		//Fill table with values array
		for (int i = 0; i < values.length; i++){
			ht.Insert(values[i]);
		}
		System.out.println("The values in the hash table are:");
		for (int k = 0; k < ht.NumEntries(); k++){
			System.out.println("at " + ""  +ht.get(values[k]));
		}
		System.out.println("The hash table contains Bob: " + ht.Contains("Bob"));
		System.out.println("The hash table contains cat: " + ht.Contains("cat"));
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
