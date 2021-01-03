package main;

import util.DefaultRequestHandler;
import util.UtilException;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(
					new DefaultRequestHandler().request("http://localhost:4000/Spring-MD5/md5/criptografar", "gEt", null)
			);
		} catch (UtilException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
