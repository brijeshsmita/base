import java.util.*;
/*
 * @author Smita Brijesh
 */
class GenericStack<AnyType> {
	ArrayList<AnyType> buffer;
  	int size, top;
  	GenericStack(int s) { 
    			size = s;
    			buffer = new ArrayList<AnyType>(size);
    			top=-1; 
  	}
  	void addNewAccount(AnyType item) { 
    			buffer.add(++top,item);
  	}
  	AnyType getAccount() { 
    			return buffer.get(top--); 
  	}
}




