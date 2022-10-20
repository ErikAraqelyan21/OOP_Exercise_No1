import Statics.Author;

public class Main {
    public static void main(String[] args) {
        Author a = new Author("Valodia","shnik@gmail.com",'M');
        System.out.println(a);
        System.out.println("Author name is: " + a.getName());
        System.out.println("gender is: " + a.getGender());
        a.setEmail("shnik@gmail.com");
        System.out.println("Email is: " + a.getEmail());

            }
    }





