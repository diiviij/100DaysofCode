

public class Arrangement {
    public static void negToLeft(int arr[]){
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }
        }
    }

    public static void posToLeft(int arr[]){
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
        }
    }
    public static void main(String arg[]){
        int arr[]={1,2,-2,-3,2,4,-3,-5,-6,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        // negToLeft(arr);
        posToLeft(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

    }
}
