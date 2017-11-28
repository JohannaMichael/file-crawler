package files.simple;

import java.io.File;
import java.util.Comparator;

public class StringLengthComparator implements Comparator<File> {

	@Override
	public int compare(File o1, File o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getName().length(), o2.getName().length());
	}

}
