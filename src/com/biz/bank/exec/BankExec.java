package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;

public class BankExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFileName = "src/com/biz/bank/bankBalance.txt";

		BankService bs = new BankService(strFileName);

		bs.readFile();

		// 업무 선택 메뉴를 보여주고 선택 업무에 따라서 ... 실행

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("====================================================");
			System.out.println("광한루 은행 차세대 시스템 1.0");
			System.out.println("----------------------------------------------------");
			System.out.println("1.입금 2.출금 3.계좌조회 -9.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("업무를 선택하세요 >>>");
			String strWrite = scan.nextLine();
			int intWrite = Integer.valueOf(strWrite);
			if (intWrite == (-9)) {
				System.out.println("업무를 종료합니다.");
				break;
			}
			if (intWrite == 1)
				bs.bankInput();
			if (intWrite == 2)
				bs.bankOutput();
			if (intWrite == 3) {
				bs.viewBalance();
			}

		}
		bs.saveInfo();

	}

}
