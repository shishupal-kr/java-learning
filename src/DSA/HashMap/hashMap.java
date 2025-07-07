package DSA.HashMap;

import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap();
            hm.put("India",100);
            hm.put("China",150);
            hm.put("Canada",50);
            hm.put("Japan",60);
            hm.put("USA",50);

            //Iterate
        Set<String> keys = hm. keySet () ;
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key="+k+", "+"value="+hm.get(k));
        }
    }
}
