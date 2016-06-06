class Q
{
public static void main(String args[])
{
int age =25;
float sal =2000.0f;

if(age>60)
{System.out.println("There is no deduction in salary:"+sal);

}

else{
if((age<=60)&&(age>40))
{sal=sal-((0.15f)*sal);
System.out.println("There is 15% deduction in salary:"+sal);
}

else{
sal=sal-((0.20f)*sal);
System.out.println("There is 20% deduction in salary:"+sal);
}
}
}}