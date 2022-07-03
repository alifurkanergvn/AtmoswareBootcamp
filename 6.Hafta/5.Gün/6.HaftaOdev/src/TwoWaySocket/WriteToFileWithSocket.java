package TwoWaySocket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WriteToFileWithSocket {
	
	public static void writeToFile(String str) {
		String path = "C:\\Users\\TCAERGUVEN\\eclipse\\jee-2022-03\\workspace\\Turkcelll_JavaSEE\\src\\main\\java\\TwoWaySocket\\data.txt";
		File file = new File(path);
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.append(" " + createDate());
		
		try {
			file.createNewFile();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
			bufferedWriter.write(stringBuilder.toString());
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
		} catch (IOException e) {
			System.out.println("Dosya olusturulamadi.");
			e.printStackTrace();
		}
		
	}
	
	private static String createDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		return dateFormat.format(new Date());
	}
	
}
