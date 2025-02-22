class student
{
int id;
String name;
int age;
student(int i,String n)
{
id=i;
name=n;
System.out.println(id+" "+name);
}
student(int i,String n,int a)
{
id=i;
name=n;
age=a;
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
student s1=new student(1,"karan");
student s2=new student(2,"Aryan",25);
}
}
