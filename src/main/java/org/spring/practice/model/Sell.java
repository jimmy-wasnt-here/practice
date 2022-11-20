package org.spring.practice.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sell {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Client client;

    //TODO fill missing properties later
    @ManyToMany 
    @JoinTable(name = "products_sale", 
        joinColumns = @JoinColumn(name="", referencedColumnName = ""), 
        inverseJoinColumns = @JoinColumn(referencedColumnName = "")
    )
    private List<Product> products;
}
