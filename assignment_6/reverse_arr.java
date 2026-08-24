public class reverse_arr {
    public static void main(String[] args) {
        //reverse the array
        int arr[]={1,2,3,4,5};
        int new_arr[]=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            new_arr[j]=arr[i];
            j--;
        }
        for(int i=0;i<new_arr.length;i++){
            System.out.println(new_arr[i]);
        }
    }
}



//int arr[] = {1, 2, 3, 4, 5};
// int new_arr[] = new int[arr.length];

// int j = arr.length - 1;

// for(int i = 0; i < arr.length; i++) {
//     new_arr[j] = arr[i];
//     j--;
// }