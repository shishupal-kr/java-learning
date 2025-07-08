package DSA.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class Hash_map {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bucket[]; //array

        @SuppressWarnings("UnChecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N*2];
            N = 2*N;

            for(int i = 0; i <bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }
            //nodes add in bucket
            for(int i=0; i<oldBuck.length;i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put (K key, V value) {  // 0(1)
                int bi = hashFunction(key);
                int di = SearchInLL(key,bi);

                if(di != -1){
                    Node node = bucket[bi].get(di);
                    node.value = value;
                }else{
                    bucket[bi].add(new Node(key, value));
                    n++;
                }
                double lamda = (double)n/N;
                if(lamda > 2.0){
                    rehash();
                }
        }

        public boolean containsKey (K key) { // 0(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                return true;
            }else{
                return false;
            }
        }

        public V remove (K key) { // 0(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key) { // 0(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Canada",50);
        hm.put("Japan",60);
        hm.put("USA",50);

        ArrayList<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
    }
}
