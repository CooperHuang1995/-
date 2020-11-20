package com.mycompany.springbasic1102.jdbc.tx.service;

public interface BookService {
    void buyOne(Integer wid, Integer bid);
    void byMany(Integer wid, Integer...bids);
}
