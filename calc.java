class calc{

public static void main(String args[])
{
int i=1,x=4,y=2,z=0;

switch(i){

case 1: z=x+y; 
System.out.println("Addition of numbers: "+z);
break;

case 2: z=x-y; 
System.out.println("Subtraction of numbers: "+z);
break;

case 3: z=x*y; 
System.out.println("Multiplication of numbers: "+z);
break;

case 4: z=x/y; 
System.out.println("Division of numbers: "+z);
break;

default: System.out.println("Wrong Choice");
}
}
}