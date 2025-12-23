package com.example.SpringWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Products {

    @Id
    private int prodID;
    private String prodName;
    private int prodValue;

    public Products(){}

    public Products(int prodID, String prodName, int prodValue ) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodValue = prodValue;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdValue() {
        return prodValue;
    }

    public void setProdValue(int prodValue) {
        this.prodValue = prodValue;
    }




    @Override
    public String toString() {
        return "Products{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", prodValue=" + prodValue +
                '}';
    }
}
