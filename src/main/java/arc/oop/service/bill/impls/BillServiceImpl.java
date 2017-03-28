package arc.oop.service.bill.impls;

import arc.oop.dao.bill.interfaces.IDaoBill;
import arc.oop.model.bill.Bill;
import arc.oop.service.bill.interfaces.IBillService;

import java.util.List;

/**
 * Created by initium on 28.03.17.
 */
public class BillServiceImpl implements IBillService{
    IDaoBill daoBill;

    public IDaoBill getDaoBill() {
        return daoBill;
    }

    public void setDaoBill(IDaoBill daoBill) {
        this.daoBill = daoBill;
    }

    public BillServiceImpl() {

    }

    public BillServiceImpl(IDaoBill daoBill) {

        this.daoBill = daoBill;
    }

    @Override
    public List<Bill> getAll() {
        return daoBill.getAll();
    }

    @Override
    public Bill getBill(int id) {
        return daoBill.getBill(id);
    }

    @Override
    public void createBill(Bill bill) {
        daoBill.createBill(bill);
    }

    @Override
    public void updateBill(Bill bill) {
        daoBill.updateBill(bill);
    }

    @Override
    public void deleteBill(int id) {
        daoBill.deleteBill(id);
    }

    @Override
    public void showAll() {
        daoBill.showAll();
    }
}
