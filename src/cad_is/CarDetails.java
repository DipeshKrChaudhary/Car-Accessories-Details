/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_is;

/**
 *
 * @author 
 */
public class CarDetails {
    private String productId;
    private String name;
    private String range;
    private String category;
    private String recommendation;
    private int price;
    
    public CarDetails(String productId, String name, String range, String category, String recommendation, int price)
    {
       this.productId=productId;
       this.name=name;
       this.range=range;
       this.recommendation=recommendation;
       this.category=category;
       this.price=price;
       
    }
    

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return name;
    }

    /**
     * @return the range
     */
    public String getRange() {
        return range;
    }

    /**
     * @return the recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }
    
    /**
     * @return the category
     */
     public String getCategory() {
        return category;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    
    
    
    
}
