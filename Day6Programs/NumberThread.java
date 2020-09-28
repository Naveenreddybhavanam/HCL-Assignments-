public class NumberThread implements Runnable {

	int multiple;

	public NumberThread(int multiple) {
		this.multiple = multiple;
	}

	@Override
	public void run() {

		System.out.println("Starting  " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {

			System.out.println(multiple + " * " + i + " :" + multiple * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Stopping  " + Thread.currentThread().getName());
	}

}