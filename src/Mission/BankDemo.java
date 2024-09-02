package Mission;

import java.util.HashMap;
import java.util.Scanner;

public class BankDemo {
  static HashMap<String, Account> list = new HashMap<>();

  public static void main(String[] args) {
    start();
  }

  static void start() {
    System.out.print("1 계좌 생성 / 2 입금 / 3 출금 / 4 조회 / 5 종료");
    System.out.println();

    Scanner in = new Scanner(System.in);

    out: while (true) {
      int i = in.nextInt();

      switch (i) {
        case 1 -> createAccount();
        case 2 -> inputMoney();
        case 3 -> outputMoney();
        case 4 -> lookupMoney();
        case 5 -> {
          break out;
        }
      }
    }
  }

  // 계좌 생성
  static void createAccount() {
    Scanner in = new Scanner(System.in);
    Account newAccount = new Account();

    // 은행 선택
    int bankNumber = in.nextInt();
    Bank[] banks = Bank.values();
    newAccount.bank = banks[bankNumber];

    // 계좌 번호 생성
    long accountNumber = (long)(Math.random() * 100000) + 10000;
    newAccount.accountNumber = accountNumber + "";

    // 비밀 번호 입력
    System.out.print("비밀번호 입력");
    int password = in.nextInt();
    newAccount.accountPassword = password;

    in.nextLine();

    // 고객 식별 아이디
    System.out.print("생일 6자리 입력");
    String s = in.nextLine();

    list.put(s, newAccount);
    System.out.println(list.get(s).toString());

    start();
  }

  static void inputMoney() {

  }

  static void outputMoney() {

  }

  static void lookupMoney() {

  }
}

enum Bank {
  HANA, SINHAN, KAKAO, KBANK, WOORI;
}

class Account {
  Bank bank;
  String accountNumber;
  int accountPassword;
  long money;
  String openDate;
  String removeDate;

  @Override
  public String toString() {
    return "Account{" +
        "bank=" + bank +
        ", accountNumber='" + accountNumber + '\'' +
        ", accountPassword=" + accountPassword +
        ", money=" + money +
        ", openDate='" + openDate + '\'' +
        ", removeDate='" + removeDate + '\'' +
        '}';
  }
}
