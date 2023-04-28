//waoojp for class Student 

class Student
{
int rno;
String name;
int age;
int marks;

public void setData(int rno, String name, int age, int marks ){
this.rno=rno;
this.name=name;
this.age=age;
this.marks=marks;
}
public void showData(){
System.out.println("rno ="+rno);
System.out.println("name ="+name);
System.out.println("age ="+age);
System.out.println("marks ="+marks);
}}
class p2
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData(10,"aman yadav",25,95);
s1.showData();

Student s2=new Student();
s2.setData(11,"anil singh",30,85);
s2.showData();

}
}