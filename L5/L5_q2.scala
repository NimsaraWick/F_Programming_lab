case class Book(title: String, author: String, isbn: String);

object Library {
    var books: Set[Book] = Set(
    Book("Jane Eyre", "Charlotte Bronte", "001"),
    Book("Robinson Crusoe", "Daniel Defoe", "002"),
    Book("Gulliver's travels","Jonathan Swift", "003"));

    def addBook(book: Book): Unit ={
        books += book;
        println(s"Book added: ${book.title}\n");
    }
 
    def removeBook(isbn: String): Unit = {
        books = books.filterNot(_.isbn == isbn);
        println(s"Book with ISBN $isbn removed.\n");
    }

    def bookExists(isbn: String): Boolean = {
        books.exists(_.isbn == isbn);
    }

    def displayCollection(): Unit = {
        println("Current library : ");
        books.foreach(book => println(s"Title: ${book.title} , Author: ${book.author} , ISBN: ${book.isbn}"));
        println("\n");
    }

    def searchByTitle(title: String): Unit = {
        val result = books.find(_.title.equalsIgnoreCase(title));
        result match {
            case Some(book) => println(s"Found: Title: ${book.title} , Author: ${book.author} , ISBN: ${book.isbn}\n");
            case None => println(s"No book found with title '$title'.\n");
        }
    }

    def displayBooksByAuthor(author: String): Unit = {
        val authorBooks = books.filter(_.author.equalsIgnoreCase(author));
        if (authorBooks.nonEmpty) {
            println(s"Books by $author:");
            authorBooks.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}\n"));
        } 
        else{
        println(s"No books found by $author.\n");
        }
    }

    @main def main(): Unit = {
        Library.displayCollection();
        Library.addBook(Book("David Copperfield", "Charles Dickens", "004"));
        Library.removeBook("003");
        println(s"Book exists with ISBN 002: ${Library.bookExists("002")}\n");
        Library.searchByTitle("Jane Eyre");
        Library.displayBooksByAuthor("Charlotte Bronte");
        Library.displayCollection();
    }
}