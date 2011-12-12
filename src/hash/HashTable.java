package hash;

/**
 * <p>
 * Implement a hash table to store strings (i.e. objects of the Java String class).
 * This implementation uses closed hashing to group hash table slots into buckets. 
 * The hash table is viewed as an array of M slots divided into B buckets, with 
 * each bucket consisting of M/B slots. The hash function then assigns each record 
 * to the first slot within one of the buckets. If this slot is already occupied, 
 * then the record is moved downwards within the bucket until an open slot is found. 
 * </p>
 * <p>
 * When searching for a record, the first step is to hash the key to determine
 * which bucket should contain the record. The records in this bucket are then 
 * searched.  If the desired key value is not found and the bucket still has 
 * free slots, then the search is complete.
 * 
 * Note: Since the bucket method is best suited when the values for the hash table
 * are known the default constructor has values that we have found are 
 * optimal for this implementation, through the testing we have undertaken for this
 * data set.
 * 
 * </p>
 * @author Cory Koch
 * @author Carl Bohman
 *
 */
public class HashTable {
   // size of dict = 2744	 dict * 2 = 5488
   private final static int TABLE_SIZE  = 5488;	//Rows in 2d array
   private final static int BUCKET_SIZE = 9;   // columns in 2d array
   protected int numEntries;
   HashEntry[][] table;
		    
   /**
   * 
   * Constructor for a hash table of two dimensions of size
   * default TABLE _SIZE = rows and BUCKET_SIZE = columns.
   */
   public HashTable() {
      table = new HashEntry[TABLE_SIZE][BUCKET_SIZE];
      for ( int row = 0; row < table.length; row++) {
         for (int column = 0; column < table[row].length; column++) { 
            table[row][column] = null;
	     }
      }
   }
   /**
    * Constructor for a hash table of two dimensions of size
    * table_siza = rows and BUCKET_SIZE = columns.
    * @param table_size
    */
   public HashTable(int table_size) {
	      if (isPrime(table_size) == true){
	    	  table = new HashEntry[(table_size*2)+1][BUCKET_SIZE];
	      }
	      else table = new HashEntry[(table_size*2)+3][BUCKET_SIZE];
	      for ( int row = 0; row < table.length; row++) {
	         for (int column = 0; column < table[row].length; column++) { 
	            table[row][column] = null;
		     }
	      }
	   }
   /**
   * inserts S into the hash table.
   * @param S 
   * 
   */
   public void Insert (String S){
      int i, key, bucket;
      int power;
      bucket = 0; 
      power  = 0;
      for(key = 0 , i = 0; i < S.length(); i++ ) {
    	 if(power < 3)power++;
    	 else power = 0;
         key += Math.pow(32, power)*(int)S.charAt(i);
      }
      int hash = (key % TABLE_SIZE);		 
      while (table[hash][bucket] != null           && 
	        table[hash][bucket].getValue() != S ) {
         bucket++; 
      }
      table[hash][bucket] = new HashEntry(key, S);
      numEntries++;
   }
		
   /**
   * 
   * @param S
   * @return true if S is in the table, false otherwise
   */
   public boolean Contains (String S){
      int i, key, bucket;
      int power;
      power  = 0;
      bucket = 0; 
		
      for(key = 0 , i = 0; i < S.length(); i++ ) {
    	  if(power < 3)power++;
     	  else power = 0;
          key += Math.pow(32, power)*(int)S.charAt(i);
      }
      int hash = (key % TABLE_SIZE);	
      while (table[hash][bucket] != null             && 
	      ! table[hash][bucket].getValue().equals(S) &&
	       bucket != 7) {
         bucket++;
      }	 
      if ( table[hash][bucket] == null ) return false;
      else                              return true;
   }
   /**
   * 
   * @return - returns the number of strings stored in the table
   */
   public int NumEntries() { return numEntries; } 
   
   /**
    * 
    * @param S
    * @return Returns the value if found else returns false
    */
   public String get(String S) {
      int i, key, bucket;
      int power;
      power  = 0;
      bucket = 0;

      for(key = 0 , i = 0; i < S.length(); i++ ) {
    	  if(power < 3)power++;
     	  else power = 0;
          key += Math.pow(32, power)*(int)S.charAt(i);
      }
      int hash = (key % TABLE_SIZE);		 
      while (table[hash][bucket] != null           && 
	       table[hash][bucket].getValue() != S){
         bucket++;                 
      }
      if ( table[hash][bucket] == null) return null;
      else return table[hash][bucket].getValue();
   }
	
   /**
   * For testing if an integer is prime:
   * @param n
   * @return
   */
   public boolean isPrime(int n) {
	  n *= 2; //Double the table size and add one to make it odd.
	  n += 1;
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
