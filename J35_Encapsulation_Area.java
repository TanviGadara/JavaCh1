class J35_Encapsulation_Area
{
private String Name;
public String getName()
{
return Name;
}
public void setName(String newName)
{
Name=newName;
}
}
class TestEncapsulation
{
public static void main(String args[])
{
J35_Encapsulation_Area obj=new J35_Encapsulation_Area();
obj.setName("TNR");
System.out.println("Name is:"+obj.getName());
}
}
