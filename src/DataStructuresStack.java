import java.util.Stack;

public class DataStructuresStack {

    public static void main(String[] args) {

//        Stacks = LIFO data structre which means last in first out
//                  stores objects into a sort of bertical tower
//                  push() to add to the top and pop() to remove from the top



        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("For Honor");


//        System.out.println(stack.empty()); // Checks if stack is empty
//        stack.pop(); // removes the top of the stack
//        String myFavGame = stack.pop(); // Assign poped stack to a varible
//        System.out.println(myFavGame);
//        System.out.println(stack.peek()); // Peeks at the top of the stack with out removing it
//        System.out.println(stack.search("Skyrim")); // Searches the stack and gives its position
        System.out.println(stack);



    }

}
