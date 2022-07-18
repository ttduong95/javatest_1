/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Book implements Serializable{
    public String Id;
    public String Name;
    public String Author;
    public int Price;

    public Book() {
    }

    public Book(String Id, String Name, String Author, int Price) {
        this.Id = Id;
        this.Name = Name;
        this.Author = Author;
        this.Price = Price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Book{" + "Id=" + Id + ", Name=" + Name + ", Author=" + Author + ", Price=" + Price + '}';
    }


    
}
