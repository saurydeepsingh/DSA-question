class nimgame {
    public static boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        else{
            return true;
        }

        
    }
    public static void main(String[] args){
        int n=4;
        System.out.print(canWinNim(n));
    }
}