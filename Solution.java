import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       
       try{
        //напишите тут ваш код

        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
       }
       catch(NullPointerException e)
       {
       System.out.println(e.getClass());
        }
    }
}
