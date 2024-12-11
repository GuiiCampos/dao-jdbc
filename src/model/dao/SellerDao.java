package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert (Seller obs);
    void update (Seller obs);
    void deleteById (Integer id);
    Seller selectById (Integer id);
    List<Seller> findAll ();
}
