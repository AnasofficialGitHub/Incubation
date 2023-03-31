public class Task{
	public static void main(String[] args){
		Student s = new Student(2,"John");
		s.met();
	}
}

class Student{
	int rollno;
	String name;
	public Student(int rollno, String name){
		this.name=name;
		this.rollno=rollno;
	}
	public void met(){
		System.out.println(name+" "+rollno);
	}
}