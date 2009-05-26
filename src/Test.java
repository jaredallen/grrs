import java.util.*;
import java.text.*;

public class Test {
	static final String DATE_FIELD = "* Experiment Run End Time";
	static final String VALUE_PAIR_DELIMITER = "=";
	static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss aa zzz";
	static final String RESULTS_MARKER = "[Results]";
	Date date = null;
	int numResults = 0;
	List<String[]> list;
	List<Snip> snips;
	
	public Test(List<String[]> list) {
		this.list = list;
		this.date = getDate();
		this.snips = getSnips();
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
						System.out.println(ex);
					}
				}
			}
		}
		return this.date;
	}
	
	public List<Snip> getSnips() {
		ListIterator<String[]> iterator;
		String[] tokens;

		if(this.snips == null) {
			iterator = this.list.listIterator();
			
			//Move to the results marker
			while(iterator.hasNext() && !iterator.next()[0].startsWith(RESULTS_MARKER)) {
			}
			
			//Skip over column headers
			iterator.next();
			
			this.snips = new ArrayList();
			while(iterator.hasNext()) {
				this.snips.add(new Snip(iterator.next()));
			}
				
			/*	
			while(iterator.hasNext()) {
				tokens = iterator.next();
				if(tokens[0].startsWith(RESULTS_MARKER)) {
					if(iterator.hasNext()) {
						this.snips = new ArrayList();
						//skip over column headers
						iterator.next();
						while(iterator.hasNext()) {
							this.snips.add(new Snip(iterator.next()));
						}
					} else {
						return null;
					}
				}
			}*/
		}
		return this.snips;		
	}
	
	public String toString() {
		String output;
		ListIterator<Snip> iterator;
		int snipNum;
		Snip snip;
		
		if(getDate() == null) {
			output = "INVALID DATE";
		} else {
			output = "DATE: " + getDate().toString();
		}
		
		snipNum = 0;
		output += "\n** SNIPS **\n";
		if(getSnips() != null) {
			iterator = getSnips().listIterator();
			while(iterator.hasNext()) {
				snip = iterator.next();
				if(!snip.isEmpty()) {
					output += "SNIP #" + ++snipNum + "\n";
					output += snip.toString();
				}
			}
		} else {
			output += "NO SNIPS FOUND.";
		}
		
		return output;
	}

}
