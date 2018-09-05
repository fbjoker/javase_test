package doufu;

import java.io.IOException;

public class TestFolderCopy {
public static void main(String[] args) throws IOException {
		
		FolderCopy folderCopy = new FolderCopy("D:\\Test\\image","D:\\Test\\copy\\");
		
		folderCopy.copyDir("D:\\Test\\image","D:\\Test\\copy\\");
	}
}
