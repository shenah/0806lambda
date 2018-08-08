
public class Main {

	public static void main(String[] args) {
		// 클래스를 만들어서 스레드 사용.
		// RunnableImpl r = new RunnableImpl();

		// 익명 클래스를 이용한 스레드
		Runnable r = new Runnable() {

			@Override
			public void run() {
				int i = 1;
				while (i <= 10) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("i:" + i);
					i = i + 1;
				}

			}

		};

		//람다를 이용한 스레드 
		/*Runnable r = () -> {
			int i = 1;
			while (i <= 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i:" + i);
				i = i + 1;
			}

		};*/
		Thread th = new Thread(r);
		th.start();

	}

}
