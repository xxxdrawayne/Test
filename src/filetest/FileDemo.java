package filetest;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Tencent\\Tim Files\\1912297235\\FileRecv\\UML课程设计");
//		file.createNewFile();
//
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());
//		File[] filelist = file.listFiles();
//		for(File f:filelist) {
//			System.out.println(f.getAbsolutePath());
//		}
		GetAllFilePath(file);
//		System.out.println(file.mkdirs());
//		File file1 = new File("D:\\英雄时刻\\23470739");
//		file1.delete();
//		file.delete();
//		new File("d:\\aaaa\\1.txt").delete();
//		file.delete();
//		File file = new File("aaa\\bbb\\ccc");
//		file.mkdirs();
//		file.renameTo(null);
//		File file2 = new File("d:\\");
//		String[] filstr = file2.list();
//		for(String s:filstr) {
//			System.out.println(s);
//		}
//		String[] filterstr = file.list(new FilenameFilter() {
//			public boolean accept(File dir,String name) {
//				return true;
//			}
//		});
	}

	public static void GetAllFilePath(File file) {
		File[] filelist = file.listFiles();

		if(!file.isDirectory()) {
			System.out.println(file.getAbsolutePath());
			return;
		}
		for(File f:filelist) {
			if(f.isDirectory()) {
				GetAllFilePath(f);
			}else
				System.out.println(++count+"  "+f.getAbsolutePath());
		}
	}
}
