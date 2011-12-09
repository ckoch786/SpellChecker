import hash.HashTable;


/**
 * Just a test driver to test HashTable and HashEnry
 * 
 *
 */
public class Testing {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		
		String[] values = {"cat", "dog", "cow", "lepard"};
	
		//Fill table with values array
		for (int i = 0; i < values.length; i++){
			ht.Insert(values[i]);
		}
		System.out.println("The values in the hash table are:");
		for (int k = 0; k < values.length; k++){
			System.out.println("at " +k + "  " +ht.get(values[k]));
		}
		System.out.println("The hash table contains cat:"+ht.Contains("cat"));


	}

	

}
