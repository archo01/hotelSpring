package arc.oop.dao.bill.impl;

import arc.oop.dao.bill.interfaces.IDaoBill;
import arc.oop.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initium on 24.03.17.
 */
public class DaoBillImpl implements IDaoBill{

    public List<Bill> bills = new ArrayList<>();

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }



    public DaoBillImpl() {

    }

    public DaoBillImpl(List<Bill> bills) {

        this.bills = bills;
    }

    @Override
    public List<Bill> getAll() {
        return bills;
    }

    @Override
    public Bill getBill(int id) {
        Bill result = null;
        for (  Bill item: bills
                ) {
            if (item.getId() == id){
                result = new Bill(

                );
            }
        }
        return result;
    }

    @Override
    public void createBill(Bill bill) {
        bills.add(bill);
    }

    @Override
    public void updateBill(Bill bill) {
        Bill updateBill = null;
        for (Bill item : bills) {
            if (item.getId() == bill.getId()) {
                updateBill = item;
                break;

            }
        }
        updateBill = bill;
    }

    @Override
    public void deleteBill(int id) {
        int i = 0;
        boolean is = false;
        for (Bill item : bills) {
            if (item.getId() == id) {
                is = true;
                break;
            }
            i++;
        }
        if (is){bills.remove(i);}
    }

    @Override
    public void showAll() {
        for (Bill item: bills
                ) {
            System.out.println(item.toString());
        }
    }
}
