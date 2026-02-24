import java.util.Arrays;

class boattosave {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat=0;
        int i=0, j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }
            else{
                j--;
            }
            boat++;
        }
        return boat;
    }
    public static void main(String[] args){
        int arr[]={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(arr, limit));
    }
    
}