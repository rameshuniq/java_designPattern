/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverDesignPattern;

/**
 *
 * @author user
 */
public interface Subject {

    void notifySub();

    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void upload(String title);
    
}
