/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import java.util.List;

/**
 *
 * @author Hoang
 */
public interface Controller {
    <T> void writeToFile(List<T> list, String fileName);
    
    <T> List<T> readDataFromFile(String fileName);
}
