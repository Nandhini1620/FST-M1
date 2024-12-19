package fst_m1_java;

public class Activity5 {

	public static void main(String[] args) {
		String title = "Anna Karenina";
		MyBook_Activity5 novel = new MyBook_Activity5();
		novel.setTitle(title);
		String bookname = novel.getTitle();
		System.out.println(bookname);

	}

}
