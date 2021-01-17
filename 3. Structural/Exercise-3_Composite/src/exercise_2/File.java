package exercise_2;
public class File {

	private String filename;
	private int fileSizeInKB;
	private String _fileType;
	
	
	public File(String filename, int fileSizelnKB, String fileType) {
		this.filename = filename;
		this.fileSizeInKB = fileSizelnKB;
		this._fileType = fileType;
		}
	
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println(" File Name =" + filename + ";File size in KB = " + fileSizeInKB + "; File type " + _fileType );
	}

}
