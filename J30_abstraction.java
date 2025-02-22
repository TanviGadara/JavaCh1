abstract class college
{
public abstract void stream();
public void computer()
{
System.out.println("BCA");
}
}
class M_department extends college
{
public void stream()
{
System.out.println("BBA");
}
}
class Main
{
public static void main(String[] args)
{
M_department obj=new M_department();
obj.computer();
obj.stream();
}
}
