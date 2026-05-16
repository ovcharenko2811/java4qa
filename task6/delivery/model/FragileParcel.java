package task6.delivery.model;

public class FragileParcel extends Parcel{
    private boolean requiresCarefulHandling;

    //- конструктор с аргументами как в Parcel но с дополнительным аргументом-значением для поля requiresCarefulHandling. конструктор первой строкой вызывает родительский конструктор через super(...).
    public FragileParcel(String recipientName, String deliveryAddress, double deliveryWeight, String trackNumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAddress, deliveryWeight, trackNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }


//- метод public double calculateDeliveryPrice() - по формуле родительского метода плюс 200 наценка. родительский метод можно вызвать через super.имяМетода()
    public double calculateDeliveryPrice(){
        double deliveryPrice = super.calculateDeliveryPrice() + 200;
        return deliveryPrice;
    }

//- метод public void printInfo() - в нем вызвать родительский метод и добавить фразу "Handle with care: " плюс значение поля requiresCarefulHandling
    public void printInfo(){
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
