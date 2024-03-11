package access;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }//alt+insert 단축키로 생성자 한 번에 불러오기

    public String getName() {
        return name;
    }//이름을 반환하기

    public int getTotalPrice() {
        return price*quantity;
    }
}
