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
	
	private final static int TABLE_SIZE = 128;
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
	public static void Insert (String S){
		int location, hashVal;
		
		
		
		
		if(Contains(S)){
			hashVal=getHashValue(S);
			location=hashVal.hash();
			for(int i=0; i<10; i++){
				if(hashTable[location][i]==0){
					hashTable[location][i]=hashVal;
					break;
				}else 
					System.out.println("Too many collisions");
			}
		}
		//TODO Fix how to correctly get the location from
		//	   Insert and Contains
		
	} 
	/**
	 * 
	 * @param S
	 * @return true if S is in the table, false otherwise
 	 */
	public static boolean Contains (String S){
		int location, hashVal;
		
		hashVal=getHashValue(S);
		location=hashVal.hash();
		for(int i=0; i<10; i++){
			if(hashTable[location][i]==(hashVal)){
				return true;
			}
		}
		
		return false;
	}
	/**
	 * 
	 * @return - returns the number of strings stored in the table
	 */
	public int NumEntries ( ){
		return 0;
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
	
	public void setHashValue(int i) {
		this.hashValue = i;
	}
	public static int getHashValue(String S){
		return hashValue;
	}
}
