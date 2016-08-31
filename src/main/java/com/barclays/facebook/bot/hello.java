package com.barclays.facebook.bot;


import java.io.*;
import java.nio.CharBuffer;

public class hello {

	public hello() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {

			// String prg = "import sys\nprint
			// int(sys.argv[1])+int(sys.argv[2])\n";
			// BufferedWriter out = new BufferedWriter(new
			// FileWriter("test1.py"));
			// out.write(prg);
			// out.close();

			String s = "Change Statement Date";
			int number1 = 564;
			int number2 = 32;

			ProcessBuilder pb = new ProcessBuilder("python3", "/opt/bitnami/pyfiles/chat_bot_nlp_combined.py", ""+s,"");
			//ProcessBuilder pb = new ProcessBuilder("python", "F:/chatbotworkspace/facebookJavabot/chat_bot_nlp_combined.py","" + s, "");
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			///BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// int ret = new Integer(in.readLine()).intValue();
			System.out.println("value is : " + in.readLine());
			//System.out.println("value is : " + error.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
