package Mission;

import java.time.LocalDate;

public class Account {
  BankCode bankCode;				// 은행코드
  String accountNumber;			// 계좌번호 5자
  String customerNumber;			// 고객번호 주민번호 앞자리 6자
  LocalDate accountOpenDate;		// 계좌 개설 일자
  LocalDate accountColoseDate;	// 계좌 삭제 일자
  Boolean isDormantt;   			// 휴면 계좌 여부
  String password;     			// 비밀번호
  long balance;        			// 잔고

  // 계좌 생성
  public Account(BankCode bankCode,
                 int accountCounter,
                 String customerNumber,
                 String password) {
    this.bankCode = bankCode;
    this.accountNumber = String.format("%05d", accountCounter);
    this.customerNumber = customerNumber;
    this.accountOpenDate = LocalDate.now();
    this.accountColoseDate = null;
    this.isDormantt = false;
    this.password = password;
    this.balance = 0;
  }

  // 출금
  // 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액 한도 내에서 출금을 할 수 있다.
  public long withdraw() {
    return 0;
  }

  // 입금
  // 해당 은행에 계좌가 있고, 계좌번호와 고객번호가 일치하면 입금을 할 수 있다.
  public long deposit() {
    return 0;
  }

  // 잔액 조회
  // 해당 은행에 계좌가 있고, 계좌번호와 고객번호, 비밀번호가 일치하면 잔액을 조회할 수 있다.
  public long balanceInquiry() {
    return 0;
  }

  // 계좌 삭제
  // 더이상 거래를 원하지 않으면 계좌를 없앨 수 있다. 이 때 잔액이 남아있으면 모두 출금처리후 삭제처리한다.
  // (계좌번호,고객번호,비밀번호 일치확인 필요)
  public void deleteAccount() {
  }
}
