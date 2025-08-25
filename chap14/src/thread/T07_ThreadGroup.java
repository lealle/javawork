package thread;

public class T07_ThreadGroup {
	public static void main(String[] args) {
		ThreadGroup main1 = Thread.currentThread().getThreadGroup();
		String groupName = main1.getName();
		System.out.println(groupName);
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"subGroup1");
		
		grp1.setMaxPriority(9);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		// 생성자 종류 - 아무것도 안넣은거, Runnable 넣은거, 매개변수 3개 받는것 
		// Thread()
		// Thread(Runnable r)
		// Thread(ThreadGroup tg, Runnable r , String name)		
//		Thread th1 = new Thread(r); 
		Thread th2 = new Thread(grp1, r, "th2");
		Thread th3 = new Thread(subGrp1, r, "th3");
		
		Thread th4 = new Thread(grp2, r, "th4");
		th2.start();
		th3.start();
		th4.start();
		
		System.out.println("실행중인 스레드의 상위 그룹 : "+main1.getName());
		System.out.println("실행중인 스레드의 그룹의 수 : "+main1.activeGroupCount()); // 그룹은 3개
		System.out.println("실행중인 스레드의 수 : "+main1.activeCount()); // main 스레드까지 4개 
		main1.list();
		
		/*
		 * java.lang.ThreadGroup[name=main,maxpri=10] // 최상위 스레드 그룹: main, 최대 우선순위 10
		 * 		Thread[#1,main,5,main] // 스레드 ID=1, 이름=main, 우선순위=5, 그룹=main
		 * 		java.lang.ThreadGroup[name=Group1,maxpri=9] // main의 하위 그룹: Group1, 최대 우선순위 9
		 * 			Thread[#21,th2,5,Group1] // 스레드 ID=21, 이름=th2, 우선순위=5, 그룹=Group1
		 * 			java.lang.ThreadGroup[name=subGroup1,maxpri=9] // Group1의 하위 그룹: subGroup1,최대 우선순위 9 
		 * 				Thread[#22,th3,5,subGroup1] // 스레드 ID=22, 이름=th3, 우선순위=5,그룹=subGroup1 
		 * 		java.lang.ThreadGroup[name=Group2,maxpri=10]// main의 하위 그룹:Group2, 최대 우선순위 10 
		 * 			Thread[#23,th4,5,Group2] // 스레드 ID=23, 이름=th4, 우선순위=5,그룹=Group2
		 */
		
		
		System.out.println("");
		System.out.println();
		
		
		
		
		
	}
}
