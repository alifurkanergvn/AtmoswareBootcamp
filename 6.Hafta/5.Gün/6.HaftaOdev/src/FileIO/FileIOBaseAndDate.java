package FileIO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileIOBaseAndDate {
	
		
		private String path;
		private final String date = createdDate();
		

		public FileIOBaseAndDate() {
			this.path = "C:\\Users\\TCAERGUVEN\\eclipse\\jee-2022-03\\workspace\\6.HaftaOdev\\src\\FileIO\\data.txt";
			File file = new File(path);
			
			try {
				if (file.createNewFile()) {
					System.out.println("data.txt oluşturuldu!");
				}else {
					System.out.println("zaten aynı isimde txt dosyası var");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Parametreli Constructor
		public FileIOBaseAndDate(String path) {
			this.path= path;
		}
		
		private String createdDate() {
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
			return dateFormat.format(new Date());
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getDate() {
			return date;
		}
		
		
}
