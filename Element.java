public class Element {
    public int intElement;
    public double doubleElement;
    public String stringElement;
    
    public Element(int type, int intValue,
                    double doubleValue, 
                    String stringValue) {
                        if (type == 0) {
                            intElement = intValue;
                        }
                        if (type == 1) {
                            doubleElement = doubleValue;
                        }
                        if (type == 1) {
                            stringElement = stringValue;
                        }
                    }
    
    
}