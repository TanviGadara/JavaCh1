class student
{
int id;
String name;
student(int i, String n)
{
id=i;
name=n;
}
student()
{
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String tanu[])
{
student s1=new student(1,"Karan");
student s2=new student();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}
