package task6.delivery.model;

public class ExpressParcel extends Parcel{
    private int deliveryHours;

//- конструктор с аргументами (аргументы как у родителя + аргумент-значение для поле deliveryHours)
    public ExpressParcel(String recipientName, String deliveryAddress, double deliveryWeight, String trackNumber, int deliveryHours){
        super(recipientName, deliveryAddress, deliveryWeight, trackNumber);
        this.deliveryHours = deliveryHours;
    }

//- метод public double calculateDeliveryPrice() - по формуле цены обычной посылки плюс 500 ЕСЛИ доставка должна быть быстрее чем за 24 часа (ориентируемся на поле deliveryHours)
    public double calculateDeliveryPrice(){
        double deliveryPrice;
        if(deliveryHours < 24) {
            deliveryPrice = super.calculateDeliveryPrice() + 500;
        } else {
            deliveryPrice = super.calculateDeliveryPrice();
        }
        return deliveryPrice;
    }

//- метод public void printInfo() - в нем вызвать родительский метод и дополнительно вывести фразу "Delivery deadline: " плюс срок доставки
    public void printInfo(){
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours);
    }
}
