class A
{

public A()
{
System.out.println("This is A");
}
}

class B extends A
{

public B()
{
this(4);
System.out.println("This is B1");
}

public B(int k)
{
System.out.println("This is B2");
}
}

public class example
{

public static void main(String[] args)
{
B object = new B();
}
}