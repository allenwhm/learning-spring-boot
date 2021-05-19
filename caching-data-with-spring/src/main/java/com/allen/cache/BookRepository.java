package com.allen.cache;

/**
 * @author allen
 * @date 2021/5/19 21:58
 */
public interface BookRepository {

    Book getByIsbn(String isbn);
}
