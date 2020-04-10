import java.util.Arrays;

public class tester {
    public static void main(String[] args){


        //Bounded ArrayStack testing will be going here
        System.out.println("================TESTING FOR ARRAY BOUNDED STACK ================");
        BDDStack<Integer> neww = new ArrayStack<>(4);
        System.out.println("Depth--Capacity");
        neww.push(10);
        System.out.println(neww.depth() + "--" + neww.capacity());
        neww.push(20);
        System.out.println(neww.depth() + "--" + neww.capacity());
        neww.push(30);
        System.out.println(neww.depth() + "--" + neww.capacity());
        neww.pop();
        System.out.println("After pop " + neww.depth() + "--" + neww.capacity());
        neww.push(30);
        System.out.println(neww.depth() + "--" + neww.capacity());
        neww.push(40);
        System.out.println(neww.depth() + "--" + neww.capacity());



        neww.clear();
        System.out.println("After clearing " + neww.depth() + "--" + neww.capacity());

        neww.push(10);
        neww.push(20);
        neww.push(30);
        neww.push(40);



   neww.flip();
        System.out.println("What it looks like after flipping and coppying");



BDDStack<Integer> copied = neww.copy();


        int a = copied.pop();
        int b = copied.pop();
        int c = copied.pop();
        int d = copied.pop();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //Our printing method

        //Bounded ArrayList testing will be going here

        System.out.println("================TESTING FOR ARRAYLIST BOUNDED STACK ================");

        BDDStack<Integer> stackList = new ListStack<Integer>(4);

        System.out.println("Depth--Capacity");
        stackList.push(1);
        System.out.println(stackList.depth() + "--" + stackList.capacity());
        stackList.push(2);
        System.out.println(stackList.depth() + "--" + stackList.capacity());
        stackList.push(3);
        System.out.println(stackList.depth() + "--" + stackList.capacity());
        stackList.pop();
        System.out.println("After pop " + stackList.depth() + "--" + stackList.capacity());
        stackList.push(3);
        System.out.println(stackList.depth() + "--" + stackList.capacity());
        stackList.push(4);
        System.out.println(stackList.depth() + "--" + stackList.capacity());

        neww.clear();
        System.out.println("After clearing " + neww.depth() + "--" + neww.capacity());

        neww.push(10);
        neww.push(20);
        neww.push(30);
        neww.push(40);



        neww.flip();
        System.out.println("What it looks like after flipping and coppying");



        BDDStack<Integer> copied2 = neww.copy();


        int a2 = copied2.pop();
        int b2 = copied2.pop();
        int c2 = copied2.pop();
        int d2 = copied2.pop();


        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);

    }
}
