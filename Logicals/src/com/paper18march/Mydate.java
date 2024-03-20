package com.paper18march;

public class Mydate {

	private int dd,mm,yy;

	Mydate()
	{  
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	Mydate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}		
	
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}


	
}
