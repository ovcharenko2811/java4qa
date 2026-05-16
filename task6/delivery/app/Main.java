package task6.delivery.app;

import task6.delivery.model.ExpressParcel;
import task6.delivery.model.FragileParcel;
import task6.delivery.model.Parcel;
import task6.delivery.service.ParcelService;

public class Main {
    static void main() {
        Parcel parcel1 = new Parcel("Иван","Саратов",23.5,"64_001");
        FragileParcel fragileParcel1 = new FragileParcel("Петр","Москва",16.445, "77_001", true);
        ExpressParcel expressParcel1 = new ExpressParcel("Артем", "Воронеж", 1, "3452",23);
        Parcel parcel2 = new Parcel();
        Parcel[] parcels = {parcel1, fragileParcel1, expressParcel1, parcel2};

        ParcelService parcelService = new ParcelService();
        parcelService.printParcelsReport(parcels);
    }
}
