
public class Main {

	public static void main(String[] args) {
		// Ŭ������ ���� ������ ���.
		// RunnableImpl r = new RunnableImpl();

		// �͸� Ŭ������ �̿��� ������
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

		//���ٸ� �̿��� ������ 
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
