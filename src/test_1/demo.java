package test_1;
import java.util.Scanner;
class demo extends demo2 {
    String name;
    int n;

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		demo other = (demo) obj;
		if (n != other.n)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class demo2{
	
}
class DemoTest {
	public static void main(String[] args) {
		demo2 d = new demo();
		System.out.println(d.toString());
		System.out.println(new demo().name);
	//	demo pdd = demo(d);
	}
}