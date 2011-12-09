package hash;

/**
 * <p>
 * Implement a hash table to store strings (i.e. objects of the Java String class).
 * </p>
 * @author Cory Koch
 * @author Carl Bohman
 *
 */
public class HashTable {
    // size of dict = 2744	 dict * 2 = 5488
	private final static int TABLE_SIZE = 5488;
    HashEntry[] table;
    
	/**
	 * 
	 * Constructor for a hash table of size TABLE _SIZE.
	 */
   public HashTable() {
      table = new HashEntry[TABLE_SIZE];
	  for ( int i = 0; i < TABLE_SIZE; i++) {
	     table[i] = null;
	  }
}
	/**
	 * inserts S into the hash table.
	 * @param S 
	 * 
	 */
	public void Insert (String S){
		int i, key; 
		
		for(key = 0 , i = 0; i < S.length(); i++ ) {
			key += (int)S.charAt(i);
			System.out.println("The key for "+S + " is " +key);
		}
		int hash = (key % TABLE_SIZE);		 
	    while ( table[hash] != null && table[hash].getKey() != key)
		   hash = (hash + 1) % TABLE_SIZE;
	       table[hash] = new HashEntry(key, S);
	}
		

	/**
	 * 
	 * @param S
	 * @return true if S is in the table, false otherwise
 	 */
	public boolean Contains (String S){
        int i, key; 
		
		for(key = 0 , i = 0; i < S.length(); i++ ) {
			key += (int)S.charAt(i);
		}
		int hash = (key % TABLE_SIZE);	
		while (table[hash] != null && table[hash].getKey() != key)
	        hash = (hash + 1) % TABLE_SIZE;
		if ( table[hash] == null) return false;
		else if(table[hash].equals(S))    return true;
		else                              return false;
   }
	/**
	 * 
	 * @return - returns the number of strings stored in the table
	 */
	public int NumEntries ( ){
		return 0;
	} 
	
	
	//TODO remove
	   public String get(String S) {
		  int i, key; 
		  for(key = 0 , i = 0; i < S.length(); i++ ) {
              key += (int)S.charAt(i);
		  }
		  int hash = (key % TABLE_SIZE);		 
		   
	      while ( table[hash] != null && table[hash].getKey() != key)
		      hash = (hash + 1) % TABLE_SIZE;
	      if ( table[hash] == null) return null;
	      else return table[hash].getValue();
	   }
	
	/**
	 * For testing if an integer is prime:
	 * @param n
	 * @return
	 */
	public boolean isPrime(int n) {
    
       if (n%2==0) 	//check if n is a multiple of 2
          return false;
       else
          for(int i=3; i*i <= n; i+=2) {
             if(n%i == 0)
                return false;
       }
       return true;
}
	
	
}
