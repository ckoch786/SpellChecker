package hash;

public class HashEntry {
   private int key;
   private String value;

   HashEntry(int key, String value) {
      this.key   = key;
      this.value = value;
  }
   public int getKey()      { return key; } //ASCII sum of each character of the value
   public String getValue() { return value; }
}