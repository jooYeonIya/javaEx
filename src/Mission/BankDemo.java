package Mission;

import ObjectPackage.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankDemo {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    out: while (true) {
      System.out.println("1 계좌 생성 / 2 입금 / 3 출금 / 4 잔액 조회 / 5 계좌 삭제 / 6 종료");

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
        case 4:
          balanceInquiry();
          break;
        case 5:
          deleteAccount();
          break;
        default:
          break out;
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

  public static void setLastTransactionDate(String customerNumber) {
    Customer customer = Customer.customerMap.get(customerNumber);
    Customer.setLastTransactionDate(customerNumber);
    System.out.println(Customer.customerMap.get(customerNumber).toString());
  }

  public static void updateTransaction(TransactionType type, long money, Customer customer) {
    Banker banker = new Banker(BankCode.HANA, "123456", "뱅커");
    Transaction transaction = new Transaction(type, TransactionStatus.NORMAL, money, customer, banker);
    Transaction.transactionMap.put(transaction.seqNo, transaction);
    System.out.println(Transaction.transactionMap.get(transaction.seqNo).toString());
  }

  public static void deposit() {
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    System.out.println("입금 금액 입력");
    int money = in.nextInt();

    // 계좌 정보 업데이트
    Account account = Account.accountMap.get(accountNumber);
    long deposit = Account.deposit(accountNumber, account.customer.customerNumber, password, (long) money);

    // 고객 정보 업데이트
    setLastTransactionDate(account.customer.customerNumber);

    // 입출금 거래 내역 업데이트
    updateTransaction(TransactionType.DEPOSIT, (long) money, account.customer);

    System.out.println("입금 후 잔액" + deposit + "원");
  }

  public static void withdraw() {
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    System.out.println("출금 금액 입력");
    int money = in.nextInt();

    // 계좌 정보 업데이트
    Account account = Account.accountMap.get(accountNumber);
    long withdraw = Account.withdraw(accountNumber, account.customer.customerNumber, password, (long) money);

    // 고객 정보 업데이트
    setLastTransactionDate(account.customer.customerNumber);

    // 입출금 거래 내역 업데이트
    updateTransaction(TransactionType.WITHDRAWAL, (long) money, account.customer);

    System.out.println("출금 후 잔액" + withdraw + "원");
  }

  public static void balanceInquiry() {
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    // 계좌 정보 업데이트
    Account account = Account.accountMap.get(accountNumber);
    long balance = Account.balanceInquiry(accountNumber, account.customer.customerNumber, password);

    // 고객 정보 업데이트
    setLastTransactionDate(account.customer.customerNumber);

    // 입출금 거래 내역 업데이트
    updateTransaction(TransactionType.INQUIRY, 0, account.customer);

    System.out.println("잔액 " + balance);
  }

  public static void deleteAccount() {
    System.out.println("계좌 번호 입력");
    String accountNumber = in.nextLine();

    System.out.println("비밀번호 입력");
    String password = in.nextLine();

    // 계좌 정보 업데이트
    Account account = Account.accountMap.get(accountNumber);
    Account.deleteAccount(accountNumber, account.customer.customerNumber, password);

    // 입출금 거래 내역 업데이트
    updateTransaction(TransactionType.DELETE, 0, account.customer);
  }
}
