package basic;

abstract class abst {
    public void day6(){
        System.out.println(" the internship very useful for us");
    }
    abstract void  newbustand();
    abstract  void  oldbustand();

}
class time extends abst{

    @Override
    void newbustand() {

    }

    @Override
    void oldbustand() {
    }

//       @Override
//       public void day6()
//       {
//           System.out.println("the zealous internship is very super");
//
//       }
}
public class abstraction{
    public static void main(String[]args) {
        time obj = new time();
        obj.day6();
    }
}