public class InsertionSort{
    public static void selectionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            int j=i-1;
            while(j>-1 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;

        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={12,34,56,3,2,67,8987,3,56,74,45};
        selectionSort(arr);
        print(arr);
    }
}
