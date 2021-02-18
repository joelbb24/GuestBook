package io.pragra.learning;

public class GuestRun {
    public static void main(String[] args) {
        GuestBook book = new GuestBook();

        try {
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
            book.add(new Guest("Hitesh", "abc@email.com"));
        } catch (InvalidNameException e) {
            e.printStackTrace();
        } catch(GuestBookFullException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println("Book is closed now");
        }

    }
}
