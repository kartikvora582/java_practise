package math;

public class mathExamples {
    static void Unique(int[] arr) {
        String sd = new String("");
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                int x= (j==0)? 0: 1;
                arr[i] = arr[i] >> x;
                if ((arr[i] & 1) != 0)
                    count++;
            }
            sd+=count%3;
        }
        String reversed="";
        int len=sd.length()-1;
        while(len>=0){
            reversed+=sd.charAt(len);
            len--;
        }
        int dec = Integer.parseInt(reversed, 2);
        System.out.println(dec);
    }
    public static void main(String[] args){
        int[] arr={2, 2, 3, 2, 7, 7, 8, 8, 7, 8};
        Unique(arr);
    }
}