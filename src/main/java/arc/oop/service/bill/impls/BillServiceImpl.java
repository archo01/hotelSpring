package arc.oop.service.bill.impls;

import arc.oop.dao.bill.interfaces.IDaoBill;
import arc.oop.model.bill.Bill;
import arc.oop.model.chamber.Chamber;
import arc.oop.service.bill.interfaces.IBillService;
import arc.oop.service.chamber.interfaces.IChamberService;
import arc.oop.service.restoraunt.interfaces.IRestorauntService;
import arc.oop.service.spa.interfaces.ISpaService;

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

    @Override
    public int getPriceById(int id) {
        int price = 250;
        price += daoBill.getBill(id).getRestorant().getPrice()
                + daoBill.getBill(id).getSpa().getPrice();
        Chamber room = daoBill.getBill(id).getChamber();
            if (room.isBar()){
                price += 150;
            }
            if (room.isConditioner()){
                price += 80;
            }
            if (room.isFridge()){
                price += 60;
            }
            if (room.isJacusi()){
                price += 200;
            }

            return price;
        }

    @Override
    public int getLastMaxBillSum() {
        int maxSum = 0;
        for (int i = 1; i < daoBill.getAll().size(); i++) {
            if (getPriceById(i) > maxSum ){
                maxSum = getPriceById(i);
            }

        }
        return maxSum;
    }

    @Override
    public void showLastTopClient() {
        int maxSum = 0;
        int ClientID = 0;
        for (int i = 1; i < daoBill.getAll().size(); i++) {
            if (getPriceById(i) > maxSum) {
                maxSum = getPriceById(i);
                ClientID = i;
            }

        }
        System.out.println(daoBill.getBill(ClientID).toString());
    }
}
