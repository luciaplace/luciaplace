package day1117.io;

import java.io.*;
import java.util.*;


public class BookList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "book_list.csv";
		List<Book> bookList = new ArrayList<Book>();
		
		try(FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				){ String b = "";
						while((b = br.readLine())!=null) {
						String book [] = b.split(",");
						Book nwbook = new Book(Integer.parseInt(book[0]), book[1], book[2], Integer.parseInt(book[3]));
						bookList.add(nwbook);
						
						}
			
		}catch (FileNotFoundException e) {e.printStackTrace();
		}catch(IOException e) {e.printStackTrace();
		
		}
			// TODO: handle exception
		}
	}

