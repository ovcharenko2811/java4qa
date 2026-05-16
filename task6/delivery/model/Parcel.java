package task6.delivery.model;

public class Parcel {
    private String recipientName;
    private String deliveryAddress;
    protected double deliveryWeight;
    String trackNumber;



//- конструктор с аргументами (имя получателя, адрес доставки, вес посылки, трек-номер)
    public Parcel(String recipientName, String deliveryAddress, double deliveryWeight, String trackNumber){
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryWeight = deliveryWeight;
        this.trackNumber = trackNumber;
    }
//- конструктор без аргументов
    public Parcel(){}

//- методы - геттеры и сеттеры для полей: имя получателя, адрес доставки, вес посылки
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getDeliveryWeight() {
        return deliveryWeight;
    }

    public void setDeliveryAddress(double deliveryWeight) {
        this.deliveryWeight = deliveryWeight;
    }

//- метод public double calculateDeliveryPrice() - возвращает базовую стоимость доставки, по формуле: 100 + вес посылки * 30
    public double calculateDeliveryPrice(){
        return 100 + deliveryWeight * 30;
    }
//- метод public void printInfo() - выводит в консоль информацию о всех полях посылки
    public void printInfo(){
        System.out.println("Имя получателя: " + recipientName);
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Вес посылки: " + deliveryWeight + " кг");
        System.out.println("Трек-номер: " + trackNumber);
        System.out.println("Стоимость доставки: " + calculateDeliveryPrice() + " рублей");
    }
}


