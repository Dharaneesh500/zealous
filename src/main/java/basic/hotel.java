package basic;

public class hotel extends meals implements lunch,nightdinner,morningtiffan {
    @Override
    public void Lunch() {
        System.out.println("Briyani");
    }

    @Override
    public void Morningtiffan() {
        System.out.println("Idly");

    }

    @Override
    public void Nightdinner() {
        System.out.println("Roti");

    }
    public static void main(String[]args){
        hotel obj= new hotel();
        obj.Lunch();
        obj.Morningtiffan();
        obj.Nightdinner();
        obj.Meals();

    }
}