package org.sdu.edu.kz.BookCategory;

import org.sdu.edu.kz.Interfaces.IBookCategory;

public class NonFictionCategory implements IBookCategory {
    @Override
    public String getCategory() {
        return "Non - Fiction Category";
    }
}
