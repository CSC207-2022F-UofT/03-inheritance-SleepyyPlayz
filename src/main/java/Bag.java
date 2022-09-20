/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TO-DO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    /*
     * TO-DO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;

        contents = new String[capacity];
    }

    /*
     * TO-DO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    public String getColor() {
        return color;
    }

    public int getNumberOfContents() {
        return numberOfContents;
    }

    public int getCapacity() {
        return capacity;
    }

    /*
     * TO-DO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * TO-DO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     * .
     *       This method should return true if the item was added
     *       and false otherwise.
     * .
     * @param item the name of the item being added
     * @return Whether the item was successfully added or not.
     */
    public boolean addItem(String item){
        if(numberOfContents < capacity){
            // numberOfContents can also function as index for the "contents" array
            contents[numberOfContents] = item;  // Item now occupies the empty spot where
            numberOfContents += 1;  // Updating numberOfContents
            return true;
        }else{
            return false;
        }
    }

    /**
     * TO-DO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     * .
     * If there are no items in this Bag, return null.
     *
     * @return the name of the last item added to the bag
     */
    public String popItem(){
        if(numberOfContents > 0){
            // Notice that we can use numberOfContents as an index again.
            String toReturn = new String(contents[numberOfContents - 1]);  // Copy the rightmost

            numberOfContents -= 1;
            contents[numberOfContents] = "";  // Reset, just to be safe, not necessary tho.

            return toReturn;
        }else{
            return null;
        }
    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
        String[] newArray = new String[capacity];

        // Followed IntelliJ's suggestion and used System.arraycopy instead of for loop copying.
        if (numberOfContents >= 0) {
            System.arraycopy(contents, 0, newArray, 0, numberOfContents);
        }
        // Replace content's reference to newArray, thus completing the extension process
        contents = newArray;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return details of the bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}