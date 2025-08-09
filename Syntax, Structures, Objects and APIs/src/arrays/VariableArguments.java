package arrays;

public class VariableArguments {
    public static void main(String[] args) {
        calculateSum(1);
        calculateSum(1,2);
        calculateSum(3,554,7);
        calculateSum(new int[]{1,2,4,5,63,3});

    }

    public static void calculateSum(int ...a){
        int sum = 0;
        for (int i =0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("The sum is "+sum);
    }
}
