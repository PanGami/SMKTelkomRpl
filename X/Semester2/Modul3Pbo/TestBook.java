public class TestBook
{
	public static void main(String[] args){                  // Main Method - Only this method gets executed
		//Create a Book object
		Buku book1 = new Buku("Gary Rich", 8.99f, 19.99f, "How to get rich", 100);   
		//Fetch Book Class specific fields from this book
		System.out.println("\n1) Book Details\n    1a) Author: " + book1.author + " | cost price: "+ book1.costPrice +" | sale price:"
				+ book1.salePrice +" | pages: "+ book1.pages +" | title: " + book1.title+"\n");
		//Get Profit and Tax
		System.out.println("    1a) Author " + book1.author + " nets a per-book profit of $" + book1.netProfit() + " and a tax of $" + book1.getTax());

		//Create an e-book object
		Ebook book2 = new Ebook("Seth Devilin", 10f, 23f, "Bad habits that lead to success", 200, "Amazon", 80);
		//Fetch Book Class specific fields from this ebook
		System.out.println("\n2) EBook Details\n    2a) Author: " + book2.author + " | cost price: "+ book2.costPrice +" | sale price:"
				+ book2.salePrice +" | pages: "+ book2.pages +" | title: " + book2.title+"\n");
		//Get Profit and Tax
		System.out.println("    2b) Author " + book2.author + " nets a per-book profit of $" + book2.netProfit() + " and a tax of $" + book2.getTax());
		//Get per page size
		System.out.println("\n    2c) Book \"" + book2.title + "\" has a per-page size of " + book2.pageSize() +" MB\n");
	}

}