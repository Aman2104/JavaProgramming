package Strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        // Append a string to the StringBuilder
        sb.append(" Welcome!");

        // Insert a string at a specific position
        sb.insert(6, "Awesome ");

        // Replace a substring with another string
        sb.replace(0, 5, "Hi");

        // Delete a range of characters
        sb.delete(9, 15);

        // Reverse the contents of the StringBuilder
        sb.reverse();

        System.out.println(sb);
    }
}
