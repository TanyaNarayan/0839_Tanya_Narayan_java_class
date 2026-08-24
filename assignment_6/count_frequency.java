public class count_frequency {
    public static void main(String[] args) {
        int arr[]={2,5,7,42,8,3,5,6,8,4,7,22,55,88,45,3,5,6,8,9,4,6,2,1,4,6,7};
        int target=7;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count+=1;
            }
        }System.out.println("the count of the target is: " + count );

    }
}
