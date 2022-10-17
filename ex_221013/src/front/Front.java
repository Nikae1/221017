package front;

import java.util.Scanner;

public class Front {
	

	public Front(int recordIdx) {
		this.controller(recordIdx);
}

	public void controller(int recordIndex) {
		Scanner scanner = new Scanner(System.in);
		String title = this.makeTitle();
		String[][] menu = {
				{"EXIT", "프로그램을 종료합니다.~~"},
				{"MAIN", "연산하기","끝내기"},
				{"연산", "새로운 연산","이어서 연산","이전 화면"},
				
		};
		
		/* 로딩 후 첫 화면 출력*/
		this.display(title);
		this.makeSubMenu(menu[1]);
		/* 사용자 입력 ==> 화면 이동 */
		
		
		scanner.close();
		
	}
	

	public String makeTitle() {

		StringBuffer title = new StringBuffer();
		title.append("#####################################\n\n");
		title.append("      JS FrameWork Calculator v1.0\n");
		title.append("                   Designed By JW\n\n");
		title.append("#####################################\n\n");

		return title.toString();

	}

	public String makeMessage(String text) {
		StringBuffer message = new StringBuffer();
		message.append("[");
		message.append("text");
		message.append("]");
		return message.toString();
	}

	public String makeSubMenu(String[] menu) {
		StringBuffer subMenu = new StringBuffer();
		subMenu.append("[");
		subMenu.append("menu[0]");
		subMenu.append("]__________________________________\n");

		
		if (menu.length <= 2) {
			subMenu.append(menu[menu.length - 1] + "  \n");
			subMenu.append("________________________________________________");

		} else {
			for (int colIdx = 1; colIdx < menu.length; colIdx++) {
				if (colIdx == menu.length - 1) {
					subMenu.append("0. " + menu[colIdx] + " \n");

				} else {
					subMenu.append(colIdx + ". " + menu[colIdx] + " ");
				}
				subMenu.append("__________________________________ select : ");
			}
			
		}

	
		
		return subMenu.toString();

	}

	/*
	 * 사용자 입력 전용 메소드 고려사항 : 1. 숫자로 변환이 불가능한 데이터가 입력되어질 경우 해결방안 2.Scanner Class의 Life
	 * Cycle과 Performance
	 * 
	 */
	public int userInput(Scanner scanner) {
		return scanner.nextInt();
	}

	/* 출력 전용 메서도 1 */
	public void display(String text) {
		System.out.println(text);
	}

	/* 출력 전용 메서도 2 */
	public void display(String[] text) {
		for (int idx = 0; idx < text.length; idx++) {
			System.out.println((idx + 1) + ". " + text[idx] + " ");
		}

	}

}
