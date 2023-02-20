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
//        for (ObserverRegistration or : observers) {
//            or.getObserver().update(score, date);
//        }
//    }
//
//    // 모든 리뷰를 등록일자순으로 출력하는 메서드
//   
//            	 public void printAllReviewsByRegistrationDate() {
//            	        observers.sort(Comparator.comparing(ObserverRegistration::getRegistrationDate));// 등록일자순으로 정렬
//            	        for (ObserverRegistration or : observers) {
//            	            if (or.getObserver() instanceof Customer) {
//            	                Customer customer = (Customer) or.getObserver();
//            	                SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일"); // 출력 형식 지정
//            	                String dateString = format.format(customer.getRegistrationDate()); // 등록일자를 형식에 맞게 변환
//            	                System.out.println(  " " + customer.toString() + "  등록일자 " + dateString);
//            	                System.out.println();
//            	            }
//            	        }
//            	    }
//            	}
//
//            	public class asd {
//            	    public static void main(String[] args) {
//            	        Restaurant restaurant = new Restaurant();
//
//            	        // 옵저버 추가
//            	        restaurant.addObserver(new Customer("김철수", 5, "별루에요", new Date()));
//            	        restaurant.addObserver(new Customer("박영희1", 4, "사이즈가작아요", new Date()));
//            	        restaurant.addObserver(new Customer("이몽룡", 4, "괜찮아요", new Date()));
//            	        restaurant.addObserver(new Customer("임꺽정", 3, "그냥그래요", new Date()));
//            	        int score = 4; // 예시로 5점을 받았다고 가정
//
//            	        // 별점 계산 및 출력
//            	        if (score >= 1 && score <= 5) {
//            	            restaurant.notifyObservers(score);
//            	        } else {
//            	            System.out.println("잘못된 입력입니다.");
//            	        }
//
//            	        // 등록일자순으로 모든 리뷰 출력
//            	        restaurant.printAllReviewsByRegistrationDate(); 
//            	      
//            	    }}  
            