public class LinearSearch {
   public int LinSearch(int[] arr,int low,int high,int key){

           if(high<low){
               return 0;
           }
           if (arr[low]==key){
               return 1;
           }
           else
               return LinSearch(arr, low+1, high, key);
        }


}
