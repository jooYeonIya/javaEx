package Mission;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Transaction {
  // 은행별 입출금내역: 시퀀스 넘버 + 입출금 내역 객체
  public Map<String, Transaction> transactionMap = new HashMap<>();

  long seqNo;        		    // 거래 고유 번호
  TransactionType type; 	  // 거래 타입 구분 코드
  TransactionStatus status; // 처리 상태
  LocalDate date; 		      // 거래 일시0
  long money; 			        // 금액
  Customer customer;        // 고객
  Banker banker; 	          // 직원 번호

  public void updateTransactionStatus() {

  }
}


