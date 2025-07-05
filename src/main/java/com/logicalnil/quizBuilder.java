package com.logicalnil;

import java.io.FileNotFoundException;

public class quizBuilder {
    private questionsList qObject;
    private MyData[] q;
    quizBuilder() throws FileNotFoundException {
         this.qObject = new questionsList();
    }

    public void setQ() {
        this.q = qObject.getData();

    }

    public MyData[] getQ() {

        return q;
    }
}
