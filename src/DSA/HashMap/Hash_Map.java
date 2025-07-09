package DSA.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;


public class Hash_Map {

    static class HashMap<K,V> {  //class with parameter type/generic
        private class Node {   // Inner class Node
            K key;
            V value;

            public Node(K key, V value) {   // Constructor
                this.key = key;
                this.value = value;
            }
        }

        private int n; // No. of key-value pairs stored in HashMap
        private int N; // Total no. of buckets/Array slot
        private LinkedList<Node> bucket[];  //like  int array[]; ,Array of LinkedLists of node

        @SuppressWarnings("UnChecked")  //To silence the compiler warning
        public HashMap(){  //constructor of HashMap class
            this.N = 4;  //no. of bucket/array slot
            this.bucket = new LinkedList[4];  //Create Array of 4 element which is null
            for(int i=0; i<4; i++){
                this.bucket[i] = new LinkedList<>();  //it created empty LinkedList node
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); //get integer hashcode
            return Math.abs(bi) % N; // It returns & Makes sure it's positive & maps the hash to valid bucket idx
        }

        //search for key inside bucket
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];  //retrieve ll from bi
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){ //stored find by search key
                    return i; //if found return idx
                }
            }
            return -1;  //not found
        }

        // expands bucket size
        private void rehash(){
            LinkedList<Node> oldBucket[] = bucket;  // Store the current bucket array
            N = N * 2;  // Update N to reflect the new number of buckets
            bucket = new LinkedList[N];  // Create new bucket array with updated size

            // Initialize each bucket in the new array with an empty LinkedList
            for(int i=0; i<N; i++){
                bucket[i] = new LinkedList<>();
            }

            // Re-insert all existing entries into the new bucket array
            for(int i=0; i<oldBucket.length; i++){  // Traverse old bucket array
                LinkedList<Node> ll = oldBucket[i];  // Get the linked list at index i
                for(int j=0; j<ll.size(); j++){  // Traverse each node in the linked list
                    Node node = ll.get(j);  // Get the node at position j
                    put(node.key,node.value); // Reinsert the key-value pair into the new bucket array
                }
            }
        }

        public void put (K key, V value) {  // 0(1)
            int bi = hashFunction(key);  //bucket idx
            int di = SearchInLL(key,bi);  //data idx return index if found, -1 if not

            if(di == -1){  //check if key doesn't exist
                bucket[bi].add(new Node(key, value)); //create new node and add to LL
                n++;
            }else{ //key exist
                Node node = bucket[bi].get(di); // get node at idx 'di' in linkedlist
                node.value = value;  //update value of exist key
            }
            double lamda = (double)n/N; //average node per bucket
            if(lamda > 2.0){
                //rehashing
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);  //bucket idx
            int di = SearchInLL(key,bi);  //data idx return index if found, -1 if not

            if(di == -1){  //check if key doesn't exist
                return null;
            }else{ //key exist
                Node node = bucket[bi].get(di); // get node at idx 'di' in linkedlist
                return node.value;  //update value of exist key
            }
        }

        public boolean containKey(K key){
            int bi = hashFunction(key);  //bucket idx
            int di = SearchInLL(key,bi);  //data idx return index if found, -1 if not

            if(di == -1){  //check if key doesn't exist
               return false;
            }else{ //key exist
                return true;  //update value of exist key
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);  //bucket idx
            int di = SearchInLL(key,bi);  //data idx return index if found, -1 if not

            if(di == -1){  //check if key doesn't exist
                return null;
            }else{ //key exist
                Node node = bucket[bi].remove(di); // get node at idx 'di' in linkedlist & remove it
                return node.value;  //update value of exist key
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
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

        HashMap<String, Integer> hm = new HashMap();
            hm.put("India",100);
            hm.put("China",150);
            hm.put("Canada",50);
            hm.put("Japan",60);
            hm.put("USA",50);

        System.out.println(hm.containKey("India"));
        System.out.println(hm.remove("China"));
        System.out.println(hm.get("USA"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());

        ArrayList<String> keys = hm.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " "+hm.get(keys.get(i)));
        }

    }
}
