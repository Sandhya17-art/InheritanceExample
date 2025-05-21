interface printable{
    void print();
}
interface showtable{
    void show();
}
class Document implements printable , showtable{
public void print()
{
    System.out.println("Print the Document ");
    System.out.println("Print Name Sagun");
}
public void show()
{
    System.out.println("Show the Document");
    System.out.println("Show the name of girl named Bindu");

}
}
 public class MultipleInheritance {
    public static void main(String[] args) {
        {
            Document doc = new Document();
            doc.print();
            doc.show();
        }
    }
 }