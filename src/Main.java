public class Main {
    public static void main(String[] args) {
        Author a = new Author("James", "jamesgosling@gmail.com", 'M');
        System.out.println(a); // toString();
        System.out.println("============================");
        //Getters and Setters
        System.out.println("Author name is: " + a.getName());
        System.out.println("gender is: " + a.getGender());
        a.setEmail("jamesgosling@gmail.com");
        System.out.println("His email is: " + a.getEmail());
        System.out.println("============================");
        Book book = new Book("Java", 99.99, 9 ,
                new Author("James Gosling", "jamesgosling@gmail,com", 'M'));
        System.out.println(book);//toString()
        System.out.println("=============================");
        //Getters and Setters
        System.out.println("Book author is: " + book.getAuthor());
        System.out.println("Book name is: " + book.getName());
        book.setPrice(99.99);
        book.setQty(9);
        System.out.println("Book price is: " + book.getPrice());
        System.out.println("qty is:" + book.getQty());

    }
    }





