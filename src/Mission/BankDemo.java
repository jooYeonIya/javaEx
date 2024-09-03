package Mission;

import ObjectPackage.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankDemo {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("1 계좌 생성 / 2 입금 / 3 출금 / 4 잔액 조회 / 5 종료");

      int option = in.nextInt();
      in.nextLine();

      switch (option) {
        case 1:
          createAccount();
          break;
        case 2:
          deposit();
          break;
        case 3:
          withdraw();
          break;

      }
    }
  }

  public static void createAccount() {
    // 고객 생성
    Customer customer = new Customer(BankCode.HANA);

    System.out.println("주민번호 앞자리 6자리 입력");
    String number = in.nextLine();
    customer.customerNumber = number;

    System.out.println("이름 입력");
    String name = in.nextLine();
    customer.name = name;

    Customer.customerMap.put(number, customer);
    System.out.println(Customer.customerMap.get(number).toString());

    // 계좌 생성
    int count = Account.accountMap.size() + 1;

    Account account = new Account(customer, count);

    System.out.println("비밀번호 입력해 주세요");
    String password = in.nextLine();
    account.password = password;

    Account.accountMap.put(account.accountNumber, account);
    System.out.println(Account.accountMap.get(account.accountNumber).toString());
  }

  public static void deposit() {
    // 계좌 정보 업데이트
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    System.out.println("입금 금액 입력");
    int money = in.nextInt();

    Account account = Account.accountMap.get(accountNumber);

    Customer customer = Customer.customerMap.get(account.customer.customerNumber);

    long deposit = Account.deposit(accountNumber, customer.customerNumber, password, (long) money);

    // 고객 정보 업데이트
    Customer.setLastTransactionDate(account.customer.customerNumber);
    System.out.println(Customer.customerMap.get(account.customer.customerNumber).toString());

    // 입출금 거래 내역 업데이트
    Banker banker = new Banker(BankCode.HANA, "123456", "뱅커");

    Transaction transaction = new Transaction(TransactionType.DEPOSIT,
        TransactionStatus.NORMAL,
        (long) money,
        customer,
        banker
    );

    Transaction.transactionMap.put(transaction.seqNo, transaction);
    System.out.println(Transaction.transactionMap.get(transaction.seqNo).toString());

    System.out.println("입금 후 잔액" + deposit + "원");
  }

  public static void withdraw() {
    // 계좌 정보 업데이트
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    System.out.println("출금 금액 입력");
    int money = in.nextInt();

    Account account = Account.accountMap.get(accountNumber);

    Customer customer = Customer.customerMap.get(account.customer.customerNumber);

    long deposit = Account.withdraw(accountNumber, customer.customerNumber, password, (long) money);

    // 고객 정보 업데이트
    Customer.setLastTransactionDate(account.customer.customerNumber);
    System.out.println(Customer.customerMap.get(account.customer.customerNumber).toString());

    // 입출금 거래 내역 업데이트
    Banker banker = new Banker(BankCode.HANA, "123456", "뱅커");

    Transaction transaction = new Transaction(TransactionType.WITHDRAWAL,
        TransactionStatus.NORMAL,
        (long) money,
        customer,
        banker
    );

    Transaction.transactionMap.put(transaction.seqNo, transaction);
    System.out.println(Transaction.transactionMap.get(transaction.seqNo).toString());

    System.out.println("출금 후 잔액" + deposit + "원");
  }
}
