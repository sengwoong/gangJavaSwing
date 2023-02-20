package star;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//
//class Customer implements Observer {
//    private String name;
//    private int targetScore;
//    private String review;
//    private Date date;
//    public Customer(String name, int targetScore,String review,Date date) {
//        this.name = name;
//        this.targetScore = targetScore;
//        this.review = review;
//        this.date = date;
//    }
//
//    public void update(int score) {
//        if (score == targetScore) {
//            System.out.println(name + ": " + score +"  "+ "리뷰"+review);
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getTargetScore() {
//        return targetScore;
//    }
//
//    public String getReview() {
//        return review;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//}

public class Main {
    public static void main(String[] args) {
        // ArrayList에 고객 정보 저장
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("김철수", 5, "별루에요", new Date()));
        customers.add(new Customer("박영희1", 4, "사이즈가작아요", new Date()));
        customers.add(new Customer("박영희2", 4, "좋아요", new Date()));
        customers.add(new Customer("이민수", 3, "이뻐요", new Date()));
  
        // 입력된 별점에 따라 Restaurant 객체의 receiveScore() 메소드 호출
        int score = 4;
        if (score >= 1 && score <= 5) {
        	Shoose GetShooseStar = new Shoose();
       
        	
        	
            for (Customer customer : customers) {
            	GetShooseStar.addObserver(customer);
            }
         	GetShooseStar.removeObserver(customers.get(1));
         	  System.out.println("점수입니다.");
            GetShooseStar.receiveScore(score);

            // 2차원 배열에 결과 저장
            String[][] result = new String[customers.size()][3];
            for (int i = 0; i < customers.size(); i++) {
                Customer c = customers.get(i);
                result[i][0] = c.getName();
                result[i][1] = Integer.toString(c.getTargetScore());
                result[i][2] = c.getReview();
            }


            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i][0] + ": " + result[i][1] + " " + result[i][2]);
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        
        System.out.println(); // 개행
        System.out.println(); // 개행

        // ArrayList를 배열로 변환
        Object[] arr = customers.toArray();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");

        // 첫번째 요소 출력
        Customer c1 = (Customer) arr[0];
        System.out.println(((Customer) arr[0]).getName() + ": " + c1.getTargetScore() + " " + c1.getReview() + " " + dateFormat.format(c1.getDate()));

        // 두번째 요소 출력
        Customer c2 = (Customer) arr[1];
        System.out.println(c2.getName() + ": " + c2.getTargetScore() + " " + c2.getReview() + " " + dateFormat.format(c2.getDate()));

        // 세번째 요소 출력
        Customer c3 = (Customer) arr[2];
        System.out.println(c3.getName() + ": " + c3.getTargetScore() + " " + c3.getReview() + " " + dateFormat.format(c3.getDate()));
    }
}
