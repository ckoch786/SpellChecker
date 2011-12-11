protected int numElements;



public void insert (String S) {
    int location;
    location = element.hash();
    while (list[location] != null);
       location = (location + 1) % list.length;
    list[location] = element;
    numElements++;
    
    }

public boolean Contains(String S) {
    int location;
    location = element.hash();
    while (!list[location].equals(element))
	location = (location + 1) % list.length;
        
    
    return false;
    }


public int NumEntries() {
    return numElements;
    }
