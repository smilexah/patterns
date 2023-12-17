package org.sdu.edu.kz.BookCategory;

import org.sdu.edu.kz.Interfaces.IBookCategory;

public class SciFiCategory implements IBookCategory {
    @Override
    public String getCategory() {
        return "Science Fiction category";
    }
}
