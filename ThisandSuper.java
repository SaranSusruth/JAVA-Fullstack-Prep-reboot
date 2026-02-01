class A
{
    public A()
    {
        System.out.println("class A default");

    }
    public A(int a)
    {
        System.out.println("class A parameter");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("class B default");

    }
    public B(int b)
    {

        this();
        System.out.println("class B parameter");
    }
}
public class ThisandSuper {
    public static void main(String[] args) {
        
        B obj = new B(15);
    }
    
}
