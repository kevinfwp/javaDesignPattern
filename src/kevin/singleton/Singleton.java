package kevin.singleton;

import java.util.Arrays;
import java.util.Date;

public class Singleton {
	Date date;

	@Override
	public String toString() {
		return "Singleton [ date=" + date + "]";
	}

	private Singleton() {
		date = new Date();
	}

	private static class HolderClass {
		private final static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return HolderClass.instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = null, s2 = null, s3 = null, s4 = null, s5 = null;
		Singleton[] a = { s1, s2, s3, s4, s5 };
		for (int i = 0; i < 5; i++) {

			a[i] = Singleton.getInstance();
			System.out.println(new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// a[i].date = new Date();
		}
		System.out.println("================");
		Arrays.asList(a).forEach(System.out::println);
		System.out.println("================");
		System.out.println(new Date());
	}

}
