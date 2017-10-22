package stack;

public class App {

    public static void main(String[] args){
        Stack stack = new Stack(8 );

        for(int i = 8; i > 0; i--)
            stack.push(i);

        System.out.println(stack.toString());

        stack.push(10);

        System.out.println(stack.toString());

        while(!stack.isEmpty())
            stack.pop();

        stack.pop();

        System.out.println(stack.toString());

        while(!stack.isFull())
            stack.push(49);

        System.out.println(stack.toString());

        stack.push(100);
        System.out.println(stack.peek());

        System.out.println(stack.toString());

//        System.out.println(reverseString("hello my name is Rohan"));

    }

    // O(N) where N = # chars in str
//    public static String reverseString(String str){
//        Stack stack = new Stack(str.length());
//        for(int i = 0; i < str.length(); i++)
//            stack.push(str.charAt(i));
//        str = "";
//        while(!stack.isEmpty())
//            str += stack.pop();
//        return str;
//    }
}
