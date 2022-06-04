public class Main
{
    public static void main(String[] args) {
        String inputString = "ddaaaaaddd";
        int freequencyChar = 1;
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i<inputString.length(); i++){
            char currentChar = inputString.charAt(i);
            char nextChar = ' ';
            if(i != (inputString.length() - 1)){
                int nextId = i+1;
                nextChar = inputString.charAt(nextId);    
            }
            if(currentChar == nextChar){
                freequencyChar ++;
                
            }else{
                
                result.append(currentChar);
                result.append(Integer.toString(freequencyChar)+ " ");
                if(freequencyChar != 1){
                    freequencyChar = 1;
                }
            }
            
        }
        result.insert(0, "Archivate string: ");
        System.out.print(result);
    }
}