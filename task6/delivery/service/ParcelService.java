package task6.delivery.service;

import task6.delivery.model.Parcel;

public class ParcelService {
    public void printParcelsReport(Parcel[] parcels){
//        Метод должен пройтись по массиву и для каждой посылки:
//        - вызвать printInfo();
//        - вывести стоимость доставки через calculateDeliveryPrice();
//        - напечатать разделитель (пустую строку)
        for(Parcel parcel:parcels){
            parcel.printInfo();
            System.out.println();
        }
    }
}
