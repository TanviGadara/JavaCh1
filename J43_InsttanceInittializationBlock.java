class Varargsexample
{
static void display(String... a)
{
for(String s:a)
{
System.out.println(s);
}
}
public static void main(String args[])
{
display();
display("Hello");
display("My","college","name","is","TNR");
}
}
