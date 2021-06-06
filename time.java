import java.time.LocalDate; // 시간 로컬데이터 가져오기

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // 객체 생성
    System.out.println(myObj); // 현재 날짜 표시 예를들어 오늘이 2021년 06월 07일 이면 2021-06-07으로 뜸
  }
}
