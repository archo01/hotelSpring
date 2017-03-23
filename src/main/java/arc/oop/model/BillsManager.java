package arc.oop.model;

import arc.oop.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initium on 20.03.17.
 */
public class BillsManager {
    List<Bill> list = new ArrayList<Bill>();

    public List<Bill> getList() {
        return list;
    }

    public void setList(List<Bill> list) {
        this.list = list;
    }

    public BillsManager() {

    }

    public BillsManager(List<Bill> list) {

        this.list = list;
    }
}
