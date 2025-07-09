package ThisKeyword;

public class Return_Current_Class_Instance {
	
	Return_Current_Class_Instance getObject() {
	        return this;
	    }

	    void show() {
	        System.out.println("Returned current object using this.");
	    }

	    public static void main(String[] args) {
	        new Return_Current_Class_Instance().getObject().show();
	    }
	}

