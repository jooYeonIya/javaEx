package Mission;

import java.time.LocalDate;

public class Customer {
  BankCode bankCode;      		// 은행코드
  String customerNumber; 			// 고객번호 주민번호 앞자리 6자리
  String name;           			// 고객 이름
  LocalDate firstTransactionDate; // 신규 거래 일자
  LocalDate lastTransactionDate; 	// 최종 거래 일자

  public Customer(BankCode bankCode, String customerNumber, String name) {
    this.bankCode = bankCode;
    this.customerNumber = customerNumber;
    this.name = name;
    this.firstTransactionDate = LocalDate.now();
    this.lastTransactionDate = LocalDate.now();
  }
}

//고객의 cru 는 거래가 있을때 같이 진행됨, 고객정보 삭제는 이번에는 고려대상이 아님
