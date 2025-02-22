class student
{
int id;
String name;
student(int i,String n)
{
id=i;
name=n;
System.out.println(id+" "+name);
}
student(student s)
{
id=s.id;
name=s.name;
System.out.println(id+" "+name);
}
public static void main(String args[])
{
student s1=new student(1,"Karan");
student s2=new student(s1);
}
}
