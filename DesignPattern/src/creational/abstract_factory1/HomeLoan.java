/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstract_factory1;

/**
 *
 * @author Abhishek.Sehgal
 */
public class HomeLoan extends Loan {

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }

}
