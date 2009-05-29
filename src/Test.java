import java.util.*;
import java.text.*;

public class Test {
	static final String DATE_FIELD = "* Experiment Run End Time";
	static final String VALUE_PAIR_DELIMITER = "=";
	static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss aa zzz";
	static final String RESULTS_MARKER = "[Results]";
	static final int REPORT_SIZE = 105;
	static final String WARNING = "** WARNING - Possible bad report format ** ";
	static final String ERROR = "** ERROR - Bad report format **";
	
	Date date = null;
	boolean isValid = true;
	String warnings = "";
	String errors = "";
	
	int numResults = 0;
	List<String[]> list;
	List<Snp> snps;
	
	public Test(List<String[]> list) {
		this.list = list;
		if(this.list.size() != REPORT_SIZE) {
			String warning;
			
			warning = WARNING + " \nReport should have " + REPORT_SIZE + " lines" + " but has " + this.list.size();
			this.warnings += warning;
			System.out.println(warning);
		}
		this.date = getDate();
		this.snps = getSnps();
	}
	
	public Date getDate() {
		String[] tokens;
		int dateStart;
		String strDate;
		SimpleDateFormat formatter;
		ListIterator<String[]> iterator;
		
		if(this.date == null) {
			iterator = this.list.listIterator();
			while(iterator.hasNext()) {
				tokens = iterator.next();
				if(tokens[0].startsWith(DATE_FIELD)) {
					dateStart = tokens[0].lastIndexOf(VALUE_PAIR_DELIMITER);
					dateStart++;
					strDate = tokens[0].substring(dateStart).trim();
					formatter = new SimpleDateFormat(DATE_FORMAT);
					try {
						this.date = formatter.parse(strDate);
					} catch (ParseException ex) {
						String error;
						
						this.isValid = false;
						error = ERROR + "\nBad date format: \n" + ex;
						this.errors += error;
						System.out.println(error);
					}
				}
			}
		}
		return this.date;
	}
	
	public List<Snp> getSnps() {
		ListIterator<String[]> iterator;
		String[] tokens;

		if(this.snps == null) {
			iterator = this.list.listIterator();
			
			//Move to the results marker
			while(iterator.hasNext() && !iterator.next()[0].startsWith(RESULTS_MARKER)) {
			}
			
			//Skip over column headers
			iterator.next();
			
			this.snps = new ArrayList();
			while(iterator.hasNext()) {
				this.snps.add(new Snp(iterator.next()));
			}
			
			if(this.snps == null) {
				this.isValid = false;
				this.errors += "\nReport contains no results";
			}
		}
		return this.snps;		
	}
	
	public boolean isValid() {
		return this.isValid();
	}
	
	public String getWarnings() {
		return this.warnings;
	}
	
	public String getErrors() {
		return this.errors;
	}
	
	public String toString() {
		String output;
		ListIterator<Snp> iterator;
		int snipNum;
		Snp snp;
		
		if(getDate() == null) {
			output = "INVALID DATE";
		} else {
			output = "DATE: " + getDate().toString();
		}
		
		snipNum = 0;
		output += "\n** SNPs **\n";
		if(getSnps() != null) {
			iterator = getSnps().listIterator();
			while(iterator.hasNext()) {
				snp = iterator.next();
				output += "SNP #";
				output += ++snipNum + "\n";
				output += snp.toString() + "\n";
			}
		} else {
			output += "NO SNPs FOUND.";
		}
		
		return output;
	}

}
