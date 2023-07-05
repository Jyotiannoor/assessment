package com.trigyn.paymentService.service;

import com.trigyn.paymentService.model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    List paymentList = new ArrayList();

    public List<Payment> getPriceList(){
        return paymentList;
    }

    public  Boolean addItem(Payment payment){
        paymentList.add(payment);
        return true;
    }
}
