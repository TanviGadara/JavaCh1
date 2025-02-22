class student
{
int roll_no=1;
String name="TNR";
public void detail()
{
System.out.println("Roll No is:"+roll_no);
System.out.println("Name is:"+name);
}
}
class IT extends student
{
String stream="B.C.A";
public void print()
{
System.out.println("stream is:"+stream);
}
}
class subject extends IT
{
String sub_name="JAVA";
public void sub_print()
{
System.out.println("subject is:"+sub_name);
}
}
class Main
{
public static void main(String args[])
{
subject obj=new subject();
obj.detail();
obj.print();
obj.sub_print();
}
}
