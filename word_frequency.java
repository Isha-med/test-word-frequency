import java.util.*;
public class MyClass {
    public static void main(String[] args) {
       String s="the cat is in the bag in in in";
       Map<String, Integer> hm = new HashMap<>();
       String sArr[]=s.trim().split(" ");
       for(int i=0;i<sArr.length;i++){
           hm.put(sArr[i],hm.getOrDefault(sArr[i],0)+1);
       }
       LinkedList<Map.Entry<String,Integer>> al=new LinkedList<>(hm.entrySet());
       Collections.sort(al, new Comparator<Map.Entry<String,Integer>>(){
           public int compare(Map.Entry<String, Integer> o1,Map.Entry<String,Integer> o2){
               return (o2.getValue()).compareTo(o1.getValue());
           }
       });
       Map<String, Integer> sortedMap=new LinkedHashMap<>();
       for(Map.Entry<String, Integer> m:al){
           sortedMap.put(m.getKey(), m.getValue());
       }
       for(Map.Entry<String, Integer> entry:sortedMap.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
}
