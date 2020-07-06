package com.pbilton.userDatabase;

import java.util.ArrayList;

public interface Repository<t>{

    void add(t item);

    ArrayList<t> getAll();

    ArrayList<t> search(String criteria, String searchTerm);

    ArrayList<t> remove(String criteria, int removeID);
}
