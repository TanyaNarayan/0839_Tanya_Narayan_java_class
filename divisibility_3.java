import java.util.*;
public class divisibility_3 {
  public static void main(String[] args) {
    System.out.println("enter the number till where you want to check the divisiblity");
    Scanner ob=new Scanner(System.in);
    int num= ob.nextInt();
    int count = 0;

    for(int i=1;i<=num;i++){
        if(i%3==0){
            count++;
        }
       
        
    }System.out.println("count is: " + count);
    ob.close();

  }  
}
