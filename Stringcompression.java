public class Stringcompression {
    public static void main(String[] args){
        String str="aaabbbcccddd";
        System.out.println(compressString(str));
    }
    
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar).append(count);
        return compressed.toString();
    }
}