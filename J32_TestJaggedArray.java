class J32_TestJaggedArray
{
public static void main(String args[])
{
int arr[][]=new int[3][];
arr[0]=new int[]{1,2,3};
arr[1]=new int[]{4,5,6,7};
arr[2]=new int[3];
arr[2][0]=8;
arr[2][2]=9;
for(int i=0;i<arr.length;i++)
{
for(int a:arr[i])
{
System.out.print(a+" ");
}
System.out.println();
}
}
}
