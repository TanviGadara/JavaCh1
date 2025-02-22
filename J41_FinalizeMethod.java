class Demo
{
public static void main(String args[])
{
String s1="Hello World!";
s1=null;
System.out.println(s1);
System.gc();
System.out.println("Garbage collection is called");
}
protected void finalize()
{
System.out.println("Finalize method is called");
}
}
