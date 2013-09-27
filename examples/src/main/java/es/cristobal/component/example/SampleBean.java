package es.cristobal.component.example;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="manBean")
@SessionScoped
public class SampleBean {

  private BigDecimal amount;

  private int luckyNumber;
  
  public int getLuckyNumber() { return luckyNumber; }
  
  public void setLuckyNumber(int value) { luckyNumber=0; }
  
  public String login() {
    if (luckyNumber==0) {return "error";}
    else {return "success";}
  }


  private int idToDelete;
  public void setIdToDelete(int value) { idToDelete = value; }
  public String deleteAction() {
    // delete the entry whose id is idToDelete
    return null;
  }
  
  public class Entry{
	  public void Entry() {}
  }  
  public List<Entry> getEntries() { return null; }


  private static Map<String, Object> items;
  static {
    items = new LinkedHashMap<String, Object>();
    items.put("Cheese", 1); // label, value
    items.put("Pickle", 2);
  }
  public Map<String, Object> getItems() { return items; }
  public String getCondiment(int index) { return (String) items.get(index); }
  public void setCondiment(String condiment) { items.put(condiment, items.size()); }

}

