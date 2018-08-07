package com.Catalin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**Primitive data types are value types, in other words, they hold a value. Unlike these,
         * Arrays and Strings are reference types.
         */
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        /** When you initialize an array, a new array is created in memory with the given number of elements,
         * set by default to 0, so in the above example the array is myIntValue = {0,0,0,0,0,0,0,0,0,0}
         */

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        /** These are value types, when you create an int variable, a single space in memory is allocated to
         * store the value and that variable will directly hold the value.
         */

        /** Reference types are used as references and they hold a reference or an address of the object
         * but not the object itself. Eve
         */

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        /** One way of knowing that you are using a reference is the "new" operator, meaning that you are creating
         * a new object.
         * To print these out we are going to use a built in Java method.
         */
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        /** This will print out every element of the array and it will convert them to strings.
         */
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        /** Since this is just a reference to an Array in memory, changing one of the variables, will actually
         * update both.
         */

        /** Long story short, using a primitive data type means that if you use the following code:
         * int one = 1;
         * int two = one;
         * You are first of all setting the value of 1 to int one and then you state that int two is equal to int one.
         * This means that changing the value of int one will also change the value of int two. But not the other way
         * around. You did not assign the value of two to int one so if you change the value of int two, int one will
         * not be affected. You are interacting only with the surface layer, only with the values of the ints.
         *
         * In the case of reference data types. You actually interfere with the origin. so if you have:
         * arrayOne [0] = 1;
         * arrayTwo = arrayOne;
         * any change that you make to one array will also apply to the other array. Because these are just references to
         * an origin point, an array created in memory. You are not assigning the value of arrayOne to the value of arrayTwo,
         * instead you are stating that the arrays are equal. Just like = vs ==. The first one sets a value, the second
         * verifies that the values are identical.
         */

    modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};
        /** This is called de-referencing, we are re-initializing an array, a reference that will point to a different
         * object in memory so the arrays are no longer pointing to same object anymore.
         */
    }

}
