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
	protected int key;
	protected int[] hashTable;
	protected int size;
	private int hashValue;
	/**
	 * Constructor for a hash table of default size: 101
	 */
	public HashTable(){
		hashTable = new int[101];
	} 
	/**
	 * 
	 * @param n Constructor for a hash table of size n.
	 */
	public HashTable (int n){
		if(isPrime(n) == true)
		   hashTable = new int[size];
		//else
			
	} 
	
	/**
	 * 
	 * @param S inserts S into the hash table.
	 */
<<<<<<< HEAD
	public void Insert (String S){
=======
	public static void Insert (String S){
		//Hash the String S
>>>>>>> 5775a564a670bda66fa3a9a85e2c7b7dd81dfd4f
		
	} 
	/**
	 * 
	 * @param S
	 * @return return true if S is in the table, false otherwise
 	 */
<<<<<<< HEAD
	public boolean Contains (String S){
=======
	boolean Contains (String S){
		
		
		
		
		
>>>>>>> 5775a564a670bda66fa3a9a85e2c7b7dd81dfd4f
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
	public int getHashValue(){
		return hashValue;
	}
}
