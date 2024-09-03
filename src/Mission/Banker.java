package Mission;

public class Banker {
  BankCode bankCode;     	// 은행코드
  String bankerNumber;	// 직원번호
  String bankerName;  	// 직원명

  public Banker(BankCode bankCode, String bankerNumber, String bankerName) {
    this.bankCode = bankCode;
    this.bankerNumber = bankerNumber;
    this.bankerName = bankerName;
  }
}

// 은행원의 crud 는 생략