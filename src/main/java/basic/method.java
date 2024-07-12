package basic;

public class method {

    public void intern()
    {
        System.out.println("without return type without arguments");
    }
    public void intern2(String name,int age ){
        System.out.println("name :"+name+"\nage:"+age);
    }
    public char intern3(){
        System.out.println("with return type and without arguments");
        return 'M';
    }

    public static void main(String[]args){
        method obj=new method();
        obj.intern();
        obj.intern2("dharaneesh",20);
        char gender = obj.intern3();
        System.out.println("current person name(female,male)"+gender);
    }

}