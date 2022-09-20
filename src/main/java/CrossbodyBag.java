/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TO-DO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
public class CrossbodyBag extends Bag{

    private final int numberOfStraps;
    // This property is final as per IntelliJ's suggestion,
    // Because no where is it changed after initialization

    /**
     * Creates a new CrossbodyBag with its color, capacity, and number of straps.
     *
     * @param color color of the bag
     * @param capacity initial capacity of the bag
     * @param numberOfStraps number of straps on the bag
     * */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     * Getter for number of straps on the bag.
     *
     * @return number of straps on the bag
     * */
    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    /**
     * Increase the capacity of this bag by 1.
     */
    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    /**
     * Return the details of this CrossbodyBag.
     *
     * @return details of the bag
     */
    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + String.valueOf(numberOfStraps) +
                " straps (" + this.getNumberOfContents() + " / " + this.getCapacity() + ")";
    }
}