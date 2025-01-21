public class ComparisonStrings {
    public static void main(String[] args) {
//        String is immutable due to security reasons.
//        == -> methods checks wh ether the two reference variables are pointing to the same object.

//        String a = "Nihad";
//         a = "Kuala"        -> This possible because we are not changing the object intern we are creating a new object.


//        In java here both reference variables are pointing to the same object in the string pool in the heap memory. -> For optimization.
        String a = "Nihad";
        String b = "Nihad";

//        By using the new keyword we can create two different objects. They will be outside the spring pool.
//        here a == b -> False.

//        When you only need to check value use .equals method.

//        '' -> Single quote is used for characters.
//        "" -> Double quote used for strings.

//        'a' + 'b' -> print -> 195 -> converts to ASCII and add.
//        "a" + "b" -> print > ab. -> only operator overloading available in java. No other operator overloading is available unlike cpp.
//        'a' + 3 -> print -> 100(ASCII of a is 97).
//        "a" + 1 -> print -> a1 -> integer will be converted Integer which will call it's toString().

//        if anyone is string other will become string.

//        string doesn't allow to modify its value, its immutable. Each time new object is created, so the old
//        objects will have no reference variable and they will ultimately be removed by garbage collector.
//        if we loop through alphabet and add to string, it will have time complexity of O(n2).

//        So we have STRINGBUILDER -> no new object is created, changes are made to the existing object only.

    }
}
