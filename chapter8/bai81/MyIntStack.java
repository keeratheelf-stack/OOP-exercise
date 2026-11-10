import java.util.Arrays;

public class MyIntStack {
    private int[] contents;
    private int tos;

     public MyIntStack(int capacity) {
      contents = new int[capacity];
      tos = -1;
   }
 
   public void push(int element) {
    if (isFull()) {
        int newCapacity = Math.max(1, contents.length * 2);
        contents = Arrays.copyOf(contents, newCapacity);
    }
      contents[++tos] = element;
   }
 
   public int pop() {
      return contents[tos--];
   }
 
   public int peek() {
      return contents[tos];
   }
 
   public boolean isEmpty() {
      return tos < 0;
   }
 
   public boolean isFull() {
      return tos == contents.length - 1;
   }
   
}
