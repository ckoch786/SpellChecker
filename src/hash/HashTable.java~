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
   private final static int TABLE_SIZE  = 23; //Rows in 2d array
   private final static int BUCKET_SIZE = 10;   // columns in 2d array
   protected int numEntries;
   HashEntry[][] table;
    
   /**
   * 
   * Constructor for a hash table of two dimensions of size
   * TABLE _SIZE = rows and BUCKET_SIZE = columns.
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
   * inserts S into the hash table.
   * @param S 
   * 
   */
   public void Insert (String S){
      int i, key, bucket;
      bucket = 0; 
		
      for(key = 0 , i = 0; i < S.length(); i++ ) {
         key += (int)S.charAt(i);
         System.out.println("The key for "+S + " is " +key);
      }
      int hash = (key % TABLE_SIZE);		 
      while (table[hash][bucket] != null           && 
	        table[hash][bucket].getValue() != S ) {
         bucket++; 
         System.out.println("\t\tThere has been a collision at " +hash + " " + bucket);	 
      }
      table[hash][bucket] = new HashEntry(key, S);
      System.out.println("The Value stored in hash table location "+hash+":"+ bucket+" is \"" + S+"\"" );
      System.out.println("The key: " + key + " for value: " + S);
      System.out.println("Value "+"\""+S+"\""+ " is being place into the hash table at "+ hash);
      System.out.println();
      numEntries++;
   }
		

   /**
   * 
   * @param S
   * @return true if S is in the table, false otherwise
   */
   public boolean Contains (String S){
      int i, key, bucket;
      bucket = 0; 
		
      for(key = 0 , i = 0; i < S.length(); i++ ) {
            key += (int)S.charAt(i);
      }
      int hash = (key % TABLE_SIZE);	
      while (table[hash][bucket] != null           && 
	       table[hash][bucket].getValue() != S) {
         bucket++;           
      }	 
      if ( table[hash][bucket] == null) return false;
      else                              return true;
   }
   /**
   * 
   * @return - returns the number of strings stored in the table
   */
   public int NumEntries() { return numEntries; } 
   
   //TODO remove
   public String get(String S) {
      int i, key, bucket;
      bucket = 0;

      for(key = 0 , i = 0; i < S.length(); i++ ) {
         key += (int)S.charAt(i);
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
