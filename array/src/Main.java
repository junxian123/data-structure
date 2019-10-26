import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Array<Integer> arr = new Array<>(10);

        System.out.println("---test add/push/unshift---");
        // test add
        for (int i = 0; i < 4; i++) {
            arr.push(i);
        }
        System.out.println(arr.toString());
        // test push
        arr.push(4);
        System.out.println(arr.toString());
        // test unshift
        arr.unshift(5);
        System.out.println(arr.toString());

        System.out.println("---test remove/pop/shift---");
        // test remove
        arr.remove(0);
        System.out.println(arr.toString());
        // test pop
        arr.pop();
        System.out.println(arr.toString());
        // test shift
        arr.shift();
        System.out.println(arr.toString());

        // test set
        System.out.println("---test set---");
        arr.set(0,10);
        System.out.println(arr.toString());
        // test get
        System.out.println("---test get---");
        Integer e = arr.get(0);
        System.out.println(e);
        // test contains
        System.out.println("---test contains---");
        boolean isContains = arr.contains(11111);
        System.out.println(isContains);
        isContains = arr.contains(10);
        System.out.println(isContains);
        // test 动态数组
        System.out.println("原数组:"+arr.toString());
        for (int i = 10; i < 20; i++) {
            arr.push(i);
        }
        System.out.println("动态改变后数组:"+arr.toString());

    }
}
