import java.io.DataInputStream;
class Area
{
public static void main(String args [])
{
float r=0.0f,area=0.0f;
DataInputStream o=new DataInputStream(System.in);
try
{

System.out.println("enter the radius");
r=Float.valueOf(o.readLine());
area=3.14f*r*r;
System.out.println("area of circle is "+area);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
