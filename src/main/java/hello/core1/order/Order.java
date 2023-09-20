package hello.core1.order;

public class Order {
    private  Long memberId;
    private String itemName;
    private int itemPrice;
    private int disCountPrice;

    public Order(Long memberId, String itemName, int itemPrice, int disCountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.disCountPrice = disCountPrice;
    }
    // 비즈니스 계산로직을 하나 넣을 것임
    // 이건 정률이든 정액이든 다 빼기로 가능
    public int calculatePrice(){
        return itemPrice - disCountPrice;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDisCountPrice() {
        return disCountPrice;
    }

    public void setDisCountPrice(int disCountPrice) {
        this.disCountPrice = disCountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", disCountPrice=" + disCountPrice +
                '}';
    }
}
