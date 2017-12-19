package com.example.tarkeshwar.charts;

/**
 * Created by tarkeshwar on 21/1/17.
 */

public class GetSetGraphDivisionFS {
    private String name;
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSetGraphDivisionFS that = (GetSetGraphDivisionFS) o;

        if (total != that.total) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + total;
        return result;
    }

    @Override
    public String toString() {
        return "GetSetGraphDivisionFS{" +
                "name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
