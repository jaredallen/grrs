
public class Snp {
	static final int NUMBER_OF_COLUMNS = 23;
	static final String WARNING = "** WARNING - Possible bad snp in report ** ";
	static final String ERROR = "** ERROR - Bad snp in report **";
	
	String wellID;
	String sampleName;
	String snpAssayName;
	String task;
	String allele1;
	String allele2;
	String passRef;
	String quality;
	String call;
	String method;
	String allele1AutoCt;
	String allele1CtThreshold;
	String allele1AutoBaseline;
	String allele1BaselineStart;
	String allele1BaseLineEnd;
	String allele2AutoCt;
	String allele2CtThreshold;
	String allele2AutoBaseline;
	String allele2BaselineStart;
	String allele2BaseLineEnd;
	String comments;
	String ampnc;
	String noamp;

	String warnings = "";
	String errors = "";
	boolean isValid = true;
	boolean isEmpty;
	
	public Snp(String[] line) {
		if(line.length != NUMBER_OF_COLUMNS) {
			this.isValid = false;
			this.errors += ERROR + " - Wrong number of columns.  Should have " + NUMBER_OF_COLUMNS +
									". Instead there is " + line.length;
			return;
		}

		wellID = line[0];
		sampleName = line[1];
		snpAssayName = line[2];
		task = line[3];
		allele1 = line[4];
		allele2 = line[5];
		passRef = line[6];
		quality = line[7];
		call = line[8];
		method = line[9];
		allele1AutoCt = line[10];
		allele1CtThreshold = line[11];
		allele1AutoBaseline = line[12];
		allele1BaselineStart = line[13];
		allele1BaseLineEnd = line[14];
		allele2AutoCt = line[15];
		allele2CtThreshold = line[16];
		allele2AutoBaseline = line[17];
		allele2BaselineStart = line[18];
		allele2BaseLineEnd = line[19];
		comments = line[20];
		ampnc = line[21];
		noamp = line[22];
	}
		
	/**
	 * @return the wellID
	 */
	public String getWellID() {
		return wellID;
	}

	/**
	 * @return the sampleName
	 */
	public String getSampleName() {
		return sampleName;
	}

	/**
	 * @return the snpAssayName
	 */
	public String getSnpAssayName() {
		return snpAssayName;
	}

	/**
	 * @return the task
	 */
	public String getTask() {
		return task;
	}

	/**
	 * @return the allele1
	 */
	public String getAllele1() {
		return allele1;
	}

	/**
	 * @return the allel2
	 */
	public String getAllele2() {
		return allele2;
	}

	/**
	 * @return the passRef
	 */
	public String getPassRef() {
		return passRef;
	}

	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @return the call
	 */
	public String getCall() {
		return call;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @return the allele1AutoCt
	 */
	public String getAllele1AutoCt() {
		return allele1AutoCt;
	}

	/**
	 * @return the allele1CtThreshold
	 */
	public String getAllele1CtThreshold() {
		return allele1CtThreshold;
	}

	/**
	 * @return the allele1AutoBaseline
	 */
	public String getAllele1AutoBaseline() {
		return allele1AutoBaseline;
	}

	/**
	 * @return the allele1BaselineStart
	 */
	public String getAllele1BaselineStart() {
		return allele1BaselineStart;
	}

	/**
	 * @return the allele1BaseLineEnd
	 */
	public String getAllele1BaseLineEnd() {
		return allele1BaseLineEnd;
	}

	/**
	 * @return the allele2AutoCt
	 */
	public String getAllele2AutoCt() {
		return allele2AutoCt;
	}

	/**
	 * @return the allele2CtThreshold
	 */
	public String getAllele2CtThreshold() {
		return allele2CtThreshold;
	}

	/**
	 * @return the allele2AutoBaseline
	 */
	public String getAllele2AutoBaseline() {
		return allele2AutoBaseline;
	}

	/**
	 * @return the allele2BaselineStart
	 */
	public String getAllele2BaselineStart() {
		return allele2BaselineStart;
	}

	/**
	 * @return the allele2BaseLineEnd
	 */
	public String getAllele2BaseLineEnd() {
		return allele2BaseLineEnd;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @return the ampnc
	 */
	public String getAmpnc() {
		return ampnc;
	}

	/**
	 * @return the noamp
	 */
	public String getNoamp() {
		return noamp;
	}
	
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return this.isValid;
	}

	public String toString() {
		String output;
		
		if(this.isValid()) {
			output = "wellID: " + getWellID();
			output += "\nsampleName: " + getSampleName();
			output += "\nsnpAssayName: " + getSnpAssayName();
			output += "\ntask: " + getTask();
			output += "\nallel1: " + getAllele1();
			output += "\nallel2: " + getAllele2();
			output += "\npassRef: " + getPassRef();
			output += "\nquality: " + getQuality();
			output += "\ncall: " + getCall();
			output += "\nmethod: " + getMethod();
			output += "\nallele1AutoCt: " + getAllele1AutoCt();
			output += "\nallele1CtThreshold: " + getAllele1CtThreshold();
			output += "\nallele1AutoBaseline: " + getAllele1AutoBaseline();
			output += "\nallele1BaselineStart: " + getAllele1BaselineStart();
			output += "\nallele1BaselineEnd: " + getAllele1BaseLineEnd();
			output += "\nallele2AutoCt: " + getAllele2AutoCt();
			output += "\nallele2CtThreshold: " + getAllele2CtThreshold();
			output += "\nallele2AutoBaseline: " + getAllele2AutoBaseline();
			output += "\nallele2BaselineStart: " + getAllele2BaselineStart();
			output += "\nallele2BaselineEnd: " + getAllele2BaseLineEnd();
			output += "\ncomments: " + getComments();
			output += "\nampnc: " + getAmpnc();
			output += "\noamp: " + getNoamp();
		} else {
			output = this.errors;
		}
		
		return output;
	}

}
