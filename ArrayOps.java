public class ArrayOps {
    public static void main(String[] args) {
        int[] arr1 = {10 ,9 ,8};
        int[] arr2 = {10, 9 , 8 ,8 ,9};
        System.out.println(containsTheSameElements(arr1, arr2));
    }
    
    //Gets an array with the length n, that holds all the integrs from 0 to n except one, and then rturns the missing integer
    public static int findMissingInt (int [] array) {
        int[] array2 = new int[array.length + 1];
        int ans = 0;
        for (int i = 0; i < array.length; i++){
            array2[array[i]]++;
        }
        for (int i = 0; i < array2.length; i++){ 
            if(array2[i] == 0){
                ans = i;
            }
        }       
        return ans;
    }
    //Gets an array of integers and rturns the integer with the seconed highest value
    public static int secondMaxValue(int [] array) {
        int max = Math.max(array[0], array[1]);
        int seconedMax = Math.min(array[0], array[1]);

        for (int i = 2; i < array.length; i++){
            if (array[i] > seconedMax){
                if(array[i] > max){
                    seconedMax = max;
                    max = array[i];
                }
                else{
                    seconedMax = array[i];
                }
            }
        }
        return seconedMax;
    }

    public static boolean containsTheSameElements(int [] array1, int [] array2) {
        boolean ans = true;
        int count = 0;
        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i]!= array2[j]){
                    count++;
                }
            }
            if (count ==array2.length){
                ans = false;
                break;
            }
            else{
                count = 0;
            }
        }
        
        
        return ans;
    }

    //Gets an array of integers and returns whether the array is sorted or not
    public static boolean isSorted(int [] array) {
        int i = 1;
        boolean ans = true;
        boolean isDecreasing = false;
        boolean isIncreasing = false;

        while ((isDecreasing == false && isIncreasing == false) && array.length > i) {
             if (array[i] < array [i-1]){
                isDecreasing = true;
             }  
              if (array[i] > array [i-1]){
                isIncreasing = true;
             }   
             i++;
        } 
        i = 1;
        while (i < array.length && ans) {
            if (isIncreasing){
                if (array[i] < array[i-1]){
                    ans = false;
                }
            }
            
            if (isDecreasing){
                if (array[i] > array[i-1]){
                    ans = false;
                }
            }
            i++;
        }
        return ans;
    }

}
