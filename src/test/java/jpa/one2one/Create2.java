package jpa.one2one;

import com.mycompany.springbasic1102.jpa.entities.one2one.Boss;
import com.mycompany.springbasic1102.jpa.entities.one2one.Company;
import jpa.JPATemplate;
import org.junit.Test;

public class Create2 extends JPATemplate{
    @Test
    public void t1(){
        Boss boss = new Boss();
        boss.setName("Mary");
        
        Company company = new Company();
        company.setName("B公司");
        
        //配置關聯
        //由於在Boss.java的Department department 上設置了
        //@OneToOne(mappedBy = "boss"),所以Boss對應Department的關聯就不用寫了
        //boss.setCompany(company):<--可以不用寫
        company.setBoss(boss);
        
        //儲存(聯集新增)
        //在Company中加上@OneToOne(cascade = CascadeType.PERSIST)
        session.persist(company);
        
        
        
        
    }
}
