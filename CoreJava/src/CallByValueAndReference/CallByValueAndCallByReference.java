package CallByValueAndReference;

public class CallByValueAndCallByReference {
	
	int p;
	int q;
	
	//  below is method of call by value.
	int sum(int a,int b) {
	a=32;
	b=42;
	int c= a+b;
	return c;
	}
	
	// below is method of call by reference
	void swap(CallByValueAndCallByReference t) // passing reference variable(t) of a class .     -----Important to remember
	{
	int temp;
	temp =t.p;  // temp =51
	t.p= t.q;   // t.p=81
	t.q=temp;   // t.q= 51
	}

	public static void main(String[] args) {
    CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
    int x =9;
    int y=21;
    obj.sum(x, y); // call by value OR pass by value
   System.out.println(obj.sum(x, y));

    
    obj.p=51;
    obj.q=81;
    
    obj.swap(obj);  // we will pass argument as object.
    // After swap
    
    System.out.println("*****************After swap value is interchanged****************");
    System.out.println(obj.p);
    System.out.println(obj.q);
    
	}

}
