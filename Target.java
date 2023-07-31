public class Target {
    public static void main(String[] args) {
        int arr[]={3,2,4,6,7};
        int target=10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(target == (arr[i]+arr[j])){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
