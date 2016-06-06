class Test
{
private int data;


public void setData(int data)
{
this.data=data;
}

public int getData()
{
return data;
}


}

class Test1
{
public static void main(String args[])
{
Test t=new Test();
t.setData(100);
int a=t.getData();

System.out.println(a);

}
}

