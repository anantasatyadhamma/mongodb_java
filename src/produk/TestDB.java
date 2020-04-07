/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produk;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Anan
 */
public class TestDB {
    public static void main(String[]args){
        try {
            MongoDatabase database = Koneksi.sambungDB();
        } catch (Exception e) {
        }
    }
}
