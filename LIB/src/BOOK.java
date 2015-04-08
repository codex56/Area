package BOOK;

public class BOOK
{
	
	private String title,authors;
	private double price;
	private int ISBN,no_of_copies;
	
	public BOOK()
	{
		
	}
	
	public BOOK(String name,String author,int ISBN,int copies,double cost)
	{
		this.title=name;
		this.authors=author;
		this.price=cost;
		this.ISBN=ISBN;
		this.no_of_copies=copies;
	}
	
	public void get_title()
	{
		System.out.println("Title is "+title);
	}
	
	public void get_author()
	{
		System.out.println("Author is "+authors);
	}
	
	public void get_price()
	{
		System.out.println("price is "+price);
	}
	
	public String tostring()							//Overriding to String Method
	{
		return title.toString()+" by"+authors.toString();
	}
	
	public int get_noofcopies(String name)
	{ int flag=0;
	  if(name==authors)
		  flag=1;
	  return flag;
		
	}
	
}