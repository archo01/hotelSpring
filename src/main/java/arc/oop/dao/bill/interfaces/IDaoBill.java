package arc.oop.dao.bill.interfaces;

import arc.oop.dao.bill.impl.DaoBillImpl;
import arc.oop.dao.chamber.impls.DaoChamberImpl;
import arc.oop.model.bill.Bill;

import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public interface IDaoBill {
    List<Bill> getAll();
    Bill getBill(int id);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int id);
    void showAll();
}
