/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intElements = new int[ INITIAL_CAPACITY];
        doubleElements = new double[ INITIAL_CAPACITY];
        stringElements = new String[ INITIAL_CAPACITY];
        typeOfElements = new int[ INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String output = "[";
        for (int index = 0; index < filledElements; index++){
            int num = typeOfElements[index];
            if (num == 0){
                output += intElements[index] + ",";
            }
            else if (num == 1){
                output += doubleElements[index] + ",";
            }
            else{
                output += stringElements[index] + ",";
            }
        }
        output += "]";
        return output;
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
            if (filledElements == typeOfElements.length) {
              expand();
            }
            if (type == 0) {
              intElements[filledElements] = intValue;
              doubleElements[filledElements] = 0;
              stringElements[filledElements] = "";
              typeOfElements[filledElements] = 0;
            }
            else if (type == 1) {
              doubleElements[filledElements] = doubleValue;
              intElements[filledElements] = 0;
              stringElements[filledElements] = "";
              typeOfElements[filledElements] = 1;
            }
            else{
              stringElements[filledElements] = stringValue;
              intElements[filledElements] = 0;
              doubleElements[filledElements] = 0;
              typeOfElements[filledElements] = 2;
            }
            filledElements++;
            return true;
          }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expDoubleand... (for debugging)");
        int[] newIntValue = new int[intElements.length * 2];
        for (int i = 0; i < intElements.length; i ++) {
            newIntValue[i] = intElements[i];
        }
        intElements = newIntValue;
        double[] newDoubleValue = new double[doubleElements.length * 2];
        for (int i = 0; i < doubleElements.length; i ++) {
            newIntValue[i] = intElements[i];
        }
        doubleElements = newDoubleValue;

        String[] newStringValue = new String[stringElements.length * 2];
        for (int i = 0; i < stringElements.length; i ++) {
            newIntValue[i] = intElements[i];
        }
        stringElements = newStringValue;

        int[] newTypeValue = new int[typeOfElements.length * 2];
        for (int i = 0; i < typeOfElements.length; i ++) {
            newTypeValue[i] = typeOfElements[i];
        }

     }
}
