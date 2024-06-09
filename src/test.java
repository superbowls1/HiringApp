import java.util.LinkedList;

public class test {
    public static boolean check(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        int i = 0;
        int j = 0;

        while(i<list1.size()&& j<list2.size()){
            if(list1(i)==list2(i)){
                return true;
            }


        }


        return false;
    }

    private static boolean list2(int i) {
        return true;
    }

    private static boolean list1(int i) {
        System.out.println("They are equal");
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        System.out.println("They end with each other" );
    }
}
