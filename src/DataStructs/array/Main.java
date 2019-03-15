package DataStructs.array;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(1);
        System.out.println(dynamicArray);

        dynamicArray.add(0);
        System.out.println(dynamicArray);

        dynamicArray.add(1);
        System.out.println(dynamicArray);

        dynamicArray.add(2);
        System.out.println(dynamicArray);

        dynamicArray.add(3);
        System.out.println(dynamicArray);

        dynamicArray.removeEnd();
        System.out.println(dynamicArray);

        dynamicArray.removeEnd();
        System.out.println(dynamicArray);

        dynamicArray.removeEnd();
        System.out.println(dynamicArray);

        dynamicArray.removeEnd();
        System.out.println(dynamicArray);



    }
}
