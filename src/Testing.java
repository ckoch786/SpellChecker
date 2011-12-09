import hash.HashTable;


/**
 * Just a test driver to test HashTable and HashEnry
 * 
 *
 */
public class Testing {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		
		int[] values = {43,55,89,100,54,23,12,21,44,67};
		int key;
		int value;
		//Fill table with values array
		for (int i = 0; i < values.length; i++){
	        key = values[i];
	        value = i;
			ht.Insert(key, value);
		}
		System.out.println("The values in the hash table are:");
		for (int k = 0; k < values.length; k++){
			System.out.println("at " +k + "  " +ht.get(values[k]));
		}
		System.out.println("The hash table contains 43:"+ht.Contains(6));


	}

	

}
