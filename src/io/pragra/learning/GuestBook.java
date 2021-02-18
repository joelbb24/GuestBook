package io.pragra.learning;

public class GuestBook {
    private int capacity = 20;
    private Guest[] book = new Guest[20];

    public void add(Guest guest) throws InvalidNameException {
        if(guest.getName().length()<4) {
            throw new InvalidNameException("Name should be 4 or more character");
        }

        if(!guest.getEmail().matches("[aA-AZ]+@[aA-aZ]"))


        for(int i=0; i< book.length; i++) {
            if(book[i] == null) {
                book[i] = guest;
                break;
            }
        }

        if(book[capacity-1] != null) {
            throw new GuestBookFullException("All Guest has been added no more room");
        }

    }
}
