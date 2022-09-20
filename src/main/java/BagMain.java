/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     * TO-DO: Implement this method
     * Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     * .
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     *
     * @param bags an array of objects that ARE Bags (child classes of Bag)
     * @param double_enhance_handbags bool, whether to enhance a second time or not
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        for(Bag b : bags){
            b.enhance();

            // Check for double enhance for HandBag instances
            if(double_enhance_handbags && (b instanceof HandBag)){
                b.enhance();
            }
        }
    }

    /**
     * TO-DO: Implement this method
     * Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        int sum = 0;

        for(Bag b : bags){
            if(b instanceof CrossbodyBag){
                sum += ((CrossbodyBag) b).getNumberOfStraps();  // Down-casting then calling method
            }
        }

        return sum;
    }
}