package Todaypractice;

public class Precencp {
	
	private int pslnum;
	private String pname;
	private int page;
	private int pfee;
	
	public Precencp() {
		System.out.println("this is default Constructor");
	}
	
	public Precencp(int psno,String pnm,int ag,int crgs) {
		System.out.println("this is Parametrized Constructor");
		pslnum=psno;
		pname=pnm;
		page=ag;
		pfee=crgs;
	}
	
      public  void display() {
    	  System.out.println("Patient Serial Number : "+pslnum);
    	  System.out.println("Patient Name : "+pname);
    	  System.out.println("Patient age : "+page);
    	  System.out.println("Patient fee : "+pfee);
      }
      public static void main(String[] args) {
    	  Precencp p=new Precencp(1,"patient",25,10000);
    	  p.display();
	}

	public int getPslnum() {
		return pslnum;
	}

	public String getPname() {
		return pname;
	}

	public int getPage() {
		return page;
	}

	public int getPfee() {
		return pfee;
	}

	public void setPslnum(int pslnum) {
		this.pslnum = pslnum;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPfee(int pfee) {
		this.pfee = pfee;
	}
      
}



