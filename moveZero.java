class moveZeroes {
    public void moveZeroes(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length;j<=0;j--){
                if(arr[i]!=arr[j]){
                    arr[j]=arr[i];
                }
            }

        }
        
    }
}