package basic;
class intern{
    public void dharaneesh()
    {
        String name= "dharaneesh";
        int rollno = 22063;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class intern2 extends intern{
    public void gokul(){
        String name = "gokul";
        int rollno = 22076;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class intern3 extends intern2{
    public void giri(){
        String name = "giri";
        int rollno = 22074;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
public class multilevel {
    public static void main(String[] args){
        intern3 obj=new intern3();
        obj.dharaneesh();
        obj.giri();
        obj.gokul();
    }
}