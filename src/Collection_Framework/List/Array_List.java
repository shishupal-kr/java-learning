package Collection_Framework.List;
import java.util.ArrayList;
import java.util.List;

    public class Array_List {
        public static void main(String[] args) {

            List<String> list = new ArrayList<>();  //use LinkedList,vector

            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
            list.add("Date");
            list.addLast("kela");
            list.add("Orange");
            list.add("Pear");
            list.add(1, "Blueberry");

            System.out.println(list);

            list.get(2);
            list.set(2, "Coconut");
            list.remove("Date");
            list.remove(1);
            System.out.println("After removal: " + list);
            System.out.println("Size of list: " + list.size());
            System.out.println(list.contains("Apple"));//checkelmnt
            System.out.println(list.indexOf("Coconut"));// indx of elmnt

            //sublist from index 0, print 2 index
            List<String> subList = list.subList(0,3);

            System.out.println("Sublist: " + subList);

            System.out.println("Iterating over the list:");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }