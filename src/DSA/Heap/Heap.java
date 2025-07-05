package DSA.Heap;
import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){
        arr.add(data);

        int x = arr.size()-1; //x is child
        int par = (x-1) / 2;  // parent

        while(arr.get(x) < arr.get(par)){
           int temp = arr.get(x);  //swap
           arr.set(x, arr.get(par));
           arr.set(par, temp);

           x = par;
           par = (x-1)/2;
        }
    }

    public int peek(){
       return arr.get(0);
    }

    private void heapify(int i){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int minIdx = i;

        if(left < arr.size() &&  arr.get(minIdx) > arr.get(left)){
            minIdx = left;
        }
        if(right < arr.size() &&  arr.get(minIdx) > arr.get(right)){
            minIdx = right;
        }

        if (minIdx != i) {
            //swap
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }

    public int remove() {
        int data = arr.get(0);

        //swap
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);
        //delete
        arr.remove(arr.size() - 1);
        //heapify means repair heap
        heapify(0);

        return data;
    }

    private boolean isEmpty() {
        return arr.isEmpty();
    }

    public static void main(String[] args) {
           Heap h1 = new Heap();
           h1.add(3);
           h1.add(4);
           h1.add(1);
           h1.add(5);

           while(!h1.isEmpty()){
               System.out.println(h1.peek());
               h1.remove();
           }
    }
}
