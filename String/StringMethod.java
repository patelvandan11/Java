class StringMethods{
    public static void main(String[] args) {
        String str = "Hello World";
        // print the length of the string
        System.out.println(str.length());
        
        // print the character at index 0
        System.out.println(str.charAt(0));
        
        // print the character at index 6
        System.out.println(str.charAt(6));
        
        // print the substring starting from index 6
        System.out.println(str.substring(6));
        
        // print the substring from index 0 to 4 (exclusive)
        System.out.println(str.substring(0, 5));
        
        // print the index of the first occurrence of 'o'
        System.out.println(str.indexOf('o'));
        
        // print the index of 'o' starting from index 5
        System.out.println(str.indexOf('o', 5));
        
        // print the index of the last occurrence of 'o'
        System.out.println(str.lastIndexOf('o'));
        
        // print the index of 'o' starting from index 5 in reverse order
        System.out.println(str.lastIndexOf('o', 5));
        
        // check if the string starts with "Hello"
        System.out.println(str.startsWith("Hello"));
        
        // check if the string ends with "World"
        System.out.println(str.endsWith("World"));
        
        // check if the string contains "World"
        System.out.println(str.contains("World"));
        
        // check if the string is equal to "Hello World"
        System.out.println(str.equals("Hello World"));
        
        // check if the string is equal to "hello world" (ignoring case)
        System.out.println(str.equalsIgnoreCase("hello world"));
        
        // compare the string with "Hello World" lexicographically
        System.out.println(str.compareTo("Hello World"));
        
        // compare the string with "hello world" lexicographically (ignoring case)
        System.out.println(str.compareToIgnoreCase("hello world"));
        
        // convert the string to lowercase
        System.out.println(str.toLowerCase());
        
        // convert the string to uppercase
        System.out.println(str.toUpperCase());
        
        // remove leading and trailing whitespaces from the string
        System.out.println(str.trim());
        
        // replace all occurrences of 'o' with 'a'
        System.out.println(str.replace('o', 'a'));
        
        // replace all occurrences of "World" with "Java"
        System.out.println(str.replaceAll("World", "Java"));
        
        // replace the first occurrence of "World" with "Java"
        System.out.println(str.replaceFirst("World", "Java"));
        
        // concatenate the string with "!!!"
        System.out.println(str.concat("!!!"));
        
        // concatenate the string with "!!!" using the + operator
        System.out.println(str + "!!!");
        
        // convert the string to a character array
        System.out.println(str.toCharArray());
        
        // convert the string to a byte array
        System.out.println(str.getBytes());
    }
}