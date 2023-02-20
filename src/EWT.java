<<<<<<< HEAD
import java.awt.Color;
=======
package gang.SWING.src;

>>>>>>> ef6ccd82ca0d0818fcd2c9c0f651280ae82a7bd3
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import facroyinto.ItemFactory;
import facroyinto.ItemFromMenu;
import facroyinto.ItemPrinter;
import star.Customer;
import star.Shoose;
public class EWT extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane;
    ImageIcon icon;
    private JTextField textField;

<<<<<<< HEAD
    ArrayList<Customer> customers = new ArrayList<>();

 //전화면에서 크릭해서 들어온이미지
=======
private int index; // �쁽�옱 �씤�뜳�뒪 ���옣�슜
private static final String[] IMAGES = { // �씠誘몄� 寃쎈줈 臾몄옄�뿴濡� ���옣
"C:/Users/dita810/Desktop/myJava/SWING/src/aasdaf.PNG",
"C:/Users/dita810/Desktop/myJava/SWING/src/aasdaf.PNG",
"C:/Users/dita810/Desktop/myJava/SWING/src/aasdaf.PNG",
};
>>>>>>> ef6ccd82ca0d0818fcd2c9c0f651280ae82a7bd3






    public EWT() {
    	
    
 
    	   List<ItemFromMenu> items = new ArrayList<>();
	        items.add(ItemFactory.createItem("신발이름", 10000, "C:/Users/dita810/Desktop/myJava/SWING/src/bigshoose1.PNG"));
	        items.add(ItemFactory.createItem("", 0, "photo2"));
	        items.add(ItemFactory.createItem("", 0, "photo3"));
	        ItemFromMenu firstItem = items.get(0);
	 
	        String name = firstItem.getName();
	        int price = firstItem.getPrice();
	        String photo = firstItem.getPhoto();
	        
	        
	        ItemPrinter.printAllitems(items);
	       
	        System.out.println(name +price+photo);
        
        
	        
	        System.out.println(); // 개행
	        System.out.println(); // 개행
	        System.out.println(); // 개행
	        System.out.println(); // 개행
	        
	        //---------------------------
	        
	        
	        

	        customers.add(new Customer("김철수", 1, "별루에요", new Date()));
	        customers.add(new Customer("박영희1", 2, "사이즈가작아요", new Date()));
	        customers.add(new Customer("박영희2", 3, "좋아요", new Date()));
	        customers.add(new Customer("이민수", 4, "이뻐요", new Date()));
	        System.out.println(); // 개행
	        System.out.println(); // 개행
            System.out.println(); // 개행
	        System.out.println("별점에관한정보 출력"); // 개행
	        // 입력된 별점에 따라 Restaurant 객체의 receiveScore() 메소드 호출
	        int score = 4;	
	        if (score >= 1 && score <= 5) {
	        	Shoose GetShooseStar = new Shoose();
	            for (Customer customer : customers) {
	            	GetShooseStar.addObserver(customer);
	            }
	      
	         
	         	
	            GetShooseStar.receiveScore(score);
	        
	            // 2차원 배열에 결과 저장
	            String[][] result = new String[customers.size()][3];
	            for (int i = 0; i < customers.size(); i++) {
	                Customer c = customers.get(i);
	                result[i][0] = c.getName();
	                result[i][1] = Integer.toString(c.getTargetScore());
	                result[i][2] = c.getReview();
	            }

		        
	        

	        System.out.println(); // 개행
	        System.out.println(); // 개행

	   
	        //--------------
	        
	        Object[] arr = customers.toArray();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
	  //첫번째 요소 출력
	        Customer c1 = (Customer) arr[arr.length-1];
	        System.out.println(c1.getName() + ": " + c1.getTargetScore() + " " + c1.getReview() + " " + dateFormat.format(c1.getDate()));

	        // 두번째 요소 출력
	        Customer c2 = (Customer) arr[arr.length-2];
	        System.out.println(c2.getName() + ": " + c2.getTargetScore() + " " + c2.getReview() + " " + dateFormat.format(c2.getDate()));

	   
        

        icon = new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/back1.PNG");
       
        //諛곌꼍 Panel �깮�꽦�썑 而⑦뀗痢좏럹�씤�쑝濡� 吏��젙      
        JPanel background = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
               
                g.drawImage(icon.getImage(), 0, 0, null);
              
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
        background.setLayout(null);
       
        //-------------------------------------------------------
        
        
        JLabel 게시판1 = new JLabel(c1.getReview());
        게시판1.setBounds(73, 415, 165, 45);
        background.add(게시판1);
        
        JLabel 게시판2 = new JLabel(c2.getReview());
        게시판2.setBounds(73, 470, 165, 45);
        background.add(게시판2);
        
        JLabel 게시판1이름 = new JLabel();
        게시판1이름.setText(c1.getName());
        게시판1이름.setBounds(12, 412, 57, 15);
        background.add(게시판1이름);
        
        JLabel 게시판2이름 = new JLabel(c2.getName());
        게시판2이름.setBounds(12, 458, 57, 15);
        background.add(게시판2이름);
        
        JLabel 게시판별점1 = new JLabel(Integer.toString(c1.getTargetScore()));
        게시판별점1.setBounds(248, 426, 40, 15);
        background.add(게시판별점1);
        
        JLabel 게시판별점2 = new JLabel(Integer.toString(c2.getTargetScore()));
        게시판별점2.setBounds(248, 474, 40, 15);
        background.add(게시판별점2);

      
        //-----------------------------------
       
<<<<<<< HEAD
        JButton basket = new JButton("");
        basket.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/장바구니.PNG"));
=======
       
        JButton basket = new JButton("�옣諛붽뎄�땲");
>>>>>>> ef6ccd82ca0d0818fcd2c9c0f651280ae82a7bd3
        basket.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//장바구니담기
        	}
        });
        basket.setBounds(0, 531, 401, 48);
        background.add(basket);
        scrollPane = new JScrollPane(background);
        
<<<<<<< HEAD
        JButton immediatepurchase = new JButton("");
        immediatepurchase.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/즉시구매.PNG"));
        immediatepurchase.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//즉시구매
        	}
        });
        immediatepurchase.setBounds(0, 576, 401, 48);
=======
        JButton immediatepurchase = new JButton("利됱떆援щℓ");
        immediatepurchase.setBounds(0, 576, 432, 48);
>>>>>>> ef6ccd82ca0d0818fcd2c9c0f651280ae82a7bd3
        background.add(immediatepurchase);
        

    	

        JButton x_2 = new JButton("");
        x_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
         		customers.remove(customers.size()-1);
         		 Object[] arr = customers.toArray();
     	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
    	  //첫번째 요소 출력
    	      
    	        
        	       Customer c2 = (Customer) arr[arr.length-1];
        	        System.out.println(c2.getName() + ": " + c2.getTargetScore() + " " + c2.getReview() + " " + dateFormat.format(c2.getDate()));
        	        
        	        
        	        
       	        게시판2이름.setText(c2.getName());
       	        게시판별점2.setText(Integer.toString(c2.getTargetScore()));
       	        게시판2.setText(c2.getReview());
        	}
        });
        x_2.setBounds(300, 485, 31, 34);
        background.add(x_2);
    
        JButton x_1 = new JButton("");
        x_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//첫번째지우기
        	//	customers.remove(customers.size() - 1);;
        		         		
     
        		customers.remove(customers.size()-1);
        		 Object[] arr = customers.toArray();
     	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
     
     	        Customer c1 = (Customer) arr[arr.length-1];
     	        System.out.println(c1.getName() + ": " + c1.getTargetScore() + " " + c1.getReview() + " " + dateFormat.format(c1.getDate()));

     	        // 두번째 요소 출력
     	     
        			게시판1.setText(c1.getReview());
					
        	        게시판1이름.setText(c1.getName());
        	       
        	        게시판별점1.setText(Integer.toString(c1.getTargetScore()));
        	        
        	 
        		repaint();
        		
        	}

			private String integertoString(int targetScore) {
				// TODO Auto-generated method stub
				return null;
			}
        });
  	 
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        x_1.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/x.PNG"));
        x_2.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/x.PNG"));
        x_1.setBounds(300, 426, 31, 34);
        background.add(x_1);
        
        JButton createReview = new JButton("");
        createReview.setBackground(Color.WHITE);
        createReview.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//로직추가
        		  customers.add(new Customer("김철수", 1, "별루에요", new Date()));
        	}
        });
        createReview.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/리뷰작성.PNG"));
        createReview.setBounds(339, 374, 64, 23);
      
        background.add(createReview);
        
        JLabel images =  new JLabel("");
        images.setBounds(0, 139, 401, 229);
        images.setIcon(new ImageIcon(photo));
        background.add(images);
        
        JButton gotobarket = new JButton("");
        gotobarket.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/CART.PNG"));
        gotobarket.setBounds(370, 10, 31, 39);
        background.add(gotobarket);
        gotobarket.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//장바구니이동
        	}
        });
        JButton logout = new JButton("");
        logout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//로그아웃페이지
        	}
        });
        logout.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/LOGOUT.PNG"));
        logout.setBounds(327, 10, 31, 39);
        background.add(logout);
        
        JButton back = new JButton("");
        back.setIcon(new ImageIcon("C:/Users/dita810/Desktop/myJava/SWING/src/BACK.PNG"));
        back.setBounds(12, 10, 18, 39);
        back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//뒤로가기
        	}
        });
        background.add(back);
        
        JLabel 이름 = new JLabel(name);
        이름.setBounds(128, 67, 130, 23);
        background.add(이름);
        
        JLabel 가격 = new JLabel(Integer.toString(price));
        가격.setBounds(261, 79, 130, 23);
        background.add(가격);
        
        
        
        
        

  
        setContentPane(scrollPane);
    }}
 
    public static void main(String[] args) {
        EWT frame = new EWT();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,665);
        frame.setVisible(true);
    }
}