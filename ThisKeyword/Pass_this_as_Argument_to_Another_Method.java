package ThisKeyword;

public class Pass_this_as_Argument_to_Another_Method {
	

	    void display(Pass_this_as_Argument_to_Another_Method c) {
	        System.out.println("Method received: " + c);
	    }

	    void callDisplay() {
	        display(this);  // pass current object
	    }

	    public static void main(String[] args) {
	    	Pass_this_as_Argument_to_Another_Method car = new Pass_this_as_Argument_to_Another_Method();
	        car.callDisplay();
	    }
	}
