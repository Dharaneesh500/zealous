package basic;

import java.util.Arrays;

public class PassingArray {
    public void PassingArray(double[] salary1)
    {
        salary1[3]=1111.12;
        salary1[0]=1122.15;
        System.out.println(Arrays.toString(salary1));
    }
    public void PassingArray2(String name1)
    {

        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        int a=100;
        String name="Dharaneesh";
        double[] salary= {11.1,12,.5,85.6,78.6,63.5};
        PassingArray pass=new PassingArray();
        pass.PassingArray(salary);
        pass.PassingArray2(name);
        System.out.println(name);

    }
}