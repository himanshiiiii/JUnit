import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
        System.out.println("this is about adding two integer number");
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("the sum is "+sum);
    }
    int sum(int a,int b){
        return a+b;
    }
    String sum(String fname, String lname){
        return fname+lname;
    }

    List sum(List listA, List listB){
        List list=new ArrayList();
        list.addAll(listA);
        list.addAll(listB);
        return list;
    }

    Float sum(Float fa, Float fb){
        return fa+fb;
    }


    Double sum(Double da, Double db){
        return da+db;
    }

}
