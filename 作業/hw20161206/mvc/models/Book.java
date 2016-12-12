package mvc.models;

import javax.swing.*;
public class Book { //定義儲存書籍資料的Book物件

	private String title, publisher;
	private double price;
	private ImageIcon coverImage;
	private String p_date;

	//Book物件的建構子
	public Book(String title, String publisher, double price, 
									ImageIcon coverImage, String p_date){
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.coverImage = coverImage;
		this.p_date = p_date;
	}

	public String toString(){ //將Book物件轉換為String物件
		return title;
	}

	public String getTitle(){ //取得書籍的標題
		return title;
	}

	public String getPublisher(){ //取得書籍的出版商
		return publisher;
	}

	public double getPrice(){ //取得書籍的價格
		return price;
	}

	public ImageIcon getCoverImage(){ //取得書籍封面的圖片
		return coverImage;
	}

	public String getPublishDate(){ //取得出版日期
		return p_date;
	}
}