public class find_largest_element {
    public static void main(String[] args) {
        //largest element of an array
        int arr[]={3,6,2,8,5,9,7,2};
        int small=arr[0];

        for(int i=0;i<arr.length;i++){
            if(small<arr[i]){
                small=arr[i];
            }
            
        }System.out.println(small);

    }
}
