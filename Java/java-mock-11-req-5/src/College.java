import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College implements Comparable<College>{
	private String name, website, mobile, founder, location;
	private Integer numberOfDept;
	private Date startingDate;
	
	public College() {}

	public College(String name, String website, String mobile, String founder, String location, Integer numberOfDept,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.location = location;
		this.numberOfDept = numberOfDept;
		this.startingDate = startingDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNumberOfDept() {
		return numberOfDept;
	}

	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", website=" + website + ", mobile=" + mobile + ", founder=" + founder
				+ ", location=" + location + ", numberOfDept=" + numberOfDept + ", startingDate=" + startingDate + "]";
	}

	static College createCollege(String detail) throws ParseException {
		College college=new College();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String[] arr = detail.split(",");
//		IIT Guwahati,www.iitg.ac.in/,9876543214,Govt of India,10,Guwahati,17-05-1994
		college.setName(arr[0]);
		college.setWebsite(arr[1]);
		college.setMobile(arr[2]);
		college.setFounder(arr[3]);
		college.setNumberOfDept(Integer.valueOf(arr[4]));
		college.setLocation(arr[5]);
		college.setStartingDate(sdf.parse(arr[6]));
		return college;
	}

	@Override
	public int compareTo(College o) {
		return this.getName().compareTo(o.getName());
	}
	
}
