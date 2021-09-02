class Super_Department{
	
	public void departmentName(){
		String s1 = "Welcome to Super Department";
		System.out.println(s1);
	}	
	public void getTodaysWork(){
		String s2 = "No Work as of now";
		System.out.println(s2);
	}
	public void getWorkDeadline(){
		String s3 = "Nil";
		System.out.println(s3);
	}
	public void isTodayAHoliday(){
		String s4 = "Today is not a Holiday";
		System.out.println(s4);
	}
	
}

class Admin_Department extends Super_Department{
	
	public void departmentName(){
		String str1 = "Welcome to Admin Department";
		System.out.println(str1);
	}
	public void getTodaysWork(){
		String str2 = "Complete your Documents Submission";
		System.out.println(str2);
	}
	public void getWorkDeadline(){
		String str3 = "Complete by EOD";
		System.out.println(str3);
	}
	
}

class Hr_Department extends Super_Department{
	
	public void departmentName(){
		String a = "Welcome to HR Department";
		System.out.println(a);
	}
	public void getTodaysWork(){
		String b = "Fill Today's Work&Time-Sheets and Mark your Attendance";
		System.out.println(b);
	}
	public void getworkDeadline(){
		String c = "Complete by EOD";
		System.out.println(c);
	}
	public void doActivity(){
		String d = "Team Lunch";
		System.out.println(d);
	}
	
}

class Tech_Department extends Super_Department{
	
	public void departmentName(){
		String w = "Welcome to Tech Department";
		System.out.println(w);
	}
	public void getTodaysWork(){
		String x = "Complete Coding of Module 1";
		System.out.println(x);
	}
	public void getworkDeadline(){
		String y = "Complete by EOD";
		System.out.println(y);
	}
	public void getTechStackInformation(){
		String z = "Core Java";
		System.out.println(z);
	}
	
}

class Main{
	
	public static void main(String[] args) {
		
		Admin_Department ad = new Admin_Department();
		ad.departmentName();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		System.out.println("==================================================\n");
		
		Hr_Department hd = new Hr_Department();
		hd.departmentName();
		hd.getTodaysWork();
		hd.getworkDeadline();
		hd.doActivity();
		hd.isTodayAHoliday();
		System.out.println("==================================================\n");
		
		Tech_Department td = new Tech_Department();
		td.departmentName();
		td.getTodaysWork();
		td.getworkDeadline();
		td.getTechStackInformation();
		hd.isTodayAHoliday();
		System.out.println("==================================================\n");
		
	}
	
}
