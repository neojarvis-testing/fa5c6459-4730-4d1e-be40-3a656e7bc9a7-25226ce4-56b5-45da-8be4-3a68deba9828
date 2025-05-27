package main.java.com.examly.springapploan.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class LoanApplication {

    private long loanApplicationId;
    private LocalDateTime applicationDate;
    private BigDecimal loanAmount;
    private int tenureMonth;
    private String applicationStatus;
    private String employmentStatus;
    private BigDecimal annualincome;
    private String remarks;
    private String proof;
    private String accountHolder;
    private String accountNumber;
    private String iFSCCode;
    private User user;
    private Loan loan;

}
