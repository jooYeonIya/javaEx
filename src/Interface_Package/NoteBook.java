package Interface_Package;

public class NoteBook extends Computer implements Portable {
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방에 있당");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북을 켠당");
  }

  @Override
  public void trunOff() {
    System.out.println("노트북을 끈당");
  }

  @Override
  public void repair() {
    System.out.println("노트북 수리수리마수리~");
  }
}
