package com.mycompany.springbasic1102.jpa.entities.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")//若命名一樣可不寫(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue
    private  Integer id;
    
    @Column
    private  String orderName;
    
    
    // 映射單向n-1的關聯關係
    @ManyToOne
    //FetchType.EAGER預先select加載資料
    //@ManyToOne(fetch = FetchType.EAGER)
    //FetchType.LAZY不預先select加載資料,等到程式有使用到時才會去select
    //@ManyToOne(fetch = FetchType.LAZY)//ToOne的話FetchType.EAGER為預設
    //使用 @JoinColum 來設定映射外鍵
    @JoinColumn(name = "customer_id", referencedColumnName = "id")//referencedColumnName為確保主鍵(pk)的名稱,可能不一定叫id
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
    
    
}
