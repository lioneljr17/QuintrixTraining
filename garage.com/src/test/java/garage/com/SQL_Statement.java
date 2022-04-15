package garage.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SQL_Statement {

	public static void main(String[] args) {
		try { 
			File SQL = new File("src/test/resources/SQL_Basic.txt");
			Scanner Read =new Scanner(SQL);
			while (Read.hasNextLine()) {
				String Data = Read.nextLine();
				System.out.println(Data);
			}
			Read.close();
		}catch(FileNotFoundException I) {
			I.printStackTrace();
		}

	}

}
