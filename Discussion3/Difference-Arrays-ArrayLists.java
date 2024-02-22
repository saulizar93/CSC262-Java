import java.util.ArrayList;

class DifferenceArraysArrayLists{


    public static void main(String[] args){
        // Array

        // type and size of the array are fixed, cannot be changed after initialization
        String[] foodArray = {"CA Burrito", "Carne Asada Taco", "Rolled Taco", "Pozole", "Tortilla"};

        System.out.println("Array elements:");
        for(String food:foodArray) {
            System.out.println(food);
        }

        // print first entry and try to edit it
        System.out.println("\n***Trying to edit the first array element");
        System.out.println("Original first element: " + foodArray[0]);
        foodArray[0] = "TX Burrito";
        System.out.println("Edited first element (same data type): " + foodArray[0]);
        
        // cannot set an integer, must always be a String since the array was initialized as a String array
        // foodArray[0] = 5;
        // foodArray[5] = "new entry"; // this gives an exception: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // you cannot increase the size of an array after initialization

        // ArrayList
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add("2nd");
        arrayList.add(0.95);
        arrayList.add("testing string");
        arrayList.add("final arrayList entry");
        
        System.out.println("\nArrayList elements:");
        for(Object entry: arrayList){
            System.out.println(entry);
        }

        // edit first entry of ArrayList
        System.out.println("\n*** Trying to edit the first entry of ArrayList:");
        System.out.println("Original first element: " + arrayList.get(0));

        arrayList.set(0, "first element substituted");
        System.out.println("Edited first element: " + arrayList.get(0));

        // increase the size of the ArrayList
        arrayList.add("new entry");

        // print out ArrayList again
        System.out.println("\nPrint out ArrayList again after adding a new entry:");
        for(Object entry: arrayList){
            System.out.println(entry);
        }
    }
}