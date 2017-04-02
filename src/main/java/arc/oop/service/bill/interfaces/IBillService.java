package arc.oop.service.bill.interfaces;

import arc.oop.model.bill.Bill;

import java.util.List;

/**
 * Created by initium on 28.03.17.
 */
public interface IBillService {

    List<Bill> getAll();
    Bill getBill(int id);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int id);
    void showAll();

    int getPriceById(int id);
    int getLastMaxBillSum();
    void showLastTopClient();

}
