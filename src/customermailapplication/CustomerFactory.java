/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author DELL
 */
public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch (type) {
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
            case "Regular":
                return new RegularCustomer();
            default:
                break;
        }
        return null;
    }
}
