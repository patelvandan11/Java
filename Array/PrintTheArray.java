
class PrintTheArray{
    public static void main(String[] args){
        int [] arr={1,2,3,56,5};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println("size of array is :"+arr.length);
        for(int i : arr){
            System.out.println(i);
        }
    }
}