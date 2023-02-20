package facroyinto;
public class ConcreteItem implements ItemFromMenu {
    private String name;
    private int price;
    private String photo;



    public ConcreteItem(String name, int price, String photo) {
//        if (photo == null || price == 0  ||name==null ) {
//            throw new NullPointerException("제품 사진은 null 일 수 없습니다.");
//        }
        this.name = name;
        this.price = price;
        this.photo = photo;
    }
    public ConcreteItem(String photo) {

      this.name = null;
      this.price = 0;
      this.photo = photo;
  }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getPhoto() {
        return photo;
    }
}