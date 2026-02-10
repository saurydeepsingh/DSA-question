public class SpiralMatrix {

    public static void spiral(int arr[][]) {

        int startrow = 0, startcol = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        while(startrow <= endrow && startcol <= endcol){

            // top
            for(int j = startcol; j <= endcol; j++){
                System.out.print(arr[startrow][j] + " ");
            }

            // right
            for(int i = startrow + 1; i <= endrow; i++){
                System.out.print(arr[i][endcol] + " ");
            }

            // bottom
            if(startrow < endrow){
                for(int j = endcol - 1; j >= startcol; j--){
                    System.out.print(arr[endrow][j] + " ");
                }
            }

            // left
            if(startcol < endcol){
                for(int i = endrow - 1; i > startrow; i--){
                    System.out.print(arr[i][startcol] + " ");
                }
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args){
        int arr[][] = {
            {1,3,5,7},
            {2,4,6,8},
            {2,3,5,6},
            {3,7,3,5}
        };
        spiral(arr);
    }
}
