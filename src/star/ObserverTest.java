//package star;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.List;
//
//// 옵저버 인터페이스
//interface Observer {
//    void update(int score, Date date);
//}
//
//// 고객 클래스 (옵저버 역할을 함)
//class Customer implements Observer {
//	
//    private String name; // 이름
//    private int targetScore; // 목표 별점
//    private String review; // 리뷰 내용
//    private Date registrationDate; // 등록일자 저장할 변수 추가
//
//    // 생성자
//    public Customer(String name, int targetScore, String review, Date registrationDate) {
//        this.name = name;
//        this.targetScore = targetScore;
//        this.review = review;
//        this.registrationDate = registrationDate; // 등록일자 저장
//    }
//
//    // 옵저버 인터페이스 구현
//    public void update(int score, Date date) {
//        if (score == targetScore) {
//            SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일"); // 출력 형식 지정
//            String dateString = format.format(registrationDate); // 등록일자를 형식에 맞게 변환
//            System.out.println(name + ": " + score +"  "+ "리뷰 " + review + "  등록일자 " + dateString);
//        }
//    }
//
//    // 등록일자 getter
//    public Date getRegistrationDate() {
//        return registrationDate;
//    }
//
//    // 문자열 출력
//    @Override
//    public String toString() {
//        return name + ": " + "리뷰 " + review;
//    }
//}
//
//// 옵저버 등록 클래스
//class ObserverRegistration {
//    private Observer observer; // 옵저버 객체
//    private Date registrationDate; // 등록일자
//
//    // 생성자
//    public ObserverRegistration(Observer observer, Date registrationDate) {
//        this.observer = observer;
//        this.registrationDate = registrationDate;
//    }
//
//    // 옵저버 getter
//    public Observer getObserver() {
//        return observer;
//    }
//
//    // 등록일자 getter
//    public Date getRegistrationDate() {
//        return registrationDate;
//    }
//}
//
//// 레스토랑 클래스 (Subject 역할을 함)
//class Restaurant {
//    private List<ObserverRegistration> observers = new ArrayList<>(); // 옵저버 등록 리스트
//
//    // 옵저버 추가 메서드
//    public void addObserver(Observer observer) {
//        observers.add(new ObserverRegistration(observer, new Date()));
//    }
//
//    // 옵저버 제거 메서드
//    public void removeObserver(Observer observer) {
//        observers.removeIf(or -> or.getObserver().equals(observer));
//    }
//
//    // 옵저버들에게 알림 메서드
//    public void notifyObservers(int score) {
//        Date date = new Date();
//        for (ObserverRegistration or : observers)
//            or.getObserver().update(score, date);
//    }
//
//// 레스토랑에서 식사 후 리뷰를 작성하는 메서드
//public void review(int score, String review) {
//    // 별점이 3점 이상일 때만 옵저버들에게 알림
//    if (score >= 3) {
//        System.out.println("리뷰를 작성합니다.");
//        System.out.println("별점: " + score + ", 리뷰 내용: " + review);
//        notifyObservers(score);
//    } else {
//        System.out.println("별점이 3점 미만이므로 리뷰를 작성하지 않습니다.");
//    }
//}
//
//// 최근 등록된 고객 n명을 리턴하는 메서드
//public List<Customer> getRecentCustomers(int n) {
//    List<Customer> customers = new ArrayList<>();
//    // ObserverRegistration 객체를 등록일자가 최신순으로 정렬
//    observers.sort(Comparator.comparing(ObserverRegistration::getRegistrationDate).reversed());
//    // 최신 등록일자 n개에 해당하는 옵저버들을 고객 객체로 변환하여 리스트에 추가
//    for (int i = 0; i < n && i < observers.size(); i++) {
//        customers.add((Customer) observers.get(i).getObserver());
//    }
//    return customers;
//}
//}
//
//public class ObserverTest {
//public static void main(String[] args) {
//    Restaurant restaurant = new Restaurant();
//
//    // 옵저버 등록
//    Customer customer1 = new Customer("홍길동", 4, "맛있습니다.", new Date());
//    restaurant.addObserver(customer1);
//
//    Customer customer2 = new Customer("임꺽정", 3, "보통입니다.", new Date());
//    restaurant.addObserver(customer2);
//
//    // 리뷰 작성
//    restaurant.review(4, "최고에요!");
//
//    // 최근 등록된 고객 출력
//    System.out.println("최근 등록된 고객");
//    for (Customer customer : restaurant.getRecentCustomers(3)) {
//        System.out.println(customer);
//    }
//
//    // 옵저버 제거
//    restaurant.removeObserver(customer2);
//
//    // 리뷰 작성
//    restaurant.review(2, "별로에요");
//
//    // 최근 등록된 고객 출력
//    System.out.println("최근 등록된 고객");
//    for (Customer customer : restaurant.getRecentCustomers(3)) {
//        System.out.println(customer);
//    }
//}
//}
