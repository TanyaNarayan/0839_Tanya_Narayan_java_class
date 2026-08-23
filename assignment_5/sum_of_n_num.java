import java.util.*;
class sum_of_n_num {
    public static void main(String[] args) {
        System.out.println("enter the number of which you have to find the sum");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
        ob.close();
    }
}
