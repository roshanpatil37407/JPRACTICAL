public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Creating wrapper objects
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        // Displaying values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);

        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Wrapped Character: " + wrappedChar);

        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Converting from wrapper object to primitive
        int unwrappedInt = wrappedInt.intValue();
        double unwrappedDouble = wrappedDouble.doubleValue();
        char unwrappedChar = wrappedChar.charValue();
        boolean unwrappedBoolean = wrappedBoolean.booleanValue();

        // Displaying unwrapped values
        System.out.println("\nUnwrapped int: " + unwrappedInt);
        System.out.println("Unwrapped double: " + unwrappedDouble);
        System.out.println("Unwrapped char: " + unwrappedChar);
        System.out.println("Unwrapped boolean: " + unwrappedBoolean);
    }
}
