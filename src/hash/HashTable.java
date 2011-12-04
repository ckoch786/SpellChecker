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
	/**
	 * Constructor for a hash table of default size: 101
	 */
	HashTable (){
		
	} 
	/**
	 * 
	 * @param n Constructor for a hash table of size n.
	 */
	HashTable (int n){
		
	} 
	/**
	 * 
	 * @param S inserts S into the hash table.
	 */
	public static void Insert (String S){
		//Hash the String S
		
	} 
	/**
	 * 
	 * @param S
	 * @return return true if S is in the table, false otherwise
 	 */
	boolean Contains (String S){
		
		
		
		
		
		return false;
	}
	/**
	 * 
	 * @return - returns the number of strings stored in the table
	 */
	int NumEntries ( ){
		return 0;
	} 
	
	/**
	 * For testing if an integer is prime:
	 * @param n
	 * @return
	 */
	boolean isPrime(int n) {
    
       if (n%2==0) 	//check if n is a multiple of 2
          return false;
       else
          for(int i=3;i*i<=n;i+=2) {
             if(n%i==0)
                return false;
       }
       return true;
}
}
