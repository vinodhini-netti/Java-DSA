import java.util.*;
class MapX{
    public static void main(String args[]){
        int arr[]={222,42,42,8};
       HashMap<Integer,Integer>m=new HashMap<>();
       for(int temp:arr){
           if(m.containsKey(temp)){
               int incremented=m.get(temp)+1;
               m.put(temp,incremented);
           }
           else{
               m.put(temp,1);
           }
       }
       for(Map.Entry<Integer,Integer>map:m.entrySet()){
           if(map.getValue()==1){
           System.out.println(map.getKey());
           }
       }
    }
}
