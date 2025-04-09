
import java.util.Scanner;


class Book{
    private String author;
    private String title;
    private int isbn;
    Book(String author,String title,int isbn){
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    void displaybook(){
        System.out.println("Book Name: "+title+", Book Author: "+author+", ISBN: "+isbn);
    }
    String gettitle(){
        return title;
    }
    String getauthor(){
        return author;
    }
}

interface libraryop{
    void addbook(Book b);
    void listbook();
    void searchbook(String info);
}

class library implements libraryop{
    private String name;
    private String address;
    private Book[] books;
    private int count=0;
    private int max=50;
    private boolean found=false;

    library(String name,String address){
        this.name=name;
        this.address=address;
        this.books=new Book[max];
    }

    public void addbook(Book b){
        if(count<max){
            books[count++]=b;
        }
        else{
            System.out.println("List is Full...");
        }
    }

    public void listbook(){
        for(int i=0;i<count;i++){
            books[i].displaybook();
        }
    }

    public void searchbook(String info){
        for(int i=0;i<count;i++){
            if(books[i].gettitle().equalsIgnoreCase(info)){
                found=true;
                books[i].displaybook();
                break;
            }
        }
        if(found){
            System.out.println("No Book Found...");
        }
    }
}

public class librarymanagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        library lb=new library("Graphic Era Library","Clemen town,Dehradun");
        while(true){
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. List All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter book title: ");
                    String title=sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author=sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    int isbn=sc.nextInt();
                    sc.nextLine();
                    Book b=new Book(author,title,isbn);
                    lb.addbook(b);
                    break;
                case 2:
                    lb.listbook();
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String search=sc.nextLine();
                    lb.searchbook(search);
                    break;
                case 4:
                    System.out.println("Ending Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Select a valid option...");
            }
        }
    }
}
