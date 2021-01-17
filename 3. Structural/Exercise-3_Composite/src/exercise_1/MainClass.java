package exercise_1;
public class MainClass {
	public static void main(String[] args) {
		//create Laafs/Files
		File filel = new File ( "File",30, "TXT");
		File file2 = new File ( "File 2", 40, "PNG");
		File file3 = new File ( "File 3", 50, "GIF");
		File file4 = new File ( "File 4", 60, "TXT");
		File fileS = new File ( "File 5", 70, "MOV");

		//create Branches/Folders
		Folder folderA = new Folder();
		Folder folderB = new Folder ();
		//Assign Leafs/Files to Branches/Folders
		folderB.add(file4);
		folderB.add(fileS);
		folderA.add(filel);
		folderA.add(file2);
		folderA.add(file3);
		folderA.add(folderB); //add also FolderB under FolderA
		folderA.showDetails();
		}

}
