import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class MyListModel implements ListModel<String>{
    private ArrayList<String> data;

    public MyListModel(){
        data = new ArrayList<String>();
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public String getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    public void addElement(String s){
        data.add(s);
    }

    public void removeElement(int index){
        data.remove(index);
    }

    public void removeElement(String obj){
        data.remove(obj);
    }
}
