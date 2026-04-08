package ArrayMultiDim;

public class MaxMin2D {
    public static void main(String[] args) {
        int[][] arr = {{6,9,7,9,8},{1,3,7,20,2},{9,9,4,5,2}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum += arr[i][j];// sum += arr[i][j]
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
            maxSum = Math.max(maxSum ,sum);
        }
        System.out.println(row+" "+maxSum);
        //System.out.println(maxSum);
    }
}
