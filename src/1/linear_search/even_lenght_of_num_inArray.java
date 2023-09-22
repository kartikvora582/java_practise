package linear_search;

public class even_lenght_of_num_inArray {
    public static void main(String[] args) {
        int[] array1 = {12,134,111,121,4444,555555, 11};
        int ans = findEvenNoOfElements(array1);
        System.out.println(ans);

    }
    static int findEvenNoOfElements(int[] arr){
        if(arr.length == 0){
            return 1;
        }
        int countOfEvenElements =  0;
        for (int element = 0; element < arr.length; element++) {
            int temp = arr[element];
            int countDigits = 0;
            while (temp != 0) {
                // num = num/10
                temp /= 10;
                ++countDigits;
            }
            if(countDigits % 2 == 0){
                countOfEvenElements ++;
            }
        }
        return countOfEvenElements;
    }
}


//faster way to find no of digits will be
//        (int)(Math.log10(num))