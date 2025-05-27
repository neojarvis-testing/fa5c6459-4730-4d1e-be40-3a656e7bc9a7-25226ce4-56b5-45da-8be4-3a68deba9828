package main.java.com.examly.springapploan.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Loan {

private long loanId;
private String loanType;
private BigDecimal maxAmount;
private BigDecimal minAmount;
private int minTenureMonths;
private int maxTenureMonths;
private String description;
private String status;
private double processingFee;
private BigDecimal prepaymentPenalty;
private int gracePeriodMonths;
private BigDecimal latePaymentFee;


}
