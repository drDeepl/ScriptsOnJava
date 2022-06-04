import java.util.Hashtable;
public class Main
{
    public static void main(String[] args) {
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
         String str = "abacabadabacabae";
         int id = 0;
         int step = 0;
         String result = "";
         
         for(int i =0; i< str.length(); i++){
             String currentChar = Character.toString(str.charAt(i));
             if(dict.get(currentChar) == null){
                 if(!dict.isEmpty()){
                     id++;
                 }
                 dict.put(currentChar, id);
                 
             }
         }
         System.out.println(dict);
         System.out.println(id);
         StringBuilder substr = new StringBuilder();
         String lastChar = String.valueOf(str.charAt((str.length()-1)));
         while(step < str.length()){
             String currentChar = String.valueOf(str.charAt(step));
             substr.append(currentChar);
             
             String key = String.valueOf(substr);
             if(dict.get(key) == null){
                 System.out.println(substr.substring(0, (substr.length()-1)));
                 result += String.valueOf(dict.get(substr.substring(0, (substr.length()-1))));
                 id ++;
                 dict.put(substr.toString(), id);
                 substr.delete(0, (substr.length() - 1));
             }
             
             if(currentChar.equals(lastChar)){
                 result += String.valueOf(dict.get(lastChar));
             }
             step ++;
         }
         System.out.println(result);
    }
}
