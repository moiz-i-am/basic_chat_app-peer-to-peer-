/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_application_java;

/**
 *
 * @author Muhammad Moiz Tahir
 */
public interface MessageListener {
     public void onMessage(String fromLogin, String msgBody);
}
