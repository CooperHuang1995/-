package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.Bookshelf;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete extends JPATemplate{
    @Test
    public void t1(){
        Bookshelf bookshelf =(Bookshelf) session.get(Bookshelf.class, 1);
        // 若透過 CascadeType.REMOVE 可以集連刪除(many的一方也都會刪除)
        // 否則多的一方資料仍會保存 外鍵內容 = null
        session.delete(bookshelf);
    }
}
