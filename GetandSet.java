class A
{
    private int age;
    private String name;

    void setAge(int age)
    {
        this.age = age;
    }
    void getAge()
    {
        System.out.println(age);
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    void getName()
    {
        System.out.println(name);
    }
}




public class GetandSet {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.setAge(36);
        obj.setName("sai");
        obj.getAge();
        obj.getName();
         
    }
}
