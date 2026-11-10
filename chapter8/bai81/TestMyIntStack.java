public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(2);

        System.out.println("Empty: " + stack.isEmpty()); // true
        System.out.println("Full: " + stack.isFull());   // false

        stack.push(10);
        stack.push(20);

        System.out.println("Full before adding 30: "
                + stack.isFull()); // true

        stack.push(30); // Mảng tự tăng sức chứa
        System.out.println("Top after adding 30: "
                + stack.peek()); // 30
        System.out.println("Full after resizing: "
                + stack.isFull()); // false

        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Pop: " + stack.pop()); // 10

        System.out.println("Empty at the end: "
                + stack.isEmpty()); // true
    }
}