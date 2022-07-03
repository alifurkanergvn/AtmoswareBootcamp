package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class MainFileIO {
	
	// step.1 -) File için CRUD işlemi yapacak bir algoritma yapınız ?

	// step.2 -) oluşturulan her bir dosyaya enum ile
	// ADMIN(yazma,okuma,oluşturmadır),WRITER(yazma veokumadaır),USER(okumak)
	// rollerini en sola yazalım ==> ADMIN 30/Haziran/2022 12:26:01 yazdımmm

	// step.3 -) Bir Dosya okuyacak başka bir dosyaya verileri yazacak ( Object)

	// step.4 -) Bu projemiz şunuda yapsın ?
	// person.txt ve homework.txt diye bir dosyamız olsun bu dosyalar
	// person.txt dosyasında ==> kişi ismi ve soyisimi olacak
	// homework.txt dosyasında ==> verilecek ödevler olacak
	// Bilgisayar random olarak kişiye ödev verecek
	
	
		// Sınıf değişkeni (Class variable)
		private static Scanner klavye = new Scanner(System.in);
		// file path
		private static String MY_PATH = new FileIOBaseAndDate().getPath();
		//File new
		private static File file = new File(MY_PATH);
		// roles
		//private static int MY_ROLES;
		//File class
		FileIOBaseAndDate pathClass;
		
		//Parametreli Constructor
		public MainFileIO (FileIOBaseAndDate pathClass){
			this.pathClass = new FileIOBaseAndDate();		
		}
		
		// Chooise Method
		public static int chooise() {
			klavye = new Scanner(System.in);
			System.out.println("Seçim yapınız.");
			System.out.println(
					"0-)Çıkış\n1-)Dosya oluştur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol değiştir\n7-)Bütün Dosyalar");
			return klavye.nextInt();
		}
		
		// ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
		// ADMIN(yazma,okuma,oluşturmadır),WRITER(yazma veokumadaır),USER(okumak)
		// mainMethod
		public static void mainMethod(int roles) throws IOException {
			int key = chooise();
			switch (key) {
				case 1:
					if (roles == 1) {
						System.out.println("*** Dosya Olusturmak ***");
						createDataFile();
					} else {
						System.out.println("Yetkiniz yok.");
					}
					break;
					
				case 2:
					if (roles <= 2) {
						System.out.println("*** Dosya Yaz ***");
						writeDataFile();
					} else {
						System.out.println("Yetkiniz yok.");
					}
					
					break;
				case 3:
					System.out.println("*** Dosya Oku ***");
					readDataFile();
					break;
				case 4:
					if (roles == 1) {
						System.out.println("*** Dosya Sil ***");
						deleteDataFile();
					} else {
						System.out.println("Yetkiniz yok.");
					}
					break;
				case 5:
					System.out.println("*** Dosya Bilgileri ***");
					dataFileInformation();
					break;
				case 6:
					System.out.println("*** Rol Secimi ***");
					roles = chooiseRole();
					break;
				case 7:
					System.out.println("*** Butun Dosyalar ***");
					allFiles();
					break;
				case 0:
					System.out.println("Cikis yapiliyor.");
					System.exit(0);
					break;
			
				default:
					System.out.println("Farkli bir deger girdiniz, yeniden deneyiniz.");
			}
		}
		
		
		private static int chooiseRole() {
			int rol = 0;
			while (rol < 1 || rol > 3) {
				System.out.println("Rol seciniz:");
				System.out.println("1-ADMIN\n2-WRITER\n3-USER");
				rol = klavye.nextInt();
			}
			return rol;
		}
		
		// data Merge
		private static String dataMerge(String fileName) {
			StringBuilder builder = new StringBuilder();
			builder.append("C:\\\\Users\\\\TCAERGUVEN\\\\eclipse\\\\jee-2022-03\\\\workspace\\\\6.HaftaOdev\\\\src\\\\FileIO\\").append(fileName).append(".txt");
			return builder.toString();
		}
		
		// create path
		private static String createPath() {
			//klavye = new Scanner(System.in);
			// "C:\\turkcell\\data.txt"
			System.out.println("Dosya adını giriniz...");
			String fileName = klavye.nextLine();
			FileIOBaseAndDate pathClass = new FileIOBaseAndDate(dataMerge(fileName));
			return pathClass.getPath();
		}
		
		//Dosya oluştur
		private static void createDataFile() throws IOException {
			System.out.println("*** Dosya Oluşturmak ***");
			String path = createPath();
			MY_PATH = path;
			file = new File(path);
			if (file.createNewFile()) {
				System.out.println(file.getAbsolutePath() + " Dosya oluşturuldu");
			} else {
				System.out.println("Oluşturulmadı");
			}
		}
		
		//Dosyaya veri yazma
		private static void writeDataFile() {
			if (!file.exists()) {
				System.out.println("Dosya mevcut degil.");
				return;
			}
			
			System.out.println("*** Dosya Yaz ***");
			klavye = new Scanner(System.in);
			System.out.println("Dosya yazmak için birşeyler yazınız...");
			String vocabulary = klavye.nextLine();
			System.out.println(MY_PATH);
			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
				// _35_FileIO4_1_FileClass class1 = new _35_FileIO4_1_FileClass();
				// bufferedWriter.write("ROL: " + MY_ROLES + " ==>" + class1.getDate() + " ==> "
				// + vocabulary);
				bufferedWriter.write(vocabulary);
				bufferedWriter.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//Dosyadan veri okuma
		private static void readDataFile() {
			System.out.println("*** Dosya Oku ***");
			try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
				StringBuilder builder = new StringBuilder();
				String satir = "";
				while ((satir = bufferedReader.readLine()) != null) {
					builder.append(satir);
				}
				System.out.println(builder);
			} catch (Exception e) {
				System.out.println("Okumada sorun oluştu");
				e.printStackTrace();
			}
			
		}
		
		//Tüm dosyalarımız
		private static String allFiles() {
			String baseFilePath = file.getParent();
			System.out.println(baseFilePath);
			System.out.println("#########");
			for (File temp : new File(baseFilePath).listFiles()) {
				System.err.println(temp.getName());
			}
			System.out.println("#########");
			return baseFilePath;
		}
		
		//Dosya silmek
		private static void deleteDataFile() {
			System.out.println("*** Dosya Sil ***");
			klavye = new Scanner(System.in);
			String tempBaseFile = allFiles();
			System.out.println("Silmek istediğiniz dosya yazınız");
			String filesName = klavye.nextLine();
			String fileConcat = tempBaseFile + "\\" + filesName + ".txt";
			File deleteFile = new File(fileConcat);
			
			// try-with resources
			if (deleteFile.exists()) {
				System.out.println("Dosyanız siliniyor");
				deleteFile.delete();
			} else {
				System.out.println("Dosyanız silinemedi");
				// kendi exception yazdım
			}
		}
	
		private static void dataFileInformation() {
			File file = new File(MY_PATH);
			System.out.println("toplam karakter sayısı: " + file.length());
			System.out.println("toplam GB : " + file.getTotalSpace());
			System.out.println("absolute path: " + file.getAbsolutePath());
			System.out.println("kullanılabileceğin GB : " + file.getUsableSpace());
			System.out.println("Değişikliği Tarihi: " + new Date(file.lastModified()));
			
		}

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int rol = chooiseRole();
			for (;;) {
				mainMethod(rol);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
