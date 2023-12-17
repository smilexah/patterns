package org.sdu.edu.kz.BookCategory;

import org.sdu.edu.kz.Interfaces.IBookCategory;

public class FictionCategory implements IBookCategory {
    @Override
    public String getCategory() {
        return "Fiction Category";
    }
}
