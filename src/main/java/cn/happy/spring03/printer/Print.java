package cn.happy.spring03.printer;

import cn.happy.spring03.Ink.Ink;
import cn.happy.spring03.paper.Paper;

/**
 * Created by linlin on 2017/7/24.
 */
public class Print {
    private Paper p;
    private Ink ink;

    @Override
    public String toString() {
        return "Print{" +
                "paper=" + p.Apaper() +
                ", ink=" + ink.inkcolor() +
                '}';
    }

    public Paper getP() {
        return p;
    }

    public void setP(Paper p) {
        this.p = p;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }
}
