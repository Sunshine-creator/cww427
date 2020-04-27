package cww.book;

public class BookList {
private  Book[] books = new Book[100];
int size =0;//有效元素的个数
    public BookList(){
        books[0]= new Book("三国演义",45,"罗贯中",
                "四大名著",false);
        books[1] = new Book("西游记",68,
                "吴承恩","四大名著",false);
         size =2;
    }
     public  Book getBook(int pos){
        return books[pos];
     }
     public void setBook(int pos,Book book){
        books[pos] =book;
     }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
