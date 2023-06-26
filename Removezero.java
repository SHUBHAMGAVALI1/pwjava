public class Removezero {
    public static void findzero(int [] arr) {
          int left=0;

        for(int i=0;arr.length>i;i++){
            if(arr[i]!=0){
              int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
               
            }


        }
        
    
        
    }
    public static void main(String[] args) {
        int [] arr={0,2,3,5,0};
       findzero(arr);
        System.out.print(Arrays.toString(arr));
    
    }
    
}
