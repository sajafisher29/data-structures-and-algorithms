package code401challenges.tree;

public class FizzBuzzTree<T> {

    // Write a function called FizzBuzzTree which takes a tree as an argument.
    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> tree){
        fizzBuzz(tree.root);
        //Return the tree with its new values.
        return tree;
    }

    //    Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
    //    If the value is divisible by 3, replace the value with “Fizz”
    //    If the value is divisible by 5, replace the value with “Buzz”
    //    If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

    public static void fizzBuzz(Node<Object> current) {
        if (current != null) {
            fizzBuzz(current.leftChild);
            fizzBuzz(current.rightChild);
            if ((Integer) current.value % 15 == 0) {
                current.value = "FizzBuzz";
            } else if ((Integer) current.value % 3 == 0) {
                current.value = "Fizz";
            } else if ((Integer) current.value % 5 == 0) {
                current.value = "Buzz";
            }
        }
    }
}