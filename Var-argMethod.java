import java.util.*;
class Test
{
    void add(int ...a)
    {
        int r=0;
        for(int x:a)
        {
            r=r+x;
        }
        System.out.println(r);
    }
    public static void main(String args[])
    {
        Test t1=new Test();
        t1.add();
        t1.add(23,56);
        t1.add(10,3,66,88);
        t1.add(34);
    }
    
}
