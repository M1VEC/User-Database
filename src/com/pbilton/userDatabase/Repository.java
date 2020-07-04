package com.pbilton.userDatabase;

import java.util.ArrayList;

public interface Repository<t>{

    void add(t item);

    ArrayList<t> getAll();
}
