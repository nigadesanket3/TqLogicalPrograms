package com.anonymous;



	class Driver
	{
		String name;
		String email;
		public Driver() {
			// TODO Auto-generated constructor stub
		}
		public Driver(String name,String email)
		{
			this.name=name;
			this.email=email;
		}
		public void drive()
		{
			System.out.println("I am in drive()");
		}
		public String toString()
		{
			return name + "  "+ email;
		}
	}
	public class Outer {
	    // Anonymous inner class of Driver 
		Driver obj=new Driver("Ganesh","g@gmail.com")
				{
			         int number;
			         {
			        	 number=672647;
			         }
			          public void drive()
			          {
			        	  System.out.println(" I am in drive method of Anonymous inner class");
			        	  newMethod();
			          }
			          public String toString()
			          {
			        	  return super.toString() + "  "+number;
			          }
			          public void newMethod()
			          {
			        	  System.out.println("in new method of Anonymous Inner class");
			          }
				};
	    public void show()
	    {
	    	obj.drive();
	    	//obj.newMethod();
	    	System.out.println(obj);
	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Outer o=new Outer();
			o.show();
		}

	}


