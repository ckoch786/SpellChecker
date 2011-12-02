package hash;
/**
 * Objects of classes that implement this interface can be used
 * with lists based on hashing
 */
public interface Hashable {
	/**
	 * A mathematical function is used to manipulate the key of an element
	 * in a list to identify its location in the list
	 */
	int hash(int idNum);
}
