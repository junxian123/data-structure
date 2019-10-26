public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> as = new ArrayStack<>();
        // test getCapacity
        System.out.println("---test getCapacity---");
        System.out.println(as.getCapacity());
        // test getSize
        System.out.println("---test getSize---");
        System.out.println(as.getSize());
        // test isEmpty
        System.out.println("---test isEmpty---");
        System.out.println(as.isEmpty());
        // test push
        System.out.println("---test push---");
        for (int i = 0; i < 5; i++) {
            as.push(i);
        }
        System.out.println(as.toString());
        // test pop
        System.out.println("---test pop---");
        Integer topStack = as.pop();
        System.out.println(topStack);
        // test peek
        System.out.println("---test peek---");
        System.out.println(as.peek());
    }
}
