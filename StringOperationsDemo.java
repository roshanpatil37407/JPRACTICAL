public class StringOperationsDemo {
    public static void main(String[] args) {
        // Initialization
        String str1 = "Hello";
        String str2 = "World";
        String combinedString;

        // Concatenation
        combinedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + combinedString);

        // Length
        int length = combinedString.length();
        System.out.println("Length of the String: " + length);

        // Character at a specific index
        char charAtIndex = combinedString.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = combinedString.substring(0, 5);
        System.out.println("Substring from index 0 to 4: " + substring);

        // Uppercase and lowercase
        String uppercaseString = combinedString.toUpperCase();
        String lowercaseString = combinedString.toLowerCase();
        System.out.println("Uppercase String: " + uppercaseString);
        System.out.println("Lowercase String: " + lowercaseString);

        // Replace
        String replacedString = combinedString.replace('o', 'x');
        System.out.println("String after replacing 'o' with 'x': " + replacedString);

        // Check if a string contains another string
        boolean containsWorld = combinedString.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);

        // Compare strings
        String str3 = "Hello World";
        boolean isEqual = combinedString.equals(str3);
        System.out.println("Are the strings equal? " + isEqual);

        // Trim leading and trailing whitespaces
        String stringWithSpaces = "   Trim Me   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Original String: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
