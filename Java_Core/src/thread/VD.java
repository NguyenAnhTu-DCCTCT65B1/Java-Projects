package thread;

class VD2 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread());
			System.out.println(i);
		}
	}
}

public class VD extends Thread {
 
	public void run() {
		for (int i = 1; i < 50; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread());
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
//		VD v = new VD();
//		VD v2 = new VD();
//		v.start();
		//System.out.println(Thread.currentThread());
//		v.setPriority(Thread.MAX_PRIORITY);
//		try {
//			v.join();
//		} catch (Exception e) {
//			System.out.println(e.hashCode());
//		}
//		v2.start();
//		
//		VD2 vd2 = new VD2();
//		vd2.run();
	    Runnable task1 = () -> {
	    	for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(Thread.currentThread());
				System.out.println(i);
			}
	    };
	    
	    Runnable task2 = () -> {
	    	for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println(Thread.currentThread());
				System.out.println(i);
			}
	    };
	    
	    new Thread(task1).start();
	    new Thread(task2).start();
	}
}