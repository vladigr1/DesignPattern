package exercise_1;
public class File implements Component {

	private String filename;
	private int fileSizeInKB;
	private String _fileType;
	
	
	public File(String filename, int fileSizelnKB, String fileType) {
		this.filename = filename;
		this.fileSizeInKB = fileSizelnKB;
		this._fileType = fileType;
		}
	@Override
	public void showDetails() {
		System.out.println(" File Name =" + filename + ";File size in KB = " + fileSizeInKB + "; File type " + _fileType );
	}

}
