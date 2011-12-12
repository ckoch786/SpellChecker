package hash;
/**
 * <p>
 * The HashEntry class contains a constructor for constructing
 * a hash entry as a key value pair.
 * </p> 
 * @author Cory Koch
 * @author Carl Bohman
 *
 */
public class HashEntry {
   private int    key;
   private String value;

   HashEntry(int key, String value) {
      this.key   = key;
      this.value = value;
   }
   public int getKey()      { return key; } 
   public String getValue() { return value; } 
}
