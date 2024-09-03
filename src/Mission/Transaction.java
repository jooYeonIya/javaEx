package Mission;

import java.time.LocalDate;

public class Transaction {
  long seqNo;        		// 거래 고유 번호
  TransactionType type; 	// 거래 타입 구분 코드
  LocalDate date; 		// 거래 일시
  String accountNumber; 	// 계좌 번호
  String customerNumber;	// 고객 번호
  long money; 			// 금액
  String bankerNumber; 	// 직원 번호
  TransactionStatus status; // 처리 상태
}


