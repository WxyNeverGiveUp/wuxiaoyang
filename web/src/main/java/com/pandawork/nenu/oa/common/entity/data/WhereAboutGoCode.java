package com.pandawork.nenu.oa.common.entity.data;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * user: lishicao
 * date 15/4/15
 * time 上午9:59
 */
@Entity
@Table(name = "t_whereaboutgo_code")
public class WhereAboutGoCode extends AbstractEntity {
    //唯一表示
    @Id
    private Integer id ;

    @Column( name = "whereaboutgo_id")
    private Integer whereAboutGoId;

    @Column( name = "whereaboutgo")
    private String whereAboutGo;


    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public int getWhereAboutGoId() {
        return whereAboutGoId;
    }

    public void setWhereAboutGoId(int whereAboutGoId) {
        this.whereAboutGoId = whereAboutGoId;
    }

    public String getWhereAboutGo() {
        return whereAboutGo;
    }

    public void setWhereAboutGo(String whereAboutGo) {
        this.whereAboutGo = whereAboutGo;
    }
}
