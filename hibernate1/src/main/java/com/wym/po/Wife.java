package com.wym.po;

import javax.persistence.*;

@Entity
public class Wife {
    private int id;
    private String wname;
    private Hus hus;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "wname", nullable = true, length = 20)
    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wife wife = (Wife) o;

        if (id != wife.id) return false;
        if (wname != null ? !wname.equals(wife.wname) : wife.wname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wname != null ? wname.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "wife")
    public Hus getHus() {
        return hus;
    }

    public void setHus(Hus hus) {
        this.hus = hus;
    }
}
