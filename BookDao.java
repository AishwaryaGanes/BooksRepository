package p;

import java.util.Date;

public class BookDao {
	private static Books list
    = new Books();

// This static block is executed
// before executing the main
// block
static
{

    // Creating a few employees
    // and adding them to the list
    list.getBookList().add(
        new Book(
            1,
            "Half girlfriend",
            "Chetan Bhagat",
            "Its a nice book",
            new Date("12-03-1995")));

   

       
}

// Method to return the list
public Books getAllBooks()
{

    return list;
}

   
    // Method to add an employee
    // to the employees list
    public void
    addEmployee(Book book)
{
    list.getBookList()
        .add(book);
       
}
	

}
