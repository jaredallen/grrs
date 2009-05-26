
public class Snip {
	static final int NUM_ATTR = 5;
	
	String wellID;
	String customerID;
	String name;
	String call;
	String comments;
	boolean isEmpty;
	
	public Snip(String[] line) {
		wellID = line[0];
		customerID = line[1];
		name = line[2];
		call = line[3];
		comments = line[4];
	}
	
	public String getWellID() {
		return this.wellID;
	}
	
	public String getCustomerID() {
		return this.customerID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCall() {
		return this.call;
	}

	public String getComments() {
		return this.comments;
	}
	
	public boolean isEmpty() {
		return this.customerID.isEmpty() && this.name.isEmpty()
				&& this.call.isEmpty() && this.comments.isEmpty();
	}
	
	public String toString() {
		String output;
		
		output = "WELL: ";
		output += getWellID() + "\n";
		
		output += "CUSTOMER: ";
		output += getCustomerID() + "\n";
		
		output += "NAME: ";
		output += getName() + "\n";
		
		output += "CALL: ";
		output += getCall() + "\n";
		
		output += "COMMENTS: ";
		output += getComments() + "\n";
		
		return output;
	}

}
