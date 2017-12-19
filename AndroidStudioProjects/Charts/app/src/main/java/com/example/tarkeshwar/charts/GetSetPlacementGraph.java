package com.example.tarkeshwar.charts;

import java.util.Objects;

/**
 * Created by tarkeshwar on 18/1/17.
 */

public class GetSetPlacementGraph {
    private Float TOPUP,ITES;

    public Float getTOPUP() {
        return TOPUP;
    }

    public void setTOPUP(Float TOPUP) {
        this.TOPUP = TOPUP;
    }

    public Float getITES() {
        return ITES;
    }

    public void setITES(Float ITES) {
        this.ITES = ITES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetSetPlacementGraph that = (GetSetPlacementGraph) o;

        if (TOPUP != null ? !TOPUP.equals(that.TOPUP) : that.TOPUP != null) return false;
        return ITES != null ? ITES.equals(that.ITES) : that.ITES == null;

    }

    @Override
    public int hashCode() {
        int result = TOPUP != null ? TOPUP.hashCode() : 0;
        result = 31 * result + (ITES != null ? ITES.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GetSetPlacementGraph{" +
                "GraphTopup=" + TOPUP +
                ", ITES=" + ITES +
                '}';
    }
}
